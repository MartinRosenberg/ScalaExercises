package com.martinbrosenberg.exercises.exercism.side

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.exercism.side.anagram.Anagram

/** @version 1.4.0 */
class Anagram_Spec extends BaseSpec {

  "no matches" in {
    Anagram.findAnagrams("diaper", List("hello", "world", "zombies", "pants")) should be(
      List())
  }

  "detects two anagrams" in {
    Anagram.findAnagrams("master", List("stream", "pigeon", "maters")) should be(
      List("stream", "maters"))
  }

  "does not detect anagram subsets" in {
    Anagram.findAnagrams("good", List("dog", "goody")) should be(List())
  }

  "detects anagram" in {
    Anagram.findAnagrams(
      "listen",
      List("enlists", "google", "inlets", "banana")) should be(List("inlets"))
  }

  "detects three anagrams" in {
    Anagram.findAnagrams("allergy",
      List("gallery",
        "ballerina",
        "regally",
        "clergy",
        "largely",
        "leading")) should be(
      List("gallery", "regally", "largely"))
  }

  "does not detect non-anagrams with identical checksum" in {
    Anagram.findAnagrams("mass", List("last")) should be(List())
  }

  "detects anagrams case-insensitively" in {
    Anagram.findAnagrams(
      "Orchestra",
      List("cashregister", "Carthorse", "radishes")) should be(
      List("Carthorse"))
  }

  "detects anagrams using case-insensitive subject" in {
    Anagram.findAnagrams(
      "Orchestra",
      List("cashregister", "carthorse", "radishes")) should be(
      List("carthorse"))
  }

  "detects anagrams using case-insensitive possible matches" in {
    Anagram.findAnagrams(
      "orchestra",
      List("cashregister", "Carthorse", "radishes")) should be(
      List("Carthorse"))
  }

  "does not detect a anagram if the original word is repeated" in {
    Anagram.findAnagrams("go", List("go Go GO")) should be(List())
  }

  "anagrams must use all letters exactly once" in {
    Anagram.findAnagrams("tapper", List("patter")) should be(List())
  }

  "words are not anagrams of themselves (case-insensitive)" in {
    Anagram.findAnagrams("BANANA", List("BANANA", "Banana", "banana")) should be(
      List())
  }

}
