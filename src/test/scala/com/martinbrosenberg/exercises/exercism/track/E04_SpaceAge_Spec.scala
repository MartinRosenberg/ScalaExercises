package com.martinbrosenberg.exercises.exercism.track

import com.martinbrosenberg.exercises.exercism.ExercismBaseSpec
import org.scalatest.{FunSuite, Matchers}

/** @version 1.1.0 */
class E04_SpaceAge_Spec extends ExercismBaseSpec {

  test("age on Earth") {
    E04_SpaceAge.onEarth(1000000000) should be (31.69 +- 0.01)
  }

  test("age on Mercury") {
    E04_SpaceAge.onMercury(2134835688) should be (280.88 +- 0.01)
  }

  test("age on Venus") {
    E04_SpaceAge.onVenus(189839836) should be (9.78 +- 0.01)
  }

  test("age on Mars") {
    E04_SpaceAge.onMars(2.329871239E9) should be (39.25 +- 0.01)
  }

  test("age on Jupiter") {
    E04_SpaceAge.onJupiter(901876382) should be (2.41 +- 0.01)
  }

  test("age on Saturn") {
    E04_SpaceAge.onSaturn(3.0E9) should be (3.23 +- 0.01)
  }

  test("age on Uranus") {
    E04_SpaceAge.onUranus(3.210123456E9) should be (1.21 +- 0.01)
  }

  test("age on Neptune") {
    E04_SpaceAge.onNeptune(8.210123456E9) should be (1.58 +- 0.01)
  }
}