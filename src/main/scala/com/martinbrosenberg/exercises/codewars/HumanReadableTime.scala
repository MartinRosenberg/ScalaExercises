package com.martinbrosenberg.exercises.codewars

import scala.util.{Failure, Success, Try}

/** Write a function, which takes a non-negative integer (seconds) as input and
  * returns the time in a human-readable format (HH:MM:SS)
  *
  * HH = hours, padded to 2 digits, range: 00 - 99
  * MM = minutes, padded to 2 digits, range: 00 - 59
  * SS = seconds, padded to 2 digits, range: 00 - 59
  *
  * The maximum time never exceeds 359999 (99:59:59)
  *
  * You can find some examples in the test fixtures.
  */
object HumanReadableTime {

  def format(seconds: Int): Try[String] =
    if (seconds >= 0) Success {
      val s = seconds % 60
      val minutes = seconds / 60
      val m = minutes % 60
      val h = minutes / 60
      f"$h%02d:$m%02d:$s%02d"
    } else Failure {
      new IllegalArgumentException("Seconds must be non-negative")
    }

}
