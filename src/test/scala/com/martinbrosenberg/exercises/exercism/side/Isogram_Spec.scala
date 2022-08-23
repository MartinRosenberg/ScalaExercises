package com.martinbrosenberg.exercises.exercism.side

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.exercism.side.isogram.Isogram

/** @version 1.4.0 */
class Isogram_Spec extends BaseSpec {

  "empty string" in {
    Isogram.isIsogram("") should be(true)
  }

  "isogram with only lower case characters" in {
    Isogram.isIsogram("isogram") should be(true)
  }

  "word with one duplicated character" in {
    Isogram.isIsogram("eleven") should be(false)
  }

  "word with one duplicated character from the end of the alphabet" in {
    Isogram.isIsogram("zzyzx") should be(false)
  }

  "longest reported english isogram" in {
    Isogram.isIsogram("subdermatoglyphic") should be(true)
  }

  "word with duplicated character in mixed case" in {
    Isogram.isIsogram("Alphabet") should be(false)
  }

  "hypothetical isogrammic word with hyphen" in {
    Isogram.isIsogram("thumbscrew-japingly") should be(true)
  }

  "isogram with duplicated hyphen" in {
    Isogram.isIsogram("six-year-old") should be(true)
  }

  "made-up name that is an isogram" in {
    Isogram.isIsogram("Emily Jung Schwartzkopf") should be(true)
  }

  "duplicated character in the middle" in {
    Isogram.isIsogram("accentor") should be(false)
  }

}