package com.martinbrosenberg.exercises.exercism.track

import com.martinbrosenberg.exercises.exercism.ExercismBaseSpec

/** @version 1.2.0 */
class E10_SecretHandshake_Spec extends ExercismBaseSpec {

  test("wink for 1") {
    E10_SecretHandshake.commands(1) should be (List("wink"))
  }

  test("double blink for 10") {
    E10_SecretHandshake.commands(2) should be (List("double blink"))
  }

  test("close your eyes for 100") {
    E10_SecretHandshake.commands(4) should be (List("close your eyes"))
  }

  test("jump for 1000") {
    E10_SecretHandshake.commands(8) should be (List("jump"))
  }

  test("combine two actions") {
    E10_SecretHandshake.commands(3) should be (List("wink", "double blink"))
  }

  test("reverse two actions") {
    E10_SecretHandshake.commands(19) should be (List("double blink", "wink"))
  }

  test("reversing one action gives the same action") {
    E10_SecretHandshake.commands(24) should be (List("jump"))
  }

  test("reversing no actions still gives no actions") {
    E10_SecretHandshake.commands(16) should be (List())
  }

  test("all possible actions") {
    E10_SecretHandshake.commands(15) should be (List("wink", "double blink", "close your eyes", "jump"))
  }

  test("reverse all possible actions") {
    E10_SecretHandshake.commands(31) should be (List("jump", "close your eyes", "double blink", "wink"))
  }

  test("do nothing for zero") {
    E10_SecretHandshake.commands(0) should be (List())
  }

}