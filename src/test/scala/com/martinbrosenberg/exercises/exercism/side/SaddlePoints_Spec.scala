package com.martinbrosenberg.exercises.exercism.side

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.exercism.side.saddlepoints.Matrix

/** @version 1.1.0 */
class SaddlePoints_Spec extends BaseSpec {

  "Can identify single saddle point" in {
    Matrix(List(List(9, 8, 7), List(5, 3, 2), List(6, 6, 7))).saddlePoints should be(
      Set((1, 0)))
  }

  "Can identify that empty matrix has no saddle points" in {
    Matrix(List(List())).saddlePoints should be(Set())
  }

  "Can identify lack of saddle points when there are none" in {
    Matrix(List(List(1, 2, 3), List(3, 1, 2), List(2, 3, 1))).saddlePoints should be(
      Set())
  }

  "Can identify multiple saddle points" in {
    Matrix(List(List(4, 5, 4), List(3, 5, 5), List(1, 5, 4))).saddlePoints should be(
      Set((0, 1), (1, 1), (2, 1)))
  }

  "Can identify saddle point in bottom right corner" in {
    Matrix(List(List(8, 7, 9), List(6, 7, 6), List(3, 2, 5))).saddlePoints should be(
      Set((2, 2)))
  }

}
