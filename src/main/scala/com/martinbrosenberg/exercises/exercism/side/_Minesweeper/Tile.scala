package com.martinbrosenberg.exercises.exercism.side._Minesweeper

import Tile._

sealed trait Tile {
  override def toString: String = this match {
    case Mine     => "*"
    case Clear(0) => " "
    case Clear(n) => n.toString
  }
}

object Tile {
  case object Mine extends Tile
  case class Clear(neighbors: Int) extends Tile

  def apply(c: Char): Tile = if (c == '*') Mine else Clear(0)
}
