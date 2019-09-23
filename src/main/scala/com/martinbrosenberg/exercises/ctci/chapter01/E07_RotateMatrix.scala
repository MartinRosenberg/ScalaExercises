package com.martinbrosenberg.exercises.ctci.chapter01

/** ROTATE MATRIX
  *
  * Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, write a method to rotate the
  * image by 90 degrees. Can you do this in place?
  */
object E07_RotateMatrix {

  case class Pixel(channels: Int) {
    lazy val red:   Int = (channels >> 24) & 0xff
    lazy val green: Int = (channels >> 16) & 0xff
    lazy val blue:  Int = (channels >>  8) & 0xff
    lazy val alpha: Int =  channels        & 0xff
  }

  // do it not in place
  def rotateMatrix1(matrix: Array[Array[Int]]): Array[Array[Int]] = {
    ???
  }

  // do it in place
  def rotateMatrix2(matrix: Array[Array[Int]]): Unit = {
    ???
  }

}
