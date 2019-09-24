package com.martinbrosenberg.exercises.exercism.side

/** DIFFERENCE OF SQUARES
  *
  * Find the difference between the square of the sum and the sum of the squares
  * of the first N natural numbers.
  *
  * The square of the sum of the first ten natural numbers is
  * (1 + 2 + ... + 10)² = 55² = 3025.
  *
  * The sum of the squares of the first ten natural numbers is
  * 1² + 2² + ... + 10² = 385.
  *
  * Hence the difference between the square of the sum of the first ten natural
  * numbers and the sum of the squares of the first ten natural numbers is
  * 3025 - 385 = 2640.
  */
object DifferenceOfSquares {

  private def square(n: Int): Int = n * n

  def squareOfSum(n: Int): Int = square(n * (n + 1) / 2)

  def sumOfSquares(n: Int): Int = n * (n + 1) * (2 * n + 1) / 6

  def differenceOfSquares(n: Int): Int = squareOfSum(n) - sumOfSquares(n)

}
