package com.martinbrosenberg.exercises.exercism.track

/** BOB
  *
  * Bob is a lackadaisical teenager. In conversation, his responses are very
  * limited.
  *
  * - Bob answers 'Sure.' if you ask him a question.
  * - He answers 'Whoa, chill out!' if you yell at him.
  * - He answers 'Calm down, I know what I'm doing!' if you yell a question at
  *   him.
  * - He says 'Fine. Be that way!' if you address him without actually saying
  *   anything.
  * - He answers 'Whatever.' to anything else.
  */
object E05_Bob {

  private def isQuestion(s: String): Boolean = s.endsWith("?")
  private def isSilence(s: String): Boolean = s == ""
  private def isYelling(s: String): Boolean =
    s.replaceAll("[^A-Za-z]", "").matches("[A-Z]+")

  def response(statement: String): String = statement.trim match {
    case s if isSilence(s) => "Fine. Be that way!"
    case s if isQuestion(s) && isYelling(s) => "Calm down, I know what I'm doing!"
    case s if isQuestion(s) => "Sure."
    case s if isYelling(s) => "Whoa, chill out!"
    case _ => "Whatever."
  }

}
