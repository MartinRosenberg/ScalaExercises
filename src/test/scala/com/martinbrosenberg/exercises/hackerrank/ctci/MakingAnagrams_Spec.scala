package com.martinbrosenberg.exercises.hackerrank.ctci

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.hackerrank.ctci.MakingAnagrams.makeAnagram
import com.martinbrosenberg.exercises.hackerrank.ctci.MakingAnagrams_Spec.testCases

class MakingAnagrams_Spec extends BaseSpec {
  for ((a, b, result) <- testCases) {
    s"The number of deletions required to make anagrams of '$a' and '$b' should be $result" in {
      assertResult(result)(makeAnagram(a, b))
    }
  }
}

object MakingAnagrams_Spec {
  private val testCases = Seq[(String, String, Int)](
    ("cde", "dcf", 2),
    ("cde", "abc", 4),
  )
}