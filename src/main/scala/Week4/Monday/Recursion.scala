package Week4.Monday

import scala.annotation.tailrec

object Recursion extends App {

  /**
   * Standard Recursion
   * Recursive calls which calls the original method, within the method
   * Each new call, adds to the call stack
   * Method will remember all of these calls before completing
   * Will continue to recursively call, until the base case is reached
   * Only once the base case is reached, it will resolve in reverse order.
   */

  //Factorial method will multiply all positive Int's in a list (input = 4 --> 4 x 3 x 2 x 1)

  def factorial(n: Int): Int = {
    if (n <= 1 ) {
      println("Hitting if")
      1 // base case - when you get to 1, return 1, and then the stored call stack can start unwinding
    } else {
      println(s"Incoming n is $n")
      println(s"New n = ${n -1}")
      val finalResult = n * factorial(n-1)
      println(s"final n call: $n")
      println(s"$n * ${n-1} = $finalResult")
      finalResult
    }
  }
  println(factorial(4))
  // Pseudocode unwinding stack - factorial(4)
  // factorial(4) --> 4 * factorial(4-1) --> factorial(3)
  //factorial(3) --> 3 * factorial(3-1) --> factorial(2)
  // factorial(2) --> 2 * factorial(2-1) -- factorial(1)
  //factorial(1) --> Hitting the case case --> return 1
  // UNWIND - Top to bottom
  // factorial(2) --> 2 * factorial(2-1) --2 * factorial(1) --> 2 * 1 = 2
  // factorial(3) --> 3 * factorial(3-2) --3 * factorial(2) --> 3 * 2 = 6
  // factorial(4) --> 4 * factorial(4-3) --4 * factorial(3) --> 4 * 6 = 24

  /**
   * Stack overflow error - there is only so much memory in the call stack.
   * If this is exceeded, we get a stack overflow error
   * println(factorial(10000)
   */

  /**
   * Tail recursion - Only holds the last calculation in memory
   * We always try to aim for tail recursion
   * 1. Recursive call must be the last operation that the function calls,(@tailrec will check this)
   * 2. Prevents Stack overflow error:
   * 2a. It doesn't need to remember all the previous values, all needed information is passed through as an accumulator (acc).
   * 2b. Scala replaces recursive calls with a simple loop under the hood, called "Tail call optimization" (TCO).
   * Replaces and updates the accumulator with every recursive call.
   */

  // With a helper method (Stringent methods when you can't pass in extra parameters)

//   def smarterRecursion(n: Int): Int = {
//     def smarterRecursionHelper(x: Int, acc: Int): Int = {
//       //write our standard recursion method
//       if (x <= 1) acc
//       else {
//         smarterRecursionHelper(x -1, acc * x)
//       }
//     }
//    smarterRecursionHelper(n, 1) // 1 is the base case
//   }
//}

   def smarterRecursion(n: Int): Int = {
     @tailrec
     def smarterRecursionHelper(x: Int, acc: Int): Int = { // By using a helper method we don't have to change the top level method parameters
       //write our standard recursion method
       if (x <= 1) acc // acc = superstar storing the intermediate value
       else {
         println(s"current x = $x and current acc = $acc")
         smarterRecursionHelper(x -1, acc * x) // x-1 is how we work our way down to our base. acc * x is our running total
       }
     }
    smarterRecursionHelper(n, 1) // 1 is the base case
   }

  println("Tailrec with helper: " + smarterRecursion(4))

  // Tail recursion without helper method

  @tailrec
  def smarterRecursionWithoutHelper(n: Int, acc: Int = 1): Int = {
    if ( n <= 1) acc
    else smarterRecursionWithoutHelper(n-1, acc * n)
  }

  println(s"Tailrec without helper:" + smarterRecursionWithoutHelper(4))

  // Example with String

  def concatenateWords(aWord: String, n: Int, acc: String): String = {
    if ( n<= 0) {
      println(s"current aWord inside if: $aWord")
      println(s"current acc inside if: $acc")
      acc
    }
    else {
      println(s"current aWord inside else: $aWord")
      println(s"current acc inside else: $acc")
      concatenateWords(aWord, n-1, aWord + acc )
    }
  }
 println(concatenateWords("Hello World ", 3, "Start here" ))

  // Task 1

  @tailrec
  def countElements(list: List[String], acc: Int = 0): Int = {
    if (list.isEmpty) acc
    else  countElements(list.tail, acc + 1 )
  }
  println(countElements(List("a", "b", "c")))

  def numOfElementsRecursion(list: List[Any]): Int = {
    if (list == List()) 0
    else {
      println(s"numOfElementRecursion, Inside else:  $list")
      1 + numOfElementsRecursion(list.tail)
    }
  }
  println(s"numofElementsRecursion " + numOfElementsRecursion(List("a", "b", "c")))
}

