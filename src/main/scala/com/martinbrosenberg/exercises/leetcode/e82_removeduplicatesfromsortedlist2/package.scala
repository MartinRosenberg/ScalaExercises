package com.martinbrosenberg.exercises.leetcode

package object e82_removeduplicatesfromsortedlist2 {

  /** Provided. Is this required? It's terrible. And clearly written by someone
    * not familiar with Scala.
    *
    * @param _x data
    * @param _next link to next node
    */
  class ListNode(_x: Int = 0, _next: ListNode = null) {
    var next: ListNode = _next
    var x: Int = _x
  }

  class ListNode2(var value: Int = 0, var next: ListNode = null)
}
