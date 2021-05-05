package com.martinbrosenberg.exercises.exercism.track.e05_gradeschool

import com.martinbrosenberg.exercises.exercism.track.e05_gradeschool.School._

import scala.collection.immutable.SortedMap

class School {
  private var _db: DB = SortedMap.empty[Grade, Roster].withDefaultValue(Nil)

  def db: DB = _db

  def add(name: Name, grade: Grade): Unit = {
    _db += (grade -> (db(grade) :+ name))
  }

  def grade(grade: Grade): Roster = db(grade)

  def sorted: DB = db.view.mapValues(_.sorted).toMap
}

object School {
  type Name = String
  type Grade = Int
  type Roster = Seq[Name]
  type DB = Map[Grade, Roster]
}
