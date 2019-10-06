package com.martinbrosenberg.exercises.exercism.side.nucleotidecount

import DNA._

class DNA(strand: String) {

  val nucleotideCounts: Either[String, Map[Char, Int]] =
    if (strand.forall(Nucleotides.contains)) Right(
      Nucleotides.map(_ -> 0) ++: strand.groupBy(identity).mapValues(_.length)
    )
    else Left("Strand contains invalid nucleotides")

}

object DNA {

  private final val Nucleotides = Seq('A', 'C', 'G', 'T')

}
