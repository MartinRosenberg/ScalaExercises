package com.martinbrosenberg.exercises.exercism.side.grains

object Grains {

  private val squares: Stream[BigInt] = BigInt(1) #:: squares.map(_ * 2)

  def square(n: Int): Option[BigInt] =
    if (n <= 0 || n > 64) None
    else Some(squares.take(n).last)

  lazy val total: BigInt = squares.take(64).sum

}
