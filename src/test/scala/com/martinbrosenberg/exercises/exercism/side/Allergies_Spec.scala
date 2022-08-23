package com.martinbrosenberg.exercises.exercism.side

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.exercism.side.allergies.{Allergen, Allergies}

/** @version 1.2.0 */
class Allergies_Spec extends BaseSpec {

  "Allergen.Peanuts - no allergies means not allergic" in {
    Allergies.allergicTo(Allergen.Peanuts, 0) should be(false)
  }

  "Allergen.Cats - no allergies means not allergic" in {
    Allergies.allergicTo(Allergen.Cats, 0) should be(false)
  }

  "Allergen.Strawberries - no allergies means not allergic" in {
    Allergies.allergicTo(Allergen.Strawberries, 0) should be(false)
  }

  "Allergen.Eggs - is allergic to eggs" in {
    Allergies.allergicTo(Allergen.Eggs, 1) should be(true)
  }

  "Allergen.Eggs - allergic to eggs in addition to other stuff" in {
    Allergies.allergicTo(Allergen.Eggs, 5) should be(true)
  }

  "Allergen.Shellfish - allergic to eggs in addition to other stuff" in {
    Allergies.allergicTo(Allergen.Shellfish, 5) should be(true)
  }

  "Allergen.Strawberries - allergic to eggs in addition to other stuff" in {
    Allergies.allergicTo(Allergen.Strawberries, 5) should be(false)
  }

  "Allergen.Eggs - allergic to strawberries but not peanuts" in {
    Allergies.allergicTo(Allergen.Eggs, 9) should be(true)
  }

  "Allergen.Peanuts - allergic to strawberries but not peanuts" in {
    Allergies.allergicTo(Allergen.Peanuts, 9) should be(false)
  }

  "Allergen.Shellfish - allergic to strawberries but not peanuts" in {
    Allergies.allergicTo(Allergen.Shellfish, 9) should be(false)
  }

  "Allergen.Strawberries - allergic to strawberries but not peanuts" in {
    Allergies.allergicTo(Allergen.Strawberries, 9) should be(true)
  }

  "no allergies at all" in {
    Allergies.list(0) should be(List())
  }

  "allergic to just eggs" in {
    Allergies.list(1) should be(List(Allergen.Eggs))
  }

  "allergic to just peanuts" in {
    Allergies.list(2) should be(List(Allergen.Peanuts))
  }

  "allergic to just strawberries" in {
    Allergies.list(8) should be(List(Allergen.Strawberries))
  }

  "allergic to eggs and peanuts" in {
    Allergies.list(3) should be(List(Allergen.Eggs, Allergen.Peanuts))
  }

  "allergic to more than eggs but not peanuts" in {
    Allergies.list(5) should be(List(Allergen.Eggs, Allergen.Shellfish))
  }

  "allergic to lots of stuff" in {
    Allergies.list(248) should be(
      List(Allergen.Strawberries,
        Allergen.Tomatoes,
        Allergen.Chocolate,
        Allergen.Pollen,
        Allergen.Cats))
  }

  "allergic to everything" in {
    Allergies.list(255) should be(
      List(Allergen.Eggs,
        Allergen.Peanuts,
        Allergen.Shellfish,
        Allergen.Strawberries,
        Allergen.Tomatoes,
        Allergen.Chocolate,
        Allergen.Pollen,
        Allergen.Cats))
  }

  "ignore non allergen score parts" in {
    Allergies.list(509) should be(
      List(Allergen.Eggs,
        Allergen.Shellfish,
        Allergen.Strawberries,
        Allergen.Tomatoes,
        Allergen.Chocolate,
        Allergen.Pollen,
        Allergen.Cats))
  }
}