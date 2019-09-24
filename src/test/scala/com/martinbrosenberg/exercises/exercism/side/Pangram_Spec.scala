package com.martinbrosenberg.exercises.exercism.side

import com.martinbrosenberg.exercises.exercism.ExercismBaseSpec

/** @version 1.4.0 */
class Pangram_Spec extends ExercismBaseSpec {

  test("sentence empty") {
    Pangram.isPangram("") should be (false)
  }

  test("recognizes a perfect lower case pangram") {
    Pangram.isPangram("abcdefghijklmnopqrstuvwxyz") should be (true)
  }

  test("pangram with only lower case") {
    Pangram.isPangram("the quick brown fox jumps over the lazy dog") should be (true)
  }

  test("missing character 'x'") {
    Pangram.isPangram("a quick movement of the enemy will jeopardize five gunboats") should be (false)
  }

  test("another missing character, e.g. 'h'") {
    Pangram.isPangram("five boxing wizards jump quickly at it") should be (false)
  }

  test("pangram with underscores") {
    Pangram.isPangram("the_quick_brown_fox_jumps_over_the_lazy_dog") should be (true)
  }

  test("pangram with numbers") {
    Pangram.isPangram("the 1 quick brown fox jumps over the 2 lazy dogs") should be (true)
  }

  test("missing letters replaced by numbers") {
    Pangram.isPangram("7h3 qu1ck brown fox jumps ov3r 7h3 lazy dog") should be (false)
  }

  test("pangram with mixed case and punctuation") {
    Pangram.isPangram(""""Five quacking Zephyrs jolt my wax bed."""") should be (true)
  }

  test("upper and lower case versions of the same character should not be counted separately") {
    Pangram.isPangram("the quick brown fox jumps over with lazy FX") should be (false)
  }

}