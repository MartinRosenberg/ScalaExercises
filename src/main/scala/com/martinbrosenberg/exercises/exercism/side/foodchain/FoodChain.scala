package com.martinbrosenberg.exercises.exercism.side.foodchain

object FoodChain {

  private val segments = Seq(
    Seq(
      "I know an old lady who swallowed a fly.",
      "I don't know why she swallowed the fly. Perhaps she'll die."
    ),
    Seq(
      "I know an old lady who swallowed a spider.",
      "It wriggled and jiggled and tickled inside her.",
      "She swallowed the spider to catch the fly."
    ),
    Seq(
      "I know an old lady who swallowed a bird.",
      "How absurd to swallow a bird!",
      "She swallowed the bird to catch the spider that wriggled and jiggled and tickled inside her."
    ),
    Seq(
      "I know an old lady who swallowed a cat.",
      "Imagine that, to swallow a cat!",
      "She swallowed the cat to catch the bird."
    ),
    Seq(
      "I know an old lady who swallowed a dog.",
      "What a hog, to swallow a dog!",
      "She swallowed the dog to catch the cat."
    ),
    Seq(
      "I know an old lady who swallowed a goat.",
      "Just opened her throat and swallowed a goat!",
      "She swallowed the goat to catch the dog."
    ),
    Seq(
      "I know an old lady who swallowed a cow.",
      "I don't know how she swallowed a cow!",
      "She swallowed the cow to catch the goat."
    ),
    Seq(
      "I know an old lady who swallowed a horse.",
      "She's dead, of course!"
    )
  )

  def verse(n: Int): String = (n match {
    case 7 => segments(7)
    case _ => segments(n) ++ ((n - 1) to 0 by -1).map(segments(_).last)
  }).mkString("\n")

  def recite(start: Int, end: Int): String =
    (start to end).map(n => verse(n - 1)).mkString("\n\n") + "\n\n"

}
