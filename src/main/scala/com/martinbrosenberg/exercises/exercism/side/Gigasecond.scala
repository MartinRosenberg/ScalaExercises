package com.martinbrosenberg.exercises.exercism.side

import java.time.{LocalDate, LocalDateTime}

/** GIGASECOND
  *
  * Calculate the moment when someone has lived for `10^9` seconds.
  *
  * A gigasecond is `10^9` (1,000,000,000) seconds.
  */
object Gigasecond {

  def add(startDate: LocalDate): LocalDateTime =
    add(startDate.atStartOfDay)

  def add(startDateTime: LocalDateTime): LocalDateTime =
    startDateTime.plusSeconds(1000000000)

}
