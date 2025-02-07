// These work on monadic types -- Seq, List, Option, Either, Future
// Will not work on standard Int's or Sring's (Can wrap in option to work)

// <-- (backward arrow) is a simplified notation.
// A simple way of writing a function (flatmap, filter, map, foreach)
// yield -- calls the method

//classic
def retriveNumbers: Seq[Int] = for (number <- 1 to 10) yield number

retriveNumbers

//use operators
def squaredNumbers: Seq[Int] = for (number <- 1 to 5) yield number * number

squaredNumbers

// if guard
def useIfGuard: Seq[Int] = for (number <- 1 to 10 if number % 2 == 0) yield number
useIfGuard

val animals: List[String] = List("Hippo", "Bear", "Seal", "Pig")

def addS(animalList:List[String]): List[String] = animalList.map(animal => animal + "s")
addS(animals)

def lowerCaseAnimals(animalList:List[String]): List[String] = {
  animalList.map(animal => animal.toLowerCase)
}
lowerCaseAnimals(animals)

def lowercaseAndAddS(animalList:List[String]): List[String] = for {
  addAnS <- addS(animalList)
  lowerCase <- lowerCaseAnimals(List(addAnS))
} yield lowerCase
lowercaseAndAddS(animals)
lowercaseAndAddS(animals).mkString(" ") // change a list, to a string

val names: List[String] = List("aRIa", "BaRT", "ChUCk")
def capitalize(nameList:List[String]): List[String] = {
  nameList.map(name => name.capitalize)
}
capitalize(names)

def capitalizeAndLowercase(nameList:List[String]): List[String] = for {
  toLower <- lowerCaseAnimals(nameList)
  addCaps <- capitalize(List(toLower))
} yield addCaps

capitalizeAndLowercase(names)