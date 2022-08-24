package com.martinbrosenberg.exercises.codewars

import com.martinbrosenberg.exercises.BaseSpec

class StopSpinningMyWords_Spec extends BaseSpec {

	"Hey fellow warriors" in {
		StopSpinningMyWords.spinWords("Hey fellow warriors") should be("Hey wollef sroirraw")
	}

	"This is a test" in {
		StopSpinningMyWords.spinWords("This is a test") should be("This is a test")
	}

	"This is another test" in {
		StopSpinningMyWords.spinWords("This is another test") should be("This is rehtona test")
	}

	"emocleW" in {
		StopSpinningMyWords.spinWords("emocleW") should be("Welcome")
	}

	"Hey wollef sroirraw" in {
		StopSpinningMyWords.spinWords("Hey wollef sroirraw") should be("Hey fellow warriors")
	}

	"This is rehtona test" in {
		StopSpinningMyWords.spinWords("This is rehtona test") should be("This is another test")
	}

	"You are tsomla to the last test" in {
		StopSpinningMyWords.spinWords("You are tsomla to the last test") should be("You are almost to the last test")
	}

	"Just gniddik ereht is llits one more" in {
		StopSpinningMyWords.spinWords("Just gniddik ereht is llits one more") should be("Just kidding there is still one more")
	}

	"ylsuoireS this is the last one" in {
		StopSpinningMyWords.spinWords("ylsuoireS this is the last one") should be("Seriously this is the last one")
	}

}
