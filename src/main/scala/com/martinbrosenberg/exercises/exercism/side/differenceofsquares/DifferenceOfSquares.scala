package com.martinbrosenberg.exercises.exercism.side.differenceofsquares

object DifferenceOfSquares {

  private def square(n: Int): Int = n * n

  def squareOfSum(n: Int): Int = square(n * (n + 1) / 2)

  def sumOfSquares(n: Int): Int = n * (n + 1) * (2 * n + 1) / 6

  def differenceOfSquares(n: Int): Int = squareOfSum(n) - sumOfSquares(n)

}
