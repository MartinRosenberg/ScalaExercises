package com.martinbrosenberg.exercises.exercism.track.e09_robotsimulator

import com.martinbrosenberg.exercises.exercism.track.e09_robotsimulator.Bearing._

case class Robot(bearing: Bearing, coordinates: (Int, Int)) {
  def advance: Robot = coordinates match { case (x, y) =>
    copy(coordinates = bearing match {
      case North => (x, y + 1)
      case East  => (x + 1, y)
      case South => (x, y - 1)
      case West  => (x - 1, y)
    })
  }

  def turnLeft: Robot = copy(bearing = bearing.left)

  def turnRight: Robot = copy(bearing = bearing.right)

  def simulate(commands: String): Robot =
    commands.foldLeft(this)((robot, command) => command match {
      case 'A' => robot.advance
      case 'L' => robot.turnLeft
      case 'R' => robot.turnRight
    })
}
