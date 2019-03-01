package com.martinbrosenberg.problems.ctci.chapter01

/** STRING ROTATION
  *
  * Given two strings, `s1` and `s2`, write code to check if `s2` is a rotation of `s1` using only one call to
  * `isSubstring`. Assume you have a method `isSubstring` which checks if one word is a substring of another.
  */
object Chapter1Question9 {

  /** Constraints: None.
    *
    * Scala already contains `contains`, which accomplishes the same as `isSubstring`. We just need to check that the
    * strings are of the same length, to ensure one isn't an *incomplete* rotation (e.g. a proper substring). Scala also
    * has string multiplication built in.
    */
  def isRotation1(s1: String, s2: String): Boolean = s1.length == s2.length && (s1 * 2).contains(s2)

}
