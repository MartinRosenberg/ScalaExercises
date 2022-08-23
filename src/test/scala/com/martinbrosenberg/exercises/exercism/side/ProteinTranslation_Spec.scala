package com.martinbrosenberg.exercises.exercism.side

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.exercism.side.proteintranslation.ProteinTranslation

/** @version 1.1.0 */
class ProteinTranslation_Spec extends BaseSpec {

  "Methionine RNA sequence" in {
    ProteinTranslation.proteins("AUG") should be(Seq("Methionine"))
  }

  "Phenylalanine RNA sequence 1" in {
    ProteinTranslation.proteins("UUU") should be(Seq("Phenylalanine"))
  }

  "Phenylalanine RNA sequence 2" in {
    ProteinTranslation.proteins("UUC") should be(Seq("Phenylalanine"))
  }

  "Leucine RNA sequence 1" in {
    ProteinTranslation.proteins("UUA") should be(Seq("Leucine"))
  }

  "Leucine RNA sequence 2" in {
    ProteinTranslation.proteins("UUG") should be(Seq("Leucine"))
  }

  "Serine RNA sequence 1" in {
    ProteinTranslation.proteins("UCU") should be(Seq("Serine"))
  }

  "Serine RNA sequence 2" in {
    ProteinTranslation.proteins("UCC") should be(Seq("Serine"))
  }

  "Serine RNA sequence 3" in {
    ProteinTranslation.proteins("UCA") should be(Seq("Serine"))
  }

  "Serine RNA sequence 4" in {
    ProteinTranslation.proteins("UCG") should be(Seq("Serine"))
  }

  "Tyrosine RNA sequence 1" in {
    ProteinTranslation.proteins("UAU") should be(Seq("Tyrosine"))
  }

  "Tyrosine RNA sequence 2" in {
    ProteinTranslation.proteins("UAC") should be(Seq("Tyrosine"))
  }

  "Cysteine RNA sequence 1" in {
    ProteinTranslation.proteins("UGU") should be(Seq("Cysteine"))
  }

  "Cysteine RNA sequence 2" in {
    ProteinTranslation.proteins("UGC") should be(Seq("Cysteine"))
  }

  "Tryptophan RNA sequence" in {
    ProteinTranslation.proteins("UGG") should be(Seq("Tryptophan"))
  }

  "STOP codon RNA sequence 1" in {
    ProteinTranslation.proteins("UAA") should be(Seq())
  }

  "STOP codon RNA sequence 2" in {
    ProteinTranslation.proteins("UAG") should be(Seq())
  }

  "STOP codon RNA sequence 3" in {
    ProteinTranslation.proteins("UGA") should be(Seq())
  }

  "Translate RNA strand into correct protein list" in {
    ProteinTranslation.proteins("AUGUUUUGG") should be(
      Seq("Methionine", "Phenylalanine", "Tryptophan"))
  }

  "Translation stops if STOP codon at beginning of sequence" in {
    ProteinTranslation.proteins("UAGUGG") should be(Seq())
  }

  "Translation stops if STOP codon at end of two-codon sequence" in {
    ProteinTranslation.proteins("UGGUAG") should be(Seq("Tryptophan"))
  }

  "Translation stops if STOP codon at end of three-codon sequence" in {
    ProteinTranslation.proteins("AUGUUUUAA") should be(
      Seq("Methionine", "Phenylalanine"))
  }

  "Translation stops if STOP codon in middle of three-codon sequence" in {
    ProteinTranslation.proteins("UGGUAGUGG") should be(Seq("Tryptophan"))
  }

  "Translation stops if STOP codon in middle of six-codon sequence" in {
    ProteinTranslation.proteins("UGGUGUUAUUAAUGGUUU") should be(
      Seq("Tryptophan", "Cysteine", "Tyrosine"))
  }

}