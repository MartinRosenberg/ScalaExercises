package com.martinbrosenberg.problems.hackerrank.projecteuler

import com.martinbrosenberg.problems.BaseSpec

class P006_SumSquareDifference_Spec extends BaseSpec {
  import P006_SumSquareDifference_Spec._

  for ((fnName, difference) <- functions) {
    s"Using function $fnName" - {
      for ((max, result) <- testCases) {
        s"difference of square of sum and sum of squares under $max should be $result" in {
          assertResult(result)(difference(max))
        }
      }
    }
  }

}

object P006_SumSquareDifference_Spec {
  import P006_SumSquareDifference._

  val functions: Seq[(String, Long => Long)] = Seq(
    ("difference_1", difference_1),
    ("difference_2", difference_2),
  )

  val testCases: Seq[(Int, Int)] = Seq(
    (3, 22),
    (10, 2640),
    (100, 25164150)
  )

}
