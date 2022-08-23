package com.martinbrosenberg.exercises.exercism.side

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.exercism.side.collatzconjecture.CollatzConjecture

/** @version 1.2.0 */
class CollatzConjecture_Spec extends BaseSpec {

  "zero steps for one" in {
    CollatzConjecture.steps(1) should be (Some(0))
  }

  "divide if even" in {
    CollatzConjecture.steps(16) should be (Some(4))
  }

  "even and odd steps" in {
    CollatzConjecture.steps(12) should be (Some(9))
  }

  "Large number of even and odd steps" in {
    CollatzConjecture.steps(1000000) should be (Some(152))
  }

  "zero is an error" in {
    CollatzConjecture.steps(0) should be (None)
  }

  "negative value is an error" in {
    CollatzConjecture.steps(-15) should be (None)
  }

}
