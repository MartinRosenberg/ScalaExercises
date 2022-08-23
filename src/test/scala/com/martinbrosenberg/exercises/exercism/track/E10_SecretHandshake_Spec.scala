package com.martinbrosenberg.exercises.exercism.track

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.exercism.track.e10_secrethandshake.SecretHandshake

/** @version 1.2.0 */
class E10_SecretHandshake_Spec extends BaseSpec {

  "wink for 1" in {
    SecretHandshake.commands(1) should be (List("wink"))
  }

  "double blink for 10" in {
    SecretHandshake.commands(2) should be (List("double blink"))
  }

  "close your eyes for 100" in {
    SecretHandshake.commands(4) should be (List("close your eyes"))
  }

  "jump for 1000" in {
    SecretHandshake.commands(8) should be (List("jump"))
  }

  "combine two actions" in {
    SecretHandshake.commands(3) should be (List("wink", "double blink"))
  }

  "reverse two actions" in {
    SecretHandshake.commands(19) should be (List("double blink", "wink"))
  }

  "reversing one action gives the same action" in {
    SecretHandshake.commands(24) should be (List("jump"))
  }

  "reversing no actions still gives no actions" in {
    SecretHandshake.commands(16) should be (List())
  }

  "all possible actions" in {
    SecretHandshake.commands(15) should be (List("wink", "double blink", "close your eyes", "jump"))
  }

  "reverse all possible actions" in {
    SecretHandshake.commands(31) should be (List("jump", "close your eyes", "double blink", "wink"))
  }

  "do nothing for zero" in {
    SecretHandshake.commands(0) should be (List())
  }

}