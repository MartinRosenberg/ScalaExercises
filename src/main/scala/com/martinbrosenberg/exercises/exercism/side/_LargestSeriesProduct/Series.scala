package com.martinbrosenberg.exercises.exercism.side._LargestSeriesProduct

/** LARGEST SERIES PRODUCT
  *
  * Given a string of digits, calculate the largest product for a contiguous
  * substring of digits of length n.
  *
  * For example, for the input '1027839564', the largest product for a series of
  * 3 digits is 270 (9 * 5 * 6), and the largest product for a series of 5
  * digits is 7560 (7 * 8 * 3 * 9 * 5).
  *
  * Note that these series are only required to occupy adjacent positions in the
  * input; the digits need not be numerically consecutive.
  *
  * For the input '73167176531330624919225119674426574742355349194934', the
  * largest product for a series of 6 digits is 23520.
  */
object Series {

  def largestProduct(n: Int, s: String): Option[Int] =
    if (n == 0) Some(1)
    else if (n < 0 || n > s.length || s.exists(!_.isDigit)) None
    else Some(s.map(_.asDigit).sliding(n).map(_.product).max)

}
