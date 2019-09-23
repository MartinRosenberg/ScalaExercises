package com.martinbrosenberg.exercises.exercism.track

/** LEAP
  *
  * Given a year, report if it is a leap year.
  *
  * The tricky thing here is that a leap year in the Gregorian calendar occurs:
  *
  * on every year that is evenly divisible by 4
  *   except every year that is evenly divisible by 100
  *     unless the year is also evenly divisible by 400
  *
  * For example, 1997 is not a leap year, but 1996 is. 1900 is not a leap year,
  * but 2000 is.
  *
  * If your language provides a method in the standard library that does this
  * look-up, pretend it doesn't exist and implement it yourself.
  */
object E02_Leap {

  def leapYear(year: Int): Boolean =
    year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)

}
