package com.martinbrosenberg.exercises.exercism.track

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.exercism.track.e07_hamming.Hamming

/** @version 2.1.0 */
class E07_Hamming_Spec extends BaseSpec {

  "empty strands" in {
    Hamming.distance("", "") should be (Some(0))
  }

  "identical strands" in {
    Hamming.distance("A", "A") should be (Some(0))
  }

  "long identical strands" in {
    Hamming.distance("GGACTGA", "GGACTGA") should be (Some(0))
  }

  "complete distance in single nucleotide strands" in {
    Hamming.distance("A", "G") should be (Some(1))
  }

  "complete distance in small strands" in {
    Hamming.distance("AG", "CT") should be (Some(2))
  }

  "small distance in small strands" in {
    Hamming.distance("AT", "CT") should be (Some(1))
  }

  "small distance" in {
    Hamming.distance("GGACG", "GGTCG") should be (Some(1))
  }

  "small distance in long strands" in {
    Hamming.distance("ACCAGGG", "ACTATGG") should be (Some(2))
  }

  "non-unique character in first strand" in {
    Hamming.distance("AAG", "AAA") should be (Some(1))
  }

  "non-unique character in second strand" in {
    Hamming.distance("AAA", "AAG") should be (Some(1))
  }

  "same nucleotides in different positions" in {
    Hamming.distance("TAG", "GAT") should be (Some(2))
  }

  "large distance" in {
    Hamming.distance("GATACA", "GCATAA") should be (Some(4))
  }

  "large distance in off-by-one strand" in {
    Hamming.distance("GGACGGATTCTG", "AGGACGGATTCT") should be (Some(9))
  }

  "disallow first strand longer" in {
    Hamming.distance("AATG", "AAA") should be (None)
  }

  "disallow second strand longer" in {
    Hamming.distance("ATA", "AGTG") should be (None)
  }

}
