package com.martinbrosenberg.problems.ctci.chapter01

import com.github.dwickern.macros.NameOf._
import com.martinbrosenberg.problems.ctci.CtciBaseSpec
import com.martinbrosenberg.problems.ctci.chapter01.Chapter1Question1._
import com.martinbrosenberg.problems.ctci.chapter01.Chapter1Question1Spec._

class Chapter1Question1Spec extends CtciBaseSpec {

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

object Chapter1Question1Spec {

  private case class TestCase(string: String, isUnique: Boolean)

  private val testCases = Seq[TestCase](
    TestCase("",      isUnique = true ),
    TestCase("abcde", isUnique = true ),
    TestCase("hello", isUnique = false),
    TestCase("river", isUnique = false),
  )

  private val functions = Seq[(String, String => Boolean)](
    nameOf(isUnique1 _) -> isUnique1,
    nameOf(isUnique2 _) -> isUnique2,
    nameOf(isUnique3 _) -> isUnique3,
    nameOf(isUnique4 _) -> isUnique4,
    nameOf(isUnique5 _) -> isUnique5,
    nameOf(isUnique6 _) -> isUnique6,
  )

}