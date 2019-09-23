package com.martinbrosenberg.exercises.ctci.chapter01

/** ONE AWAY
  *
  * There are three types of edits that can be performed on strings: insert a character, remove a character, or replace
  * a character. Given two strings, write a function to check if they are one edit (or zero edits) away.
  *
  * EXAMPLE
  * pale, ple -> true
  * pales, pale -> true
  * pale, bale -> true
  * pale, bake -> false
  */
object E05_OneAway {

  def isOneAway(s1: String, s2: String): Boolean = {
    if (s1 == s2) return true
    ???
  }

}
