package com.martinbrosenberg.exercises.exercism.track.e02_twofer

object Twofer {

  def twofer(name: String = "you"): String =
    s"One for ${name match {
      case "" | null => "you"
      case _         => name
    }}, one for me."

}
