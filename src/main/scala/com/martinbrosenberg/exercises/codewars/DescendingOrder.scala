package com.martinbrosenberg.exercises.codewars

/** Your task is to make a function that can take any non-negative integer as an
	* argument and return it with its digits in descending order. Essentially,
	* rearrange the digits to create the highest possible number.
	*
	* You can find some examples in the test fixtures.
	*/
object DescendingOrder {

	def descendingOrder(num: Int): Int = num.toString.sortWith(_ > _).toInt

}
