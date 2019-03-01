package com.martinbrosenberg.exercises.ctci.chapter05

object BitOps {

  def getBit(n: Int, i: Int): Boolean = (n & (1 << i)) != 0

  def setBit(n: Int, i: Int): Int = n | (1 << i)

  def clearBit(n: Int, i: Int): Int = n & ~(1 << i)

  def flipBit(n: Int, i: Int): Int = n ^ (1 << i)

  def updateBit(n: Int, i: Int, value: Boolean): Int = if (value) setBit(n, i) else clearBit(n, i)

  /** [MSB, end] */
  def clearHighBitsTo(n: Int, end: Int): Int = n & ((1 << end) - 1)

  /** [MSB, end) */
  def clearHighBitsUntil(n: Int, end: Int): Int = n & ((1 << (end + 1)) - 1)

  /** [start, 0] */
  def clearLowBitsFrom(n: Int, start: Int): Int = n & (-1 << (start + 1))

  /** (start, 0] */
  def clearLowBitsAfter(n: Int, start: Int): Int = n & (-1 << start)

  /** [start, end] */
  def clearBitsBetween(n: Int, start: Int, end: Int): Int = {
    val clearMask = -1 << (start + 1)
    val keepMask = (1 << end) - 1
    n & (clearMask | keepMask)
  }

}
