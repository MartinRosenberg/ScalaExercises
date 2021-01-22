package com.martinbrosenberg.exercises.exercism.track

import com.martinbrosenberg.exercises.exercism.track.e01_helloworld.HelloWorld
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

/** @version 1.1.0 */
class E01_HelloWorld_Spec extends AnyFunSuite with Matchers {

  test("Say Hi!") {
    HelloWorld.hello() should be ("Hello, World!")
  }

}
