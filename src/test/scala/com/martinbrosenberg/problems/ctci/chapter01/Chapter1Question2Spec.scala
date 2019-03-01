package com.martinbrosenberg.problems.ctci.chapter01

import com.github.dwickern.macros.NameOf._
import com.martinbrosenberg.problems.ctci.CtciBaseSpec
import com.martinbrosenberg.problems.ctci.chapter01.Chapter1Question2._
import com.martinbrosenberg.problems.ctci.chapter01.Chapter1Question2Spec._

class Chapter1Question2Spec extends CtciBaseSpec {

  for ((name, function) <- functions) {
    s"`$name` should correctly determine whether" - {
      for (TestCase(s1, s2, isPermutation) <- testCases) {
        s"'$s1' and '$s2' are permutations" in {
          function(s1, s2) shouldBe isPermutation
        }
      }
    }
  }

}

object Chapter1Question2Spec {

  private case class TestCase(s1: String, s2: String, isPermutation: Boolean)

  private val testCases = Seq[TestCase](
    TestCase("abc", "cba", isPermutation = true ),
    TestCase("abc", "bac", isPermutation = true ),
    TestCase("",    "",    isPermutation = true ),
    TestCase("abc", "abc", isPermutation = true ),
    TestCase("abc", "",    isPermutation = false),
    TestCase("",    "abc", isPermutation = false),
  )

  private val functions = Seq[(String, (String, String) => Boolean)](
    nameOf(isPermutation1 _) -> isPermutation1,
    nameOf(isPermutation2 _) -> isPermutation2,
  )

}