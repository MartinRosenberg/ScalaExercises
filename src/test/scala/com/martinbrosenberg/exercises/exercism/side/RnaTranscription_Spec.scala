package com.martinbrosenberg.exercises.exercism.side

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.exercism.side.rnatranscription.RnaTranscription

/** @version 1.2.0 */
class RnaTranscription_Spec extends BaseSpec {

  "RNA complement of cytosine is guanine" in {
    RnaTranscription.toRna("C") should be(Some("G"))
  }

  "RNA complement of guanine is cytosine" in {
    RnaTranscription.toRna("G") should be(Some("C"))
  }

  "RNA complement of thymine is adenine" in {
    RnaTranscription.toRna("T") should be(Some("A"))
  }

  "RNA complement of adenine is uracil" in {
    RnaTranscription.toRna("A") should be(Some("U"))
  }

  "RNA complement" in {
    RnaTranscription.toRna("ACGTGGTCTTAA") should be(Some("UGCACCAGAAUU"))
  }

}
