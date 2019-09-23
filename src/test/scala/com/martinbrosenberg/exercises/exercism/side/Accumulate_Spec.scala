package com.martinbrosenberg.exercises.exercism.side

import com.martinbrosenberg.exercises.exercism.ExercismBaseSpec

/** @version created manually */
class Accumulate_Spec extends ExercismBaseSpec {

  test("allow empty accumulation") {
    val accumulate = new Accumulate
    val accumulation = accumulate.accumulate[Int, Int](x => x * x, List.empty)
    accumulation should be (List.empty)
  }

  test("accumulate squares") {
    val accumulate = new Accumulate
    val accumulation = accumulate.accumulate[Int, Int](x => x * x, List(1, 2, 3))
    accumulation should be (List(1, 4, 9))
  }

  test("accumulate upcases") {
    pending
    val accumulate = new Accumulate
    val accumulation = accumulate.accumulate[String, String](_.map(_.toUpper), List("hello", "world"))
    accumulation should be (List("HELLO", "WORLD"))
  }

  test("accumulate reversed strings") {
    val accumulate = new Accumulate
    val accumulation = accumulate.accumulate[String, String](_.reverse, List("eht", "kciuq", "nworb", "xof", "cte"))
    accumulation should be (List("the", "quick", "brown", "fox", "etc"))
  }

  test("allow different return type") {
    val accumulate = new Accumulate
    val accumulation = accumulate.accumulate[Int, String](_.toString, List(1, 2, 3))
    accumulation should be (List("1", "2", "3"))
  }

}