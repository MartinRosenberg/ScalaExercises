package com.martinbrosenberg.exercises.exercism.track.e09_robotsimulator

sealed class Bearing(_left: => Bearing, _right: => Bearing) {
  lazy val left: Bearing = _left
  lazy val right: Bearing = _right
}

object Bearing {
  lazy val North: Bearing = new Bearing(West,  East)
  lazy val East:  Bearing = new Bearing(North, South)
  lazy val South: Bearing = new Bearing(East,  West)
  lazy val West:  Bearing = new Bearing(South, North)
}
