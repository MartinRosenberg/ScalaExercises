package com.martinbrosenberg.exercises.codewars

import com.martinbrosenberg.exercises.BaseSpec

class DescendingOrder_Spec extends BaseSpec {

	"0" in {
		DescendingOrder.descendingOrder(0) shouldBe 0
	}

	"7" in {
		DescendingOrder.descendingOrder(7) shouldBe 7
	}

	"15" in {
		DescendingOrder.descendingOrder(15) shouldBe 51
	}

	"42145" in {
		DescendingOrder.descendingOrder(42145) shouldBe 54421
	}

	"145263" in {
		DescendingOrder.descendingOrder(145263) shouldBe 654321
	}

	"123456789" in {
		DescendingOrder.descendingOrder(123456789) shouldBe 987654321
	}

}
