package Week2.monday.Family

class Dog (val dogName: DogName, val age: Age) {
  val waggyTail: Boolean = true
  val noOfLegs: Int = 4
}

class DogName (val dogName: String)

class Age (val dogAge: Int)

object Dog {
  def apply(dogName: DogName, age: Age): Dog = new Dog(dogName, age)

}