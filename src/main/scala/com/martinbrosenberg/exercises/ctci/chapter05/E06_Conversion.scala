package com.martinbrosenberg.exercises.ctci.chapter05

/** CONVERSION
  *
  * Write a function to determine the number of bits you would need to flip to
  * convert integer A to integer B.
  */
object E06_Conversion {

  /** Diffs a and b (using XOR), then iterates from the lowest bit to the
    * highest significant bit, counting all the ones.
    */
  def numDifferentBits_1(a: Int, b: Int): Int = {
    var diff = a ^ b
    var count = 0
    while (diff != 0) {
      count += diff & 1
      diff >>>= 1
    }
    count
  }

  /** Does the same, but using a `Stream`, a more functional approach. */
  def numDifferentBits_2(a: Int, b: Int): Int = {
    def bits(diff: Int): LazyList[Int] = diff #:: bits(diff >>> 1)
    bits(a ^ b)
      .takeWhile(_ != 0)
      .count(x => (x & 1) == 1)
  }

}
