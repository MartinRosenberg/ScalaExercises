package com.martinbrosenberg.exercises.exercism.side.rotationalcipher

object RotationalCipher {

  private final val AlphaSize = 26
  private final val LowerOffset = 'a'
  private final val UpperOffset = 'A'

  private def rotateLetter(c: Char, by: Int): Char = {
    val offset = if (c.isUpper) UpperOffset else LowerOffset
    ((c - offset + by) % AlphaSize + offset).toChar
  }

  def rotate(s: String, by: Int): String =
    s.map(c => if (c.isLetter) rotateLetter(c, by) else c)

}
