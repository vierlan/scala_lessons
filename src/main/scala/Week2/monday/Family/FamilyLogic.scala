package Week2.monday.Family

object FamilyLogic extends App {

  // Everytime we make a new instance of a class using the keyword new, we are making an object
  new Child("Ryan") // 1 use only
  val child1 = new Child("Ryan") // Can reuse this by callin it with the val child1
  val child2 = new Child("Ryan") // Can reuse this by callin it with the val child1
  val bob2 = Child.apply("Bob")

  println("Is child 1 and Child 2 the same? " + (child1 == child2 )) // false, each is a different object in memory

  println(child1.forename)
  println(child1.under18)
  //println(child1.idPlease)  //cannot access when the method is private in the child Class
  println(bob2.forename)
  println(bob2.idPlease)

  // Adult
  val adult1: Adult = Adult.apply(new Forename("Lananh"), new Surname("Nguyen")) //using apply method
  val adult2: Adult = new Adult(new Forename("Lananh"), new Surname("Nguyen")) //using keyword new
  println(adult1.forename.name)
  println(adult1.forename)
  val dog1: Dog = Dog.apply(new DogName("Woofy"), new Age(4))
  val dog2: Dog = Dog.apply(new DogName("Rey"), new Age(2))
  println(dog1.dogName.dogName)
  println(dog1.noOfLegs)
}


