/**
 * Examples
 */

(number : Int) => +1 //Anonymous function - Cannot reuse anywhere
val addition = (number : Int) => +1 //Named function - only name when we want to reuse.  We cannot override.  Immutable
def addition1 (number:Int): Int = number +1 //Method (also a type of function) Named so can reuse.  Must be named.
def addition2 (number:Int): Int = number +10

addition1(5)

/**
 * Task 1
 * The last expression needs to be the value that is return (which should
 * also be the same type as value declared as return type
 * println returns a temporary (unit)
 * Task 2
 * would return the else as aValue
 */
val aValue = 6<3
def findReturnValue: Int = {
  if (aValue) 564 else 865
  42
}

findReturnValue //only 42 will be returned because it is the last expression in the method
// must be correct return type defined

def makeACoffee: String = {
  "Add coffee to boiling water"
  "Add sugar or/and milk if required"
  "Stir"
  "Enjoy!"
}
makeACoffee

def makeATea(sugar:Int): String = {
  s"Add boiling water to your cup with a teabag.  Add $sugar spoons of sugar, stir an enjoy!"
}
makeATea(4)

val vat: Double = 1.2
def priceIncVat(priceOfItem: Double): Double = {
  priceOfItem * vat
}
priceIncVat(3.99)

//Task 1
def getBigVal(input1:Int, input2:Int): String = {
  if (input1 > input2) {
    "first"
  } else if (input1 < input2) {
    "second"
  } else {
    "same"
  }
}
getBigVal(332434, 23432)
getBigVal(1,343242424)
getBigVal(1,1)

//Task 2
def nameLength(firstName:String, surname: String): Int = {
  if (firstName.length > surname.length) {
    firstName.length
  } else if (surname.length > firstName.length) {
    surname.length
  } else {
    0
  }
}

nameLength("Lananh", "Nguyen")
nameLength("Tom", "Hanks")
nameLength("Madonna", "Cicone")


//Referential transparency
// We say something has referential transparency when a functions return value is based solely on the inputs
// Example addition(1,2) is always 3
def addTwoInts(x:Int, y:Int): Int = x + y

3 + 3
3 + addTwoInts(1,2)
addTwoInts(1,2) + addTwoInts(1,2)
6


