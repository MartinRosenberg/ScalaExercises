package com.martinbrosenberg.exercises.exercism.side

/** PROTEIN TRANSLATION
  *
  * Translate RNA sequences into proteins.
  *
  * RNA can be broken into three nucleotide sequences called codons, and then
  * translated to a polypeptide like so:
  *
  * RNA: "AUGUUUUCU" => translates to
  *
  * Codons: "AUG", "UUU", "UCU" => which become a polypeptide with the following
  * sequence =>
  *
  * Protein: "Methionine", "Phenylalanine", "Serine"
  *
  * There are 64 codons which in turn correspond to 20 amino acids; however, all
  * of the codon sequences and resulting amino acids are not important in this
  * exercise. If it works for one codon, the program should work for all of
  * them. However, feel free to expand the list in the test suite to include
  * them all.
  *
  * There are also three terminating codons (also known as 'STOP' codons); if
  * any of these codons are encountered (by the ribosome), all translation ends
  * and the protein is terminated.
  *
  * All subsequent codons after are ignored, like this:
  *
  * RNA: "AUGUUUUCUUAAAUG" =>
  *
  * Codons: "AUG", "UUU", "UCU", "UAA", "AUG" =>
  *
  * Protein: "Methionine", "Phenylalanine", "Serine"
  *
  * Note the stop codon "UAA" terminates the translation and the final
  * methionine is not translated into the protein sequence.
  *
  * Below are the codons and resulting Amino Acids needed for the exercise.
  * Codon 	              Protein
  * AUG                   Methionine
  * UUU, UUC              Phenylalanine
  * UUA, UUG              Leucine
  * UCU, UCC, UCA, UCG    Serine
  * UAU, UAC              Tyrosine
  * UGU, UGC              Cysteine
  * UGG                   Tryptophan
  * UAA, UAG, UGA         STOP
  *
  * Learn more about protein translation on Wikipedia:
  * [[http://en.wikipedia.org/wiki/Translation_(biology)]].
  */
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
