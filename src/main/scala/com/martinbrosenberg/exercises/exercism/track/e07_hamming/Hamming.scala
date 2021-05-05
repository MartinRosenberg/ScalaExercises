package com.martinbrosenberg.exercises.exercism.track.e07_hamming

object Hamming {
  type Strand = String
  type Distance = Int

  def distance(a: Strand, b: Strand): Option[Distance] =
    if (a.length != b.length) None
    else Some(a.zip(b).count { case (baseA, baseB) => baseA != baseB })
}
