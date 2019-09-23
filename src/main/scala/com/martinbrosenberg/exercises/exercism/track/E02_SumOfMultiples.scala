package com.martinbrosenberg.exercises.exercism.track

object E02_SumOfMultiples {

  def sum(factors: Set[Int], limit: Int): Int =
    (1 until limit)
      .filter(n => factors.exists(n % _ == 0))
      .sum

}
