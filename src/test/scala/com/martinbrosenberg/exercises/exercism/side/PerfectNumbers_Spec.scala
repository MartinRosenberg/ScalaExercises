package com.martinbrosenberg.exercises.exercism.side

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.exercism.side.perfectnumbers.{NumberType, PerfectNumbers}

/** @version 1.1.0 */
class PerfectNumbers_Spec extends BaseSpec {

  "Smallest perfect number is classified correctly" in {
    PerfectNumbers.classify(6) should be(Right(NumberType.Perfect))
  }

  "Medium perfect number is classified correctly" in {
    PerfectNumbers.classify(28) should be(Right(NumberType.Perfect))
  }

  "Large perfect number is classified correctly" in {
    PerfectNumbers.classify(33550336) should be(Right(NumberType.Perfect))
  }

  "Smallest abundant number is classified correctly" in {
    PerfectNumbers.classify(12) should be(Right(NumberType.Abundant))
  }

  "Medium abundant number is classified correctly" in {
    PerfectNumbers.classify(30) should be(Right(NumberType.Abundant))
  }

  "Large abundant number is classified correctly" in {
    PerfectNumbers.classify(33550335) should be(Right(NumberType.Abundant))
  }

  "Smallest prime deficient number is classified correctly" in {
    PerfectNumbers.classify(2) should be(Right(NumberType.Deficient))
  }

  "Smallest non-prime deficient number is classified correctly" in {
    PerfectNumbers.classify(4) should be(Right(NumberType.Deficient))
  }

  "Medium deficient number is classified correctly" in {
    PerfectNumbers.classify(32) should be(Right(NumberType.Deficient))
  }

  "Large deficient number is classified correctly" in {
    PerfectNumbers.classify(33550337) should be(Right(NumberType.Deficient))
  }

  "Edge case (no factors other than itself) is classified correctly" in {
    PerfectNumbers.classify(1) should be(Right(NumberType.Deficient))
  }

  "Zero is rejected (not a natural number)" in {
    PerfectNumbers.classify(0) should be(
      Left("Classification is only possible for natural numbers."))
  }

  "Negative integer is rejected (not a natural number)" in {
    PerfectNumbers.classify(-1) should be(
      Left("Classification is only possible for natural numbers."))
  }

}