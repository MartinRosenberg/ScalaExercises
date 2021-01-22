package com.martinbrosenberg.exercises.rosettacode

/** Sleep Sort
  *
  * In general, sleep sort works by starting a separate task for each item to be
  * sorted, where each task sleeps for an interval corresponding to the item's
  * sort key, then emits the item. Items are then collected sequentially in
  * time.
  *
  * Task: Write a program that implements sleep sort. Have it accept non-
  * negative integers on the command line and print the integers in sorted
  * order. If this is not idiomatic in your language or environment, input and
  * output may be done differently. Enhancements for optimization,
  * generalization, practicality, robustness, and so on are not required.
  *
  * Sleep sort was [[http://dis.4chan.org/read/prog/1295544154 presented]]
  * anonymously on 4chan and has been
  * [[http://news.ycombinator.com/item?id=2657277 discussed]] on Hacker News.
  *
  * @see [[http://rosettacode.org/wiki/Sorting_algorithms/Sleep_sort]]
  */
object SleepSort {

  /** Just `n` is unpredictable with small numbers */
  final val WaitCoefficient = 32

  /** Sorts a list of non-negative integers by waiting to print each one based
    * on the size of the number.
    */
  @throws[IllegalArgumentException]("if any element of nums is negative")
  def sort(nums: Seq[Int], dispFn: Any => Unit = Console.println): Unit =
    nums.foreach(n => new Thread {
      override def run(): Unit = {
        Thread.sleep(n * WaitCoefficient)
        dispFn(n)
      }
    }.start())

  def main(args: String*): Unit = {
    val nums = args.map(_.toInt)
    sort(nums)
    // Keep the JVM alive while we wait
    Thread.sleep(if (nums.isEmpty) 0 else (nums.max + 1) * WaitCoefficient)
    println()
  }

}