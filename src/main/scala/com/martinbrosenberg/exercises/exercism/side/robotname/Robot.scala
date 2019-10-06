package com.martinbrosenberg.exercises.exercism.side.robotname

import scala.collection.mutable
import scala.util.Random

class Robot() {

  private var _name: String = Robot.replaceName(_name)

  def name: String = _name

  def reset(): Unit = { _name = Robot.replaceName(_name) }

}

object Robot {

  private val namesInUse = mutable.HashSet.empty[String]

  /** To make naming scalable, take argument by name for `continually` */
  private val randomName: Iterator[String] = {
    val random = new Random

    def choose[A](from: Seq[A]): Iterator[A] =
      Iterator.continually(from(random.nextInt(from.length)))

    val randomLetter = choose('A' to 'Z')
    val randomDigit = choose('0' to '9')

    Iterator
      .continually((randomLetter.take(2) ++ randomDigit.take(3)).mkString)
      .filterNot(namesInUse.contains)
  }

  private def replaceName(oldName: String): String = {
    val newName = randomName.next()
    namesInUse -= oldName
    namesInUse += newName
    newName
  }

}
