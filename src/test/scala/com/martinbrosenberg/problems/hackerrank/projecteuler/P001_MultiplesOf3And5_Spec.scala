package com.martinbrosenberg.problems.hackerrank.projecteuler

import com.martinbrosenberg.problems.BaseSpec

class P001_MultiplesOf3And5_Spec extends BaseSpec {
  import P001_MultiplesOf3And5_Spec._

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

object P001_MultiplesOf3And5_Spec {
  import P001_MultiplesOf3And5._

  val functions: Seq[(String, Int => Long)] = Seq(
    ("sum_1", sum_1),
    ("sum_2", sum_2),
  )

  val testCases: Seq[(Int, Long)] = Seq(
    (10, 23L),
    (100, 2318L),
    (1000, 233168L),
    (10000, 23331668L),
    (100000, 2333316668L),
    (1000000, 233333166668L),
    (10000000, 23333331666668L),
  )

}