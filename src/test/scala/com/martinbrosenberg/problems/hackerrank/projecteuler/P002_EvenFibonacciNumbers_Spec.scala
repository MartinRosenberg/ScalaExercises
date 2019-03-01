package com.martinbrosenberg.problems.hackerrank.projecteuler

import com.martinbrosenberg.problems.BaseSpec
import com.martinbrosenberg.problems.hackerrank.projecteuler.P002_EvenFibonacciNumbers._
import com.martinbrosenberg.problems.hackerrank.projecteuler.P002_EvenFibonacciNumbers_Spec._

class P002_EvenFibonacciNumbers_Spec extends BaseSpec {

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

  private val functions = Seq[(String, Long => Long)](
    ("sum_1", sum_1),
    ("sum_2", sum_2),
  )

  private val testCases = Seq[(Long, Long)](
    (10, 10),
    (100, 44),
    (4000000, 4613732),
  )

}
