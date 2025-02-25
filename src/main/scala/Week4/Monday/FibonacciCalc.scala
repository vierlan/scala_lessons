package Week4.Monday

import scala.annotation.tailrec

object FibonacciCalc extends App {
  class FibonacciCalc {

    def fibonacciRecursion(position: Int): Int = {
      @tailrec
      def fibonacciRecursionHelper(baseCountdown: Int, leftNum: Int, rightNum: Int, fibList: List[Int]): Int = {
        if (baseCountdown <= 1) leftNum
        else {
          println(s"$baseCountdown, $leftNum, $rightNum, $fibList")
          fibonacciRecursionHelper( baseCountdown - 1, rightNum, leftNum + rightNum, fibList :+ leftNum)
        }
      }
      fibonacciRecursionHelper(position, 0, 1, Nil)
    }

    println(fibonacciRecursion(6))
  // eloise's calc with pattern matching
  def betterFibonacci(n: Int, acc: Int = 1): Option[Int] = {
    if (n < 0) None  else if (n == 0) Some(0)
    else if (n <= 2) Some(acc)
    else betterFibonacci(n-1, acc + betterFibonacci(n-2).get)}

  }
}