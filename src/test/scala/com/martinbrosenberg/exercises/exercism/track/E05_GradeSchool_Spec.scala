package com.martinbrosenberg.exercises.exercism.track

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.exercism.track.e05_gradeschool.School

/** @version created manually */
class E05_GradeSchool_Spec extends BaseSpec {
  val school = new School

  "empty school" in {
    school.db should be (Map())
  }

  "add student" in {
    school.add("Aimee", 2)
    school.db should be (Map(2 -> Seq("Aimee")))
  }

  "add more students in same class" in {
    school.add("James", 2)
    school.add("Blair", 2)
    school.add("Paul", 2)
    school.db should be (Map(2 -> Seq("James", "Blair", "Paul")))
  }

  "add students to different grades" in {
    school.add("Chelsea", 3)
    school.add("Logan", 7)
    school.db should be (Map(3 -> Seq("Chelsea"), 7 -> Seq("Logan")))
  }

  "get students in a grade" in {
    school.add("Franklin", 5)
    school.add("Bradley", 5)
    school.add("Jeff", 1)
    school.grade(5) should be (Seq("Franklin", "Bradley"))
  }

  "get students in a non-existant grade" in {
    school.grade(1) should be (Seq())
  }

  "sort school" in {
    school.add("Jennifer", 4)
    school.add("Kareem", 6)
    school.add("Christopher", 4)
    school.add("Kyle", 3)
    val sorted = Map(
      3 -> Seq("Kyle"),
      4 -> Seq("Christopher", "Jennifer"),
      6 -> Seq("Kareem")
    )
    school.sorted should be (sorted)
    school.sorted.keys.toList should be (Seq(3, 4, 6))
  }
}
