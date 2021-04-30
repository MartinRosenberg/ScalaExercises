package com.martinbrosenberg.exercises.fpinscala.chapter02

import scala.annotation.tailrec

/** Exercise 2.1
  *
  * Write a recursive function to get the nth Fibonacci number. Your definition
  * should use a local tail-recursive function.
  */
object E01_Fibonacci {

  def fib(n: Int): Int = {
    @tailrec
    def run(a: Int, b: Int, i: Int): Int = i match {
      case 0 => a
      case _ => run(b, a + b, i - 1)
    }

    run(0, 1, n)
  }

}
