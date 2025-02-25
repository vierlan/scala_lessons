package Week4.Tuesday

object HigherOrderFunctions extends App {
  /**
   * Definition - A functions that either takes in a function as a parameter, or they return a functions as a result.
   * Why do we use them? -
   * 1. We have modular reusable code (often easier to use)
   * 2. Reduce reusable code (makes code more concise)
   * What do they do?
   * 1. Manipulate collections (e.g map, filter, fold, reduce...)
   */

  /** HOF Functions as Parameters */

  def firstHOF(x: Int, function: Int => Int): Int = function(x)

  def addTwo(number: Int) = number + 2

  def square(number: Int) = number * number

  def double(number: Int) = number + number

  println(firstHOF(3, addTwo))
  println(firstHOF(3, square))
  println(firstHOF(3, double))

  // This method will process a list of string
  def processTheList(listOfString: List[String], function: String => String): List[String] = listOfString.map(function) //must map through the list is access the single element

  def toUpper(word: String): String = word.toUpperCase

  def addS(word: String): String = word + "s"

  def toLower(word: String): String = word.toLowerCase

  val wordList: List[String] = List("aPple", "orAnge", "Mango", "grapE")

  println(processTheList(wordList, toUpper))
  println(processTheList(wordList, addS))
  println(processTheList(wordList, toLower))

  // Fold left works from left to right
  // Fold right works from right to left
  // Combines/reduces a collection into a single Value
  // Process the collection from left to right
  // Stores the intermediate value in an accumulator - At the end, once the full collection is checked and reduced, it will return the "acc"

  val numList: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
  println(numList.foldLeft(0)((acc, nextInt) => acc + nextInt))
  // shorthand numList.foldLeft(_+_)

  // Start with 0 -> 0 + 1 = 1 (acc = 1)
  //(1,2) => 1 + 2 = 3 (acc = 3)
  // (3,3) => 3 + 3 = 6 (acc = 6)
  // (6,4) => 6 + 4 = 10 (acc = 10)
  // at thend end, returns acc

  /** Write a method the takes a list of words that returns a sentence */
  val stringList: List[String] = List("I", "got", "my", "first", "pay", "from", "Mercator")

  println(stringList.foldLeft("")((acc, word) => acc + " " + word).trim)

  println(numList.foldLeft(1)((acc, nextInt) => acc * nextInt))

  println(numList.foldLeft(1)((acc, nextInt) => acc * nextInt))

  def filterList(numberList: List[Int]): List[Int] = {
    numberList.filter(
      num => num % 2 == 0
    )
  }

  println(filterList(numList))

  println(wordList.foldLeft(0)((acc, character) => acc + character.length))

  println(stringList.foldLeft("")((acc, word) => acc + " " + word.capitalize).trim)

  /** Fold Right */
  //Same as above except you move Right to Left.// Element comes first, then acc.// foldRight(acc)(function: (element, acc) => element, acc)
  //commonly seen in pattern matching if/else statements where we want to choose the function on the given criteria

  // write a function where, given the length of employment, the percentage pay rise is different.
  // Return the final amount paid to employee

  case class Employee(name: String, lengthOfEmployment: Int, salary: Double)

  val amanda = Employee("Amanda", 2, 30000.00)
  val amandaLong = Employee("Amanda", 5, 30000.00)
  val amandaVeryLong = Employee("Amanda", 8, 30000.00)

  def bigPayRise: Double => Double = salary => salary * 2

  def mediumPayRise: Double => Double = salary => salary * 1.3

  def smallPayRise: Double => Double = salary => salary * 1.1

  def getPayRiseCalc(employee: Employee): Double => Double = {
    employee.lengthOfEmployment match {
      case year if year <= 3 => smallPayRise
      case year if year <= 5 => mediumPayRise
      case year if year > 5 => bigPayRise
    }
  }

  // This will return the new salary for a given employee
  def getFinalSalary(employee: Employee): Double = {
    val applyPayRise: Double => Double = getPayRiseCalc(employee) // Double => Double comes from getPayRiseCalc returned methods
    applyPayRise(employee.salary)
  }

  println(getFinalSalary(amanda))
  println(getFinalSalary(amandaLong))
  println(getFinalSalary(amandaVeryLong))

  case class Item(price: Double)

  val pictureFrame = Item(56.00) // - 50% = 28
  val keyRing = Item(10.00) // - 20% = 8.00
  val painting = Item(42.00) // -40% = 25.20

  def bigDiscount: Double => Double = discount => discount * .5

  def mediumDiscount: Double => Double = discount => discount * .4

  def smallDiscount: Double => Double = discount => discount * .2

  def getDiscountCalc(item: Item): Double => Double = {
    item.price match {
      case cost if cost <= 20.00 => smallDiscount
      case cost if cost <= 50.00 => mediumDiscount
      case cost if cost > 50.00 => bigDiscount
    }
  }
  def getFinalPrice(item: Item): Double = {
    val applyDiscount: Double => Double = getDiscountCalc(item) // Double => Double comes from getPayRiseCalc returned methods
    item.price - applyDiscount(item.price)
  }

  println(getFinalPrice(keyRing))
  println(getFinalPrice(painting))
  println(getFinalPrice(pictureFrame))
}

