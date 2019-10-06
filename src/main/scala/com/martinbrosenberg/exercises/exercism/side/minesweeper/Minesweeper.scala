package com.martinbrosenberg.exercises.exercism.side.minesweeper


object Minesweeper {

  def annotate(rows: Seq[String]): Seq[String] = Board(rows).annotated.toRows

}
