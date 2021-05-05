package com.martinbrosenberg.exercises.exercism.track.e08_etl

object Etl {
  type Letter = String
  type Score = Int

  def transform(lettersByScore: Map[Score, Seq[Letter]]): Map[Letter, Score] =
    for {
      (score, letters) <- lettersByScore
      letter           <- letters
    } yield letter.toLowerCase -> score
}
