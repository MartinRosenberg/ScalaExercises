package com.martinbrosenberg.exercises.exercism.side.minesweeper

import Board._
import Tile._

import scala.util.Try

case class Board private(board: Map[Position, Tile], dim: Dimensions) {

  private def countNeighboringMines(pos: Position): Int = {
    val neighbors = for {
      y    <- pos.y - 1 to pos.y + 1
      x    <- pos.x - 1 to pos.x + 1 if Position(y, x) != pos
      tile <- board.get(Position(y, x))
    } yield tile
    neighbors.count(_ == Mine)
  }

  lazy val annotated: Board = {
    val annotatedBoard = board.map { case (pos, tile) => tile match {
      case Mine     => pos -> tile
      case Clear(_) => pos -> Clear(countNeighboringMines(pos))
    }}
    Board(annotatedBoard, dim)
  }

  lazy val toRows: Seq[String] =
    Seq
      .tabulate(dim.height, dim.width)((y, x) => board(Position(y, x)))
      .map(_.mkString)

}

object Board {

  case class Dimensions(height: Int, width: Int)

  case class Position(y: Int, x: Int)

  def apply(rows: Seq[String]): Board = {
    val dim = Dimensions(rows.length, Try(rows.head.length).getOrElse(0))
    val tiles = for {
      (row, y)  <- rows.zipWithIndex
      (tile, x) <- row.zipWithIndex
    } yield Position(y, x) -> Tile(tile)
    Board(tiles.toMap, dim)
  }

}
