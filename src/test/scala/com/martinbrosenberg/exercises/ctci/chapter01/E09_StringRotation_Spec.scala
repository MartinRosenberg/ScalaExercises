package com.martinbrosenberg.exercises.ctci.chapter01

import com.github.dwickern.macros.NameOf._
import com.martinbrosenberg.exercises.ctci.CtciBaseSpec
import com.martinbrosenberg.exercises.ctci.chapter01.E09_StringRotation._
import com.martinbrosenberg.exercises.ctci.chapter01.E09_StringRotation_Spec._

class E09_StringRotation_Spec extends CtciBaseSpec {

  s"`${nameOf(isRotation_1 _)}` should correctly determine whether" - {
    for (TestCase(s1, s2, isRotation) <- testCases) {
      s"'$s1' is a rotation of '$s2'" in {
        isRotation_1(s1, s2) shouldBe isRotation
      }
    }
  }

}

object E09_StringRotation_Spec {

  private case class TestCase(s1: String, s2: String, isRotation: Boolean)

  private val testCases: Seq[TestCase] = Seq(
    TestCase("waterbottle", "waterbottle",  isRotation = true ), // same string
    TestCase("waterbottle", "erbottlewat",  isRotation = true ), // left rotation
    TestCase("waterbottle", "tlewaterbot",  isRotation = true ), // right rotation
    TestCase("waterbottle", "fscpuumfxb",   isRotation = false), // same length, not a rotation
    TestCase("waterbottle", "erbottlewa",   isRotation = false), // substring rotation
    TestCase("waterbottle", "erbottlewate", isRotation = false), // superstring rotation
    TestCase("waterbottle", "erbottelwat",  isRotation = false), // out of order
    TestCase("waterbottle", "",             isRotation = false), // empty string
    TestCase("",            "waterbottle",  isRotation = false), // empty string
    TestCase("",            "",             isRotation = true ), // empty string, vacuously true
  )

}
