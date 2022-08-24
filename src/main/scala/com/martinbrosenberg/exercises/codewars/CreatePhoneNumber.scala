package com.martinbrosenberg.exercises.codewars

/** Write a function that accepts an array of 10 integers (between 0 and 9),
	* that returns a string of those numbers in the form of a phone number.
	*
	* You can find some examples in the test fixtures.
	*/
object CreatePhoneNumber {

	def createPhoneNumber(numbers: Seq[Int]): String = {
		val area = numbers.take(3).mkString
		val exchange = numbers.slice(3, 6).mkString
		val station = numbers.drop(6).mkString
		s"($area) $exchange-$station"
	}

}
