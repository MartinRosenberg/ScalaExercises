package com.martinbrosenberg.exercises.hackerrank.ctci

import scala.math.abs

/** @see https://www.hackerrank.com/challenges/ctci-making-anagrams/problem */
object MakingAnagrams {
  def makeAnagram(a: String, b: String): Int = {
    val aCounts = a.tallyOrZero
    val bCounts = b.tallyOrZero
    (a + b).toSet.foldLeft(0) { (acc, letter) =>
      acc + abs(aCounts(letter) - bCounts(letter))
    }
  }

  implicit class StringWithTally(s: String) {
    def tally: Map[Char, Int] = s.groupMapReduce(identity)(_ => 1)(_ + _)
    def tallyOrZero: Map[Char, Int] = s.tally.withDefaultValue(0)
  }
}
