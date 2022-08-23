package com.martinbrosenberg.exercises.exercism.side

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.exercism.side.armstrongnumbers.ArmstrongNumbers

/** @version 1.0.0 */
class ArmstrongNumbers_Spec extends BaseSpec {

  "Single digit numbers are Armstrong numbers" in {
    ArmstrongNumbers.isArmstrongNumber(5) should be (true)
  }

  "There are no 2 digit Armstrong numbers" in {
    ArmstrongNumbers.isArmstrongNumber(10) should be (false)
  }

  "Three digit number that is an Armstrong number" in {
    ArmstrongNumbers.isArmstrongNumber(153) should be (true)
  }

  "Three digit number that is not an Armstrong number" in {
    ArmstrongNumbers.isArmstrongNumber(100) should be (false)
  }

  "Four digit number that is an Armstrong number" in {
    ArmstrongNumbers.isArmstrongNumber(9474) should be (true)
  }

  "Four digit number that is not an Armstrong number" in {
    ArmstrongNumbers.isArmstrongNumber(9475) should be (false)
  }

  "Seven digit number that is an Armstrong number" in {
    ArmstrongNumbers.isArmstrongNumber(9926315) should be (true)
  }

  "Seven digit number that is not an Armstrong number" in {
    ArmstrongNumbers.isArmstrongNumber(9926314) should be (false)
  }

}
