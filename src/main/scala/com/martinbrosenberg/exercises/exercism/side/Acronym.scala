package com.martinbrosenberg.exercises.exercism.side

/** ACRONYM
  *
  * Convert a phrase to its acronym.
  *
  * Techies love their TLA (Three Letter Acronyms)!
  *
  * Help generate some jargon by writing a program that converts a long name
  * like Portable Network Graphics to its acronym (PNG).
  */
object Acronym {

  def abbreviate(phrase: String): String =
    phrase.toUpperCase.split("[^A-Z']+").map(_.head).mkString

}
