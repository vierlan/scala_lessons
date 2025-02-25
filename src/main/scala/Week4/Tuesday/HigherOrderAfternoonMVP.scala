package Week4.Tuesday

import scala.collection.IterableOnce.iterableOnceExtensionMethods
import scala.math.Ordering.Implicits.infixOrderingOps

object HigherOrderAfternoonMVP extends App {

  def intDoubler(input: Int): Int = input + input

  def applyTwice(input: Int, f: Int => Int): Int = f(f(input))

  println(applyTwice(4, intDoubler))

  def addition(a: Double, b: Double): Double = a + b

  def multiplication(a: Double, b: Double): Double = a * b

  def division(a: Double, b: Double): Double = a / b

  def subtraction(a: Double, b: Double): Double = a - b

  def IntManipulator(a: Double, b: Double, function: (Double, Double) => Double): Double = {
    function(a,b)
  }

  println(s"addition : " + IntManipulator(2,6, addition))
  println(s"multiplication : " + IntManipulator(2,6, multiplication))
  println(s"division : " + IntManipulator(2,6, division))
  println(s"subtraction : " + IntManipulator(2,6, subtraction))

  def convertToUppercase(word: String): String = {
    word.toUpperCase
  }

  def convertToLowercase(word: String): String = {
    word.toLowerCase
  }

  def stringConvertor(makeStringUppercase: Boolean): String = {
    val testString = "cOnVeRtMe"
    makeStringUppercase match {
      case true => convertToUppercase(testString)
      case false => convertToLowercase(testString)

    }
  }

  println(stringConvertor(true))
  println(stringConvertor(false))

  def getCalculation(operation: String): (Double, Double) => Double = {
    operation match {
      case "addition" => addition
      case "multiplication" => multiplication
      case "division" => division
      case "subtraction" => subtraction
    }
  }

  def calculate(a: Double , b: Double, operation: String): Double = {
    val getOperation: (Double, Double) => Double = getCalculation(operation)
    getOperation(a,b)
  }

  println("addition: " + calculate(10, 5, "addition"))
  println("multiplication: " + calculate(10, 5, "multiplication"))
  println("division: " + calculate(10, 5, "division"))
  println("subtraction: " + calculate(10, 5, "subtraction"))

  def maxFunction(a: Double, b: Double): Double = {
    (a).max(b)
  }
  println(maxFunction(10, 20))

  def maxListNum(numList: List[Double]): Double = {
    numList.reduce { (a, b) => println(s"{$a max $b}"); a max b}
  }

  def addListNum(numList: List[Double]): Double = {
    numList.reduce { (a, b) => println(s"{$a + $b}"); a + b}
  }

  val doublesList: List[Double] = List(2.0, 6.0, 8.0, 1.0, 9.0)

  //println(maxListNum(doublesList, maxFunction))
  //println(doublesList.reduce((x,y) => x max y ))
  println(maxListNum(doublesList))
  println(addListNum(doublesList))

  def applyFunc(function: Int => Int, givenInt: Int): Int = function(givenInt)

  def triple(int: Int): Int = int * 3
  def square(int: Int): Int = int * int

  println(applyFunc(triple, 9))
  println(applyFunc(triple, 5))
  println(applyFunc(square, 9))
  println(applyFunc(square, 5))

// below not working
  def power(exponent: Int): Int => Int = {
    exponent match {
      case x => square2
    }
  }

  def square2(n: Int): Int = n * n

  println(power(5))
  println(power(15))

}
