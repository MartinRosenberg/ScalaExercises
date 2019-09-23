package com.martinbrosenberg.exercises.exercism.track

import com.martinbrosenberg.exercises.exercism.ExercismBaseSpec

/** @version 2.1.0 */
class E06_Hamming_Spec extends ExercismBaseSpec {

  test("empty strands") {
    E06_Hamming.distance("", "") should be (Some(0))
  }

  test("identical strands") {
    E06_Hamming.distance("A", "A") should be (Some(0))
  }

  test("long identical strands") {
    E06_Hamming.distance("GGACTGA", "GGACTGA") should be (Some(0))
  }

  test("complete distance in single nucleotide strands") {
    E06_Hamming.distance("A", "G") should be (Some(1))
  }

  test("complete distance in small strands") {
    E06_Hamming.distance("AG", "CT") should be (Some(2))
  }

  test("small distance in small strands") {
    E06_Hamming.distance("AT", "CT") should be (Some(1))
  }

  test("small distance") {
    E06_Hamming.distance("GGACG", "GGTCG") should be (Some(1))
  }

  test("small distance in long strands") {
    E06_Hamming.distance("ACCAGGG", "ACTATGG") should be (Some(2))
  }

  test("non-unique character in first strand") {
    E06_Hamming.distance("AAG", "AAA") should be (Some(1))
  }

  test("non-unique character in second strand") {
    E06_Hamming.distance("AAA", "AAG") should be (Some(1))
  }

  test("same nucleotides in different positions") {
    E06_Hamming.distance("TAG", "GAT") should be (Some(2))
  }

  test("large distance") {
    E06_Hamming.distance("GATACA", "GCATAA") should be (Some(4))
  }

  test("large distance in off-by-one strand") {
    E06_Hamming.distance("GGACGGATTCTG", "AGGACGGATTCT") should be (Some(9))
  }

  test("disallow first strand longer") {
    E06_Hamming.distance("AATG", "AAA") should be (None)
  }

  test("disallow second strand longer") {
    E06_Hamming.distance("ATA", "AGTG") should be (None)
  }

}
