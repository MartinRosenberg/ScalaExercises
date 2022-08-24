package com.martinbrosenberg.exercises.exercism.side.anagram

object Anagram {

	def findAnagrams(word: String, candidates: Seq[String]): Seq[String] = {
		val w = word.toLowerCase
		candidates.filter { candidate =>
			val c = candidate.toLowerCase
			c != w && c.sorted == w.sorted
		}
	}

}
