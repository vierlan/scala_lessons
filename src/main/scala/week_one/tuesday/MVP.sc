// false
val a: Boolean = (3 + 4 * 57) < 100

// true
val b: Boolean = (144/12) >= 12

// true (alphabetiaclly c comes before d)
"cat" < "dog"

// false, R does not come before H
"Rabbit" < "Hamster"

// true seventten is odd
(17 % 2) != 0
// true 8.33333 < 30 && 14.83333 < 20
(75/9) < 30 && (89 / 6) < 20


val string: String = "I love Scala already"
println("I love Scala already")
// The difference between the 2 lines
// first line is defining a value and storing the string in that value
// The second line prints the string to the terminal without storing

/**
 * 1) false, caps matter in a string
 * 2) You could write methods to convert "one" to 1, but in general, no
 * 3) no, see above
 */

// 4)
1.toString
var one: Int = 1
one.toString

// 5
"hello".toUpperCase()
"hello".capitalize

// In Scala, new is a keyword, and it's used to create instances of classes (e.g., new SomeClass()). You cannot use new as a variable name because it conflicts with this reserved keyword.

// so val new: String = "New String" will not compile
// we can change the name of the value to something which is not a keyword to make it compile
val newString: String = "New String"
//should now compile
// new val def class var are keywords `new`

val `new`: String = "Another new String"

