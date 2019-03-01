package com.martinbrosenberg.exercises.hackerrank.projecteuler

/** Project Euler #6: Sum square difference
  *
  * The sum of the squares of the first ten natural numbers is,
  * 1² + 2² + ... + 10² = 385. The square of the sum of the first ten natural
  * numbers is, (1 + 2 + ... + 10)² = 55² = 3025. Hence the absolute difference
  * between the sum of the squares of the first ten natural numbers and the
  * square of the sum is 3025 - 385 = 2640.
  *
  * Find the absolute difference between the sum of the squares of the first N
  * natural numbers and the square of the sum.
  */
object E006_SumSquareDifference {

  /** Faster than built-in `Math.pow`, and returns an `Int` not a `Double` */
  def square(n: Long): Long = n * n

  def sumOfSquares(n: Long): Long = (1L to n).map(square).sum

  def squareOfSum(n: Long): Long = square((1L to n).sum)

  /** Code constraints: None.
    *
    * Manually sums the numbers in O(n) time.
    */
  def difference_1(n: Long): Long = squareOfSum(n) - sumOfSquares(n)

  /** Code constraints: O(1) time.
    *
    * (Σn)² - Σn²
    */
  def difference_2(n: Long): Long = {
    val squareOfSum = square(n * (n + 1) / 2)
    val sumOfSquares = n * (n + 1) * (2 * n + 1) / 6
    squareOfSum - sumOfSquares
  }

}
