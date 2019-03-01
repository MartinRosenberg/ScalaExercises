package com.martinbrosenberg.problems.scalaproblems.lists

import com.martinbrosenberg.problems.BaseSpec
import com.martinbrosenberg.problems.scalaproblems.lists.P05._
import com.martinbrosenberg.problems.scalaproblems.lists.P05_Spec._

class P05_Spec extends BaseSpec {

  for ((fnName, reverse) <- functions) {
    s"Using function $fnName" - {
      for (TestCase(list, reversed) <- testCases) {
        s"$list should be reversed to $reversed" in {
          assertResult(reversed)(reverse(list))
        }
      }
    }
  }

}

object P05_Spec {

  private val functions = Seq[(String, List[Int] => List[Int])](
    ("reverse_1", reverse_1),
    ("reverse_2", reverse_2),
    ("reverse_3", reverse_3),
  )

  private case class TestCase[T](list: List[T], reversed: List[T])

  private val testCases = Seq[TestCase[Int]](
    TestCase(Nil, Nil),
    TestCase(List(1), List(1)),
    TestCase(List(0, 1, 1, 2, 3, 5, 8), List(8, 5, 3, 2, 1, 1, 0)),
  )

}
