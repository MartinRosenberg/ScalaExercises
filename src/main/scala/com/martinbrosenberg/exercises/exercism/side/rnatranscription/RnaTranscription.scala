package com.martinbrosenberg.exercises.exercism.side.rnatranscription

import scala.util.Try

object RnaTranscription {

  private final val Complements = Map(
    'G' -> 'C',
    'C' -> 'G',
    'T' -> 'A',
    'A' -> 'U'
  )

  def toRna(dna: String): Option[String] = Try(dna.map(Complements)).toOption

}
