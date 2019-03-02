package com.martinbrosenberg.exercises.scalaproblems.lists

/** (*) Find out whether a list is a palindrome.
  *
  * @example scala> isPalindrome(List(1, 2, 3, 2, 1))
  *          res0: Boolean = true
  */
object E06 {

  /** Constraints: None.
    *
    * The "dumb" answer. Iterates over the whole list twice - once to reverse,
    * and once to compare.
    */
  def isPalindrome_1[A](xs: Seq[A]): Boolean = xs == xs.reverse

  /** Constraints: Faster.
    *
    * This only has to traverse halfway for the comparison.
    */
  def isPalindrome_2[A](xs: Seq[A]): Boolean = {
    val n = xs.length / 2
    xs.take(n) == xs.reverse.take(n)
  }

  /** Okay, this was just for fun. */
  def isPalindrome_3[A](xs: Seq[A]): Boolean =
    xs.zip(xs.reverse)
      .take(xs.length / 2)
      .forall { case (a, b) => a == b }

}
