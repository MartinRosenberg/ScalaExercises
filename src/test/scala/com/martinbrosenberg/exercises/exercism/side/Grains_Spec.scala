package com.martinbrosenberg.exercises.exercism.side

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.exercism.side.grains.Grains

/** @version 1.1.0 */
class Grains_Spec extends BaseSpec {

  "1" in {
    Grains.square(1) should be(Some(1))
  }

  "2" in {
    Grains.square(2) should be(Some(2))
  }

  "3" in {
    Grains.square(3) should be(Some(4))
  }

  "4" in {
    Grains.square(4) should be(Some(8))
  }

  "16" in {
    Grains.square(16) should be(Some(32768))
  }

  "32" in {
    Grains.square(32) should be(Some(BigInt("2147483648")))
  }

  "64" in {
    Grains.square(64) should be(Some(BigInt("9223372036854775808")))
  }

  "square 0 raises an exception" in {
    Grains.square(0) should be(None)
  }

  "negative square raises an exception" in {
    Grains.square(-1) should be(None)
  }

  "square greater than 64 raises an exception" in {
    Grains.square(65) should be(None)
  }

  "returns the total number of grains on the board" in {
    Grains.total should be(BigInt("18446744073709551615"))
  }

}
