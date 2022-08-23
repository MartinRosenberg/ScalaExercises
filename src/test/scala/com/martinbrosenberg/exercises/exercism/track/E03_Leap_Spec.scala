package com.martinbrosenberg.exercises.exercism.track

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.exercism.track.e03_leap.Leap

/** @version 1.3.0 */
class E03_Leap_Spec extends BaseSpec {

  "year not divisible by 4: common year" in {
    Leap.leapYear(2015) should be (false)
  }

  "year divisible by 4, not divisible by 100: leap year" in {
    Leap.leapYear(1996) should be (true)
  }

  "year divisible by 100, not divisible by 400: common year" in {
    Leap.leapYear(2100) should be (false)
  }

  "year divisible by 400: leap year" in {
    Leap.leapYear(2000) should be (true)
  }

}
