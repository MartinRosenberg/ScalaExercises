package com.martinbrosenberg.exercises.exercism.side

/** MATRIX
  *
  * Given a string representing a matrix of numbers, return the rows and columns
  * of that matrix. So given a string with embedded newlines like:
  *
  * 9 8 7
  * 5 3 2
  * 6 6 7
  *
  * representing this matrix:
  *
  *     0  1  2
  *   |---------
  * 0 | 9  8  7
  * 1 | 5  3  2
  * 2 | 6  6  7
  *
  * your code should be able to spit out:
  *
  * - A list of the rows, reading each row left-to-right while moving
  *   top-to-bottom across the rows,
  * - A list of the columns, reading each column top-to-bottom while moving from
  *   left-to-right.
  *
  * The rows for our example matrix:
  *
  *   9, 8, 7
  *   5, 3, 2
  *   6, 6, 7
  *
  * And its columns:
  *
  *   9, 5, 6
  *   8, 3, 6
  *   7, 2, 7
  */
case class Matrix(s: String) {

  private lazy val rows = s.split("\\R").map(_.split("\\s").map(_.toInt))

  private lazy val columns = rows.transpose

  def row(n: Int): Seq[Int] = rows(n)

  def column(n: Int): Seq[Int] = columns(n)

}
