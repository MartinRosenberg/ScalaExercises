package com.martinbrosenberg.exercises.exercism.side

import com.martinbrosenberg.exercises.BaseSpec
import java.time.LocalDate
import com.martinbrosenberg.exercises.exercism.side.meetup.{Meetup, Schedule}

/** @version 1.1.0 */
class Meetup_Spec extends BaseSpec {

  "monteenth of May 2013" in {
    Meetup(5, 2013).day(Meetup.Mon, Schedule.Teenth) should be(
      LocalDate.of(2013, 5, 13))
  }

  "monteenth of August 2013" in {
    Meetup(8, 2013).day(Meetup.Mon, Schedule.Teenth) should be(
      LocalDate.of(2013, 8, 19))
  }

  "monteenth of September 2013" in {
    Meetup(9, 2013).day(Meetup.Mon, Schedule.Teenth) should be(
      LocalDate.of(2013, 9, 16))
  }

  "tuesteenth of March 2013" in {
    Meetup(3, 2013).day(Meetup.Tue, Schedule.Teenth) should be(
      LocalDate.of(2013, 3, 19))
  }

  "tuesteenth of April 2013" in {
    Meetup(4, 2013).day(Meetup.Tue, Schedule.Teenth) should be(
      LocalDate.of(2013, 4, 16))
  }

  "tuesteenth of August 2013" in {
    Meetup(8, 2013).day(Meetup.Tue, Schedule.Teenth) should be(
      LocalDate.of(2013, 8, 13))
  }

  "wednesteenth of January 2013" in {
    Meetup(1, 2013).day(Meetup.Wed, Schedule.Teenth) should be(
      LocalDate.of(2013, 1, 16))
  }

  "wednesteenth of February 2013" in {
    Meetup(2, 2013).day(Meetup.Wed, Schedule.Teenth) should be(
      LocalDate.of(2013, 2, 13))
  }

  "wednesteenth of June 2013" in {
    Meetup(6, 2013).day(Meetup.Wed, Schedule.Teenth) should be(
      LocalDate.of(2013, 6, 19))
  }

  "thursteenth of May 2013" in {
    Meetup(5, 2013).day(Meetup.Thu, Schedule.Teenth) should be(
      LocalDate.of(2013, 5, 16))
  }

  "thursteenth of June 2013" in {
    Meetup(6, 2013).day(Meetup.Thu, Schedule.Teenth) should be(
      LocalDate.of(2013, 6, 13))
  }

  "thursteenth of September 2013" in {
    Meetup(9, 2013).day(Meetup.Thu, Schedule.Teenth) should be(
      LocalDate.of(2013, 9, 19))
  }

  "friteenth of April 2013" in {
    Meetup(4, 2013).day(Meetup.Fri, Schedule.Teenth) should be(
      LocalDate.of(2013, 4, 19))
  }

  "friteenth of August 2013" in {
    Meetup(8, 2013).day(Meetup.Fri, Schedule.Teenth) should be(
      LocalDate.of(2013, 8, 16))
  }

  "friteenth of September 2013" in {
    Meetup(9, 2013).day(Meetup.Fri, Schedule.Teenth) should be(
      LocalDate.of(2013, 9, 13))
  }

  "saturteenth of February 2013" in {
    Meetup(2, 2013).day(Meetup.Sat, Schedule.Teenth) should be(
      LocalDate.of(2013, 2, 16))
  }

  "saturteenth of April 2013" in {
    Meetup(4, 2013).day(Meetup.Sat, Schedule.Teenth) should be(
      LocalDate.of(2013, 4, 13))
  }

  "saturteenth of October 2013" in {
    Meetup(10, 2013).day(Meetup.Sat, Schedule.Teenth) should be(
      LocalDate.of(2013, 10, 19))
  }

  "sunteenth of May 2013" in {
    Meetup(5, 2013).day(Meetup.Sun, Schedule.Teenth) should be(
      LocalDate.of(2013, 5, 19))
  }

  "sunteenth of June 2013" in {
    Meetup(6, 2013).day(Meetup.Sun, Schedule.Teenth) should be(
      LocalDate.of(2013, 6, 16))
  }

  "sunteenth of October 2013" in {
    Meetup(10, 2013).day(Meetup.Sun, Schedule.Teenth) should be(
      LocalDate.of(2013, 10, 13))
  }

  "first Monday of March 2013" in {
    Meetup(3, 2013).day(Meetup.Mon, Schedule.First) should be(
      LocalDate.of(2013, 3, 4))
  }

  "first Monday of April 2013" in {
    Meetup(4, 2013).day(Meetup.Mon, Schedule.First) should be(
      LocalDate.of(2013, 4, 1))
  }

  "first Tuesday of May 2013" in {
    Meetup(5, 2013).day(Meetup.Tue, Schedule.First) should be(
      LocalDate.of(2013, 5, 7))
  }

  "first Tuesday of June 2013" in {
    Meetup(6, 2013).day(Meetup.Tue, Schedule.First) should be(
      LocalDate.of(2013, 6, 4))
  }

  "first Wednesday of July 2013" in {
    Meetup(7, 2013).day(Meetup.Wed, Schedule.First) should be(
      LocalDate.of(2013, 7, 3))
  }

  "first Wednesday of August 2013" in {
    Meetup(8, 2013).day(Meetup.Wed, Schedule.First) should be(
      LocalDate.of(2013, 8, 7))
  }

  "first Thursday of September 2013" in {
    Meetup(9, 2013).day(Meetup.Thu, Schedule.First) should be(
      LocalDate.of(2013, 9, 5))
  }

  "first Thursday of October 2013" in {
    Meetup(10, 2013).day(Meetup.Thu, Schedule.First) should be(
      LocalDate.of(2013, 10, 3))
  }

  "first Friday of November 2013" in {
    Meetup(11, 2013).day(Meetup.Fri, Schedule.First) should be(
      LocalDate.of(2013, 11, 1))
  }

  "first Friday of December 2013" in {
    Meetup(12, 2013).day(Meetup.Fri, Schedule.First) should be(
      LocalDate.of(2013, 12, 6))
  }

  "first Saturday of January 2013" in {
    Meetup(1, 2013).day(Meetup.Sat, Schedule.First) should be(
      LocalDate.of(2013, 1, 5))
  }

  "first Saturday of February 2013" in {
    Meetup(2, 2013).day(Meetup.Sat, Schedule.First) should be(
      LocalDate.of(2013, 2, 2))
  }

  "first Sunday of March 2013" in {
    Meetup(3, 2013).day(Meetup.Sun, Schedule.First) should be(
      LocalDate.of(2013, 3, 3))
  }

  "first Sunday of April 2013" in {
    Meetup(4, 2013).day(Meetup.Sun, Schedule.First) should be(
      LocalDate.of(2013, 4, 7))
  }

  "second Monday of March 2013" in {
    Meetup(3, 2013).day(Meetup.Mon, Schedule.Second) should be(
      LocalDate.of(2013, 3, 11))
  }

  "second Monday of April 2013" in {
    Meetup(4, 2013).day(Meetup.Mon, Schedule.Second) should be(
      LocalDate.of(2013, 4, 8))
  }

  "second Tuesday of May 2013" in {
    Meetup(5, 2013).day(Meetup.Tue, Schedule.Second) should be(
      LocalDate.of(2013, 5, 14))
  }

  "second Tuesday of June 2013" in {
    Meetup(6, 2013).day(Meetup.Tue, Schedule.Second) should be(
      LocalDate.of(2013, 6, 11))
  }

  "second Wednesday of July 2013" in {
    Meetup(7, 2013).day(Meetup.Wed, Schedule.Second) should be(
      LocalDate.of(2013, 7, 10))
  }

  "second Wednesday of August 2013" in {
    Meetup(8, 2013).day(Meetup.Wed, Schedule.Second) should be(
      LocalDate.of(2013, 8, 14))
  }

  "second Thursday of September 2013" in {
    Meetup(9, 2013).day(Meetup.Thu, Schedule.Second) should be(
      LocalDate.of(2013, 9, 12))
  }

  "second Thursday of October 2013" in {
    Meetup(10, 2013).day(Meetup.Thu, Schedule.Second) should be(
      LocalDate.of(2013, 10, 10))
  }

  "second Friday of November 2013" in {
    Meetup(11, 2013).day(Meetup.Fri, Schedule.Second) should be(
      LocalDate.of(2013, 11, 8))
  }

  "second Friday of December 2013" in {
    Meetup(12, 2013).day(Meetup.Fri, Schedule.Second) should be(
      LocalDate.of(2013, 12, 13))
  }

  "second Saturday of January 2013" in {
    Meetup(1, 2013).day(Meetup.Sat, Schedule.Second) should be(
      LocalDate.of(2013, 1, 12))
  }

  "second Saturday of February 2013" in {
    Meetup(2, 2013).day(Meetup.Sat, Schedule.Second) should be(
      LocalDate.of(2013, 2, 9))
  }

  "second Sunday of March 2013" in {
    Meetup(3, 2013).day(Meetup.Sun, Schedule.Second) should be(
      LocalDate.of(2013, 3, 10))
  }

  "second Sunday of April 2013" in {
    Meetup(4, 2013).day(Meetup.Sun, Schedule.Second) should be(
      LocalDate.of(2013, 4, 14))
  }

  "third Monday of March 2013" in {
    Meetup(3, 2013).day(Meetup.Mon, Schedule.Third) should be(
      LocalDate.of(2013, 3, 18))
  }

  "third Monday of April 2013" in {
    Meetup(4, 2013).day(Meetup.Mon, Schedule.Third) should be(
      LocalDate.of(2013, 4, 15))
  }

  "third Tuesday of May 2013" in {
    Meetup(5, 2013).day(Meetup.Tue, Schedule.Third) should be(
      LocalDate.of(2013, 5, 21))
  }

  "third Tuesday of June 2013" in {
    Meetup(6, 2013).day(Meetup.Tue, Schedule.Third) should be(
      LocalDate.of(2013, 6, 18))
  }

  "third Wednesday of July 2013" in {
    Meetup(7, 2013).day(Meetup.Wed, Schedule.Third) should be(
      LocalDate.of(2013, 7, 17))
  }

  "third Wednesday of August 2013" in {
    Meetup(8, 2013).day(Meetup.Wed, Schedule.Third) should be(
      LocalDate.of(2013, 8, 21))
  }

  "third Thursday of September 2013" in {
    Meetup(9, 2013).day(Meetup.Thu, Schedule.Third) should be(
      LocalDate.of(2013, 9, 19))
  }

  "third Thursday of October 2013" in {
    Meetup(10, 2013).day(Meetup.Thu, Schedule.Third) should be(
      LocalDate.of(2013, 10, 17))
  }

  "third Friday of November 2013" in {
    Meetup(11, 2013).day(Meetup.Fri, Schedule.Third) should be(
      LocalDate.of(2013, 11, 15))
  }

  "third Friday of December 2013" in {
    Meetup(12, 2013).day(Meetup.Fri, Schedule.Third) should be(
      LocalDate.of(2013, 12, 20))
  }

  "third Saturday of January 2013" in {
    Meetup(1, 2013).day(Meetup.Sat, Schedule.Third) should be(
      LocalDate.of(2013, 1, 19))
  }

  "third Saturday of February 2013" in {
    Meetup(2, 2013).day(Meetup.Sat, Schedule.Third) should be(
      LocalDate.of(2013, 2, 16))
  }

  "third Sunday of March 2013" in {
    Meetup(3, 2013).day(Meetup.Sun, Schedule.Third) should be(
      LocalDate.of(2013, 3, 17))
  }

  "third Sunday of April 2013" in {
    Meetup(4, 2013).day(Meetup.Sun, Schedule.Third) should be(
      LocalDate.of(2013, 4, 21))
  }

  "fourth Monday of March 2013" in {
    Meetup(3, 2013).day(Meetup.Mon, Schedule.Fourth) should be(
      LocalDate.of(2013, 3, 25))
  }

  "fourth Monday of April 2013" in {
    Meetup(4, 2013).day(Meetup.Mon, Schedule.Fourth) should be(
      LocalDate.of(2013, 4, 22))
  }

  "fourth Tuesday of May 2013" in {
    Meetup(5, 2013).day(Meetup.Tue, Schedule.Fourth) should be(
      LocalDate.of(2013, 5, 28))
  }

  "fourth Tuesday of June 2013" in {
    Meetup(6, 2013).day(Meetup.Tue, Schedule.Fourth) should be(
      LocalDate.of(2013, 6, 25))
  }

  "fourth Wednesday of July 2013" in {
    Meetup(7, 2013).day(Meetup.Wed, Schedule.Fourth) should be(
      LocalDate.of(2013, 7, 24))
  }

  "fourth Wednesday of August 2013" in {
    Meetup(8, 2013).day(Meetup.Wed, Schedule.Fourth) should be(
      LocalDate.of(2013, 8, 28))
  }

  "fourth Thursday of September 2013" in {
    Meetup(9, 2013).day(Meetup.Thu, Schedule.Fourth) should be(
      LocalDate.of(2013, 9, 26))
  }

  "fourth Thursday of October 2013" in {
    Meetup(10, 2013).day(Meetup.Thu, Schedule.Fourth) should be(
      LocalDate.of(2013, 10, 24))
  }

  "fourth Friday of November 2013" in {
    Meetup(11, 2013).day(Meetup.Fri, Schedule.Fourth) should be(
      LocalDate.of(2013, 11, 22))
  }

  "fourth Friday of December 2013" in {
    Meetup(12, 2013).day(Meetup.Fri, Schedule.Fourth) should be(
      LocalDate.of(2013, 12, 27))
  }

  "fourth Saturday of January 2013" in {
    Meetup(1, 2013).day(Meetup.Sat, Schedule.Fourth) should be(
      LocalDate.of(2013, 1, 26))
  }

  "fourth Saturday of February 2013" in {
    Meetup(2, 2013).day(Meetup.Sat, Schedule.Fourth) should be(
      LocalDate.of(2013, 2, 23))
  }

  "fourth Sunday of March 2013" in {
    Meetup(3, 2013).day(Meetup.Sun, Schedule.Fourth) should be(
      LocalDate.of(2013, 3, 24))
  }

  "fourth Sunday of April 2013" in {
    Meetup(4, 2013).day(Meetup.Sun, Schedule.Fourth) should be(
      LocalDate.of(2013, 4, 28))
  }

  "last Monday of March 2013" in {
    Meetup(3, 2013).day(Meetup.Mon, Schedule.Last) should be(
      LocalDate.of(2013, 3, 25))
  }

  "last Monday of April 2013" in {
    Meetup(4, 2013).day(Meetup.Mon, Schedule.Last) should be(
      LocalDate.of(2013, 4, 29))
  }

  "last Tuesday of May 2013" in {
    Meetup(5, 2013).day(Meetup.Tue, Schedule.Last) should be(
      LocalDate.of(2013, 5, 28))
  }

  "last Tuesday of June 2013" in {
    Meetup(6, 2013).day(Meetup.Tue, Schedule.Last) should be(
      LocalDate.of(2013, 6, 25))
  }

  "last Wednesday of July 2013" in {
    Meetup(7, 2013).day(Meetup.Wed, Schedule.Last) should be(
      LocalDate.of(2013, 7, 31))
  }

  "last Wednesday of August 2013" in {
    Meetup(8, 2013).day(Meetup.Wed, Schedule.Last) should be(
      LocalDate.of(2013, 8, 28))
  }

  "last Thursday of September 2013" in {
    Meetup(9, 2013).day(Meetup.Thu, Schedule.Last) should be(
      LocalDate.of(2013, 9, 26))
  }

  "last Thursday of October 2013" in {
    Meetup(10, 2013).day(Meetup.Thu, Schedule.Last) should be(
      LocalDate.of(2013, 10, 31))
  }

  "last Friday of November 2013" in {
    Meetup(11, 2013).day(Meetup.Fri, Schedule.Last) should be(
      LocalDate.of(2013, 11, 29))
  }

  "last Friday of December 2013" in {
    Meetup(12, 2013).day(Meetup.Fri, Schedule.Last) should be(
      LocalDate.of(2013, 12, 27))
  }

  "last Saturday of January 2013" in {
    Meetup(1, 2013).day(Meetup.Sat, Schedule.Last) should be(
      LocalDate.of(2013, 1, 26))
  }

  "last Saturday of February 2013" in {
    Meetup(2, 2013).day(Meetup.Sat, Schedule.Last) should be(
      LocalDate.of(2013, 2, 23))
  }

  "last Sunday of March 2013" in {
    Meetup(3, 2013).day(Meetup.Sun, Schedule.Last) should be(
      LocalDate.of(2013, 3, 31))
  }

  "last Sunday of April 2013" in {
    Meetup(4, 2013).day(Meetup.Sun, Schedule.Last) should be(
      LocalDate.of(2013, 4, 28))
  }

  "last Wednesday of February 2012" in {
    Meetup(2, 2012).day(Meetup.Wed, Schedule.Last) should be(
      LocalDate.of(2012, 2, 29))
  }

  "last Wednesday of December 2014" in {
    Meetup(12, 2014).day(Meetup.Wed, Schedule.Last) should be(
      LocalDate.of(2014, 12, 31))
  }

  "last Sunday of February 2015" in {
    Meetup(2, 2015).day(Meetup.Sun, Schedule.Last) should be(
      LocalDate.of(2015, 2, 22))
  }

  "first Friday of December 2012" in {
    Meetup(12, 2012).day(Meetup.Fri, Schedule.First) should be(
      LocalDate.of(2012, 12, 7))
  }

}
