package com.martinbrosenberg.exercises.exercism.side.raindrops

object Raindrops {

  private final val Factors = Map(3 -> "Pling", 5 -> "Plang", 7 -> "Plong")

  def convert(n: Int, factors: Map[Int, String] = Factors): String = {
    val words = factors.view.filterKeys(n % _ == 0).values
    if (words.nonEmpty) words.mkString else n.toString
  }

}
