package com.martinbrosenberg.exercises.exercism.side

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.exercism.side.minesweeper.Minesweeper

/** @version 1.1.0 */
class Minesweeper_Spec extends BaseSpec {

  "no rows" in {
    Minesweeper.annotate(List()) should be(List())
  }

  "no columns" in {
    Minesweeper.annotate(List("")) should be(List(""))
  }

  "no mines" in {
    Minesweeper.annotate(List("   ",
      "   ",
      "   ")) should be(
      List("   ",
        "   ",
        "   "))
  }

  "minefield with only mines" in {
    Minesweeper.annotate(List("***",
      "***",
      "***")) should be(
      List("***",
        "***",
        "***"))
  }

  "mine surrounded by spaces" in {
    Minesweeper.annotate(List("   ",
      " * ",
      "   ")) should be(
      List("111",
        "1*1",
        "111"))
  }

  "space surrounded by mines" in {
    Minesweeper.annotate(List("***",
      "* *",
      "***")) should be(
      List("***",
        "*8*",
        "***"))
  }

  "horizontal line" in {
    Minesweeper.annotate(List(" * * ")) should be(List("1*2*1"))
  }

  "horizontal line, mines at edges" in {
    Minesweeper.annotate(List("*   *")) should be(List("*1 1*"))
  }

  "vertical line" in {
    Minesweeper.annotate(List(" ",
      "*",
      " ",
      "*",
      " ")) should be(
      List("1",
        "*",
        "2",
        "*",
        "1"))
  }

  "vertical line, mines at edges" in {
    Minesweeper.annotate(List("*",
      " ",
      " ",
      " ",
      "*")) should be(
      List("*",
        "1",
        " ",
        "1",
        "*"))
  }

  "cross" in {
    Minesweeper.annotate(List("  *  ",
      "  *  ",
      "*****",
      "  *  ",
      "  *  ")) should be(
      List(" 2*2 ",
        "25*52",
        "*****",
        "25*52",
        " 2*2 "))
  }

  "large minefield" in {
    Minesweeper.annotate(List(" *  * ",
      "  *   ",
      "    * ",
      "   * *",
      " *  * ",
      "      ")) should be(
      List("1*22*1",
        "12*322",
        " 123*2",
        "112*4*",
        "1*22*2",
        "111111"))
  }

}
