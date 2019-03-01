package com.martinbrosenberg.exercises.ctci.chapter01

/** URLIFY
  *
  * Write a method to replace all spaces in a string with '%20'. You may assume
  * that the string has sufficient space at the end to hold the additional
  * characters, and that you are given the "true" length of the string. (Note:
  * If implementing in Java, please use a character array so that you can
  * perform this operation in place.)
  */
object E03_Urlify {

  /** Constraints: None.
    *
    * Simple find-and-replace. Doesn't require the offered extra spaces and
    * provided length.
    *
    * Slow, because regex isn't known for speed.
    */
  def urlify_1(s: String): String =
    s
      .trim
      .replaceAll(" ", "%20")

  /** Constraints: Do the operation in place.
    *
    * Basically the same, but copies the results back into the original string.
    */
  def urlify_2(arr: Array[Char], length: Int): Unit = {
    val arr2 = arr
      .mkString
      .trim
      .replaceAll(" ", "%20")
      .toCharArray
    arr.indices.foreach(i => arr(i) = arr2(i))
  }

  /** Constraints: Do the operation in place using no other data structures.
    *
    * Long and hard to read, but O(n) time and O(1) space.
    */
  def urlify_3(arr: Array[Char], strLen: Int): Unit = {
    val arrLen = arr.length

    var shift = arrLen - strLen
    var i = arrLen - 1

    while (shift > 0) {
      arr(i - shift) match {
        case ' ' =>
          arr(i - 2) = '%'
          arr(i - 1) = '2'
          arr(i) = '0'
          shift -= 2
          i -= 3
        case src =>
          arr(i) = src
          i -= 1
      }
    }
  }

}
