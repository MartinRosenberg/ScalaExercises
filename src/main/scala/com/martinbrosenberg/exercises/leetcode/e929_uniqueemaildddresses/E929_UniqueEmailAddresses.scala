package com.martinbrosenberg.exercises.leetcode.e929_uniqueemaildddresses

object E929_UniqueEmailAddresses {

  private def sanitize(local: String): String =
    local
      .replaceFirst("""\+.+""", "")
      .replace(".", "")

  def numUniqueEmails_1(emails: Seq[String]): Int =
    emails
      .map { email =>
        val Array(local, domain) = email.split("@")
        s"${sanitize(local)}@$domain"
      }
      .toSet
      .size

  def numUniqueEmails_2(emails: Seq[String]): Int =
    emails
      .map { email =>
        val parts = email.split("[+@]")
        parts.head.replace(".", "") + parts.last
      }
      .distinct
      .length

}
