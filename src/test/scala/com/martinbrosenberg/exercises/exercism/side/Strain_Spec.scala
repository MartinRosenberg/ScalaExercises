package com.martinbrosenberg.exercises.exercism.side

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.exercism.side.strain.Strain

/** @version created manually **/
class Strain_Spec extends BaseSpec {

  "handle empty keep" in {
    val result = Strain.keep[Int](List(), x => x < 10)
    result should be(List.empty)
  }

  "keep everything" in {
    val expectedList = List("a", "b", "c")
    val result = Strain.keep[String](expectedList, _ => true)
    result should be(expectedList)
  }

  "keep first and last" in {
    val result = Strain.keep[Int](List(1, 2, 3), x => x % 2 != 0)
    result should be(List(1, 3))
  }

  "keep neither first or last" in {
    val result = Strain.keep[Int](List(1, 2, 3, 4, 5), x => x % 2 == 0)
    result should be(List(2, 4))
  }

  "keep strings" in {
    val words = List("apple",  "zebra", "banana", "zombies", "cherimoya",  "zelot")
    val result = Strain.keep[String](words, s => s.startsWith("z"))
    result should be(List("zebra", "zombies", "zelot"))
  }

  "keep sequences" in {
    val sequences = Seq(Seq(1, 2, 3), Seq(5, 5, 5), Seq(5, 1, 2), Seq(2, 1, 2),
      Seq(1, 5, 2), Seq(2, 2, 1), Seq(1, 2, 5))
    val expected = Seq(Seq(5, 5, 5), Seq(5, 1, 2), Seq(1, 5, 2), Seq(1, 2, 5))
    val result = Strain.keep[Seq[Int]](sequences, seq => seq.contains(5))
    result should be (expected)
  }

  "handle empty discard" in {
    val result = Strain.discard[Int](List(), x => x < 10)
    result should be (List.empty)
  }

  "discard first and last" in {
    val result = Strain.discard[Int](List(1, 2, 3), x => x % 2 != 0)
    result should be (List(2))
  }

  "discard neither first or last" in {
    val result = Strain.discard[Int](List(1, 2, 3, 4, 5), x => x % 2 == 0)
    result should be (List(1, 3, 5))
  }

  "discard strings" in {
    val words = List("apple",  "zebra", "banana", "zombies", "cherimoya",  "zelot")
    val result = Strain.discard[String](words, s => s.startsWith("z"))
    result should be (List("apple", "banana", "cherimoya"))
  }

  "discard sequences" in {
    val sequences = Seq(Seq(1, 2, 3), Seq(5, 5, 5), Seq(5, 1, 2), Seq(2, 1, 2),
      Seq(1, 5, 2), Seq(2, 2, 1), Seq(1, 2, 5))
    val expected = Seq(Seq(1, 2, 3), Seq(2, 1, 2), Seq(2, 2, 1))
    val result = Strain.discard[Seq[Int]](sequences, seq => seq.contains(5))
    result should be (expected)
  }

}
