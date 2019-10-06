package com.martinbrosenberg.exercises.exercism.side.strain

object Strain {

  def keep[A](as: Seq[A], pred: A => Boolean): Seq[A] =
    as.foldLeft(Seq.empty[A])((acc, a) => if (pred(a)) acc :+ a else acc)

  def discard[A](as: Seq[A], pred: A => Boolean): Seq[A] = keep(as, !pred(_: A))

}
