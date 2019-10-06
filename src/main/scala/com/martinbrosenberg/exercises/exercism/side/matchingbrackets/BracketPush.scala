package com.martinbrosenberg.exercises.exercism.side.matchingbrackets

object BracketPush {

  def isPaired(s: String): Boolean = {
    val stripped = s.replaceAll("""[^\[\]\(\)\{\}]""", "")
    var stack = List.empty[Char]
    stripped.foreach {
      case b @ ('(' | '{' | '[') => stack = b +: stack
      case ')' | '}' | ']' if stack.isEmpty => return false
      case ')' if stack.head == '(' => stack = stack.tail
      case '}' if stack.head == '{' => stack = stack.tail
      case ']' if stack.head == '[' => stack = stack.tail
      case _ => return false
    }
    stack.isEmpty
  }

}
