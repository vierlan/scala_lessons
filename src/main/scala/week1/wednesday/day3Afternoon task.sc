//  Day 3 afternoon task If else statements

val noOfWatermelons: Int = 8
val hasABag: Boolean = true
val costOfWatermelon: Double = 1.397
// we could also assign the total for the watermelons to a value and rould it up to 2 digit double if we want
val convertedTotalCostOfWatermelon: Double =  Math.ceil((costOfWatermelon * noOfWatermelons) * 100.0) / 100.0

if ( noOfWatermelons > 8 ) {
  f"You cannot buy $noOfWatermelons%d watermelons!!  That's too many to carry!! \n The total cost for your purchase would have been ${costOfWatermelon * noOfWatermelons}%.2f"

}  else if (noOfWatermelons > 3 && hasABag) {
  f"You can buy $noOfWatermelons watermelons because you have a bag! Fantastic!!  \nThe total cost for your purchase is £${costOfWatermelon * noOfWatermelons}%.2f"

}  else if ( noOfWatermelons > 3 && !hasABag) {
  f"You can't buy $noOfWatermelons watermelons because you don't have a bag! Darn!! \nThe total cost for your purchase would have been £${costOfWatermelon * noOfWatermelons}%.2f"

}  else if ( noOfWatermelons <= 3 && noOfWatermelons >0 ) {
  s"You can buy $noOfWatermelons watermelons because you can carry them!\nThe total cost for your purchase is £${costOfWatermelon * noOfWatermelons}%.2f"
} else {
  s"That's not a valid number of watermelons"
}

/**
 * Extension
 * 1) Left to right
 * 2) false (wrong)
 * 3) false
 * 4) false (wrong again!!)
 */

true || false && false //true
(true || false) && false //false
(1<4 && 7 != 10 || 9 + 10 == 21) //true

// Research

val int1: Int = 734234
val int2: Int = 677

val stringValue: String = if (int1 > int2) {
  "yes"
} else {
  "No"
}
println(stringValue)





