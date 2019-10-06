package com.martinbrosenberg.exercises.exercism.side

import com.martinbrosenberg.exercises.exercism.ExercismBaseSpec
import com.martinbrosenberg.exercises.exercism.side.rnatranscription.RnaTranscription

/** @version 1.2.0 */
class RnaTranscription_Spec extends ExercismBaseSpec {

  test("RNA complement of cytosine is guanine") {
    RnaTranscription.toRna("C") should be(Some("G"))
  }

  test("RNA complement of guanine is cytosine") {
    RnaTranscription.toRna("G") should be(Some("C"))
  }

  test("RNA complement of thymine is adenine") {
    RnaTranscription.toRna("T") should be(Some("A"))
  }

  test("RNA complement of adenine is uracil") {
    RnaTranscription.toRna("A") should be(Some("U"))
  }

  test("RNA complement") {
    RnaTranscription.toRna("ACGTGGTCTTAA") should be(Some("UGCACCAGAAUU"))
  }

}