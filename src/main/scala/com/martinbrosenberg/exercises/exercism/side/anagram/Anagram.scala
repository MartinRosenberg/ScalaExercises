package com.martinbrosenberg.exercises.exercism.side.anagram

object Anagram {

  def findAnagrams(word: String, candidates: Seq[String]): Seq[String] = {
    val sorted = word.sorted
    candidates.filter(c =>
      !c.equalsIgnoreCase(word) && c.sorted.equalsIgnoreCase(sorted)
    )
  }

}
