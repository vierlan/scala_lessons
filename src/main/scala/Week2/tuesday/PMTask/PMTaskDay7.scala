package Week2.tuesday.PMTask

object PMTaskDay7 extends App {

  /**
   * 1) Differences between Case Class and Class
   * Case Class cannot be extended
   * Case Class has val defined by default
   * Case class can be instantiated without new keyword, or having to make a class object def apply by default.
   *
   * 2a) case class Person(name: String, age: Int, nationality: String, isStudent: Boolean) will run
   * b) val firstPerson = new Person("Carlos", 23, "Spanish", true) will run? don't need the new keyword
   * c) val secondPerson = Person("Carlos", 23, "Spanish", true) will run
   * d) val thirdPerson = Person("Chloe", 25, "British", false)
   * e) class Animal(name: String, colour: String, pet: Boolean)
   * f) val cat = Animal("cat", "black", true) // Class will not instantiate as not case class and doesn't have class object def apply
   * g) val dog = new Animal("dog", "white", true)
   */

  case class Person(name: String, age: Int, nationality: String, isStudent: Boolean)

  val firstPerson = new Person("Carlos", 23, "Spanish", true)
  println(firstPerson)
  val secondPerson = Person("Carlos", 23, "Spanish", true)
  println(secondPerson)
  val thirdPerson = Person("Chloe", 25, "British", false)
  println(thirdPerson)

  class Animal(name: String, colour: String, pet: Boolean)

  //val cat = Animal("cat", "black", true)
  val dog = new Animal("dog", "white", true)
  println(dog)


  /**
   * b == e and e == b should return true, every other combination should return false
   */
  case class Muffin(flavour: String, price: Double, storeBoughtFrom: String)

  val chocolateMuffin = Muffin("chocolate", 3.50, "Mercator Bakery")
  val blueberryMuffin = Muffin("blueberry", 3.50, "Mercator Bakery")
  val vanillaMuffin = Muffin("vanilla", 3.50, "Mercator Bakery")
  val anotherChocolateMuffin = Muffin("chocolate", 3.50, "Mercator Bakery")
  // val oneMoreChocolateMuffin = Muffin(”Chocolate", 3.50, "Mercator Bakery") error returned with wrong quotes being used
  val finalChocolateMuffin = Muffin("choocolate", 2.50, "MercatorBakery")
  println(chocolateMuffin == blueberryMuffin)
  println(chocolateMuffin == vanillaMuffin)
  println(chocolateMuffin == anotherChocolateMuffin)
  println(chocolateMuffin == finalChocolateMuffin)
  println(blueberryMuffin == vanillaMuffin)
  println(blueberryMuffin == anotherChocolateMuffin)
  println(blueberryMuffin == finalChocolateMuffin)
  println(vanillaMuffin == anotherChocolateMuffin)
  println(vanillaMuffin == finalChocolateMuffin)
  println(anotherChocolateMuffin == finalChocolateMuffin)

}