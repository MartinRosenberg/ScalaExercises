package com.martinbrosenberg.exercises.exercism.side.binarysearch

import scala.annotation.tailrec
import scala.reflect.ClassTag

object BinarySearch {

  def find[A: ClassTag](seq: Seq[A], elem: A)
                       (implicit ord: Ordering[A]): Option[Int] = {
    import ord.mkOrderingOps
    val sorted = seq.toArray.sorted
    @tailrec
    def run(min: Int, max: Int): Option[Int] = {
      val mid = (max + min) / 2
      if (min > max) None
      else sorted(mid) match {
        case `elem`        => Some(mid)
        case x if elem < x => run(min, mid - 1)
        case x if elem > x => run(mid + 1, max)
      }
    }
    run(0, sorted.length - 1)
  }

}
