package com.martinbrosenberg.exercises.exercism.side

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.exercism.side.largestseriesproduct.Series

/** @version 1.1.0 */
class LargestSeriesProduct_Spec extends BaseSpec {

  "finds the largest product if span equals length" in {
    Series.largestProduct(2, "29") should be(Some(18))
  }

  "can find the largest product of 2 with numbers in order" in {
    Series.largestProduct(2, "0123456789") should be(Some(72))
  }

  "can find the largest product of 2" in {
    Series.largestProduct(2, "576802143") should be(Some(48))
  }

  "can find the largest product of 3 with numbers in order" in {
    Series.largestProduct(3, "0123456789") should be(Some(504))
  }

  "can find the largest product of 3" in {
    Series.largestProduct(3, "1027839564") should be(Some(270))
  }

  "can find the largest product of 5 with numbers in order" in {
    Series.largestProduct(5, "0123456789") should be(Some(15120))
  }

  "can get the largest product of a big number" in {
    Series.largestProduct(
      6,
      "73167176531330624919225119674426574742355349194934") should be(
      Some(23520))
  }

  "reports zero if the only digits are zero" in {
    Series.largestProduct(2, "0000") should be(Some(0))
  }

  "reports zero if all spans include zero" in {
    Series.largestProduct(3, "99099") should be(Some(0))
  }

  "rejects span longer than string length" in {
    Series.largestProduct(4, "123") should be(None)
  }

  "reports 1 for empty string and empty product (0 span)" in {
    Series.largestProduct(0, "") should be(Some(1))
  }

  "reports 1 for nonempty string and empty product (0 span)" in {
    Series.largestProduct(0, "123") should be(Some(1))
  }

  "rejects empty string and nonzero span" in {
    Series.largestProduct(1, "") should be(None)
  }

  "rejects invalid character in digits" in {
    Series.largestProduct(2, "1234a5") should be(None)
  }

  "rejects negative span" in {
    Series.largestProduct(-1, "12345") should be(None)
  }

}
