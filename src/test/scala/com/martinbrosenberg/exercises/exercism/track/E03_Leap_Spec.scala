package com.martinbrosenberg.exercises.exercism.track

import org.scalatest.{FunSuite, Matchers}

/** @version 1.3.0 */
class E03_Leap_Spec extends FunSuite with Matchers {

  test("year not divisible by 4: common year") {
    E03_Leap.leapYear(2015) should be (false)
  }

  test("year divisible by 4, not divisible by 100: leap year") {
    E03_Leap.leapYear(1996) should be (true)
  }

  test("year divisible by 100, not divisible by 400: common year") {
    E03_Leap.leapYear(2100) should be (false)
  }

  test("year divisible by 400: leap year") {
    E03_Leap.leapYear(2000) should be (true)
  }
}
