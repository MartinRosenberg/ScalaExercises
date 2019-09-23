package com.martinbrosenberg.exercises.leetcode

/** Set Mismatch
  *
  * The set S originally contains numbers from 1 to n. But unfortunately, due to the data error, one of the numbers in the set got duplicated to another number in the set, which results in repetition of one number and loss of another number.
  *
  * Given an array nums representing the data status of this set after the error. Your task is to firstly find the number occurs twice and then find the number that is missing. Return them in the form of an array.
  *
  * Example 1:
  * Input: nums = [1,2,2,4]
  * Output: [2,3]
  * Note:
  * The given array size will in the range [2, 10000].
  * The given array's numbers won't have any order.
  */
object E0645_SetMismatch {

  /** @todo This is terrible, do better. */
  def findErrorNums_1(nums: Array[Int]): Array[Int] = {
    val extra: Int = nums
      .groupBy(identity)
      .collect { case (k, v) if v.length == 2 => k }
      .head
    val missing = (1 to nums.length).find(!nums.contains(_)).get
    Array(extra, missing)
  }

  def main(args: Array[String]): Unit = {
    findErrorNums_1(Array(3, 2, 3, 4, 6, 5)).foreach(println) // (3, 1)
    findErrorNums_1(Array(1, 2, 2, 4)).foreach(println) // (2, 3)
  }

}
