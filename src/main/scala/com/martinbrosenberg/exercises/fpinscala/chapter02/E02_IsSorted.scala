package com.martinbrosenberg.exercises.fpinscala.chapter02

/** Exercise 2.2
  *
  * Implement isSorted, which checks whether an Array[A] is sorted according to
  * a given comparison function.
  */
object E02_IsSorted {

  def isSorted[T](ts: Array[T], ordered: (T, T) => Boolean): Boolean =
    ts.sliding(2).forall { case Array(a, b) => ordered(a, b) }

}
