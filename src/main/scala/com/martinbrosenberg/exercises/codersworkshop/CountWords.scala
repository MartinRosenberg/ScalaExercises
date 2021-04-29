package com.martinbrosenberg.exercises.codersworkshop

/** Given a string of words separated by spaces, return a map from each word in
  * the string to the count of that word. For example, given the string:
  *
  * "give a little get a little"
  *
  * You should return:
  * Map(
  *   "give" -> 1,
  *   "a" -> 2,
  *   "little" -> 2,
  *   "get" -> 1,
  * )
  */
object CountWords {

  def countWords(s: String): Map[String, Int] =
    s.split(' ').filter(_ != "").groupMapReduce(identity)(_ => 1)(_ + _)

}
