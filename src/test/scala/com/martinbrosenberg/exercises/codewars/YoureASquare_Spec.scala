package com.martinbrosenberg.exercises.codewars

import com.martinbrosenberg.exercises.BaseSpec

class YoureASquare_Spec extends BaseSpec {

	"4" in {
		YoureASquare.isSquare(4) should be(true)
	}

	"3" in {
		YoureASquare.isSquare(3) should be(false)
	}

	"25" in {
		YoureASquare.isSquare(25) should be(true)
	}

	"32" in {
		YoureASquare.isSquare(32) should be(false)
	}

	"0" in {
		YoureASquare.isSquare(0) should be(true)
	}

	"-1" in {
		YoureASquare.isSquare(-1) should be(false)
	}

}
