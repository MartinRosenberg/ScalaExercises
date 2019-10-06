package com.martinbrosenberg.exercises.exercism.side.allergies

import Allergen.Allergen

object Allergies {

  type Score = Int

  def allergicTo(allergen: Allergen, score: Score): Boolean =
    (1 << allergen.id & score) != 0

  def list(score: Score): Seq[Allergen] =
    Allergen.values.filter(allergicTo(_, score)).toSeq

}
