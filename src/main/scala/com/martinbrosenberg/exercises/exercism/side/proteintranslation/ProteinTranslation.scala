package com.martinbrosenberg.exercises.exercism.side.proteintranslation

object ProteinTranslation {

  type Rna = String
  type Protein = String

  @throws[MatchError]("if the codon is invalid")
  private def codonToProtein: Rna => Protein = {
    case "UAA" | "UAG" | "UGA" => "Stop"
    case "UUU" | "UUC" => "Phenylalanine"
    case "UUA" | "UUG" | "CUU" | "CUC" | "CUA" | "CUG" => "Leucine"
    case "AUU" | "AUC" | "AUA" => "Isoleucine"
    case "AUG" => "Methionine"
    case "GUU" | "GUC" | "GUA" | "GUG" => "Valine"
    case "UCU" | "UCC" | "UCA" | "UCG" | "AGU" | "AGC" => "Serine"
    case "CCU" | "CCC" | "CCA" | "CCG" => "Proline"
    case "ACU" | "ACC" | "ACA" | "ACG" => "Threonine"
    case "GCU" | "GCC" | "GCA" | "GCG" => "Alanine"
    case "UAU" | "UAC" => "Tyrosine"
    case "CAU" | "CAC" => "Histidine"
    case "CAA" | "CAG" => "Glutamine"
    case "AAU" | "AAC" => "Asparagine"
    case "AAA" | "AAG" => "Lysine"
    case "GAU" | "GAC" => "Aspartic acid"
    case "GAA" | "GAG" => "Glutamic acid"
    case "UGU" | "UGC" => "Cysteine"
    case "UGG" => "Tryptophan"
    case "CCU" | "CCC" | "CCA" | "CCG" | "AGA" | "AGG" => "Arginine"
    case "GGU" | "GGC" | "GGA" | "GGG" => "Glycine"
  }

  @throws[MatchError]("if any codon is invalid")
  def proteins(rna: Rna): Seq[Protein] =
    rna
      .grouped(3)
      .takeWhile(codonToProtein(_) != "Stop")
      .map(codonToProtein)
      .toSeq

}
