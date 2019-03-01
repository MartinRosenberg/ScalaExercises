package com.martinbrosenberg.problems.rosettacode

import com.martinbrosenberg.problems.BaseSpec

class GeneralFizzBuzz_Spec extends BaseSpec {
  import GeneralFizzBuzz._
  import GeneralFizzBuzz_Spec._

  for ((factors, max, result) <- testCases) {
    s"FizzBuzz with factors $factors up to $max should be $result" in {
      assertResult(result)(fizzBuzz(factors)(max))
    }
  }

}

object GeneralFizzBuzz_Spec {

  val testCases: Seq[(Map[Int, String], Int, Seq[String])] = Seq(
    (
      Map(3 -> "Fizz", 5 -> "Buzz"),
      20,
      Seq("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz")
    ),
    (
      Map(3 -> "Fizz", 5 -> "Buzz", 7 -> "Tazz"),
      35,
      Seq("1", "2", "Fizz", "4", "Buzz", "Fizz", "Tazz", "8", "Fizz", "Buzz", "11", "Fizz", "13", "Tazz", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz", "FizzTazz", "22", "23", "Fizz", "Buzz", "26", "Fizz", "Tazz", "29", "FizzBuzz", "31", "32", "Fizz", "34", "BuzzTazz")
    )
  )

}
