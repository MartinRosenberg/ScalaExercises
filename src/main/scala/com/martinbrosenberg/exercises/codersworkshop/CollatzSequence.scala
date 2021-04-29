package com.martinbrosenberg.exercises.codersworkshop

import scala.annotation.tailrec
import scala.util.Try

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

  def collatzSequence(n: Int): Try[Int] = Try {
    require(n > 0, "The Collatz conjecture is only valid for positive integers.")

    @tailrec
    def run(x: Int, count: Int): Int = x match {
      case 1 => count
      case _ if x % 2 == 0 => run(x / 2, count + 1)
      case _ => run(x * 3 + 1, count + 1)
    }
    run(n, 0)
  }

}
