package com.martinbrosenberg.exercises.scalaproblems.lists

import scala.annotation.tailrec

/** (*) Find the last element of a list.
  *
  * @todo Replace exceptions with values (Try/Either)
  * @example scala> last(List(1, 1, 2, 3, 5, 8))
  *          res0: Int = 8
  */
object E01 {

  /** Constraints: None.
    *
    * Uses built-in `List.last` method.
    */
  @throws[NoSuchElementException]("if the list is empty")
  def last_1[T](list: List[T]): T = list.last

  /** Constraints: Cannot use built-in method.
    *
    * Uses `reduceLeft`. Manually throws `NoSuchElementException` to prevent
    * `reduceLeft` from throwing an `UnsupportedOperationException`.
    */
  @throws[NoSuchElementException]("if the list is empty")
  def last_2[T](list: List[T]): T =
    if (list.isEmpty) throw new NoSuchElementException
    else list.reduceLeft((_, c) => c)

  /** Constraints: Cannot use built-in method.
    *
    * Uses tail recursion.
    */
  @tailrec
  @throws[NoSuchElementException]("if the list is empty")
  def last_3[T](list: List[T]): T = list match {
    case head :: Nil  => head
    case _    :: tail => last_3(tail)
    case _            => throw new NoSuchElementException
  }

}
