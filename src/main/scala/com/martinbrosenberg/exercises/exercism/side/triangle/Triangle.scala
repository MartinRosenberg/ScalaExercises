package com.martinbrosenberg.exercises.exercism.side.triangle

case class Triangle(a: Double, b: Double, c: Double) {

  val isTriangle: Boolean =
    a > 0 && b > 0 && c > 0 && a <= b + c && b <= c + a && c <= a + b

  lazy val degenerate: Boolean =
    isTriangle && (a + b == c || b + c == a || c + a == b)

  lazy val equilateral: Boolean =
    isTriangle && a == b && b == c

  lazy val isosceles: Boolean =
    isTriangle && (a == b || b == c || c == a)

  lazy val scalene: Boolean =
    isTriangle && a != b && b != c && c != a

}
