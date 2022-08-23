package com.martinbrosenberg.exercises.exercism.track

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.exercism.track.e04_spaceage.SpaceAge

/** @version 1.1.0 */
class E04_SpaceAge_Spec extends BaseSpec {

  "age on Earth" in {
    SpaceAge.onEarth(1000000000) should be (31.69 +- 0.01)
  }

  "age on Mercury" in {
    SpaceAge.onMercury(2134835688) should be (280.88 +- 0.01)
  }

  "age on Venus" in {
    SpaceAge.onVenus(189839836) should be (9.78 +- 0.01)
  }

  "age on Mars" in {
    SpaceAge.onMars(2.329871239E9) should be (39.25 +- 0.01)
  }

  "age on Jupiter" in {
    SpaceAge.onJupiter(901876382) should be (2.41 +- 0.01)
  }

  "age on Saturn" in {
    SpaceAge.onSaturn(3.0E9) should be (3.23 +- 0.01)
  }

  "age on Uranus" in {
    SpaceAge.onUranus(3.210123456E9) should be (1.21 +- 0.01)
  }

  "age on Neptune" in {
    SpaceAge.onNeptune(8.210123456E9) should be (1.58 +- 0.01)
  }
}