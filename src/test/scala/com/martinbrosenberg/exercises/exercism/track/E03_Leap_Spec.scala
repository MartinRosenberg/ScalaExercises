package com.martinbrosenberg.exercises.exercism.track

import com.martinbrosenberg.exercises.exercism.track.e03_leap.Leap
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

/** @version 1.3.0 */
class E03_Leap_Spec extends AnyFunSuite with Matchers {

  test("year not divisible by 4: common year") {
    Leap.leapYear(2015) should be (false)
  }

  test("year divisible by 4, not divisible by 100: leap year") {
    Leap.leapYear(1996) should be (true)
  }

  test("year divisible by 100, not divisible by 400: common year") {
    Leap.leapYear(2100) should be (false)
  }

  test("year divisible by 400: leap year") {
    Leap.leapYear(2000) should be (true)
  }

}
