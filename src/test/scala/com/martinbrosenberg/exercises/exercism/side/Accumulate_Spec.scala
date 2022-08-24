package com.martinbrosenberg.exercises.exercism.side

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.exercism.side.accumulate.Accumulate

/** @version created manually */
class Accumulate_Spec extends BaseSpec {

  "allow empty accumulation" in {
    val accumulate = new Accumulate
    val accumulation = accumulate.accumulate[Int, Int](x => x * x, List.empty)
    accumulation should be (List.empty)
  }

  "accumulate squares" in {
    val accumulate = new Accumulate
    val accumulation = accumulate.accumulate[Int, Int](x => x * x, List(1, 2, 3))
    accumulation should be (List(1, 4, 9))
  }

  "accumulate upcases" in {
    val accumulate = new Accumulate
    val accumulation = accumulate.accumulate[String, String](_.map(_.toUpper), List("hello", "world"))
    accumulation should be (List("HELLO", "WORLD"))
  }

  "accumulate reversed strings" in {
    val accumulate = new Accumulate
    val accumulation = accumulate.accumulate[String, String](_.reverse, List("eht", "kciuq", "nworb", "xof", "cte"))
    accumulation should be (List("the", "quick", "brown", "fox", "etc"))
  }

  "allow different return type" in {
    val accumulate = new Accumulate
    val accumulation = accumulate.accumulate[Int, String](_.toString, List(1, 2, 3))
    accumulation should be (List("1", "2", "3"))
  }

}