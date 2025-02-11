package Week2.tuesday

object CaseClasses extends App {
  //standard class
//  class Superhero(realName: String, heroName: String, weakness: String)
//  new Superhero("Clark Kent", "Superman", "Kryptonite") // instantiated a new object from the Superhero class

  // Case Class
  case class Superhero(realName: String, heroName: String, weakness: String) //each parameter is a val by default
  // .apply method is built in.  Don't need to mak a companion object unless I need to access private methods in the class
  val superman1 = Superhero.apply("Clark Kent", "Superman", "Kryptonite")
  val superman2 = Superhero.apply("Clark Kent", "Superman", "Kryptonite")
  println(superman1 == superman2)
  // .copy method
  val copiedSuperman = superman1.copy(weakness = "gravity")
  println(copiedSuperman.weakness)
  println(superman1.weakness)
  val updatedName = superman1.copy(realName = "Andy Probert", weakness = "Good ale")
  println(updatedName.realName + updatedName.weakness)

  // TASK
  println("\n Task \n")

  case class Dog(name: String, breed: String, age: Int)

  val dog1 = Dog("Goofy", "Lab", 20)
  val dog2 = Dog("Rey", "Pomsky", 2)
  val dog3 = Dog("Charles", "Spaniel", 5)
  val dog4 = Dog("Brutus", "Bulldog", 8)
  val dog5 = Dog("Scooby Doo", "Great Dane", 15)

  case class Kennel(name: String, dogList: List[Dog], catList: List[Cat], birdList: List[Bird]) {
    def addDog (dog: Dog) : Kennel = {
      Kennel(name, dogList:+ dog, catList, birdList)
    }
  }

  val puppyClub = new Kennel(name = "Puppy Club",dogList = List(dog1, dog2, dog3, dog4), catList = List(), birdList = List())
  println(puppyClub.dogList)

  val animalClub = puppyClub.copy(name = "Animal Club")
  println(animalClub.name)
  println(animalClub.dogList)

  case class Cat(name: String, furColour: String, age: Int)
  case class Bird(name: String, speaks: Boolean, weight: Double)

  val cat1 = Cat(name = "Fluffy", furColour = "Golden", age = 3)
  val bird1 = Bird(name = "Kookoo", speaks = true, weight = 1.2)

  //val kennelAddDog = animalClub.copy()

}
