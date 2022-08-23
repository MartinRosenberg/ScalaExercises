package com.martinbrosenberg.exercises.exercism.side

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.exercism.side.nucleotidecount.DNA

/** @version 1.3.0 */
class NucleotideCount_Spec extends BaseSpec {

  "empty strand" in {
    new DNA("").nucleotideCounts should be(
      Right(Map('A' -> 0, 'C' -> 0, 'G' -> 0, 'T' -> 0)))
  }

  "can count one nucleotide in single-character input" in {
    new DNA("G").nucleotideCounts should be(
      Right(Map('A' -> 0, 'C' -> 0, 'G' -> 1, 'T' -> 0)))
  }

  "strand with repeated nucleotide" in {
    new DNA("GGGGGGG").nucleotideCounts should be(
      Right(Map('A' -> 0, 'C' -> 0, 'G' -> 7, 'T' -> 0)))
  }

  "strand with multiple nucleotides" in {
    new DNA(
      "AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC").nucleotideCounts should be(
      Right(Map('A' -> 20, 'C' -> 12, 'G' -> 17, 'T' -> 21)))
  }

  "strand with invalid nucleotides" in {
    new DNA("AGXXACT").nucleotideCounts.isLeft should be(true)
  }

}
