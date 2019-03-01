package com.martinbrosenberg.exercises.scalaproblems.lists

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.scalaproblems.lists.E01._
import com.martinbrosenberg.exercises.scalaproblems.lists.E01_Spec._

class E01_Spec extends BaseSpec {

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

object E01_Spec {

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