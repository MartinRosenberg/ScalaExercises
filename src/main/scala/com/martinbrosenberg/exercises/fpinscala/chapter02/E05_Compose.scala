package com.martinbrosenberg.exercises.fpinscala.chapter02

/** Exercise 2.5
  *
  * Implement the higher-order function that composes two functions.
  */
object E05_Compose {

  def compose[A, B, C](f: B => C, g: A => B): A => C =
    a => f(g(a))

}
