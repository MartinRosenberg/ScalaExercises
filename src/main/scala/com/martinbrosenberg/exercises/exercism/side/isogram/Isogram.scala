package com.martinbrosenberg.exercises.exercism.side.isogram

object Isogram {

  def isIsogram(s: String): Boolean = {
    val normalized = s.collect { case c if c.isLetter => c.toLower }
    normalized == normalized.distinct
  }

}
