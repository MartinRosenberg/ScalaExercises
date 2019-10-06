package com.martinbrosenberg.exercises.exercism.track.e07_hamming

object Hamming {

  def distance(a: String, b: String): Option[Int] =
    if (a.length != b.length) None
    else Some(a.zip(b).count { case (baseA, baseB) => baseA != baseB })

}
