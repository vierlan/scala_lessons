/**
 * Int - whole numbers --> 4 bytes worth of memory (Normally used)
 * Long - whole numbers --> 8 bytes
 * Short - whole number --> 2 bytes
 * Double -  simple decimals (same in java)
 * String = "Text"
 */

val one: Int = 1
val inferredOne = 1 // Not safe - define type

var integer: Int = 4
val string: String = "hey ho"
val boolean: Boolean = false
var short: Short = 766

println(integer)
println(string)
println(boolean)
println(short)

integer = 5.5
short = 767876876676768678676786876876786

println(integer)
println(string)
println(boolean)
println(short)