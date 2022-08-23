package com.martinbrosenberg.exercises.exercism.track

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.exercism.track.e06_bob.Bob

/** @version 1.4.0 */
class E06_Bob_Spec extends BaseSpec {

  "stating something" in {
    Bob.response("Tom-ay-to, tom-aaaah-to.") should be("Whatever.")
  }

  "shouting" in {
    Bob.response("WATCH OUT!") should
      be("Whoa, chill out!")
  }

  "shouting gibberish" in {
    Bob.response("FCECDFCAAB") should
      be("Whoa, chill out!")
  }

  "asking a question" in {
    Bob.response("Does this cryogenic chamber make me look fat?") should
      be("Sure.")
  }

  "asking a numeric question" in {
    Bob.response("You are, what, like 15?") should
      be("Sure.")
  }

  "asking gibberish" in {
    Bob.response("fffbbcbeab?") should
      be("Sure.")
  }

  "talking forcefully" in {
    Bob.response("Let's go make out behind the gym!") should
      be("Whatever.")
  }

  "using acronyms in regular speech" in {
    Bob.response("It's OK if you don't want to go to the DMV.") should
      be("Whatever.")
  }

  "forceful question" in {
    Bob.response("WHAT THE HELL WERE YOU THINKING?") should
      be("Calm down, I know what I'm doing!")
  }

  "shouting numbers" in {
    Bob.response("1, 2, 3 GO!") should
      be("Whoa, chill out!")
  }

  "no letters" in {
    Bob.response("1, 2, 3") should
      be("Whatever.")
  }

  "question with no letters" in {
    Bob.response("4?") should
      be("Sure.")
  }

  "shouting with special characters" in {
    Bob.response("ZOMG THE %^*@#$(*^ ZOMBIES ARE COMING!!11!!1!") should
      be("Whoa, chill out!")
  }

  "shouting with no exclamation mark" in {
    Bob.response("I HATE THE DMV") should
      be("Whoa, chill out!")
  }

  "statement containing question mark" in {
    Bob.response("Ending with ? means a question.") should
      be("Whatever.")
  }

  "non-letters with question" in {
    Bob.response(":) ?") should
      be("Sure.")
  }

  "prattling on" in {
    Bob.response("Wait! Hang on. Are you going to be OK?") should
      be("Sure.")
  }

  "silence" in {
    Bob.response("") should
      be("Fine. Be that way!")
  }

  "prolonged silence" in {
    Bob.response("          ") should
      be("Fine. Be that way!")
  }

  "alternate silence" in {
    Bob.response("										") should
      be("Fine. Be that way!")
  }

  "multiple line question" in {
    Bob.response("\nDoes this cryogenic chamber make me look fat?\nNo.") should
      be("Whatever.")
  }

  "starting with whitespace" in {
    Bob.response("         hmmmmmmm...") should
      be("Whatever.")
  }

  "ending with whitespace" in {
    Bob.response("Okay if like my  spacebar  quite a bit?   ") should
      be(
      "Sure.")
  }

  "other whitespace" in {
    Bob.response("\n                 	") should
      be("Fine. Be that way!")
  }

  "non-question ending with whitespace" in {
    Bob.response("This is a statement ending with whitespace      ") should
      be("Whatever.")
  }
}
