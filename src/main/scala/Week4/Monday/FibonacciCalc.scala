package Week4.Monday

import scala.annotation.tailrec

object FibonacciCalc extends App {
  //class FibonacciCalc {

    def fibonacciRecursion(position: Int): Int = {
      @tailrec
      def fibonacciRecursionHelper(x: Int, a: Int, b: Int, fibList: List[Int]): Int = {
        if (x <= 1) a
        else {
          println(s"$x, $a, $b, $fibList")
          fibonacciRecursionHelper(x - 1, b, a + b, fibList :+ a)
        }
      }
      fibonacciRecursionHelper(position, 0, 1, Nil)
    }

    println(fibonacciRecursion(6))
  //}
}