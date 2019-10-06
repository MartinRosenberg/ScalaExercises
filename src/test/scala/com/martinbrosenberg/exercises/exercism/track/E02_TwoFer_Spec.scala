package com.martinbrosenberg.exercises.exercism.track

import com.martinbrosenberg.exercises.exercism.ExercismBaseSpec
import com.martinbrosenberg.exercises.exercism.track.e02_twofer.Twofer

/** @version 1.2.0 */
class E02_TwoFer_Spec extends ExercismBaseSpec {

  test("no name given") {
    Twofer.twofer() should be ("One for you, one for me.")
  }

  test("empty name given") {
    Twofer.twofer("") should be ("One for you, one for me.")
  }

  test("null given") {
    Twofer.twofer(null) should be ("One for you, one for me.")
  }

  test("a name given") {
    Twofer.twofer("Alice") should be ("One for Alice, one for me.")
  }

  test("another name given") {
    Twofer.twofer("Bob") should be ("One for Bob, one for me.")
  }


}