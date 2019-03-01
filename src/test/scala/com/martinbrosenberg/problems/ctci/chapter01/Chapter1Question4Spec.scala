package com.martinbrosenberg.problems.ctci.chapter01

import com.github.dwickern.macros.NameOf._
import com.martinbrosenberg.problems.ctci.CtciBaseSpec
import com.martinbrosenberg.problems.ctci.chapter01.Chapter1Question4._
import com.martinbrosenberg.problems.ctci.chapter01.Chapter1Question4Spec._

class Chapter1Question4Spec extends CtciBaseSpec {

  for ((name, function) <- functions) {
    s"`$name` should correctly determine whether" - {
      for (TestCase(s, isPermutation) <- testCases) {
        s"'$s' is a permutation of a palindrome" in {
          function(s) shouldBe isPermutation
        }
      }
    }
  }

}

object Chapter1Question4Spec {

  private case class TestCase(s: String, isPermutation: Boolean)

  private val testCases: Seq[TestCase] = Seq(
    TestCase("", isPermutation = true), // empty string
    TestCase("tacoocat", isPermutation = true), // all twinned
    TestCase("tacocat", isPermutation = true), // all but one twinned
    TestCase("tactcoa", isPermutation = true), // out of order
    TestCase("TACtcoa", isPermutation = true), // mixed case
    TestCase("t  act \ncoa\t", isPermutation = true), // whitespace
    TestCase(",ta.ct&coa%", isPermutation = true), // punctuation/symbols
    TestCase("tācßtcoāß", isPermutation = true), // non-ASCII letters
    TestCase("Hello World", isPermutation = false), // not a palindrome
  )

  private val functions: Seq[(String, String => Boolean)] = Seq(
    nameOf(isPalindromePermutation1 _) -> isPalindromePermutation1,
  )

}