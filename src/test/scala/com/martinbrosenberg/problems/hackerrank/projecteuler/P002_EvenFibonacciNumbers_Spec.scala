package com.martinbrosenberg.problems.hackerrank.projecteuler

import com.martinbrosenberg.problems.BaseSpec

class P002_EvenFibonacciNumbers_Spec extends BaseSpec {
  import P002_EvenFibonacciNumbers_Spec._

  for ((fnName, sum) <- functions) {
    s"Using function $fnName" - {
      for ((max, result) <- testCases) {
        s"sum of even Fibonacci numbers $max and under should be $result" in {
          assertResult(result)(sum(max))
        }
      }
    }
  }

}

object P002_EvenFibonacciNumbers_Spec {
  import P002_EvenFibonacciNumbers._

  val functions: Seq[(String, Long => Long)] = Seq(
    ("sum_1", sum_1),
    ("sum_2", sum_2),
  )

  val testCases: Seq[(Long, Long)] = Seq(
    (10, 10),
    (100, 44),
    (4000000, 4613732),
  )

}
