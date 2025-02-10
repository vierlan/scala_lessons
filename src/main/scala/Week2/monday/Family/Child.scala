package Week2.monday.Family

class Child (val forename: String) { //() - class parameters, {} - body of the class, all logic goes in the body
  val under18: Boolean = true
  def idPlease: String = "Can I see your Id?"
}

// Companion object - purpose is to keep all singleton objects with
// - written under main class with apply

object Child {
  def apply(forename: String): Child = new Child(forename) // shorthand to make new instances of your class.

  //Access the companion class's private methods
  val bob = Child.apply("Bob")
  println(bob)
}