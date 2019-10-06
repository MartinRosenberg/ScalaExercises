package com.martinbrosenberg.exercises.exercism.side.simplecipher

import com.martinbrosenberg.exercises.exercism.side.simplecipher.Cipher._

import scala.util.Random

case class Cipher private(key: String) {

  private def rotate(text: String, fn: (Int, Int) => Int): String =
    text.zip(key)
      .map { case (c, by) => rotateLetter(c, by)(fn) }
      .mkString

  def encode(text: String): String = rotate(text, _ + _)

  def decode(text: String): String = rotate(text, _ - _)

}

private object Cipher {

  final val AlphaSize = 26
  final val Offset = 'a'

  lazy val keys: Iterator[String] = {
    val random = new Random
    val alphabet = 'a' to 'z'
    val nextLetter: Iterator[Char] =
      Iterator.continually(alphabet(random.nextInt(AlphaSize)))

    Iterator.continually(nextLetter.take(100).mkString)
  }

  def apply(keyOpt: Option[String]): Cipher = {
    val Valid = "([a-z]+)".r
    val key = keyOpt match {
      case None           => keys.next()
      case Some(Valid(k)) => k
      case _              => throw new IllegalArgumentException("Invalid key")
    }
    Cipher(key)
  }

  def rotateLetter(c: Char, by: Char)(op: (Int, Int) => Int): Char = {
    val toValue = (_: Char) - Offset
    val fromValue = (v: Int) => (v % AlphaSize + Offset).toChar

    fromValue(op(toValue(c), toValue(by)))
  }

}
