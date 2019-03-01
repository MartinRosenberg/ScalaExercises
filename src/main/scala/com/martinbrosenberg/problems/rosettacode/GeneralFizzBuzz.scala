package com.martinbrosenberg.problems.rosettacode

/** General FizzBuzz
  *
  * Task
  *
  * Write a generalized version of FizzBuzz that works for any list of factors,
  * along with their words.
  *
  * This is basically a "fizzbuzz" implementation where the user supplies the
  * parameters.
  *
  * The user will enter the max number, then they will enter the factors to be
  * calculated along with the corresponding word to be printed.
  *
  * For simplicity's sake, assume the user will input an integer as the max
  * number and 3 factors, each with a word associated with them.
  *
  * @see [[http://rosettacode.org/wiki/General_FizzBuzz]]
  */
object GeneralFizzBuzz {

  /** Constraints: None. */
  def fizzBuzz(factors: Map[Int, String])(max: Int): Seq[String] =
    (1 to max).map { i =>
      val words = factors.collect { case (k, v) if i % k == 0 => v }
      if (words.nonEmpty) words.mkString else s"$i"
    }

  /** First line read is the max number. Each subsequent line is a factor in the
    * format "number word", e.g. "3 Fizz" or "4 Hello World". `^D` will complete
    * the list of factors.
    */
  def main(args: Array[String]): Unit = {
    val max = io.StdIn.readInt()
    val factors = io.Source.stdin.getLines()
      .toSeq
      .sorted
      .map(_.split(" ", 2))
      .map(f => f(0).toInt -> f(1))
      .toMap
    fizzBuzz(factors)(max).foreach(println)
  }

}
