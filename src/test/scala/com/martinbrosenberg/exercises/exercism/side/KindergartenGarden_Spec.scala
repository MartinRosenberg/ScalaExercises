package com.martinbrosenberg.exercises.exercism.side

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.exercism.side.kindergartengarden.{Garden, Plant}

/** @version 1.1.1 */
class KindergartenGarden_Spec extends BaseSpec {

  "partial garden - garden with single student" in {
    Garden.defaultGarden("RC\nGG").plants("Alice") should be(
      List(Plant.Radishes, Plant.Clover, Plant.Grass, Plant.Grass))
  }

  "partial garden - different garden with single student" in {
    Garden.defaultGarden("VC\nRC").plants("Alice") should be(
      List(Plant.Violets, Plant.Clover, Plant.Radishes, Plant.Clover))
  }

  "partial garden - garden with two students" in {
    Garden.defaultGarden("VVCG\nVVRC").plants("Bob") should be(
      List(Plant.Clover, Plant.Grass, Plant.Radishes, Plant.Clover))
  }

  "multiple students for the same garden with three students, partial garden - second student's garden" in {
    Garden.defaultGarden("VVCCGG\nVVCCGG").plants("Bob") should be(
      List(Plant.Clover, Plant.Clover, Plant.Clover, Plant.Clover))
  }

  "multiple students for the same garden with three students, partial garden - third student's garden" in {
    Garden.defaultGarden("VVCCGG\nVVCCGG").plants("Charlie") should be(
      List(Plant.Grass, Plant.Grass, Plant.Grass, Plant.Grass))
  }

  "full garden - first student's garden" in {
    Garden
      .defaultGarden("VRCGVVRVCGGCCGVRGCVCGCGV\nVRCCCGCRRGVCGCRVVCVGCGCV")
      .plants("Alice") should be(
      List(Plant.Violets, Plant.Radishes, Plant.Violets, Plant.Radishes))
  }

  "full garden - second student's garden" in {
    Garden
      .defaultGarden("VRCGVVRVCGGCCGVRGCVCGCGV\nVRCCCGCRRGVCGCRVVCVGCGCV")
      .plants("Bob") should be(
      List(Plant.Clover, Plant.Grass, Plant.Clover, Plant.Clover))
  }

  "full garden - second to last student's garden" in {
    Garden
      .defaultGarden("VRCGVVRVCGGCCGVRGCVCGCGV\nVRCCCGCRRGVCGCRVVCVGCGCV")
      .plants("Kincaid") should be(
      List(Plant.Grass, Plant.Clover, Plant.Clover, Plant.Grass))
  }

  "full garden - last student's garden" in {
    Garden
      .defaultGarden("VRCGVVRVCGGCCGVRGCVCGCGV\nVRCCCGCRRGVCGCRVVCVGCGCV")
      .plants("Larry") should be(
      List(Plant.Grass, Plant.Violets, Plant.Clover, Plant.Violets))
  }

}