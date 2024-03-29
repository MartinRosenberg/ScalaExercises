package com.martinbrosenberg.exercises.exercism.side

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.exercism.side.binarysearch.BinarySearch

/** @version 1.3.0 */
class BinarySearch_Spec extends BaseSpec {

  "finds a value in an array with one element" in {
    BinarySearch.find(List(6), 6) should be(Some(0))
  }

  "finds a value in the middle of an array" in {
    BinarySearch.find(List(1, 3, 4, 6, 8, 9, 11), 6) should be(Some(3))
  }

  "finds a value at the beginning of an array" in {
    BinarySearch.find(List(1, 3, 4, 6, 8, 9, 11), 1) should be(Some(0))
  }

  "finds a value at the end of an array" in {
    BinarySearch.find(List(1, 3, 4, 6, 8, 9, 11), 11) should be(Some(6))
  }

  "finds a value in an array of odd length" in {
    BinarySearch.find(List(1, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 634),
      144) should be(Some(9))
  }

  "finds a value in an array of even length" in {
    BinarySearch.find(List(1, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377), 21) should be(
      Some(5))
  }

  "identifies that a value is not included in the array" in {
    BinarySearch.find(List(1, 3, 4, 6, 8, 9, 11), 7) should be(None)
  }

  "a value smaller than the array's smallest value is not found" in {
    BinarySearch.find(List(1, 3, 4, 6, 8, 9, 11), 0) should be(None)
  }

  "a value larger than the array's largest value is not found" in {
    BinarySearch.find(List(1, 3, 4, 6, 8, 9, 11), 13) should be(None)
  }

  "nothing is found in an empty array" in {
    BinarySearch.find(List(), 1) should be(None)
  }

  "nothing is found when the left and right bounds cross" in {
    BinarySearch.find(List(1, 2), 0) should be(None)
  }

}
