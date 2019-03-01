package com.martinbrosenberg.exercises.hackerrank.projecteuler

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.hackerrank.projecteuler.E006_SumSquareDifference._
import com.martinbrosenberg.exercises.hackerrank.projecteuler.E006_SumSquareDifference_Spec._

class E006_SumSquareDifference_Spec extends BaseSpec {

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

object E006_SumSquareDifference_Spec {

  private val functions = Seq[(String, Long => Long)](
    ("difference_1", difference_1),
    ("difference_2", difference_2),
  )

  private val testCases = Seq[(Int, Int)](
    (3, 22),
    (10, 2640),
    (100, 25164150)
  )

}
