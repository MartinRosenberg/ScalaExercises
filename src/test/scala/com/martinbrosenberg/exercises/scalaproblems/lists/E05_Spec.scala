package com.martinbrosenberg.exercises.scalaproblems.lists

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.scalaproblems.lists.E05._
import com.martinbrosenberg.exercises.scalaproblems.lists.E05_Spec._

class E05_Spec extends BaseSpec {

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

object E05_Spec {

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
