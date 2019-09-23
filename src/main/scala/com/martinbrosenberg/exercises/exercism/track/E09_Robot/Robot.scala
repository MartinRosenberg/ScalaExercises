package com.martinbrosenberg.exercises.exercism.track.E09_Robot

import Bearing._
import Direction._

/** ROBOT
  *
  * Write a robot simulator.
  *
  * A robot factory's test facility needs a program to verify robot movements.
  *
  * The robots have three possible movements:
  *
  * - turn right
  * - turn left
  * - advance
  *
  * Robots are placed on a hypothetical infinite grid, facing a particular
  * direction (north, east, south, or west) at a set of {x,y} coordinates, e.g.,
  * {3,8}, with coordinates increasing to the north and east.
  *
  * The robot then receives a number of instructions, at which point the testing
  * facility verifies the robot's new position, and in which direction it is
  * pointing.
  *
  * - The letter-string "RAALAL" means:
  *   - Turn right
  *   - Advance twice
  *   - Turn left
  *   - Advance once
  *   - Turn left yet again
  * - Say a robot starts at {7, 3} facing north. Then running this stream of
  *   instructions should leave it at {9, 4} facing west.
  */
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
