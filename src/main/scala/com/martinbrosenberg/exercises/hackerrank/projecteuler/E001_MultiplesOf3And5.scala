package com.martinbrosenberg.exercises.hackerrank.projecteuler

/** Project Euler #1: Multiples of 3 and 5
  *
  * If we list all the natural numbers below 10 that are multiples of 3 or 5, we
  * get 3, 5, 6, and 9. The sum of these multiples is 23.
  *
  * Find the sum of all positive multiples of 3 or 5 below N.
  *
  * @see [[https://www.hackerrank.com/contests/projecteuler/challenges/euler001]]
  */
object E001_MultiplesOf3And5 {

  /** Constraints: None.
    *
    * O(n) solution.
    */
  def sum_1(max: Int): Long =
    (1L until max)
      .filter(x => x % 3 == 0 || x % 5 == 0)
      .sum

  /** Constraints: O(1) time.
    */
  def sum_2(max: Int): Long =
    ???

}
