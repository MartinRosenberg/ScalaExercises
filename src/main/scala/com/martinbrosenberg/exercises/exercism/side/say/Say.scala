package com.martinbrosenberg.exercises.exercism.side.say

object Say {
  private def mkString(sep: String)(xs: Option[String]*): String =
    xs.flatten.mkString(sep)

  private final val OnesCol = Map(
    1 -> "one", 2 -> "two", 3 -> "three", 4 -> "four", 5 -> "five",
    6 -> "six", 7 -> "seven", 8 -> "eight", 9 -> "nine"
  )

  private final val TensCol = Map(
    2 -> "twenty", 3 -> "thirty", 4 -> "forty", 5 -> "fifty",
    6 -> "sixty", 7 -> "seventy", 8 -> "eighty", 9 -> "ninety"
  )

  private val twoDigitNum = Map(
    10 -> "ten", 11 -> "eleven", 12 -> "twelve", 13 -> "thirteen",
    14 -> "fourteen", 15 -> "fifteen", 16 -> "sixteen",
    17 -> "seventeen", 18 -> "eighteen", 19 -> "nineteen"
  ).withDefault { n =>
    val tens = TensCol.get(n / 10 % 10)
    val ones = OnesCol.get(n % 10)
    mkString("-")(tens, ones)
  }

  private def section(n: Int, name: Option[String]): Option[String] = {
    if (n == 0) None
    else Some {
      val hundreds = OnesCol.get(n / 100).map(_ + " hundred")
      val tensOnes = Option(twoDigitNum(n % 100)).filter(_.nonEmpty)
      mkString(" ")(hundreds, tensOnes, name)
    }
  }

  private def build(n: Long): String = {
    val ones = section((n % 1000).toInt, None)
    val thousands = section((n / 1000 % 1000).toInt, Some("thousand"))
    val millions = section((n / 1000000 % 1000).toInt, Some("million"))
    val billions = section((n / 1000000000 % 1000).toInt, Some("billion"))
    mkString(" ")(billions, millions, thousands, ones)
  }

  def inEnglish(n: Long): Option[String] = {
    if (n < 0 || n > 999999999999L) None
    else if (n == 0) Some("zero")
    else Some(build(n))
  }
}
