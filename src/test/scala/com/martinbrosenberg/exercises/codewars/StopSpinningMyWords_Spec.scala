package com.martinbrosenberg.exercises.codewars

import com.martinbrosenberg.exercises.exercism.ExercismBaseSpec

class StopSpinningMyWords_Spec extends ExercismBaseSpec {

	test("Hey fellow warriors") {
		StopSpinningMyWords.spinWords("Hey fellow warriors") should be("Hey wollef sroirraw")
	}

	test("This is a test") {
		StopSpinningMyWords.spinWords("This is a test") should be("This is a test")
	}

	test("This is another test") {
		StopSpinningMyWords.spinWords("This is another test") should be("This is rehtona test")
	}

	test("emocleW") {
		StopSpinningMyWords.spinWords("emocleW") should be("Welcome")
	}

	test("Hey wollef sroirraw") {
		StopSpinningMyWords.spinWords("Hey wollef sroirraw") should be("Hey fellow warriors")
	}

	test("This is a test") {
		StopSpinningMyWords.spinWords("This is a test") should be("This is a test")
	}

	test("This is rehtona test") {
		StopSpinningMyWords.spinWords("This is rehtona test") should be("This is another test")
	}

	test("You are tsomla to the last test") {
		StopSpinningMyWords.spinWords("You are tsomla to the last test") should be("You are almost to the last test")
	}

	test("Just gniddik ereht is llits one more") {
		StopSpinningMyWords.spinWords("Just gniddik ereht is llits one more") should be("Just kidding there is still one more")
	}

	test("ylsuoireS this is the last one") {
		StopSpinningMyWords.spinWords("ylsuoireS this is the last one") should be("Seriously this is the last one")
	}

}
