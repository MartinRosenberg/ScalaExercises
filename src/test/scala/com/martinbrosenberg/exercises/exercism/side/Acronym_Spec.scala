package com.martinbrosenberg.exercises.exercism.side

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.exercism.side.acronym.Acronym

/** @version 1.6.0 */
class Acronym_Spec extends BaseSpec {

  "basic" in {
    Acronym.abbreviate("Portable Network Graphics") should be ("PNG")
  }

  "lowercase words" in {
    Acronym.abbreviate("Ruby on Rails") should be ("ROR")
  }

  "punctuation" in {
    Acronym.abbreviate("First In, First Out") should be ("FIFO")
  }

  "all caps word" in {
    Acronym.abbreviate("GNU Image Manipulation Program") should be ("GIMP")
  }

  "punctuation without whitespace" in {
    Acronym.abbreviate("Complementary metal-oxide semiconductor") should be ("CMOS")
  }

  "very long abbreviation" in {
    Acronym.abbreviate("Rolling On The Floor Laughing So Hard That My Dogs Came Over And Licked Me") should be ("ROTFLSHTMDCOALM")
  }

  "consecutive delimiters" in {
    Acronym.abbreviate("Something - I made up from thin air") should be ("SIMUFTA")
  }

  "apostrophes" in {
    Acronym.abbreviate("Halley's Comet") should be ("HC")
  }

}
