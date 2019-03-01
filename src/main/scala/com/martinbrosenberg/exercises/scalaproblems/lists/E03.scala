package com.martinbrosenberg.exercises.scalaproblems.lists

import scala.annotation.tailrec

/** (*) Find the Kth element of a list. By convention, the first element in the
  * list is element 0.
  *
  * @todo Replace exceptions with values (Try/Either)
  * @example scala> nth(2, List(1, 1, 2, 3, 5, 8))
  *          res0: Int = 2
  */
object E03 {

  /** Constraints: None.
    *
    * Uses the built-in `apply` method.
    */
  @throws[IndexOutOfBoundsException]("if n <= 0 or n >= length")
  def nth1[T](n: Int, list: List[T]): T = list(n)

  /** Constraints: Cannot use built-in method.
    *
    * Uses recursion similar to P01/P02.
    */
  @tailrec
  @throws[IndexOutOfBoundsException]("if n <= 0 or n >= length")
  def nth2[T](n: Int, list: List[T]): T = (n, list) match {
    case (0, head :: _   ) => head
    case (_, _    :: tail) => nth2(n - 1, tail)
    case _                 => throw new IndexOutOfBoundsException(s"$n")
  }

}
