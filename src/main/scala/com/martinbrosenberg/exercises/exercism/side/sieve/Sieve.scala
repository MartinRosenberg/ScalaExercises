package com.martinbrosenberg.exercises.exercism.side.sieve

import scala.collection.mutable

object Sieve {

  def primes(n: Int): List[Int] = {
    val xs = mutable.BitSet(2 to n: _*)
    (2 to n).foreach(i => if (xs(i)) {
      (i * i to n by i).foreach(xs -= _)
    })
    xs.toList
  }

}
