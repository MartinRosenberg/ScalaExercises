package com.martinbrosenberg.exercises.exercism.track

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.exercism.track.e09_robotsimulator.{Bearing, Robot}

/** @version 2.2.0 */
class E09_Robot_Spec extends BaseSpec {

  "A robot is created with a position and a direction - Robots are created with a position and direction" in {
    Robot(Bearing.North, (0, 0)) should be(Robot(Bearing.North, (0, 0)))
  }

  "A robot is created with a position and a direction - Negative positions are allowed" in {
    Robot(Bearing.South, (-1, -1)) should be(Robot(Bearing.South, (-1, -1)))
  }

  "rotates the robot's direction 90 degrees clockwise - does not change the position" in {
    Robot(Bearing.North, (0, 0)).turnRight.coordinates should be((0, 0))
  }

  "rotates the robot's direction 90 degrees clockwise - changes the direction from north to east" in {
    Robot(Bearing.North, (0, 0)).turnRight.bearing should be(Bearing.East)
  }

  "rotates the robot's direction 90 degrees clockwise - changes the direction from east to south" in {
    Robot(Bearing.East, (0, 0)).turnRight.bearing should be(Bearing.South)
  }

  "rotates the robot's direction 90 degrees clockwise - changes the direction from south to west" in {
    Robot(Bearing.South, (0, 0)).turnRight.bearing should be(Bearing.West)
  }

  "rotates the robot's direction 90 degrees clockwise - changes the direction from west to north" in {
    Robot(Bearing.West, (0, 0)).turnRight.bearing should be(Bearing.North)
  }

  "rotates the robot's direction 90 degrees counter-clockwise - does not change the position" in {
    Robot(Bearing.North, (0, 0)).turnLeft.coordinates should be((0, 0))
  }

  "rotates the robot's direction 90 degrees counter-clockwise - changes the direction from north to west" in {
    Robot(Bearing.North, (0, 0)).turnLeft.bearing should be(Bearing.West)
  }

  "rotates the robot's direction 90 degrees counter-clockwise - changes the direction from west to south" in {
    Robot(Bearing.West, (0, 0)).turnLeft.bearing should be(Bearing.South)
  }

  "rotates the robot's direction 90 degrees counter-clockwise - changes the direction from south to east" in {
    Robot(Bearing.South, (0, 0)).turnLeft.bearing should be(Bearing.East)
  }

  "rotates the robot's direction 90 degrees counter-clockwise - changes the direction from east to north" in {
    Robot(Bearing.East, (0, 0)).turnLeft.bearing should be(Bearing.North)
  }

  "moves the robot forward 1 space in the direction it is pointing - does not change the direction" in {
    Robot(Bearing.North, (0, 0)).advance.bearing should be(Bearing.North)
  }

  "moves the robot forward 1 space in the direction it is pointing - increases the y coordinate one when facing north" in {
    Robot(Bearing.North, (0, 0)).advance.coordinates should be((0, 1))
  }

  "moves the robot forward 1 space in the direction it is pointing - decreases the y coordinate by one when facing south" in {
    Robot(Bearing.South, (0, 0)).advance.coordinates should be((0, -1))
  }

  "moves the robot forward 1 space in the direction it is pointing - increases the x coordinate by one when facing east" in {
    Robot(Bearing.East, (0, 0)).advance.coordinates should be((1, 0))
  }

  "moves the robot forward 1 space in the direction it is pointing - decreases the x coordinate by one when facing west" in {
    Robot(Bearing.West, (0, 0)).advance.coordinates should be((-1, 0))
  }

  "Where R = Turn Right, L = Turn Left and A = Advance, the robot can follow a series of instructions and end up with the correct position and direction - instructions to move west and north" in {
    Robot(Bearing.North, (0, 0)).simulate("LAAARALA") should be(
      Robot(Bearing.West, (-4, 1)))
  }

  "Where R = Turn Right, L = Turn Left and A = Advance, the robot can follow a series of instructions and end up with the correct position and direction - instructions to move west and south" in {
    Robot(Bearing.East, (2, -7)).simulate("RRAAAAALA") should be(
      Robot(Bearing.South, (-3, -8)))
  }

  "Where R = Turn Right, L = Turn Left and A = Advance, the robot can follow a series of instructions and end up with the correct position and direction - instructions to move east and north" in {
    Robot(Bearing.South, (8, 4)).simulate("LAAARRRALLLL") should be(
      Robot(Bearing.North, (11, 5)))
  }
}
