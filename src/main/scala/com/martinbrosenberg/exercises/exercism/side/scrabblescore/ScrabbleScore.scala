package com.martinbrosenberg.exercises.exercism.side.scrabblescore

object ScrabbleScore {

  @throws[MatchError]("if not an English letter")
  private val letters: Char => Int = {
    case 'A' | 'E' | 'I' | 'O' | 'U' | 'L' | 'N' | 'R' | 'S' | 'T' => 1
    case 'D' | 'G' => 2
    case 'B' | 'C' | 'M' | 'P' => 3
    case 'F' | 'H' | 'V' | 'W' | 'Y' => 4
    case 'K' => 5
    case 'J' | 'X' => 8
    case 'Q' | 'Z' => 10
  }

  @throws[MatchError]("if any character in the word is not an English letter")
  def score(word: String): Int = word.toUpperCase.map(letters).sum

}
