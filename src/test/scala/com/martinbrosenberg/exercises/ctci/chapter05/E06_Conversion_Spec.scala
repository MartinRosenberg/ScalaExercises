package com.martinbrosenberg.exercises.ctci.chapter05

import com.github.dwickern.macros.NameOf._
import com.martinbrosenberg.exercises.ctci.CtciBaseSpec
import com.martinbrosenberg.exercises.ctci.chapter05.E06_Conversion._
import com.martinbrosenberg.exercises.ctci.chapter05.E06_Conversion_Spec._

class E06_Conversion_Spec extends CtciBaseSpec {

  for ((name, function) <- functions) {
    s"`$name` should correctly determine  the number of bits that differ between" - {
      for (TestCase(a, b, diffBits) <- testCases) {
        f"$a and $b" in {
          function(a, b) shouldBe diffBits
        }
      }
    }
  }

}

object E06_Conversion_Spec {

  private case class TestCase(a: Int, b: Int, diffBits: Int)

  private val testCases: Seq[TestCase] = Seq(
    TestCase(0,  0,  0 ), // b"0",     b"0"
    TestCase(29, 29, 0 ), // b"11101", b"11101"
    TestCase(29, 0,  4 ), // b"11101", b"0"
    TestCase(29, 15, 2 ), // b"11101", b"1111"
    TestCase(-1, 0,  32), // b"11111111111111111111111111111111", b"0"
  )

  private val functions: Seq[(String, (Int, Int) => Int)] = Seq(
    nameOf(numDifferentBits_1 _) -> numDifferentBits_1,
    nameOf(numDifferentBits_2 _) -> numDifferentBits_2,
  )

}
