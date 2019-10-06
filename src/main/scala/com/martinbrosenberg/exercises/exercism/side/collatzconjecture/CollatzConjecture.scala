package com.martinbrosenberg.exercises.exercism.side.collatzconjecture

import scala.annotation.tailrec

object CollatzConjecture {

  @tailrec
  private def run(n: Int, steps: Int): Int = n match {
    case 1 => steps
    case _ if n % 2 == 0 => run(n / 2, steps + 1)
    case _ => run(3 * n + 1, steps + 1)
  }

  def steps(n: Int): Option[Int] =
    if (n <= 0) None
    else Some(run(n, 0))

}
