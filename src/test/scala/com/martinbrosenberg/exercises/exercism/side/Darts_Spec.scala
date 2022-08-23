package com.martinbrosenberg.exercises.exercism.side

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.exercism.side.darts.Darts

/** @version 1.0.0 */
class Darts_Spec extends BaseSpec {

  "A dart lands outside the target" in {
    Darts.score(15.3, 13.2) should be (0)
  }

  "A dart lands just in the border of the target" in {
    Darts.score(10, 0) should be (1)
  }

  "A dart lands in the middle circle" in {
    Darts.score(3, 3.7) should be (5)
  }

  "A dart lands right in the border between outside and middle circles" in {
    Darts.score(0, 5) should be (5)
  }

  "A dart lands in the inner circle" in {
    Darts.score(0, 0) should be (10)
  }

}
