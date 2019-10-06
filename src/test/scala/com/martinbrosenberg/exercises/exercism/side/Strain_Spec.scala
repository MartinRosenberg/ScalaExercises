package com.martinbrosenberg.exercises.exercism.side

import com.martinbrosenberg.exercises.exercism.ExercismBaseSpec
import com.martinbrosenberg.exercises.exercism.side.strain.Strain

/** @version created manually **/
class Strain_Spec extends ExercismBaseSpec {

  test("handle empty keep") {
    val result = Strain.keep[Int](List(), x => x < 10)
    result should be(List.empty)
  }

  test("keep everything") {
    val expectedList = List("a", "b", "c")
    val result = Strain.keep[String](expectedList, _ => true)
    result should be(expectedList)
  }

  test("keep first and last") {
    val result = Strain.keep[Int](List(1, 2, 3), x => x % 2 != 0)
    result should be(List(1, 3))
  }

  test("keep neither first or last") {
    val result = Strain.keep[Int](List(1, 2, 3, 4, 5), x => x % 2 == 0)
    result should be(List(2, 4))
  }

  test("keep strings") {
    val words = List("apple",  "zebra", "banana", "zombies", "cherimoya",  "zelot")
    val result = Strain.keep[String](words, s => s.startsWith("z"))
    result should be(List("zebra", "zombies", "zelot"))
  }

  test("keep sequences") {
    val sequences = Seq(Seq(1, 2, 3), Seq(5, 5, 5), Seq(5, 1, 2), Seq(2, 1, 2),
      Seq(1, 5, 2), Seq(2, 2, 1), Seq(1, 2, 5))
    val expected = Seq(Seq(5, 5, 5), Seq(5, 1, 2), Seq(1, 5, 2), Seq(1, 2, 5))
    val result = Strain.keep[Seq[Int]](sequences, seq => seq.contains(5))
    result should be (expected)
  }

  test("handle empty discard") {
    val result = Strain.discard[Int](List(), x => x < 10)
    result should be (List.empty)
  }

  test("discard first and last") {
    val result = Strain.discard[Int](List(1, 2, 3), x => x % 2 != 0)
    result should be (List(2))
  }

  test("discard neither first or last") {
    val result = Strain.discard[Int](List(1, 2, 3, 4, 5), x => x % 2 == 0)
    result should be (List(1, 3, 5))
  }

  test("discard strings") {
    val words = List("apple",  "zebra", "banana", "zombies", "cherimoya",  "zelot")
    val result = Strain.discard[String](words, s => s.startsWith("z"))
    result should be (List("apple", "banana", "cherimoya"))
  }

  test("discard sequences") {
    val sequences = Seq(Seq(1, 2, 3), Seq(5, 5, 5), Seq(5, 1, 2), Seq(2, 1, 2),
      Seq(1, 5, 2), Seq(2, 2, 1), Seq(1, 2, 5))
    val expected = Seq(Seq(1, 2, 3), Seq(2, 1, 2), Seq(2, 2, 1))
    val result = Strain.discard[Seq[Int]](sequences, seq => seq.contains(5))
    result should be (expected)
  }

}
