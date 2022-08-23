package com.martinbrosenberg.exercises.codewars

import com.martinbrosenberg.exercises.BaseSpec

class HumanReadableTime_Spec extends BaseSpec {

  "zero" in {
    HumanReadableTime.format(0).success.value should be ("00:00:00")
  }

  "seconds only" in {
    HumanReadableTime.format(5).success.value should be ("00:00:05")
  }

  "minutes only" in {
    HumanReadableTime.format(60).success.value should be ("00:01:00")
  }

  "24 hours" in {
    HumanReadableTime.format(86399).success.value should be ("23:59:59")
  }

  "100 hours" in {
    HumanReadableTime.format(359999).success.value should be ("99:59:59")
  }

  "negative" in {
    HumanReadableTime.format(-1).failure.exception should be (an [IllegalArgumentException])
  }

}
