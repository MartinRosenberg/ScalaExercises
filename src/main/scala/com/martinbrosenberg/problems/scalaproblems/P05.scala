package com.martinbrosenberg.problems.scalaproblems

import scala.annotation.tailrec

/** (*) Reverse a list.
  *
  * @example scala> reverse(List(1, 1, 2, 3, 5, 8))
  *          res0: List[Int] = List(8, 5, 3, 2, 1, 1)
  */
object P05 {

  /** Constraints: None. */
  def reverse_1[T](list: List[T]): List[T] = list.reverse

  /** Constraints: Cannot use built-in method. */
  def reverse_2[T](list: List[T]): List[T] =
    list.foldLeft(List.empty[T])((a, c) => c :: a)

  /** Constraints: Cannot use built-in method. */
  def reverse_3[T](list: List[T]): List[T] = {
    @tailrec
    def run(result: List[T], remaining: List[T]): List[T] = remaining match {
      case head :: tail => run(head :: result, tail)
      case _            => result
    }
    run(Nil, list)
  }

}
