package com.martinbrosenberg.exercises.exercism.track.e05_gradeschool

import scala.collection.immutable.TreeMap

class GradeSchool {

  type Grade = Int
  type Roster = Seq[String]
  type DB = Map[Grade, Roster]

  private var _db = TreeMap.empty[Grade, Roster].withDefaultValue[Roster](Nil)

  def db: DB = _db

  def sorted: DB = _db.map { case (g, names) => g -> names.sorted }

  def grade(g: Grade): Roster = _db.getOrElse(g, Nil)

  def add(name: String, g: Grade): Unit = { _db += (g -> (grade(g) :+ name)) }

}