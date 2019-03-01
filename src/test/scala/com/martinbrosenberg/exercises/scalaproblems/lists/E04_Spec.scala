package com.martinbrosenberg.exercises.scalaproblems.lists

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.scalaproblems.lists.E04._
import com.martinbrosenberg.exercises.scalaproblems.lists.E04_Spec._

class E04_Spec extends BaseSpec {

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

object E04_Spec {

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
