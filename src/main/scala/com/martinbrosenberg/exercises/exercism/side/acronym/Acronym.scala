package com.martinbrosenberg.exercises.exercism.side.acronym

object Acronym {

  def abbreviate(phrase: String): String =
    phrase.toUpperCase.split("[^A-Z']+").map(_.head).mkString

}
