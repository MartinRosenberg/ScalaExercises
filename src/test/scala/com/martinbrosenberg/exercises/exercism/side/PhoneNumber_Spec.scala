package com.martinbrosenberg.exercises.exercism.side

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.exercism.side.phonenumber.PhoneNumber

/** @version 1.4.0 */
class PhoneNumber_Spec extends BaseSpec {

  "cleans the number" in {
    PhoneNumber.clean("(223) 456-7890") should be(Some("2234567890"))
  }

  "cleans numbers with dots" in {
    PhoneNumber.clean("223.456.7890") should be(Some("2234567890"))
  }

  "cleans numbers with multiple spaces" in {
    PhoneNumber.clean("223 456   7890   ") should be(Some("2234567890"))
  }

  "invalid when 9 digits" in {
    PhoneNumber.clean("123456789") should be(None)
  }

  "invalid when 11 digits does not start with a 1" in {
    PhoneNumber.clean("22234567890") should be(None)
  }

  "valid when 11 digits and starting with 1" in {
    PhoneNumber.clean("12234567890") should be(Some("2234567890"))
  }

  "valid when 11 digits and starting with 1 even with punctuation" in {
    PhoneNumber.clean("+1 (223) 456-7890") should be(Some("2234567890"))
  }

  "invalid when more than 11 digits" in {
    PhoneNumber.clean("321234567890") should be(None)
  }

  "invalid with letters" in {
    PhoneNumber.clean("123-abc-7890") should be(None)
  }

  "invalid with punctuations" in {
    PhoneNumber.clean("123-@:!-7890") should be(None)
  }

  "invalid if area code starts with 0" in {
    PhoneNumber.clean("(023) 456-7890") should be(None)
  }

  "invalid if area code starts with 1" in {
    PhoneNumber.clean("(123) 456-7890") should be(None)
  }

  "invalid if exchange code starts with 0" in {
    PhoneNumber.clean("(223) 056-7890") should be(None)
  }

  "invalid if exchange code starts with 1" in {
    PhoneNumber.clean("(223) 156-7890") should be(None)
  }

}
