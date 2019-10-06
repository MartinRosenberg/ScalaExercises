package com.martinbrosenberg.exercises.exercism.track.e03_leap

object Leap {

  def leapYear(year: Int): Boolean =
    year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)

}
