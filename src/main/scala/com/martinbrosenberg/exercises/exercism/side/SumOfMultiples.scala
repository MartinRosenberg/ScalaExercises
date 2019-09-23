package com.martinbrosenberg.exercises.exercism.side

/** SUM OF MULTIPLES
  *
  * Given a number, find the sum of all the unique multiples of particular
  * numbers up to but not including that number.
  *
  * If we list all the natural numbers below 20 that are multiples of 3 or 5, we
  * get 3, 5, 6, 9, 10, 12, 15, and 18.
  *
  * The sum of these multiples is 78.
  */
object SumOfMultiples {

  def sum(factors: Set[Int], limit: Int): Int =
    (1 until limit)
      .filter(n => factors.exists(n % _ == 0))
      .sum

}
