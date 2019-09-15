package com.martinbrosenberg.exercises.codersworkshop

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.codersworkshop.CountWords._

class CountWords_Spec extends BaseSpec {

  "countWords should correctly count instances of each word" in {
    val expected = Map(
      "give" -> 1,
      "a" -> 2,
      "little" -> 2,
      "get" -> 1,
    )
    val actual = countWords("give a little get a little")
    assertResult(expected)(actual)
  }

}
