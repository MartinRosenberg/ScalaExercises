package com.martinbrosenberg.exercises.exercism.track.e06_bob

object Bob {
  private def isQuestion(s: String): Boolean = s.endsWith("?")
  private def isSilence(s: String): Boolean = s.isEmpty
  private def isYelling(s: String) = s.exists(_.isLetter) && s == s.toUpperCase

  def response(statement: String): String = statement.trim match {
    case s if isSilence(s) => "Fine. Be that way!"
    case s if isQuestion(s) && isYelling(s) => "Calm down, I know what I'm doing!"
    case s if isQuestion(s) => "Sure."
    case s if isYelling(s) => "Whoa, chill out!"
    case _ => "Whatever."
  }
}
