package com.martinbrosenberg.exercises.ctci.chapter01

import com.github.dwickern.macros.NameOf._
import com.martinbrosenberg.exercises.ctci.CtciBaseSpec
import com.martinbrosenberg.exercises.ctci.chapter01.E03_Urlify._
import com.martinbrosenberg.exercises.ctci.chapter01.E03_Urlify_Spec._

class E03_Urlify_Spec extends CtciBaseSpec {

  for (TestCase(str, strLen, urlifiedStr) <- testCases) {
    s"'${str.trim}' should have each ' ' replaced with '%20'" - {

      for ((name, function) <- outOfPlaceFunctions) {
        s"out-of-place by $name" in {
          function(str) shouldBe urlifiedStr
        }
      }

      for ((name, function) <- inPlaceFunctions) {
        s"in-place by $name" in {
          val arr = str.toCharArray
          function(arr, strLen)
          arr.mkString shouldBe urlifiedStr
        }
      }

    }
  }

}

object E03_Urlify_Spec {

  private case class TestCase(s: String, len: Int, urlified: String)

  private val testCases: Seq[TestCase] = Seq(
    TestCase("Mr John Smith    ", 13, "Mr%20John%20Smith"), // given
    TestCase("hello", 5, "hello"),
    TestCase("", 0, ""),
  )

  private val outOfPlaceFunctions: Seq[(String, String => String)] = Seq(
    nameOf(urlify_1 _) -> urlify_1,
  )

  private val inPlaceFunctions: Seq[(String, (Array[Char], Int) => Unit)] = Seq(
    nameOf(urlify_2 _) -> urlify_2,
    nameOf(urlify_3 _) -> urlify_3,
  )

}