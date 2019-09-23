package com.martinbrosenberg.exercises.exercism.track

import org.scalatest.{FunSuite, Matchers}

/** @version 1.1.0 */
class E01_HelloWorld_Spec extends FunSuite with Matchers {

  test("Say Hi!") {
    E01_HelloWorld.hello() should be ("Hello, World!")
  }

}
