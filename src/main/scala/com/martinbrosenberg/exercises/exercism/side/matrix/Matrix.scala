package com.martinbrosenberg.exercises.exercism.side.matrix

import com.martinbrosenberg.exercises.exercism.side.matrix.Matrix.toInts

case class Matrix(s: String) {
  private val rows = s.split("\\R").map(toInts).toVector
  private val columns = rows.transpose

  def row(n: Int): Seq[Int] = rows(n)
  def column(n: Int): Seq[Int] = columns(n)
}

object Matrix {
  private def toInts(s: String) = s.split("\\s").map(_.toInt).toVector
}
