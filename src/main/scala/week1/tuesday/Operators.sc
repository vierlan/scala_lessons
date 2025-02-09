/**
 * Arithmatic operators
 */

val a: Int = 10
val b: Int = 5
val c: Int = 3

//Add
a + b

//Subtract
a - b
b - c

//Divide
a/b
b/c

//Multiply
a * b
b * c
c * a

//Modulus
a % c // (10 % 3 has a reminder of 1)
a % b

//  Relational operators
//equality
a == a
a == b

//inequality
a != a
a != b

// Less than
b < a
a < b
a < c

// Less than or equals to

b <= a
a <= a

// Greater Than >=
a > b
b > c

// Greater than or equals to
a >= b
a >= a
c >= a
"dog" >= "dog"

// Logical

// AND &&
true && true //true
true && false // false
false && true // false
false && false // false
(3<6) && (6>7) //false

// OR ||
true || false // true
true || true // true
false || false //false
(3<6) || (6>7) //true

// NOT !
!false //true
!true //false

// Task 1
true && true //true
true && false //false
false && true // false
false && false // false

true || true //true
true || false // true
false || true // true
false || false // false

!true //false
!false //true

// Task 2

((4 + 3) * 55) < 300
(96 / 12) >= 8
"hamster" < "hippo"
"hamster".length < "hippo".length
(8 % 2) == 0
(156 / 8) < 20 && 54 < 20 && (54 / 4) < 14
