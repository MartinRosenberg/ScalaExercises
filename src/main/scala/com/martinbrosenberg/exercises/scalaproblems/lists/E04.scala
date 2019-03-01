package com.martinbrosenberg.exercises.scalaproblems.lists

import scala.annotation.tailrec

/** (*) Find the number of elements of a list.
  *
  * @example scala> length(List(1, 1, 2, 3, 5, 8))
  *          res0: Int = 6
  */
object E04 {

  /** Constraints: None. */
  def length1[T](list: List[T]): Int = list.length

  /** Constraints: Cannot use built-in method. */
  def length2[T](list: List[T]): Int = list.foldLeft(0)((a, _) => a + 1)

  /** Constraints: Cannot use built-in method. */
  def length3[T](list: List[T]): Int = {
    @tailrec
    def run(count: Int, remaining: List[T]): Int = remaining match {
      case _   :: tail => run(count + 1, tail)
      case Nil         => count
    }
    run(0, list)
  }

}
