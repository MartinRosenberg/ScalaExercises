package com.martinbrosenberg.exercises.exercism.side

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.exercism.side.matchingbrackets.BracketPush

/** @version 1.3.0 */
class MatchingBrackets_Spec extends BaseSpec {

  "paired square brackets" in {
    BracketPush.isPaired("[]") should be(true)
  }

  "empty string" in {
    BracketPush.isPaired("") should be(true)
  }

  "unpaired brackets" in {
    BracketPush.isPaired("[[") should be(false)
  }

  "wrong ordered brackets" in {
    BracketPush.isPaired("}{") should be(false)
  }

  "wrong closing bracket" in {
    BracketPush.isPaired("{]") should be(false)
  }

  "paired with whitespace" in {
    BracketPush.isPaired("{ }") should be(true)
  }

  "partially paired brackets" in {
    BracketPush.isPaired("{[])") should be(false)
  }

  "simple nested brackets" in {
    BracketPush.isPaired("{[]}") should be(true)
  }

  "several paired brackets" in {
    BracketPush.isPaired("{}[]") should be(true)
  }

  "paired and nested brackets" in {
    BracketPush.isPaired("([{}({}[])])") should be(true)
  }

  "unopened closing brackets" in {
    BracketPush.isPaired("{[)][]}") should be(false)
  }

  "unpaired and nested brackets" in {
    BracketPush.isPaired("([{])") should be(false)
  }

  "paired and wrong nested brackets" in {
    BracketPush.isPaired("[({]})") should be(false)
  }

  "math expression" in {
    BracketPush.isPaired("(((185 + 223.85) * 15) - 543)/2") should be(true)
  }

  "complex latex expression" in {
    BracketPush.isPaired(
      """\left(\begin{array}{cc} \frac{1}{3} & x\ \mathrm{e}^{x} &... x^2 \end{array}\right)""") should be(
      true)
  }

}
