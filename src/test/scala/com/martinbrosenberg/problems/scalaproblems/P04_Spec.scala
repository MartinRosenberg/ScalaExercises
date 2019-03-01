package com.martinbrosenberg.problems.scalaproblems

import com.martinbrosenberg.problems.BaseSpec
import com.martinbrosenberg.problems.scalaproblems.P04._
import com.martinbrosenberg.problems.scalaproblems.P04_Spec._

class P04_Spec extends BaseSpec {

  for ((fnName, length) <- functions) {
    s"Using function $fnName" - {
      for (TestCase(list, result) <- testCases) {
        s"length of $list should be $result" in {
          assertResult(result)(length(list))
        }
      }
    }
  }

}

object P04_Spec {

  private val functions = Seq[(String, List[Int] => Int)](
    ("length_1", length1),
    ("length_2", length2),
    ("length_3", length3),
  )

  private case class TestCase[T](list: List[T], length: T)

  private val testCases = Seq[TestCase[Int]](
    TestCase(Nil, 0),
    TestCase(List(1), 1),
    TestCase(List(0, 1, 1, 2, 3, 5, 8), 7),
  )

}
