package com.martinbrosenberg.exercises.exercism.track

import org.scalatest.{FunSuite, Matchers}

/** @version 1.4.0 */
class E05_Bob_Spec extends FunSuite with Matchers {

  test("stating something") {
    E05_Bob.response("Tom-ay-to, tom-aaaah-to.") should be("Whatever.")
  }

  test("shouting") {
    E05_Bob.response("WATCH OUT!") should
      be("Whoa, chill out!")
  }

  test("shouting gibberish") {
    E05_Bob.response("FCECDFCAAB") should
      be("Whoa, chill out!")
  }

  test("asking a question") {
    E05_Bob.response("Does this cryogenic chamber make me look fat?") should
      be("Sure.")
  }

  test("asking a numeric question") {
    E05_Bob.response("You are, what, like 15?") should
      be("Sure.")
  }

  test("asking gibberish") {
    E05_Bob.response("fffbbcbeab?") should
      be("Sure.")
  }

  test("talking forcefully") {
    E05_Bob.response("Let's go make out behind the gym!") should
      be("Whatever.")
  }

  test("using acronyms in regular speech") {
    E05_Bob.response("It's OK if you don't want to go to the DMV.") should
      be("Whatever.")
  }

  test("forceful question") {
    E05_Bob.response("WHAT THE HELL WERE YOU THINKING?") should
      be("Calm down, I know what I'm doing!")
  }

  test("shouting numbers") {
    E05_Bob.response("1, 2, 3 GO!") should
      be("Whoa, chill out!")
  }

  test("no letters") {
    E05_Bob.response("1, 2, 3") should
      be("Whatever.")
  }

  test("question with no letters") {
    E05_Bob.response("4?") should
      be("Sure.")
  }

  test("shouting with special characters") {
    E05_Bob.response("ZOMG THE %^*@#$(*^ ZOMBIES ARE COMING!!11!!1!") should
      be("Whoa, chill out!")
  }

  test("shouting with no exclamation mark") {
    E05_Bob.response("I HATE THE DMV") should
      be("Whoa, chill out!")
  }

  test("statement containing question mark") {
    E05_Bob.response("Ending with ? means a question.") should
      be("Whatever.")
  }

  test("non-letters with question") {
    E05_Bob.response(":) ?") should
      be("Sure.")
  }

  test("prattling on") {
    E05_Bob.response("Wait! Hang on. Are you going to be OK?") should
      be("Sure.")
  }

  test("silence") {
    E05_Bob.response("") should
      be("Fine. Be that way!")
  }

  test("prolonged silence") {
    E05_Bob.response("          ") should
      be("Fine. Be that way!")
  }

  test("alternate silence") {
    E05_Bob.response("										") should
      be("Fine. Be that way!")
  }

  test("multiple line question") {
    E05_Bob.response("\nDoes this cryogenic chamber make me look fat?\nNo.") should
      be("Whatever.")
  }

  test("starting with whitespace") {
    E05_Bob.response("         hmmmmmmm...") should
      be("Whatever.")
  }

  test("ending with whitespace") {
    E05_Bob.response("Okay if like my  spacebar  quite a bit?   ") should
      be(
      "Sure.")
  }

  test("other whitespace") {
    E05_Bob.response("\n                 	") should
      be("Fine. Be that way!")
  }

  test("non-question ending with whitespace") {
    E05_Bob.response("This is a statement ending with whitespace      ") should
      be("Whatever.")
  }
}
