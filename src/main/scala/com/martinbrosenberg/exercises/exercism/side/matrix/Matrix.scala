package com.martinbrosenberg.exercises.exercism.side.matrix

case class Matrix(s: String) {

  private lazy val rows = s
    .split("\\R")
    .map(_.split("\\s").map(_.toInt).toIndexedSeq)
    .toIndexedSeq

  private lazy val columns = rows.transpose

  def row(n: Int): Seq[Int] = rows(n)

  def column(n: Int): Seq[Int] = columns(n)

}
