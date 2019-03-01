package com.martinbrosenberg.problems.scalaproblems.lists

import com.martinbrosenberg.problems.BaseSpec
import com.martinbrosenberg.problems.scalaproblems.lists.P02._
import com.martinbrosenberg.problems.scalaproblems.lists.P02_Spec._

class P02_Spec extends BaseSpec {

  for ((fnName, penultimate) <- functions) {
    s"Using function $fnName" - {
      "the penultimate element of" - {
        for ((list, elem) <- testCases) {
          s"$list should be $elem" in {
            assertResult(elem)(penultimate(list))
          }
        }
      }

      "a NoSuchElementException should be thrown for" - {
        "an empty list" in {
          assertThrows[NoSuchElementException](penultimate(Nil))
        }

        "a list of only one element" in {
          assertThrows[NoSuchElementException](penultimate(List(1)))
        }
      }
    }
  }

}

object P02_Spec {

  private val functions = Seq[(String, List[Int] => Int)](
    ("penultimate1", penultimate_1),
    ("penultimate2", penultimate_2),
  )

  private val testCases = Seq[(List[Int], Int)](
    (List(1, 2), 1),
    (List(0, 1, 1, 2, 3, 5, 8), 5),
  )

}
