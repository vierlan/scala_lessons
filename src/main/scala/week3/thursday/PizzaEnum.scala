package week3.thursday

object PizzaEnum extends App {

//  object Toppings
//    sealed trait Meat
//    case object Pepperoni extends Meat
//
//
//  abstract class Flavor
//  case class Spicy (base: "String", topping: String , jalapeno: Boolean) extends Flavor
//  case class Sweet (base: String, topping: String) extends Flavor
//  case class Meaty (base: String, topping: String) extends Flavor
//
//

  // April's Solution

  val flavour: String = "spicy"
  flavour match {
    case "meaty" => println("Meat feast")
    case "spicy" => println("American Hot")
    case "sweet" => println("Hawaiian")
    case _ => println("enter a valid flavour")
  }

  // Task 2
  val pizzaSize: Int = 8
  pizzaSize match {
    case 7 => println("personal")
    case 9 => println("small")
    case 11 => println("medium")
    case 4 => println("large")
    case _ => println("Enter a valid pizza size")
  }

  case class Pizza(size: Int, crust: String)
  val pizzaOrder: Pizza = Pizza(11, "stuffed")
  val getPrice =
    pizzaOrder match {
      case Pizza(7, "classic") => 5.99
      case Pizza(9, "classic") => 10.99
      case Pizza(9, "italian") => 10.99
      case Pizza(11, "classic") => 12.99
      case Pizza(11, "italian") => 12.99
      case Pizza(11, "stuffed") => 15.98
      case Pizza(14, "classic") => 14.99
      case Pizza(14, "italian") => 14.99
      case Pizza(14, "stuffed") => 17.98
      case _ => "Enter a valid pizza"
    }
  println(getPrice)
}
