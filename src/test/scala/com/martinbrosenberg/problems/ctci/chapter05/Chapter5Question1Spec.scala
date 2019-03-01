package com.martinbrosenberg.problems.ctci.chapter05

import com.github.dwickern.macros.NameOf._
import com.martinbrosenberg.problems.ctci.CtciBaseSpec
import com.martinbrosenberg.problems.ctci.chapter05.Chapter5Question1._
import com.martinbrosenberg.problems.ctci.chapter05.Chapter5Question1Spec._

class Chapter5Question1Spec extends CtciBaseSpec {

  s"`${nameOf(insert1 _)}` should correctly insert" - {
    for (TestCase(n, m, i, j, res) <- testCases) {
      f"${m.toBinaryString} into ${n.toBinaryString} in bits $i to $j" in {
        insert1(n, m, i, j) shouldBe res
      }
    }
  }

}

object Chapter5Question1Spec {

  private case class TestCase(n: Int, m: Int, i: Int, j: Int, res: Int)

  private val testCases: Seq[TestCase] = Seq(
    TestCase(0, 0, 0, 0, 0),
    TestCase(0xff,  0xa,  4, 7, 0xaf ), // b"11111111", b"1010", b"10101111"
    TestCase(0xff,  0xa,  0, 3, 0xfa ), // b"11111111", b"1010", b"10101111"
    TestCase(0xff,  0xa,  0, 7, 0xa  ), // b"11111111", b"1010", b"10101111"
    TestCase(0x400, 0x13, 2, 6, 0x44c), // b"10000000000", b"10011", b"10001001100"
  )

}
