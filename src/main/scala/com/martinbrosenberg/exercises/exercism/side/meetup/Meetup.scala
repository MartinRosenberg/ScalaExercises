package com.martinbrosenberg.exercises.exercism.side.meetup

import java.time.temporal.TemporalAdjusters.{dayOfWeekInMonth, lastInMonth, nextOrSame}
import java.time.{DayOfWeek, LocalDate}

import Schedule.Schedule

case class Meetup(month: Int, year: Int) {

  private val startOfMonth = LocalDate.of(year, month, 1)

  def day(dayOfWeek: DayOfWeek, schedule: Schedule): LocalDate =
    schedule match {
      case Schedule.Teenth => startOfMonth
        .withDayOfMonth(13)
        .`with`(nextOrSame(dayOfWeek))
      case Schedule.Last => startOfMonth
        .`with`(lastInMonth(dayOfWeek))
      case _ => startOfMonth
        .`with`(dayOfWeekInMonth(schedule.id, dayOfWeek))
    }

}

object Meetup {

  val Mon = DayOfWeek.MONDAY
  val Tue = DayOfWeek.TUESDAY
  val Wed = DayOfWeek.WEDNESDAY
  val Thu = DayOfWeek.THURSDAY
  val Fri = DayOfWeek.FRIDAY
  val Sat = DayOfWeek.SATURDAY
  val Sun = DayOfWeek.SUNDAY

}
