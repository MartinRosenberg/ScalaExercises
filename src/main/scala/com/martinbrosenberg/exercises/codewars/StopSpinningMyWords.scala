package com.martinbrosenberg.exercises.codewars

/** Write a function that takes in a string of one or more words, and returns
  * the same string, but with all five or more letter words reversed (Just like
  * the name of this Kata). Strings passed in will consist of only letters and
  * spaces. Spaces will be included only when more than one word is present.
  *
  * You can find some examples in the test fixtures.
  */
object StopSpinningMyWords {
  def spinWords(sentence: String): String =
    sentence
      .split(" ")
      .map(word => if (word.length < 5) word else word.reverse)
      .mkString(" ")
}
