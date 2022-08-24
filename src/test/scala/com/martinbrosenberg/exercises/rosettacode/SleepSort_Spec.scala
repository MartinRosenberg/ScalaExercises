package com.martinbrosenberg.exercises.rosettacode

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.rosettacode.SleepSort._
import com.martinbrosenberg.exercises.rosettacode.SleepSort_Spec._

class SleepSort_Spec extends BaseSpec {

  // todo: Property testing

  for (ns <- testCases) {
    val expected = ns.sorted
    s"SleepSort of seq $ns should be $expected" in {
      var actual = Seq.empty[Any]
      sort(ns, actual :+= _)
      Thread.sleep(if (ns.isEmpty) 0 else (ns.max + 1) * WaitCoefficient)
      assertResult(expected)(actual)
    }
  }

  // This throws an uncaught exception, then fails because no exception was
  // thrown. I have no idea how to handle that. Programmatically or emotionally.
  // todo: Fix this...?
  "SleepSort of seq with neg numbers should throw IllegalArgumentException" in {
    pendingUntilFixed(
      assertThrows[IllegalArgumentException](sort(Seq(-1)))
    )
  }

}

object SleepSort_Spec {

  private val testCases = Seq[Seq[Int]](
    Nil,
    Seq(0),
    Seq(1, 1), // todo: Sometimes(?) fails, generates Seq(1)
    Seq(1, 3, 6, 0, 9, 7, 4, 2, 5, 8),
  )

}