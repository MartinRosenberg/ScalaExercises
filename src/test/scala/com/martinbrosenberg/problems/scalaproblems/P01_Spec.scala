package com.martinbrosenberg.problems.scalaproblems

import com.martinbrosenberg.problems.BaseSpec
import com.martinbrosenberg.problems.scalaproblems.P01._
import com.martinbrosenberg.problems.scalaproblems.P01_Spec._

class P01_Spec extends BaseSpec {

  for ((fnName, last) <- functions) {
    s"Function $fnName should" - {
      for ((list, elem) <- testCases) {
        s"correctly find the last element of $list" in {
          assertResult(elem)(last(list))
        }
      }

      s"throw a NoSuchElementException for an empty list" in {
        assertThrows[NoSuchElementException](last(Nil))
      }
    }
  }

}

object P01_Spec {

  private val functions = Seq[(String, List[Int] => Int)](
    ("last_1", last_1),
    ("last_2", last_2),
    ("last_3", last_3),
  )

  private val testCases = Seq[(List[Int], Int)](
    (List(1), 1),
    (List(0, 1, 1, 2, 3, 5, 8), 8),
  )

}