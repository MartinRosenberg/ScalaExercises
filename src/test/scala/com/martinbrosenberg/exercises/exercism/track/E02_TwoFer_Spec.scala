package com.martinbrosenberg.exercises.exercism.track

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.exercism.track.e02_twofer.Twofer

/** @version 1.2.0 */
class E02_TwoFer_Spec extends BaseSpec {

  "no name given" in {
    Twofer.twofer() should be ("One for you, one for me.")
  }

  "empty name given" in {
    Twofer.twofer("") should be ("One for you, one for me.")
  }

  "null given" in {
    Twofer.twofer(null) should be ("One for you, one for me.")
  }

  "a name given" in {
    Twofer.twofer("Alice") should be ("One for Alice, one for me.")
  }

  "another name given" in {
    Twofer.twofer("Bob") should be ("One for Bob, one for me.")
  }

}
