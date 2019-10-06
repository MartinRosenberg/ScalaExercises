package com.martinbrosenberg.exercises.exercism.side.saddlepoints

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
