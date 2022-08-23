package com.martinbrosenberg.exercises.exercism.side

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.exercism.side.raindrops.Raindrops

/** @version 1.1.0 */
class Raindrops_Spec extends BaseSpec {

  "the sound for 1 is 1" in {
    Raindrops.convert(1) should be ("1")
  }

  "the sound for 3 is Pling" in {
    Raindrops.convert(3) should be ("Pling")
  }

  "the sound for 5 is Plang" in {
    Raindrops.convert(5) should be ("Plang")
  }

  "the sound for 7 is Plong" in {
    Raindrops.convert(7) should be ("Plong")
  }

  "the sound for 6 is Pling as it has a factor 3" in {
    Raindrops.convert(6) should be ("Pling")
  }

  "2 to the power 3 does not make a raindrop sound as 3 is the exponent not the base" in {
    Raindrops.convert(8) should be ("8")
  }

  "the sound for 9 is Pling as it has a factor 3" in {
    Raindrops.convert(9) should be ("Pling")
  }

  "the sound for 10 is Plang as it has a factor 5" in {
    Raindrops.convert(10) should be ("Plang")
  }

  "the sound for 14 is Plong as it has a factor of 7" in {
    Raindrops.convert(14) should be ("Plong")
  }

  "the sound for 15 is PlingPlang as it has factors 3 and 5" in {
    Raindrops.convert(15) should be ("PlingPlang")
  }

  "the sound for 21 is PlingPlong as it has factors 3 and 7" in {
    Raindrops.convert(21) should be ("PlingPlong")
  }

  "the sound for 25 is Plang as it has a factor 5" in {
    Raindrops.convert(25) should be ("Plang")
  }

  "the sound for 27 is Pling as it has a factor 3" in {
    Raindrops.convert(27) should be ("Pling")
  }

  "the sound for 35 is PlangPlong as it has factors 5 and 7" in {
    Raindrops.convert(35) should be ("PlangPlong")
  }

  "the sound for 49 is Plong as it has a factor 7" in {
    Raindrops.convert(49) should be ("Plong")
  }

  "the sound for 52 is 52" in {
    Raindrops.convert(52) should be ("52")
  }

  "the sound for 105 is PlingPlangPlong as it has factors 3, 5 and 7" in {
    Raindrops.convert(105) should be ("PlingPlangPlong")
  }

  "the sound for 3125 is Plang as it has a factor 5" in {
    Raindrops.convert(3125) should be ("Plang")
  }

}