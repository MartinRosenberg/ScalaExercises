package com.martinbrosenberg.exercises.exercism.side

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.exercism.side.rotationalcipher.RotationalCipher

/** @version 1.2.0 */
class RotationalCipher_Spec extends BaseSpec {

  "rotate a by 0, same output as input" in {
    RotationalCipher.rotate("a", 0) should be("a")
  }

  "rotate a by 1" in {
    RotationalCipher.rotate("a", 1) should be("b")
  }

  "rotate a by 26, same output as input" in {
    RotationalCipher.rotate("a", 26) should be("a")
  }

  "rotate m by 13" in {
    RotationalCipher.rotate("m", 13) should be("z")
  }

  "rotate n by 13 with wrap around alphabet" in {
    RotationalCipher.rotate("n", 13) should be("a")
  }

  "rotate capital letters" in {
    RotationalCipher.rotate("OMG", 5) should be("TRL")
  }

  "rotate spaces" in {
    RotationalCipher.rotate("O M G", 5) should be("T R L")
  }

  "rotate numbers" in {
    RotationalCipher.rotate("Testing 1 2 3 testing", 4) should be(
      "Xiwxmrk 1 2 3 xiwxmrk")
  }

  "rotate punctuation" in {
    RotationalCipher.rotate("Let's eat, Grandma!", 21) should be(
      "Gzo'n zvo, Bmviyhv!")
  }

  "rotate all letters" in {
    RotationalCipher.rotate("The quick brown fox jumps over the lazy dog.", 13) should be(
      "Gur dhvpx oebja sbk whzcf bire gur ynml qbt.")
  }

}
