package com.martinbrosenberg.exercises.codersworkshop

import scala.annotation.tailrec

/** A Collatz sequence in mathematics can be defined as follows. Starting with
  * any positive integer `n`:
  *
  * If `n` is even, the next number in the sequence is `n / 2`.
  * If `n` is odd, the next number in the sequence is `3n + 1`.
  *
  * It is conjectured that every such sequence eventually reaches the number 1.
  *
  * Write a function that, given `n`, returns the number of steps in the
  * sequence from `n` to 1.
  */
object CollatzSequence {

  def collatzSequence(n: Int): Int = {
    @tailrec
    def run(last: Int, count: Int): Int = last match {
      case 1 => count
      case n if n % 2 == 0 => run(last / 2, count + 1)
      case _ => run(last * 3 + 1, count + 1)
    }
    run(n, 0)
  }

}
