/** Day 4 Afternoon Tasks.  Collections */

val numberList: List[Int] = List(1,2,3,4,5)
val colourSeq: Seq[String] = Seq("Red", "Green", "Blue")

val timesByThree: List[Int] = numberList.map{
  number => number * 3
}

val removeBlue: Seq[String] = colourSeq.init
val containsOrange: Boolean =  colourSeq.contains("orange")
val booleanMap: List[Boolean] = numberList.map{
  number => !(number % 2 == 0)
}

val davidsPets: Map[String, String] = Map (
  "woofy" -> "dog",
  "squeeky" -> "dog",
  "koi" -> "fish",
  "snowy" -> "cat"
)

val dogNames: List[String] = davidsPets.filter(
  animals => animals._2 == "dog"
).keys.toList

/** Extension */

val appendedList: Seq[Int] = numberList ++ Seq(6,7,8,9)
val includedList: Seq[Int] = Seq(1,2,5,7)
val filteredNumberList: Seq[Int] = appendedList.filter(
  number => includedList.contains(number)
)

val getThirdElement: Int = appendedList.tail.tail.head

/**
 * Research Task
 * Diffence between a Set and a Sequence
 * Set
 * Unordered (no index, order can change)
 * Cannot have duplicates
 * Sequence
 * Ordered (can use methods which access by index)
 * Can have duplicates i.e (1,2,3,1,2,3,4,5)
 *
 */

Set(1,2) == Set(2,1,1,1) // returns true because set removes duplicate values and does not care about the order
// so in the second set, 2 of the 1's are removed so the set becomes Set(2,1) and because SSet does not care about the order,
// is the same as Set(1,2)

List(3,4) == Seq(3,4)  // returns true as List is a subtype of Sequence and they both have the same contents

List(5,6) == Set(5,6) // should return false because List is a subtype of Sequence and Set is a totally different
//data type with different traits.

