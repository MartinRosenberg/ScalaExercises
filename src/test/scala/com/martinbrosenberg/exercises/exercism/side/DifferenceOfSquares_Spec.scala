package com.martinbrosenberg.exercises.exercism.side

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.exercism.side.differenceofsquares.DifferenceOfSquares

/** @version 1.2.0 */
class DifferenceOfSquares_Spec extends BaseSpec {

  "square of sum 1" in {
    DifferenceOfSquares.squareOfSum(1) should be (1)
  }

  "square of sum 5" in {
    DifferenceOfSquares.squareOfSum(5) should be (225)
  }

  "square of sum 100" in {
    DifferenceOfSquares.squareOfSum(100) should be (25502500)
  }

  "sum of squares 1" in {
    DifferenceOfSquares.sumOfSquares(1) should be (1)
  }

  "sum of squares 5" in {
    DifferenceOfSquares.sumOfSquares(5) should be (55)
  }

  "sum of squares 100" in {
    DifferenceOfSquares.sumOfSquares(100) should be (338350)
  }

  "difference of squares 1" in {
    DifferenceOfSquares.differenceOfSquares(1) should be (0)
  }

  "difference of squares 5" in {
    DifferenceOfSquares.differenceOfSquares(5) should be (170)
  }

  "difference of squares 100" in {
    DifferenceOfSquares.differenceOfSquares(100) should be (25164150)
  }

}