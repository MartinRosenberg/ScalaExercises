package com.martinbrosenberg.exercises.ctci.chapter01

import scala.collection.mutable

/** PALINDROME PERMUTATION
  *
  * Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase
  * that is the same forwards and backwards. A permutation is a rearrangement of letters. The palindrome does not need
  * to be limited to just dictionary words.
  */
object E04_PalindromePermutation {

  /** Constraints: None.
    *
    * The problem as stated doesn't care about uppercase or whitespace, so those are both removed. Without concern for
    * whether the result uses real words, all that matters is that each character has a twin - with the exception that
    * there can be one unmatched character in the middle. So we keep track of whether each character has a twin, and if
    * more than one doesn't, it's not a palindrome. O(n) time and space.
    */
  def isPalindromePermutation1(s: String): Boolean =
    s.toLowerCase
      .replaceAll("""[^\d\p{L}]""", "")
      .foldLeft(mutable.BitSet()) { (a, c) => a(c) = !a(c); a }
      .count(_ => true) <= 1

}
