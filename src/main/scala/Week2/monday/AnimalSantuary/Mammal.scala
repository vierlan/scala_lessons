package Week2.monday.AnimalSantuary

class Mammal(name: Name, age: Age, val furColour: String, val hasTail: Boolean) extends Animal(name, age) {

}

object Mammal {
  def apply(name: Name, age: Age, furColour: String, hasTail: Boolean): Mammal = new Mammal(name, age, furColour, hasTail)
}

class Warthog(name: Name, age: Age, furColour: String, hasTail: Boolean) extends Mammal(name, age, furColour, hasTail) with Species {
  val hasTusks = true
}

object Warthog extends Species {
  def apply(name: Name, age: Age, furColour: String, hasTail: Boolean): Warthog = new Warthog(name, age, furColour, hasTail)
}

class Dog(name: Name, age: Age, furColour: String, hasTail: Boolean) extends Mammal(name, age, furColour, hasTail) with Species {
  val tailLength: Int = 8
  val extractedName: String = name.name
  def wagTailMore: String = s"$extractedName is wagging their tail"
}

object Dog {
  def apply(name: Name, age: Age, furColour: String, hasTail: Boolean):Dog = new Dog(name, age, furColour, hasTail)
}