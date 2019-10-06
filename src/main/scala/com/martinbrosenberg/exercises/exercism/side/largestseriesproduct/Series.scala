package com.martinbrosenberg.exercises.exercism.side.largestseriesproduct

object Series {

  def largestProduct(n: Int, s: String): Option[Int] =
    if (n == 0) Some(1)
    else if (n < 0 || n > s.length || s.exists(!_.isDigit)) None
    else Some(s.map(_.asDigit).sliding(n).map(_.product).max)

}
