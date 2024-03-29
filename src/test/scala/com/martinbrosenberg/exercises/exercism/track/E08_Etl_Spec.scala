package com.martinbrosenberg.exercises.exercism.track

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.exercism.track.e08_etl.Etl

/** @version 1.0.0 */
class E08_Etl_Spec extends BaseSpec {

  "a single letter" in {
    Etl.transform(Map(1 -> Seq("A"))) should be(Map("a" -> 1))
  }

  "single score with multiple letters" in {
    Etl.transform(Map(1 -> Seq("A", "E", "I", "O", "U"))) should be(Map("a" -> 1,
      "e" -> 1, "i" -> 1, "o" -> 1, "u" -> 1))
  }

  "multiple scores with multiple letters" in {
    Etl.transform(Map(1 -> Seq("A", "E"), 2 -> Seq("D", "G"))) should be(Map("a" -> 1,
      "d" -> 2, "e" -> 1, "g" -> 2))
  }

  "multiple scores with differing numbers of letters" in {
    Etl.transform(Map(1 -> Seq("A", "E", "I", "O", "U", "L", "N", "R", "S", "T"),
      2 -> Seq("D", "G"), 3 -> Seq("B", "C", "M", "P"), 4 -> Seq("F", "H", "V", "W", "Y"),
      5 -> Seq("K"), 8 -> Seq("J", "X"), 10 -> Seq("Q", "Z"))) should be(Map("a" -> 1,
      "b" -> 3, "c" -> 3, "d" -> 2, "e" -> 1, "f" -> 4, "g" -> 2, "h" -> 4,
      "i" -> 1, "j" -> 8, "k" -> 5, "l" -> 1, "m" -> 3, "n" -> 1, "o" -> 1,
      "p" -> 3, "q" -> 10, "r" -> 1, "s" -> 1, "t" -> 1, "u" -> 1, "v" -> 4,
      "w" -> 4, "x" -> 8, "y" -> 4, "z" -> 10))
  }

}