package com.martinbrosenberg.exercises.exercism.side.darts

object Darts {

  def score(x: Double, y: Double): Int =
    math.sqrt(x * x + y * y) match {
      case d if d <= 1  => 10
      case d if d <= 5  => 5
      case d if d <= 10 => 1
      case _            => 0
    }

}
