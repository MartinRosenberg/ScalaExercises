package com.martinbrosenberg.exercises.exercism.side

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.exercism.side.pangram.Pangram

/** @version 1.4.0 */
class Pangram_Spec extends BaseSpec {

  "sentence empty" in {
    Pangram.isPangram("") should be (false)
  }

  "recognizes a perfect lower case pangram" in {
    Pangram.isPangram("abcdefghijklmnopqrstuvwxyz") should be (true)
  }

  "pangram with only lower case" in {
    Pangram.isPangram("the quick brown fox jumps over the lazy dog") should be (true)
  }

  "missing character 'x'" in {
    Pangram.isPangram("a quick movement of the enemy will jeopardize five gunboats") should be (false)
  }

  "another missing character, e.g. 'h'" in {
    Pangram.isPangram("five boxing wizards jump quickly at it") should be (false)
  }

  "pangram with underscores" in {
    Pangram.isPangram("the_quick_brown_fox_jumps_over_the_lazy_dog") should be (true)
  }

  "pangram with numbers" in {
    Pangram.isPangram("the 1 quick brown fox jumps over the 2 lazy dogs") should be (true)
  }

  "missing letters replaced by numbers" in {
    Pangram.isPangram("7h3 qu1ck brown fox jumps ov3r 7h3 lazy dog") should be (false)
  }

  "pangram with mixed case and punctuation" in {
    Pangram.isPangram(""""Five quacking Zephyrs jolt my wax bed."""") should be (true)
  }

  "upper and lower case versions of the same character should not be counted separately" in {
    Pangram.isPangram("the quick brown fox jumps over with lazy FX") should be (false)
  }

}