package com.martinbrosenberg.exercises.codewars

/** Given a message consisting of space-separated words, you need to encrypt
	* each word in the message using the following rules:
	*
	*  1. The first letter must be converted to its ASCII code.
	*  1. The second letter must be switched with the last letter.
	*
	* To keep it simple, there are no special characters in the input.
	*
	* You can find some examples in the test fixtures.
	*/
object EncryptThis {

	def encryptThis(text: String): String =
		text.split(" ").withFilter(_.nonEmpty).map { w =>
			if (w.length < 3) s"${w.head.toInt}${w.tail}"
			else s"${w.head.toInt}${w.last}${w.drop(2).dropRight(1)}${w(1)}"
		}.mkString(" ")

}
