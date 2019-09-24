package com.martinbrosenberg.exercises.exercism.side

/** ISOGRAM
  *
  * Determine if a word or phrase is an isogram.
  *
  * An isogram (also known as a "nonpattern word") is a word or phrase without a
  * repeating letter, however spaces and hyphens are allowed to appear multiple
  * times.
  *
  * Examples of isograms:
  *
  * - lumberjacks
  * - background
  * - downstream
  * - six-year-old
  *
  * The word isograms, however, is not an isogram, because the s repeats.
  */
object Isogram {

  def isIsogram(s: String): Boolean = {
    val normalized = s.collect { case c if c.isLetter => c.toLower }
    normalized == normalized.distinct
  }

}
