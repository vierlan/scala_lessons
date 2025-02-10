package Week2.monday.AnimalSantuary

class Animal (val name: Name, val age: Age)

class Name(val name: String)

class Age(val age: Int)

object Animal {
  def apply(name: Name, age: Age): Animal = new Animal(name, age)
}
