/**
 * String Interpolation
 * S
 */

val name: String = "Lan Anh"
println(s"My name is $name.")

println(s"3 * 3 = ${3 * 3}")

val a: Int = 19764
val b: Int = 6
println(s"a x b = ${a * b}")

//Help when debugging.  Print the result at certain points in a method

// F interpolation
// Common format specifiers (type safety)
// %f - Float, Double
// %d - Int, Long
// %s String

val height: Double = 1.9
println(f"$name%s is $height%.2f metres tall.")
println(f"$name%s is $height%f metres tall.")
println(s"$name%s is $height%f metres tall.")

math.Pi  // Built in java library
println(f"Pi to 2 decimal places is ${math.Pi}%.2f")
println(f"Pi to 2 decimal places is ${math.Pi}%.5f")
println(f"Pi to 2 decimal places is ${math.Pi}%f")
println(f"Pi to 2 decimal places is ${math.Pi}%20.8f") //Add padding
println(f"Pi to 2 decimal places is ${math.Pi}%20.12f") //Add padding
println(f"Pi to 2 decimal places is ${math.Pi}%16.12f" + "    9") //Add padding

//printf String
printf("'%s'", "Hello")
printf("'%20s'", "Hello") //Padding after
printf("'%-20s'", "Hello") //Padding before
printf("'%-20s%-20s'", "Hello", "") //Padding before and after
printf("'%-25s%-20s'", "Hello", "") //Padding before and after (accounts for the hello too)

//raw
println(s"$name is going to jump on a \nnew line") //this will use the newline
println(raw"I'm going to jump on a \nnew line")

val name2: String = "James"
val age1: Int = 46
val age2: Int = 17

println(s"$name is older than $name2")
println(s"$name is ${age1 - age2} years older than $name2")
println(s"$name is ${age1 - age2} years older than $name2")

val age1d: Double = 46
val age2d: Double = 17

println(f"$name%s is ${age1d - age2d}%.1f years older than $name2%s")

println(raw"\n\n\n\n\nsameline\n\n\n\n")


