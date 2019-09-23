package com.martinbrosenberg.exercises.codewars

import com.martinbrosenberg.exercises.exercism.ExercismBaseSpec

class HumanReadableTime_Spec extends ExercismBaseSpec {

  test("zero") {
    HumanReadableTime.format(0).success.value should be ("00:00:00")
  }

  test("seconds only") {
    HumanReadableTime.format(5).success.value should be ("00:00:05")
  }

  test("minutes only") {
    HumanReadableTime.format(60).success.value should be ("00:01:00")
  }

  test("24 hours") {
    HumanReadableTime.format(86399).success.value should be ("23:59:59")
  }

  test("100 hours") {
    HumanReadableTime.format(359999).success.value should be ("99:59:59")
  }

  test("negative") {
    HumanReadableTime.format(-1).failure.exception should be (an [IllegalArgumentException])
  }

}
