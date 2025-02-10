package Week2.monday.AnimalSantuary

class Bird(name: Name, age: Age, val beakLength: Int, val featherColour: String) extends Animal(name, age) with Flyable {

}

object Bird {
  def apply(name: Name, age: Age, beakLength: Int, featherColour: String): Bird = new Bird(name, age, beakLength, featherColour)
}

class Owl(name: Name, age: Age, beakLength: Int, featherColour: String, val hootsPerNight: Int) extends Bird(name, age, beakLength, featherColour) {

}

object Owl {
  def apply(name: Name, age: Age, beakLength: Int, featherColour: String, hootsPerNight: Int): Owl = new Owl(name, age, beakLength, featherColour, hootsPerNight)
}