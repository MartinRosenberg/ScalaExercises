package com.martinbrosenberg.exercises.exercism.side.accumulate

import scala.annotation.tailrec
import scala.collection.mutable.ListBuffer

class Accumulate {

  def accumulate[A, B](f: A => B, list: List[A]): List[B] = {
    @tailrec
    def run(rest: List[A], result: ListBuffer[B]): ListBuffer[B] = rest match {
      case Nil => result
      case head :: tail => run(tail, result :+ f(head))
    }
    run(list, ListBuffer.empty).toList
  }

}
