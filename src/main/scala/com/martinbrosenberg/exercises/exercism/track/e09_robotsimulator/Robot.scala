package com.martinbrosenberg.exercises.exercism.track.e09_robotsimulator

import Bearing._
import Direction._

case class Robot(bearing: Bearing, coordinates: (Int, Int)) {

  def advance: Robot = coordinates match { case (x, y) =>
    copy(coordinates = bearing match {
      case North => (x, y + 1)
      case East  => (x + 1, y)
      case South => (x, y - 1)
      case West  => (x - 1, y)
    })
  }

  private def turn(dir: Direction): Robot = copy(Bearing(bearing, dir))

  def turnLeft: Robot = turn(L)

  def turnRight: Robot = turn(R)

  def simulate(commands: String): Robot =
    commands.foldLeft(this)((robot, cmd) => cmd match {
      case 'A' => robot.advance
      case 'L' => robot.turnLeft
      case 'R' => robot.turnRight
    })

}
