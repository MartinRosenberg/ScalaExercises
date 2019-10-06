package com.martinbrosenberg.exercises.exercism.side

import com.martinbrosenberg.exercises.exercism.ExercismBaseSpec
import com.martinbrosenberg.exercises.exercism.side.RobotName_Spec._
import com.martinbrosenberg.exercises.exercism.side.robotname.Robot

import scala.collection.mutable

/** @version created manually **/
class RobotName_Spec extends ExercismBaseSpec {

  test("has a name") {
    new Robot().name should fullyMatch regex nameRegex
  }

  test("does not change its name") {
    val robot = new Robot
    val name = robot.name
    robot.name should be (name)
  }

  test("does not have the same name as other robots") {
    new Robot().name should not be new Robot().name
  }

  test("can have its name reset") {
    val robot = new Robot
    val name = robot.name
    robot.reset()
    val name2 = robot.name
    name should not equal name2
    name2 should fullyMatch regex nameRegex
  }

  // Making this test pass is an optional extra exercise, should you want more
  // of a challenge. It's ignored by default, to make it run, simply change
  // "ignore" below to "test". There are 26^2 * 1,000 = 676,000 possible robot
  // names - you have to ensure that none are repeated. The Robot code needs to
  // be efficient enough to allow all 676,000 unique names to be generated.
  test("a large number of new instances have unique names") {
    val alreadySet = mutable.HashSet.empty[String]
    for(_ <- 0 until 676000 - 6) { // as 6 robot names are generated in the tests above!
      val name = new Robot().name
      if (alreadySet contains name) {
        fail(s"$name is repeated")
      }
      alreadySet += name
    }
  }

}

object RobotName_Spec {

  val nameRegex = """[A-Z]{2}\d{3}"""

}
