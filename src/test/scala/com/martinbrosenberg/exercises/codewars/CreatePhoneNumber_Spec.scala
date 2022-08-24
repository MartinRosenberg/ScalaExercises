package com.martinbrosenberg.exercises.codewars

import com.martinbrosenberg.exercises.BaseSpec

class CreatePhoneNumber_Spec extends BaseSpec {

	"createPhoneNumber(Seq(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)) should return \"(123) 456-7890\"" in {
		CreatePhoneNumber.createPhoneNumber(Seq(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)) should be("(123) 456-7890")
	}

}
