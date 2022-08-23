package com.martinbrosenberg.exercises.exercism.side

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.exercism.side.sumofmultiples.SumOfMultiples

/** @version 1.2.0 */
class SumOfMultiples_Spec extends BaseSpec {

  "multiples of 3 or 5 up to 1" in {
    SumOfMultiples.sum(Set(3, 5), 1) should be(0)
  }

  "multiples of 3 or 5 up to 4" in {
    SumOfMultiples.sum(Set(3, 5), 4) should be(3)
  }

  "multiples of 3 up to 7" in {
    SumOfMultiples.sum(Set(3), 7) should be(9)
  }

  "multiples of 3 or 5 up to 10" in {
    SumOfMultiples.sum(Set(3, 5), 10) should be(23)
  }

  "multiples of 3 or 5 up to 100" in {
    SumOfMultiples.sum(Set(3, 5), 100) should be(2318)
  }

  "multiples of 3 or 5 up to 1000" in {
    SumOfMultiples.sum(Set(3, 5), 1000) should be(233168)
  }

  "multiples of 7, 13 or 17 up to 20" in {
    SumOfMultiples.sum(Set(7, 13, 17), 20) should be(51)
  }

  "multiples of 4 or 6 up to 15" in {
    SumOfMultiples.sum(Set(4, 6), 15) should be(30)
  }

  "multiples of 5, 6 or 8 up to 150" in {
    SumOfMultiples.sum(Set(5, 6, 8), 150) should be(4419)
  }

  "multiples of 5 or 25 up to 51" in {
    SumOfMultiples.sum(Set(5, 25), 51) should be(275)
  }

  "multiples of 43 or 47 up to 10000" in {
    SumOfMultiples.sum(Set(43, 47), 10000) should be(2203160)
  }

  "multiples of 1 up to 100" in {
    SumOfMultiples.sum(Set(1), 100) should be(4950)
  }

  "multiples of an empty list up to 10000" in {
    SumOfMultiples.sum(Set(), 10000) should be(0)
  }

}
