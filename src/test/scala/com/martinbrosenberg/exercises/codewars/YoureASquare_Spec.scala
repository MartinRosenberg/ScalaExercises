package com.martinbrosenberg.exercises.codewars

import com.martinbrosenberg.exercises.exercism.ExercismBaseSpec

class YoureASquare_Spec extends ExercismBaseSpec {

	test("4") {
		YoureASquare.isSquare(4) should be(true)
	}

	test("3") {
		YoureASquare.isSquare(3) should be(false)
	}

	test("25") {
		YoureASquare.isSquare(25) should be(true)
	}

	test("32") {
		YoureASquare.isSquare(32) should be(false)
	}

	test("0") {
		YoureASquare.isSquare(0) should be(true)
	}

	test("-1") {
		YoureASquare.isSquare(-1) should be(false)
	}

}
