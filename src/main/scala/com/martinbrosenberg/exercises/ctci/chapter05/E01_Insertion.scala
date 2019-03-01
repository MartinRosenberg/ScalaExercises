package com.martinbrosenberg.exercises.ctci.chapter05

/** INSERTION
  *
  * You are given two 32-bit numbers, N and M, and two bit positions, i and j. Write a method to insert M into N such
  * that M starts at bit j and ends at bit i. You can assume that the bits j through i have enough space to fit all of
  * M. That is, if M = 10011, you can assume that there are at least 5 bits between j and i. You would not, for example,
  * have j = 3 and i = 2, because M could not fully fit between bit 3 and bit 2.
  */
object E01_Insertion {

  /** Uses a separate function `BitOps.clearBitsBetween` that clears all the bits in the range (i, j), then shifts `m`
    * over to that range, and uses `|` to add it.
    */
  def insert1(n: Int, m: Int, i: Int, j: Int): Int = {
    val cleared = BitOps.clearBitsBetween(n, j, i)
    val mask = m << i
    cleared | mask
  }

}
