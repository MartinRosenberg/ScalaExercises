package com.martinbrosenberg.exercises.fpinscala.chapter02

/** Exercise 2.3
  *
  * Let’s look at another example, currying, which converts a function `f` of
  * two arguments into a function of one argument that partially applies `f`.
  * Here again there’s only one implementation that compiles. Write this
  * implementation.
  */
object E03_Curry {

  def curry[A, B, C](f: (A, B) => C): A => B => C =
    a => b => f(a, b)

}
