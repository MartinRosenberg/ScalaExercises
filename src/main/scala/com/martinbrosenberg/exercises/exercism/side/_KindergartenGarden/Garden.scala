package com.martinbrosenberg.exercises.exercism.side._KindergartenGarden

import Plant._
import Garden._

/** KINDERGARTEN GARDEN
  *
  * Given a diagram, determine which plants each child in the kindergarten class
  * is responsible for.
  *
  * The kindergarten class is learning about growing plants. The teacher thought
  * it would be a good idea to give them actual seeds, plant them in actual
  * dirt, and grow actual plants.
  *
  * They've chosen to grow grass, clover, radishes, and violets.
  *
  * To this end, the children have put little cups along the window sills, and
  * planted one type of plant in each cup, choosing randomly from the available
  * types of seeds.
  *
  * {{{
  * [window][window][window]
  * ........................ # each dot represents a cup
  * ........................
  * }}}
  *
  * There are 12 children in the class:
  *
  * Alice, Bob, Charlie, David,
  * Eve, Fred, Ginny, Harriet,
  * Ileana, Joseph, Kincaid, and Larry.
  *
  * Each child gets 4 cups, two on each row. Their teacher assigns cups to the
  * children alphabetically by their names.
  *
  * The following diagram represents Alice's plants:
  *
  * {{{
  * [window][window][window]
  * VR......................
  * RG......................
  * }}}
  *
  * In the first row, nearest the windows, she has a violet and a radish. In the
  * second row she has a radish and some grass.
  *
  * Your program will be given the plants from left-to-right starting with the
  * row nearest the windows. From this, it should be able to determine which
  * plants belong to each student.
  *
  * For example, if it's told that the garden looks like so:
  *
  * {{{
  * [window][window][window]
  * VRCGVVRVCGGCCGVRGCVCGCGV
  * VRCCCGCRRGVCGCRVVCVGCGCV
  * }}}
  *
  * Then if asked for Alice's plants, it should provide:
  *
  * Violets, radishes, violets, radishes
  *
  * While asking for Bob's plants would yield:
  *
  * Clover, grass, clover, clover
  */
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
