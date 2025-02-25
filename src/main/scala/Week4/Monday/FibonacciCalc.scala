package Week4.Monday

import scala.annotation.tailrec

object FibonacciCalc extends App {
  //class FibonacciCalc {

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
  //}
}