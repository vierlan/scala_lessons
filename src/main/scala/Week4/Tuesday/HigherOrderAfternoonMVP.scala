package Week4.Tuesday

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

}
