package com.martinbrosenberg.exercises.exercism.track

object E03_Leap {

  def leapYear(year: Int): Boolean =
    year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)

}
