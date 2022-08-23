package com.martinbrosenberg.exercises.exercism.side

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.exercism.side.scrabblescore.ScrabbleScore

/** @version 1.1.0 */
class ScrabbleScore_Spec extends BaseSpec {

  "lowercase letter" in {
    ScrabbleScore.score("a") should be(1)
  }

  "uppercase letter" in {
    ScrabbleScore.score("A") should be(1)
  }

  "valuable letter" in {
    ScrabbleScore.score("f") should be(4)
  }

  "short word" in {
    ScrabbleScore.score("at") should be(2)
  }

  "short, valuable word" in {
    ScrabbleScore.score("zoo") should be(12)
  }

  "medium word" in {
    ScrabbleScore.score("street") should be(6)
  }

  "medium, valuable word" in {
    ScrabbleScore.score("quirky") should be(22)
  }

  "long, mixed-case word" in {
    ScrabbleScore.score("OxyphenButazone") should be(41)
  }

  "english-like word" in {
    ScrabbleScore.score("pinata") should be(8)
  }

  "empty input" in {
    ScrabbleScore.score("") should be(0)
  }

  "entire alphabet available" in {
    ScrabbleScore.score("abcdefghijklmnopqrstuvwxyz") should be(87)
  }

}
