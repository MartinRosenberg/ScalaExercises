package com.martinbrosenberg.problems.rosettacode

/** Harshad or Niven Series
  *
  * The [[http://mathworld.wolfram.com/HarshadNumber.html Harshad]] or Niven
  * numbers are positive integers that are divisible by the sum of their digits.
  *
  * For example, 42 is a [[http://oeis.org/A005349 Harshad number]], as 42 is
  * divisible by 4 + 2.
  *
  * Assume that the series is defined as the numbers in increasing order.
  *
  * Task
  *
  * The task is to create a function/method/procedure to generate successive
  * members of the Harshad sequence.
  *
  * Use it to list the first twenty members of the sequence and list the first
  * Harshad number greater than 1000.
  *
  * @see [[http://rosettacode.org/wiki/Harshad_or_Niven_series]]
  */
object HarshadSeries {

  val harshads: Stream[Int] =
    Stream.from(1)
      .filter(i => i % i.toString.map(_.asDigit).sum == 0)

  /** Constraints: None. */
  def take(n: Int): List[Int] = harshads.take(n).toList

  /** Constraints: None. */
  def firstAfter(n: Int): Int = harshads.filter(_ > n).head

  /** {{{
    * > take 20
    * 1 2 3 4 5 6 7 8 9 10 12 18 20 21 24 27 30 36 40 42
    *
    * > firstafter 1000
    * 1002
    * }}}
    */
  def main(args: String*): Unit = {
    val n = args(1).toInt
    println(args.head.toLowerCase match {
      case "take" => take(n).mkString(" ")
      case "firstafter" => firstAfter(n)
    })
  }

}