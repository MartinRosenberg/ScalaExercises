package com.martinbrosenberg.exercises.exercism.side

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.exercism.side.matrix.Matrix

/** @version 1.0.0 */
class Matrix_Spec extends BaseSpec {

  "extract row from one number matrix" in {
    Matrix("1").row(0) should be(Vector(1))
  }

  "can extract row" in {
    Matrix("1 2\n" +
      "3 4").row(1) should be(Vector(3, 4))
  }

  "extract row where numbers have different widths" in {
    Matrix("1 2\n" +
      "10 20").row(1) should be(Vector(10, 20))
  }

  "can extract row from non-square matrix" in {
    Matrix("1 2 3\n"
      + "4 5 6\n"
      + "7 8 9\n"
      + "8 7 6").row(2) should be(
      Vector(7, 8, 9))
  }

  "extract column from one number matrix" in {
    Matrix("1").column(0) should be(Vector(1))
  }

  "can extract column" in {
    Matrix("1 2 3\n"
      + "4 5 6\n"
      + "7 8 9").column(2) should be(Vector(3, 6, 9))
  }

  "can extract column from non-square matrix" in {
    Matrix("1 2 3\n"
      + "4 5 6\n"
      + "7 8 9\n"
      + "8 7 6").column(2) should be(Vector(3, 6, 9, 6))
  }

  "extract column where numbers have different widths" in {
    Matrix("89 1903 3\n"
      + "18 3 1\n"
      + "9 4 800").column(1) should be(Vector(1903, 3, 4))
  }

}
