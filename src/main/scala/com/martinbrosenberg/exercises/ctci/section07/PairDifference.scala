package com.martinbrosenberg.exercises.ctci.section07

import scala.annotation.tailrec

/** Given an array of distinct integer values, count the number of pairs of
  * integers that have difference `k`. For example, given the array [1, 7, 5, 9,
  * 2, 12, 3] and the difference k = 2, there are four pairs with difference 2:
  * (1, 3), (3, 5), (5, 7), (7, 9).
  */
object PairDifference extends App {

  def pairsDifferingByK_1(k: Int, xs: Array[Int]): List[List[Int]] = {
    val sorted = xs.sorted
    val sliding = sorted.sliding(2, 1)
    val lists = sliding.map(_.toList)
    val filtered = lists.filter { case List(a, b) => a + k == b }
    val list = filtered.toList
    list
//    xs
//      .sorted
//      .sliding(2, 1)
//      .map(_.toList)
//      .filter { case List(a, b) => a + k == b }.toList //.count { case Array(a, b) => a + k == b }
  }

  val arr = Array(1, 7, 5, 9, 2, 12, 3)
  val res = pairsDifferingByK_1(2, arr)

  println(res)

}
