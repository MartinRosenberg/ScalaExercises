package com.martinbrosenberg.exercises.exercism.side.beersong

import scala.annotation.tailrec

object BeerSong {

  def recite(bottles: Int, verses: Int): String = {
    @tailrec
    def run(b: Int, v: Int, text: Seq[String]): Seq[String] = (b, v) match {
      case (_, 0) => text
      case (0, _) => text :+ "No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.\n"
      case (1, _) => run(0, v - 1, text :+ s"1 bottle of beer on the wall, 1 bottle of beer.\nTake it down and pass it around, no more bottles of beer on the wall.\n")
      case _ => run(b - 1, v - 1, text :+ s"$b bottles of beer on the wall, $b bottles of beer.\nTake one down and pass it around, ${b - 1} bottle${if (b - 1 == 1) "" else "s"} of beer on the wall.\n")
    }
    run(bottles, verses, Nil).mkString("\n")
  }

}
