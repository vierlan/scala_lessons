package Week2.monday.AnimalSantuary

class Insect(name: Name, age: Age, val numOfLimbs: Int) extends Animal(name, age) {

}

object Insect {
  def apply(name: Name, age: Age, numOfLimbs: Int): Insect = new Insect(name, age, numOfLimbs)
}

class Dragonfly(name: Name, age: Age, numOfLimbs: Int) extends Insect(name, age, numOfLimbs) {
  val wingPairs: Int = 3
}

object Dragonfly {
  def apply(name: Name, age: Age, numOfLimbs: Int): Dragonfly = new Dragonfly(name, age, numOfLimbs)
}