package com.martinbrosenberg.exercises.scalaproblems.lists

import scala.annotation.tailrec

/** (*) Find the last but one element of a list.
  *
  * @todo Replace exceptions with values (Try/Either)
  * @example scala> penultimate(List(1, 1, 2, 3, 5, 8))
  *          res0: Int = 5
  */
object E02 {

  /** Constraints: None.
    *
    * Uses built-in method `.init` to get all but the last element, and `.last`
    * to get the last element of `init`.
    */
  @throws[NoSuchElementException]("if list.length <= 1")
  def penultimate_1[T](list: List[T]): T =
    if (list.isEmpty) throw new NoSuchElementException
    else list.init.last

  /** Constraints: Cannot use built-in methods.
    *
    * Uses recursion similar to P01.
    */
  @tailrec
  @throws[NoSuchElementException]("if list.length <= 1")
  def penultimate_2[T](list: List[T]): T = list match {
    case head :: _    :: Nil => head
    case _    :: tail        => penultimate_2(tail)
    case _                   => throw new NoSuchElementException
  }

}
