package com.martinbrosenberg.exercises.ctci.chapter01

import com.github.dwickern.macros.NameOf._
import com.martinbrosenberg.exercises.ctci.CtciBaseSpec
import com.martinbrosenberg.exercises.ctci.chapter01.E04_PalindromePermutation._
import com.martinbrosenberg.exercises.ctci.chapter01.E04_PalindromePermutation_Spec._

class E04_PalindromePermutation_Spec extends CtciBaseSpec {

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

object E04_PalindromePermutation_Spec {

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
    nameOf(isPalindromePermutation_1 _) -> isPalindromePermutation_1,
  )

}