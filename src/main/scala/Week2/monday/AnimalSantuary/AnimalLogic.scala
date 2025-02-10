package Week2.monday.AnimalSantuary

object AnimalLogic extends App {
  val newAnimal = Animal.apply(new Name("Ani Ani"), new Age(12))
  print(newAnimal.name.name)
  print("\n" + newAnimal.age.age)

  val firstBird = Bird.apply(new Name("Squarky"), new Age(5), beakLength = 4, featherColour = "Green")
  println(firstBird.name.name)
  println(firstBird.age.age)
  println(firstBird.featherColour)
  println(firstBird.beakLength)

  val firstInsect = Insect.apply(new Name("Buzzy"), new Age(1), numOfLimbs = 8)
  println(firstInsect.name.name)
  println(firstInsect.age.age)
  println(firstInsect.numOfLimbs)

  val firstMammal = Mammal.apply(new Name("Fuzzy"), new Age(7), furColour = "White", hasTail = true)
  println(firstMammal.name.name)
  println(firstMammal.age.age)
  println(firstMammal.furColour)
  println(firstMammal.hasTail)

  val firstWarthog = new Warthog(new Name("Beast"), new Age(9), furColour = "Brown", hasTail = false)
  println(firstWarthog.name.name)
  println(firstWarthog.age.age)
  println(firstWarthog.hasTail)
  println(firstWarthog.furColour)
  println(firstWarthog.hasTusks)

  val firstOwl = new Owl(new Name("Tooty fruity"), new Age(3), beakLength = 1, featherColour = "Gold", hootsPerNight = 27)
  println(firstOwl.name.name)
  println(firstOwl.age.age)
  println(firstOwl.beakLength)
  println(firstOwl.featherColour)
  println(firstOwl.hootsPerNight)

  val firstDragonfly = new Dragonfly(new Name("Spirit Wings"), new Age(2), numOfLimbs = 6)
  println(firstDragonfly.name.name)
  println(firstDragonfly.age.age)
  println(firstDragonfly.numOfLimbs)

  val secondWarthog = new Warthog(new Name("Piggy"), new Age(5), furColour = "Silver", hasTail = false) with CommonWarthog
  println(secondWarthog.name.name)
  println(secondWarthog.age.age)
  println(secondWarthog.hasTail)
  println(secondWarthog.furColour)
  println(secondWarthog.hasTusks)
  println(secondWarthog.averageLifespan)
  println(secondWarthog.speciesName)
  println(secondWarthog.averageLifespan)
  println(secondWarthog.conservationStatus)

  val birdWithFlyableTrait = new Bird(new Name("Beady Eye"), new Age(6), beakLength = 5, featherColour = "Grey") with EagleWings
  println(birdWithFlyableTrait.name.name)
  println(birdWithFlyableTrait.age.age)
  println(birdWithFlyableTrait.featherColour)
  println(birdWithFlyableTrait.beakLength)
  println(birdWithFlyableTrait.canFly)
  println(birdWithFlyableTrait.wingspan)

  val doggy = new Dog(new Name("Woofy"), new Age(7), furColour = "Light Brown", hasTail = true) with WaggyTail
  println(doggy.name.name)
  println(doggy.age.age)
  println(doggy.hasTail)
  println(doggy.furColour)
  println(doggy.speciesName)
  println(doggy.wagTail)
  println(doggy.tailLength)
  println(doggy.wagTailMore)


}
