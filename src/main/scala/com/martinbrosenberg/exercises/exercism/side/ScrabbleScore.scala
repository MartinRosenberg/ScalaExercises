package com.martinbrosenberg.exercises.exercism.side

/** SCRABBLE SCORE
  *
  * Given a word, compute the scrabble score for that word.
  *
  * Letter Values
  *
  * Letter                           Value
  * A, E, I, O, U, L, N, R, S, T       1
  * D, G                               2
  * B, C, M, P                         3
  * F, H, V, W, Y                      4
  * K                                  5
  * J, X                               8
  * Q, Z                               10
  *
  * Examples
  *
  * "cabbage" should be scored as worth 14 points:
  *
  * - 3 points for C
  * - 1 point for A, twice
  * - 3 points for B, twice
  * - 2 points for G
  * - 1 point for E
  *
  * And to total:
  *
  * - 3 + 2*1 + 2*3 + 2 + 1
  * - = 3 + 2 + 6 + 3
  * - = 5 + 9
  * - = 14
  *
  * Extensions
  *
  * - You can play a double or a triple letter.
  * - You can play a double or a triple word.
  */
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
