package com.martinbrosenberg.exercises.exercism.side._SaddlePoints

/** SADDLE POINTS
  *
  * Detect saddle points in a matrix.
  *
  * So say you have a matrix like so:
  *
  * {{{
  *     0  1  2
  *   |---------
  * 0 | 9  8  7
  * 1 | 5  3  2     <--- saddle point at (1,0)
  * 2 | 6  6  7
  * }}}
  *
  * It has a saddle point at (1, 0).
  *
  * It's called a "saddle point" because it is greater than or equal to every
  * element in its row and less than or equal to every element in its column.
  *
  * A matrix may have zero or more saddle points.
  *
  * Your code should be able to provide the (possibly empty) list of all the
  * saddle points for any given matrix.
  *
  * Note that you may find other definitions of matrix saddle points online, but
  * the tests for this exercise follow the above unambiguous definition.
  */
case class Matrix(matrix: Seq[Seq[Int]]) {

  type Coordinate = (Int, Int)

  private lazy val rowMaxs = matrix.map(_.max)
  private lazy val colMins = matrix.transpose.map(_.min)

  private lazy val isSaddlePoint: Coordinate => Boolean = { case (y, x) =>
    val point = matrix(y)(x)
    rowMaxs(y) == point && colMins(x) == point
  }

  lazy val saddlePoints: Set[Coordinate] =
    (for {
      y <- matrix.indices
      x <- matrix.head.indices
      if isSaddlePoint((y, x))
    } yield (y, x)).toSet

}