package com.martinbrosenberg.exercises.exercism.side.armstrongnumbers

object ArmstrongNumbers {

  def isArmstrongNumber(n: Int): Boolean = {
    val s = n.toString
    val exp = s.length
    n == s.map(n => Math.pow(n.asDigit, exp)).sum
  }

}
