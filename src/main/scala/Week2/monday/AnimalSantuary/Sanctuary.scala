package Week2.monday.AnimalSantuary

object Sanctuary extends App{

  case class Santuary(name: String, animals: List[Animal])

  val catWithSealedTrait = Cat(name = new Name("Fluffy"), age = new Age(8), furColour = "ginger", hasTail = true, mealsPerDay = 2)
  println(DietSelector.selectDietType(catWithSealedTrait))

  val lionWithSealedTrait = Lion(name = new Name("Simba"), age = new Age(4), furColour = "golden", hasTail = true, mealsPerDay = 1)
  println(DietSelector.selectDietType(lionWithSealedTrait))

  val hamsterWithSealedTrait = Hamster(name = new Name("Hammer"), age = new Age(2), furColour = "blonde", hasTail = true, mealsPerDay = 4, proteinSource = "Seeds")
  println(DietSelector.selectDietType(hamsterWithSealedTrait))

  val santuary: Santuary = Santuary(name = "Animal Santuary", animals = List(catWithSealedTrait, lionWithSealedTrait, hamsterWithSealedTrait))
  println(santuary)

}


// Research task
// Abstract Class: Definition: An abstract class in Scala is a class that cannot be instantiated on its own. It can have both concrete (implemented) methods and abstract (unimplemented) methods. An abstract class can also have fields (variables).
// Use case: Abstract classes are typically used when you need to share code (methods, fields) across subclasses, but you also want to define some methods that must be implemented by subclasses.
// Sealed Trait:
// Definition: A sealed trait is a trait that can be extended only within the same file in which it is defined. This means all subclasses of a sealed trait must be known at compile-time, which enables the compiler to perform exhaustive checks when using pattern matching. Sealed traits are often used in situations where you want to define a closed set of related types, like enums or algebraic data types (ADTs).
// Use case: Sealed traits are often used in functional programming to define a closed hierarchy of types where all possible subtypes are known and can be handled exhaustively, such as in pattern matching.