package com.martinbrosenberg.exercises.codewars

import com.martinbrosenberg.exercises.exercism.ExercismBaseSpec

class DescendingOrder_Spec extends ExercismBaseSpec {

	test("0") {
		DescendingOrder.descendingOrder(0) shouldBe 0
	}

	test("7") {
		DescendingOrder.descendingOrder(7) shouldBe 7
	}

	test("15") {
		DescendingOrder.descendingOrder(15) shouldBe 51
	}

	test("42145") {
		DescendingOrder.descendingOrder(42145) shouldBe 54421
	}

	test("145263") {
		DescendingOrder.descendingOrder(145263) shouldBe 654321
	}

	test("123456789") {
		DescendingOrder.descendingOrder(123456789) shouldBe 987654321
	}

}
