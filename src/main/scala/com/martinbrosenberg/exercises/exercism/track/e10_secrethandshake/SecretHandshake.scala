package com.martinbrosenberg.exercises.exercism.track.e10_secrethandshake

object SecretHandshake {

  private object Component extends Enumeration {
    type Component = Value

    val Wink = Value(1, "wink")
    val DoubleBlink = Value(2, "double blink")
    val CloseEyes = Value(4, "close your eyes")
    val Jump = Value(8, "jump")
    val Reverse = Value(16)
  }

  import Component._

  def commands(code: Int): Seq[String] = {
    val hasComponent = (cmp: Component) => (code & cmp.id) == cmp.id
    Component.values.toArray.init
      .filter(hasComponent)
      .sortWith { case (a, b) => if (hasComponent(Reverse)) a > b else a < b }
      .map(_.toString)
      .toIndexedSeq
  }

}
