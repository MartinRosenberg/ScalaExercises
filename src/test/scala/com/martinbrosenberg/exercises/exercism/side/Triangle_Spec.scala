package com.martinbrosenberg.exercises.exercism.side

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.exercism.side.triangle.Triangle

/** @version 1.1.0 */
class Triangle_Spec extends BaseSpec {

  "equilateral - true if all sides are equal" in {
    Triangle(2, 2, 2).equilateral should be (true)
  }

  "equilateral - false if any side is unequal" in {
    Triangle(2, 3, 2).equilateral should be (false)
  }

  "equilateral - false if no sides are equal" in {
    Triangle(5, 4, 6).equilateral should be (false)
  }

  "equilateral - All zero sides are illegal, so the triangle is not equilateral" in {
    Triangle(0, 0, 0).equilateral should be (false)
  }

  "equilateral - sides may be floats" in {
    Triangle(0.5, 0.5, 0.5).equilateral should be (true)
  }

  "isosceles - true if last two sides are equal" in {
    Triangle(3, 4, 4).isosceles should be (true)
  }

  "isosceles - true if first two sides are equal" in {
    Triangle(4, 4, 3).isosceles should be (true)
  }

  "isosceles - true if first and last sides are equal" in {
    Triangle(4, 3, 4).isosceles should be (true)
  }

  "isosceles - equilateral triangles are also isosceles" in {
    Triangle(4, 4, 4).isosceles should be (true)
  }

  "isosceles - false if no sides are equal" in {
    Triangle(2, 3, 4).isosceles should be (false)
  }

  "isosceles - Sides that violate triangle inequality are not isosceles, even if two are equal" in {
    Triangle(1, 1, 3).isosceles should be (false)
  }

  "isosceles - sides may be floats" in {
    Triangle(0.5, 0.4, 0.5).isosceles should be (true)
  }

  "scalene - true if no sides are equal" in {
    Triangle(5, 4, 6).scalene should be (true)
  }

  "scalene - false if all sides are equal" in {
    Triangle(4, 4, 4).scalene should be (false)
  }

  "scalene - false if two sides are equal" in {
    Triangle(4, 4, 3).scalene should be (false)
  }

  "scalene - Sides that violate triangle inequality are not scalene, even if they are all different" in {
    Triangle(7, 3, 2).scalene should be (false)
  }

  "scalene - sides may be floats" in {
    Triangle(0.5, 0.4, 0.6).scalene should be (true)
  }

}
