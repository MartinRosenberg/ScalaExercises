package com.martinbrosenberg.exercises

object ApproximatePi {

  def approximatePi(): (Int, Double) = {
    @annotation.tailrec
    def run(sign: Int, divisor: Double, multiplier: Double, approximation: Double): (Int, Double) =
      (approximation * 100000).toInt match {
        case 314159 => (divisor.toInt, approximation)
        case _ =>
          val newSign = sign * -1
          val newDivisor = divisor + 2
          val newMultiplier = multiplier + (newSign / newDivisor)
          val newApproximation = 4 * newMultiplier
          run(newSign, newDivisor, newMultiplier, newApproximation)
      }

    run(1, 1, 1, 4)
  }

  def main(args: Array[String]): Unit = {
    val (divisor, approximation) = approximatePi()
    println(s"Divisor: $divisor")
    println(s"Approximation: $approximation")
  }

}