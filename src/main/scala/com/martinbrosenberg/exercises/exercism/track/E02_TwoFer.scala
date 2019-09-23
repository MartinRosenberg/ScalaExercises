package com.martinbrosenberg.exercises.exercism.track

/** TWO FER
  *
  * Two-fer or 2-fer is short for two for one. One for you and one for me. Given
  * a name, return a string with the message:
  *
  * `One for X, one for me.`
  *
  * Where X is the given name. However, if the name is missing, return the
  * string:
  *
  * `One for you, one for me.`
  *
  * Here are some examples:
  *
  * `
  *   Name 	    String to return
  *   Alice  => One for Alice, one for me.
  *   Bob 	 => One for Bob, one for me.
  *          => One for you, one for me.
  *   Zaphod =>	One for Zaphod, one for me.
  * `
  */
object E02_TwoFer {

  def twofer(name: String = "you"): String =
    s"One for ${name match {
      case "" | null => "you"
      case _         => name
    }}, one for me."

}
