package com.martinbrosenberg.exercises.hackerrank.projecteuler

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.hackerrank.projecteuler.E001_MultiplesOf3And5._
import com.martinbrosenberg.exercises.hackerrank.projecteuler.E001_MultiplesOf3And5_Spec._

class E001_MultiplesOf3And5_Spec extends BaseSpec {

  for ((fnName, sum) <- functions) {
    s"Using function $fnName" - {
      for ((max, result) <- testCases) {
        s"sum of multiples of 3 or 5 under $max should be $result" in {
          assertResult(result)(sum(max))
        }
      }
    }
  }

}

object E001_MultiplesOf3And5_Spec {

  private val functions = Seq[(String, Int => Long)](
    ("sum_1", sum_1),
    ("sum_2", sum_2),
  )

  private val testCases = Seq[(Int, Long)](
    (10, 23L),
    (100, 2318L),
    (1000, 233168L),
    (10000, 23331668L),
    (100000, 2333316668L),
    (1000000, 233333166668L),
    (10000000, 23333331666668L),
  )

}