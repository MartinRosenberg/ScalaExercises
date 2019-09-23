package com.martinbrosenberg.exercises.leetcode

/** 646. Maximum Length of Pair Chain [Medium]
  *
  * You are given n pairs of numbers. In every pair, the first number is always smaller than the second number.
  *
  * Now, we define a pair (c, d) can follow another pair (a, b) if and only if b < c. Chain of pairs can be formed in this fashion.
  *
  * Given a set of pairs, find the length longest chain which can be formed. You needn't use up all the given pairs. You can select pairs in any order.
  *
  * Example 1:
  * Input: [[1,2], [2,3], [3,4]]
  * Output: 2
  * Explanation: The longest chain is [1,2] -> [3,4]
  * Note:
  * The number of given pairs will be in the range [1, 1000].
  */
object E0646_MaximumLengthOfPairChain {

  def findLongestChain(pairs: Array[Array[Int]]): Int = {
    var left = pairs.toSeq
    var chain = Seq[Int]()
    while (left.nonEmpty) {
    }
    0 // todo
  }

  def main(args: Array[String]): Unit = {
    val res = findLongestChain(Array(Array(1, 2), Array(2, 3), Array(3, 4))) // 2
    val res2 = findLongestChain(Array(Array(-6, 9), Array(1, 6), Array(8, 10), Array(-1, 4), Array(-6, -2), Array(-9, 8), Array(-5, 3), Array(0, 3))) // 3
    println(res)
  }

}
