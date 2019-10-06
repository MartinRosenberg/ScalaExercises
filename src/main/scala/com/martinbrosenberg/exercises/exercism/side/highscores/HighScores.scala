package com.martinbrosenberg.exercises.exercism.side.highscores

object HighScores {

  type Score = Int

  def latest(scores: Seq[Score]): Score = scores.last

  def personalBest(scores: Seq[Score]): Score = scores.max

  def personalTop(scores: Seq[Score]): Seq[Score] =
    scores.sortWith(_ > _).take(3)

  private def cmpLatestBest(scores: Seq[Score]): String =
    (latest(scores), personalBest(scores)) match {
      case (l, b) if l == b => ""
      case (l, b) => s"${b - l} short of "
    }

  def report(scores: Seq[Score]): String =
    s"Your latest score was ${latest(scores)}. That's ${cmpLatestBest(scores)}your personal best!"

}
