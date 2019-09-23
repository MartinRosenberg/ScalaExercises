package com.martinbrosenberg.exercises.exercism.track

import com.martinbrosenberg.exercises.exercism.ExercismBaseSpec

/** @version 1.2.0 */
class E02_TwoFer_Spec extends ExercismBaseSpec {

  test("no name given") {
    E02_TwoFer.twofer() should be ("One for you, one for me.")
  }

  test("empty name given") {
    E02_TwoFer.twofer("") should be ("One for you, one for me.")
  }

  test("null given") {
    E02_TwoFer.twofer(null) should be ("One for you, one for me.")
  }

  test("a name given") {
    E02_TwoFer.twofer("Alice") should be ("One for Alice, one for me.")
  }

  test("another name given") {
    E02_TwoFer.twofer("Bob") should be ("One for Bob, one for me.")
  }


}