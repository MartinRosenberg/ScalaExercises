package com.martinbrosenberg.exercises.codersworkshop

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.codersworkshop.CollatzSequence._
import com.martinbrosenberg.exercises.codersworkshop.CollatzSequence_Spec._

class CollatzSequence_Spec extends BaseSpec {

  for (TestCase(start, steps) <- testCases) {
    s"collatzSequence should take $steps steps when starting from $start" in {
      collatzSequence(start).success.value should be(steps)
    }
  }

}

object CollatzSequence_Spec {

  private case class TestCase(start: Int, steps: Int)

  private val testCases = Seq[TestCase](
    TestCase(16, 4),
    TestCase(21, 7),
    TestCase(24, 10),
    TestCase(30, 18),
    TestCase(18, 20),
    TestCase(25, 23),
  )

}
