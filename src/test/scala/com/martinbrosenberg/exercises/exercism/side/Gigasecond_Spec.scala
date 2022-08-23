package com.martinbrosenberg.exercises.exercism.side

import com.martinbrosenberg.exercises.BaseSpec
import java.time.{LocalDate, LocalDateTime}
import java.time.format.DateTimeFormatter
import com.martinbrosenberg.exercises.exercism.side.gigasecond.Gigasecond

/** @version 1.1.0 */
class Gigasecond_Spec extends BaseSpec {

  private def dateTime(str: String): LocalDateTime =
    LocalDateTime.from(DateTimeFormatter.ISO_DATE_TIME.parse(str))

  private def date(str: String): LocalDate =
    LocalDate.from(DateTimeFormatter.ISO_DATE.parse(str))

  "date only specification of time" in {
    val input = date("2011-04-25")
    val expected = dateTime("2043-01-01T01:46:40")
    Gigasecond.add(input) should be (expected)
  }

  "second test for date only specification of time" in {
    val input = date("1977-06-13")
    val expected = dateTime("2009-02-19T01:46:40")
    Gigasecond.add(input) should be (expected)
  }

  "third test for date only specification of time" in {
    val input = date("1959-07-19")
    val expected = dateTime("1991-03-27T01:46:40")
    Gigasecond.add(input) should be (expected)
  }

  "full time specified" in {
    val input = dateTime("2015-01-24T22:00:00")
    val expected = dateTime("2046-10-02T23:46:40")
    Gigasecond.add(input) should be (expected)
  }

  "full time with day roll-over" in {
    val input = dateTime("2015-01-24T23:59:59")
    val expected = dateTime("2046-10-03T01:46:39")
    Gigasecond.add(input) should be (expected)
  }

}
