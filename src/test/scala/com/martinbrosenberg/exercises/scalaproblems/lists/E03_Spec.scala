package com.martinbrosenberg.exercises.scalaproblems.lists

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.scalaproblems.lists.E03._
import com.martinbrosenberg.exercises.scalaproblems.lists.E03_Spec._

class E03_Spec extends BaseSpec {

  for ((fnName, nth) <- functions) {
    s"Using function $fnName" - {
      for (TestCase(n, list, elem) <- testCases) {
        s"the ${n}th element of $list should be $elem" in {
          assertResult(elem)(nth(n, list))
        }
      }
    }

    s"$fnName should throw an `IndexOutOfBoundsException` for" - {
      s"any `n` on an empty list" in {
        assertThrows[IndexOutOfBoundsException](nth(0, Nil))
      }

      s"an `n` out of bounds" in {
        assertThrows[IndexOutOfBoundsException](nth(1, List(1)))
      }
    }
  }

}

object E03_Spec {

  private val functions = Seq[(String, (Int, List[Int]) => Int)](
    ("nth_1", nth1),
    ("nth_2", nth2),
  )

  private case class TestCase[T](n: Int, list: List[T], nth: T)

  private val testCases = Seq[TestCase[Int]](
    TestCase(0, List(1), 1),
    TestCase(0, List(0, 1, 1, 2, 3, 5, 8), 0),
    TestCase(6, List(0, 1, 1, 2, 3, 5, 8), 8),
  )

}