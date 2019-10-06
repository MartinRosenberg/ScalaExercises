package com.martinbrosenberg.exercises.exercism.side.palindromeproducts

import com.martinbrosenberg.exercises.exercism.side.palindromeproducts.PalindromeProducts._

import scala.annotation.tailrec
import scala.util.Try

case class PalindromeProducts(start: Factor, end: Factor) {

  private val factorPairs: Seq[FactorPair] =
    for {
      i <- start to end
      k <- i to end if isPalindrome(i * k)
    } yield (i, k)

  private val factorPairsByProduct: Map[Product, Set[FactorPair]] =
    factorPairs.toSet.groupBy { case (i, k) => i * k }

  lazy val smallest: Option[(Product, Set[FactorPair])] =
    Try(factorPairsByProduct.minBy { case (p, _) => p }).toOption

  lazy val largest: Option[(Product, Set[FactorPair])] =
    Try(factorPairsByProduct.maxBy { case (p, _) => p }).toOption

}

object PalindromeProducts {

  type Factor = Int
  type FactorPair = (Factor, Factor)
  type Product = Int

  @tailrec
  private def reverse(n: Int, partial: Int = 0): Int = n match {
    case 0 => partial
    case _ => reverse(n / 10, partial * 10 + n % 10)
  }

  private def isPalindrome(n: Int): Boolean = n == reverse(n)

}
