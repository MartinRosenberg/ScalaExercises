package com.martinbrosenberg.exercises.ctci.chapter01

/** CHECK PERMUTATION
  *
  * Given two strings, write a method to decide if one is a permutation of the
  * other.
  */
object E02_CheckPermutation {

  /** Constraints: None.
    *
    * After quick checks of the obvious, sorts both strings and compares them.
    * Probably the simplest solution.
    *
    * O(n log n) time.
    */
  def isPermutation1(s1: String, s2: String): Boolean =
    if (s1 == s2) true
    else if (s1.length != s2.length) false
    else s1.sorted == s2.sorted

  /** Constraints: Must be done in O(n) time.
    *
    * After doing the same sanity checks, counts all the characters in `s1`,
    * subtracts the counts from `s2`, and checks for parity.
    */
  def isPermutation2(s1: String, s2: String): Boolean =
    if (s1 == s2) true
    else if (s1.length != s2.length) false
    else {
      val cs = Map[Char, Int]().withDefaultValue(0)
      val csIncr = s1.foldLeft(cs) { (a, c) => a(c) + 1; a }
      val csDecr = s2.foldLeft(csIncr) { (a, c) => a(c) - 1; a }.view
      csDecr.forall { case(_, v) => v == 0 }
    }

}
