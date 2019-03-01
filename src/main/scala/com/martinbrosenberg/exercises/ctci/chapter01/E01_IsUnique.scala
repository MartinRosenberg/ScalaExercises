package com.martinbrosenberg.exercises.ctci.chapter01

import java.util

/** IS UNIQUE
  *
  * Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data
  * structures?
  */
object E01_IsUnique {

  /** Constraints: None.
    *
    * The simplest possible Scala to do this. Compare the original string directly with a copy of that string sans
    * duplicate characters.
    */
  def isUnique1(s: String): Boolean = s == s.distinct

  /** Constraints: You can't use `SeqLike#distinct`, as it is not built in in most languages.
    *
    * Not substantially different from `isUnique1`. Because the collection without duplicates is no longer the same type
    * as the input, it's easier to just compare the sizes of the collections.
    */
  def isUnique2(s: String): Boolean = s.length == s.toSet.size

  /** Constraints: You must detect duplicate characters manually instead of relying on built-ins.
    *
    * This makes a map with each key being a unique character, and each value a collection of all instances of that key.
    * Then `forall` takes the length of each value (i.e. the number of instances of each character) and returns false
    * as soon as it finds any groups > 1, or true at the end.
    */
  def isUnique3(s: String): Boolean = s groupBy identity forall { case (_, cs) => cs.length == 1 }

  /** Constraints: You may only use an array, or a data structure you would use in the same way.
    *
    * Uses `java.util.BitSet` as a bitmap. Each bit defaults to false. The first time we find a character, we set its
    * bit to true. The second time, we early return `false`. Otherwise, we return `true` at the end. Using
    * `scala.collection.mutable.BitSet` would be half as fast for no gain.
    *
    * This version is problematic in a few ways: compared to earlier solutions, it's difficult to read; it returns
    *  early, which is generally to be avoided in Scala; and it uses excessive space for full Unicode (up to 0x10FFFF).
    */
  def isUnique4(s: String): Boolean = {
    val cs = new util.BitSet()
    for (c <- s) {
      if (cs.get(c)) return false
      cs.set(c)
    }
    true
  }

  /** Constraints: You may only use an array.
    *
    * Similar to the `BitSet` version, but clumsier. Uses a boolean array, big enough for extended ASCII by default, and
    * naïvely resized for new Unicode characters.
    *
    * This also has the early return and Unicode issues; additionally, it is also extremely _slow_ for Unicode.
    */
  def isUnique5(s: String): Boolean = {
    var cs = Array.fill(256)(false)
    for (c <- s) {
      if (c > cs.length) cs = cs.padTo(c, false)
      if (cs(c)) return false
      cs(c) = true
    }
    true
  }

  /** Constraints: You may not use additional data structures.
    *
    * Interprets the constraint strictly, disallowing out-of-place sort. Compares every character against every other
    * character, returning `false` early upon finding a duplicate.
    *
    * Has the early return issue, and is `O(n^2)`.
    */
  def isUnique6(s: String): Boolean = {
    val len = s.length
    for (i <- 0 until len;
         k <- i until len) {
      if (i != k && s(i) == s(k)) return false
    }
    true
  }

}
