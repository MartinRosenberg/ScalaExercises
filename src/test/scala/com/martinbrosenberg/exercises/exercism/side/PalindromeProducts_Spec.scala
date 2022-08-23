package com.martinbrosenberg.exercises.exercism.side

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.exercism.side.palindromeproducts.PalindromeProducts

/** @version 1.1.0 */
class PalindromeProducts_Spec extends BaseSpec {

  "finds the smallest palindrome from single digit factors" in {
    PalindromeProducts(1, 9).smallest should be (Some((1, Set((1, 1)))))
  }

  "finds the largest palindrome from single digit factors" in {
    PalindromeProducts(1, 9).largest should be (Some((9, Set((1, 9), (3, 3)))))
  }

  "find the smallest palindrome from double digit factors" in {
    PalindromeProducts(10, 99).smallest should be (Some((121, Set((11, 11)))))
  }

  "find the largest palindrome from double digit factors" in {
    PalindromeProducts(10, 99).largest should be (Some((9009, Set((91, 99)))))
  }

  "find smallest palindrome from triple digit factors" in {
    PalindromeProducts(100, 999).smallest should be (Some((10201, Set((101, 101)))))
  }

  "find the largest palindrome from triple digit factors" in {
    PalindromeProducts(100, 999).largest should be (Some((906609, Set((913, 993)))))
  }

  "find smallest palindrome from four digit factors" in {
    PalindromeProducts(1000, 9999).smallest should be (Some((1002001, Set((1001, 1001)))))
  }

  "find the largest palindrome from four digit factors" in {
    PalindromeProducts(1000, 9999).largest should be (Some((99000099, Set((9901, 9999)))))
  }

  "empty result for smallest if no palindrome in the range" in {
    PalindromeProducts(1002, 1003).smallest should be (None)
  }

  "empty result for largest if no palindrome in the range" in {
    PalindromeProducts(15, 15).largest should be (None)
  }

  "error result for smallest if min is more than max" in {
    PalindromeProducts(10000, 1).smallest should be (None)
  }

  "error result for largest if min is more than max" in {
    PalindromeProducts(2, 1).largest should be (None)
  }

}
