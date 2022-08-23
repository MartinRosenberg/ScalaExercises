package com.martinbrosenberg.exercises.exercism.side

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.exercism.side.say.Say

/** @version 1.1.0 */
class Say_Spec extends BaseSpec {

  "zero" in {
    Say.inEnglish(0) should be(Some("zero"))
  }

  "one" in {
    Say.inEnglish(1) should be(Some("one"))
  }

  "fourteen" in {
    Say.inEnglish(14) should be(Some("fourteen"))
  }

  "twenty" in {
    Say.inEnglish(20) should be(Some("twenty"))
  }

  "twenty-two" in {
    Say.inEnglish(22) should be(Some("twenty-two"))
  }

  "one hundred" in {
    Say.inEnglish(100) should be(Some("one hundred"))
  }

  "one hundred twenty-three" in {
    Say.inEnglish(123) should be(Some("one hundred twenty-three"))
  }

  "one thousand" in {
    Say.inEnglish(1000) should be(Some("one thousand"))
  }

  "one thousand two hundred thirty-four" in {
    Say.inEnglish(1234) should be(Some("one thousand two hundred thirty-four"))
  }

  "one million" in {
    Say.inEnglish(1000000) should be(Some("one million"))
  }

  "one million two thousand three hundred forty-five" in {
    Say.inEnglish(1002345) should be(Some("one million two thousand three hundred forty-five"))
  }

  "one billion" in {
    Say.inEnglish(1000000000) should be(Some("one billion"))
  }

  "a big number" in {
    Say.inEnglish(987654321123L) should be(Some("nine hundred eighty-seven billion six hundred fifty-four million three hundred twenty-one thousand one hundred twenty-three"))
  }

  "numbers below zero are out of range" in {
    Say.inEnglish(-1) should be(None)
  }

  "numbers above 999,999,999,999 are out of range" in {
    Say.inEnglish(1000000000000L) should be(None)
  }
}
