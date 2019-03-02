package com.martinbrosenberg.exercises.scalaproblems.lists

import com.github.dwickern.macros.NameOf.nameOf
import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.scalaproblems.lists.E06._
import com.martinbrosenberg.exercises.scalaproblems.lists.E06_Spec._

class E06_Spec extends BaseSpec {

  for ((fnName, isPalindrome) <- functions) {
    s"Using function $fnName" - {
      for (TestCase(list, res) <- testCases) {
        s"$list should ${if (res) "" else "not "}be a palindrome" in {
          assertResult(res)(isPalindrome(list))
        }
      }
    }
  }

}

object E06_Spec {

  private val functions = Seq[(String, Seq[Int] => Boolean)](
    nameOf(isPalindrome_1 _) -> isPalindrome_1,
    nameOf(isPalindrome_2 _) -> isPalindrome_2,
    nameOf(isPalindrome_3 _) -> isPalindrome_3,
  )

  private case class TestCase[T](list: Seq[T], isPalindrome: Boolean)

  private val testCases = Seq[TestCase[Int]](
    TestCase(Nil, true),
    TestCase(Seq(1), true),
    TestCase(Seq(1, 1), true),
    TestCase(Seq(1, 2), false),
    TestCase(Seq(1, 2, 1), true),
    TestCase(Seq(1, 2, 2), false),
    TestCase(Seq(1, 2, 2, 1), true),
    TestCase(Seq(1, 2, 3, 2, 1), true),
  )

}
