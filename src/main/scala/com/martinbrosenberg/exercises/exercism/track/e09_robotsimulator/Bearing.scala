package com.martinbrosenberg.exercises.exercism.track.e09_robotsimulator

import Direction._

object Bearing extends Enumeration {
  type Bearing = Value

  val North, East, South, West = Value

  def apply(bearing: Bearing, dir: Direction): Bearing =
    Bearing(bearing.id + dir.id match {
      case -1 => 3
      case  4 => 0
      case  n => n
    })

}