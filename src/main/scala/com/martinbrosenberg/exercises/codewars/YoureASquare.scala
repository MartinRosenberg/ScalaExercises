package com.martinbrosenberg.exercises.codewars

/** Given an integral number, determine if it's a square number. In mathematics,
	* a square number or perfect square is an integer that is the square of an
	* integer; in other words, it is the product of some integer with itself.
	*
	* You can find some examples in the test fixtures.
	*/
object YoureASquare {

	def isSquare(x: Int): Boolean = Math.sqrt(x).isWhole

}
