package com.martinbrosenberg.exercises.exercism.side.phonenumber

object PhoneNumber {

  def clean(number: String): Option[String] = {
    val Valid = """1*([2-9]\d{2}[2-9]\d{6})""".r
    number.filter(_.isDigit) match {
      case Valid(cleaned) => Some(cleaned)
      case _ => None
    }
  }

}
