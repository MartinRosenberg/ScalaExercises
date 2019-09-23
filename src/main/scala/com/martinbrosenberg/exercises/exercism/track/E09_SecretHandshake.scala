package com.martinbrosenberg.exercises.exercism.track

/** SECRET HANDSHAKE
  *
  *   There are 10 types of people in the world: Those who understand binary,
  *   and those who don't.
  *
  * You and your fellow cohort of those in the "know" when it comes to binary
  * decide to come up with a secret "handshake".
  *
  * 1 = wink
  * 10 = double blink
  * 100 = close your eyes
  * 1000 = jump
  * 10000 = Reverse the order of the operations in the secret handshake.
  *
  * Given a decimal number, convert it to the appropriate sequence of events for
  * a secret handshake.
  *
  * Here's a couple of examples:
  *
  * Given the input 3, the function would return the array ["wink",
  * "double blink"] because 3 is 11 in binary.
  *
  * Given the input 19, the function would return the array ["double blink",
  * "wink"] because 19 is 10011 in binary. Notice that the addition of 16 (10000
  * in binary) has caused the array to be reversed.
  */
object E09_SecretHandshake {

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
  }

}