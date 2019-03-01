package com.martinbrosenberg.exercises.ctci.chapter01

import com.github.dwickern.macros.NameOf._
import com.martinbrosenberg.exercises.ctci.CtciBaseSpec
import com.martinbrosenberg.exercises.ctci.chapter01.E01_IsUnique._
import com.martinbrosenberg.exercises.ctci.chapter01.E01_IsUnique_Spec._

class E01_IsUnique_Spec extends CtciBaseSpec {

  for ((name, function) <- functions) {
    s"`$name` should correctly determine whether all characters are unique in" - {
      for (TestCase(string, isUnique) <- testCases) {
        s"'$string'" in {
          function(string) shouldBe isUnique
        }
      }
    }
  }

}

object E01_IsUnique_Spec {

  private case class TestCase(string: String, isUnique: Boolean)

  private val testCases = Seq[TestCase](
    TestCase("",      isUnique = true ),
    TestCase("abcde", isUnique = true ),
    TestCase("hello", isUnique = false),
    TestCase("river", isUnique = false),
  )

  private val functions = Seq[(String, String => Boolean)](
    nameOf(isUnique_1 _) -> isUnique_1,
    nameOf(isUnique_2 _) -> isUnique_2,
    nameOf(isUnique_3 _) -> isUnique_3,
    nameOf(isUnique_4 _) -> isUnique_4,
    nameOf(isUnique_5 _) -> isUnique_5,
    nameOf(isUnique_6 _) -> isUnique_6,
  )

}