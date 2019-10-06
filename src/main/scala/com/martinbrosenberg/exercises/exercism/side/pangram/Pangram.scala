package com.martinbrosenberg.exercises.exercism.side.pangram

object Pangram {

  def isPangram(s: String): Boolean =
    (('a' to 'z').toSet -- s.toLowerCase.toSet).isEmpty

}
