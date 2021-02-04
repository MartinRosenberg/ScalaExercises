package com.martinbrosenberg.exercises.leetcode.e929_uniqueemailaddresses

import com.github.dwickern.macros.NameOf._
import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.leetcode.e929_uniqueemailaddresses.E929_UniqueEmailAddresses_Spec.{TestCase, functions, testCases}
import com.martinbrosenberg.exercises.leetcode.e929_uniqueemaildddresses.E929_UniqueEmailAddresses._

class E929_UniqueEmailAddresses_Spec extends BaseSpec {

  for ((fnName, numUniqueEmails) <- functions) {
    s"Using function $fnName" - {
      for (TestCase(emails, unique) <- testCases) {
        s"$emails should contain $unique unique emails" in {
          assertResult(unique)(numUniqueEmails(emails))
        }
      }
    }
  }

}

object E929_UniqueEmailAddresses_Spec {

  private case class TestCase(emails: Seq[String], unique: Int)

  private val testCases = Seq[TestCase](
    TestCase(
      Seq("test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"),
      2
    ),
    TestCase(
      Seq("testemail@leetcode.com", "testemail1@leetcode.com", "testemail+david@lee.tcode.com"),
      3
    )
  )

  private val functions = Seq[(String, Seq[String] => Int)](
    nameOf(numUniqueEmails_1 _) -> numUniqueEmails_1,
    nameOf(numUniqueEmails_2 _) -> numUniqueEmails_2,
  )

}
