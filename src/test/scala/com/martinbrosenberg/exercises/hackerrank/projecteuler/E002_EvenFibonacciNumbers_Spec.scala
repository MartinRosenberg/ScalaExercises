package com.martinbrosenberg.exercises.hackerrank.projecteuler

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.hackerrank.projecteuler.E002_EvenFibonacciNumbers._
import com.martinbrosenberg.exercises.hackerrank.projecteuler.E002_EvenFibonacciNumbers_Spec._

class E002_EvenFibonacciNumbers_Spec extends BaseSpec {

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

object E002_EvenFibonacciNumbers_Spec {

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
