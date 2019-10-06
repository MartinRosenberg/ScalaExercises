package com.martinbrosenberg.exercises.exercism.side.kindergartengarden

import Plant._
import Garden._

case class Garden(garden: Seq[(Plant, Plant)]) {

  def plants(student: String): Seq[Plant] = {
    val studNum = Students(student)
    garden
      .grouped(2)
      .toSeq
      .slice(studNum, studNum + 1)
      .flatMap { case Seq((p1, p2), (p3, p4)) => Seq(p1, p3, p2, p4) }
  }

}

object Garden {

  private final val Students = Seq(
    "Alice", "Bob", "Charlie", "David", "Eve", "Fred",
    "Ginny", "Harriet", "Ileana", "Joseph", "Kincaid", "Larry"
  ).zipWithIndex.toMap

  def defaultGarden(s: String): Garden = {
    val Array(row1, row2) = s.split('\n').map(_.map(Plant(_)))
    Garden(row1.zip(row2))
  }

}
