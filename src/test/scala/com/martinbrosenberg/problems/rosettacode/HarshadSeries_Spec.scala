package com.martinbrosenberg.problems.rosettacode

import com.martinbrosenberg.problems.BaseSpec

class HarshadSeries_Spec extends BaseSpec {
  import HarshadSeries._
  import HarshadSeries_Spec._

  "The first" - {
    for ((n, result) <- takeTestCases) {
      s"$n Harshad numbers should be $result" in {
        assertResult(result)(take(n))
      }
    }
  }

  "The first Harshad number after" - {
    for ((n, result) <- firstAfterTestCases) {
      s"$n should be $result" in {
        assertResult(result)(firstAfter(n))
      }
    }
  }

}

object HarshadSeries_Spec {

  val takeTestCases: Seq[(Int, List[Int])] = Seq(
    (-1, Nil),
    (0, Nil),
    (1, List(1)),
    (20, List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 18, 20, 21, 24, 27, 30, 36, 40, 42))
  )

  val firstAfterTestCases: Seq[(Int, Int)] = Seq(
    (0, 1),
    (1, 2),
    (1000, 1002)
  )

}