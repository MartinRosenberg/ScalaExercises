package com.martinbrosenberg.exercises.exercism.side

import com.martinbrosenberg.exercises.exercism.ExercismBaseSpec
import com.martinbrosenberg.exercises.exercism.side.collatzconjecture.CollatzConjecture

/** @version 1.2.0 */
class CollatzConjecture_Spec extends ExercismBaseSpec {

  test("zero steps for one") {
    CollatzConjecture.steps(1) should be (Some(0))
  }

  test("divide if even") {
    CollatzConjecture.steps(16) should be (Some(4))
  }

  test("even and odd steps") {
    CollatzConjecture.steps(12) should be (Some(9))
  }

  test("Large number of even and odd steps") {
    CollatzConjecture.steps(1000000) should be (Some(152))
  }

  test("zero is an error") {
    CollatzConjecture.steps(0) should be (None)
  }

  test("negative value is an error") {
    CollatzConjecture.steps(-15) should be (None)
  }

}
