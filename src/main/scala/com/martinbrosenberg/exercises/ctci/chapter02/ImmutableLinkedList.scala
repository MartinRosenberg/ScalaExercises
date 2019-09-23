package com.martinbrosenberg.exercises.ctci.chapter02

sealed trait ImmutableLinkedList[+T] {

  def head: T

  def tail: ImmutableLinkedList[T]

  def isEmpty: Boolean

  def nonEmpty: Boolean = !isEmpty

  lazy val length: Int = foldLeft(0)((a, _) => a + 1)

  // todo not tailrec, do better
  def map[R](func: T => R): ImmutableLinkedList[R] = this match {
    case Empty => Empty
    case Node(head, tail) => Node(func(head), tail.map(func))
  }

  def fold[R](acc: R)(func: (R, T) => R): R = foldLeft(acc)(func)

  def foldLeft[R](acc: R)(func: (R, T) => R): R = {
    var res = acc
    var xs = this
    while (xs.nonEmpty) {
      res = func(res, xs.head)
      xs = xs.tail
    }
    res
  }

  def foldRight[R](acc: R)(func: (T, R) => R): R = reverse.foldLeft(acc)((acc, curr) => func(curr, acc))

  def reverse: ImmutableLinkedList[T] = foldLeft(Empty: ImmutableLinkedList[T])((acc, curr) => Node(curr, acc))

  def reduce[R >: T](func: (R, T) => R): R = reduceLeft(func)

  def reduceLeft[R >: T](func: (R, T) => R): R

}

case class Node[T](head: T, tail: ImmutableLinkedList[T]) extends ImmutableLinkedList[T] {

  val isEmpty: Boolean = false

  def reduceLeft[R >: T](func: (R, T) => R): R = tail.foldLeft[R](head)(func)

}

case object Empty extends ImmutableLinkedList[Nothing] {

  def head: Nothing = throw new NoSuchElementException("head of empty list")

  def tail: ImmutableLinkedList[Nothing] = throw new UnsupportedOperationException("tail of empty list")

  val isEmpty: Boolean = true

  def reduceLeft[R >: Nothing](func: (R, Nothing) => R): R =
    throw new UnsupportedOperationException("reduce on empty list")

}

object ImmutableLinkedList {

  def apply[T](xs: T*): ImmutableLinkedList[T] =
    xs.reverse.foldLeft(Empty: ImmutableLinkedList[T])((tail, head) => Node(head, tail))

  def empty[T]: ImmutableLinkedList[T] = Empty

}
