package com.martinbrosenberg.exercises.exercism.side

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.exercism.side.series.Series

/** @version created manually */
class Series_Spec extends BaseSpec {

  "slices of one" in {
    Series.slices(1, "") should be (List())
    Series.slices(1, "01234") should be (List(List(0), List(1), List(2),
      List(3), List(4)))
  }

  "slices of two" in {
    Series.slices(2, "") should be (List())
    Series.slices(2, "01") should be (List(List(0, 1)))
    Series.slices(2, "01234") should be (List(List(0, 1), List(1, 2), List(2, 3),
      List(3, 4)))
  }

  "slices of three" in {
    Series.slices(3, "") should be (List())
    Series.slices(3, "012") should be (List(List(0, 1, 2)))
    Series.slices(3, "01234") should be (List(List(0, 1, 2), List(1, 2, 3),
      List(2, 3, 4)))
  }

}
