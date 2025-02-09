//  Seq, List, Map (Uppercase important!!)

val firstSeq: Seq[Int] = Seq(1,2,3,4,5)
val firstList: List[Int] = List(1,2,3,4,5)
val firstMap: Map[String, Int] = Map(
  "one" -> 1,
  "two" -> 2,
  "three" -> 3,
  "four" -> 4,
  "five" -> 5
)
// Map has key - value pairs
// Must declare the types of both key and value in the parameters

/** Accessing data */

  // Seq
val getSequenceData: Int = firstSeq(0)
val getSequenceHead: Int = firstSeq.head // get the first element
val getSequenceTail: Seq[Int] = firstSeq.tail // get the first element

val getSequence2Data: Int = firstSeq(2)
// val getTooMuchData: Int = firstSeq(12) java.lang.IndexOutOfBoundsException: 12


// List
val getList1Data: Int = firstList(1)
val getListTail: List[Int] = firstList.tail
val getListLast: Int = firstList.last

//Maps

val getMapData: Int = firstMap("two") //enter the key to get the value

/** Manipulating Data - using map */
val tripleList: List[Int] = firstList.map{
  number => number * 3
}
// bad practice to not name data types
val tripledSeq: Seq[Int] = firstSeq.map{
  _ * 3
}

val tripledMap: Map[String, Int] = firstMap.map {
  case (key, value) => (key, value * 3)
}

val changeKey: Map[String, Int] = firstMap.map {
  case (key, value) => (key.capitalize, value)
}

val changeKeyAndValue: Map[String, Int] = firstMap.map {
  case (key, value) => (key.capitalize, value * 3)
}

//filter
//filterNot (works similar to !=)
// Boolean being return

val filteredSeq: Seq[Int] = firstSeq.filter(
  number => number > 2
)

val filteredList: List[Int] = firstList.filter(
  number => number >=2
)

val filteredMap: Map[String, Int] = firstMap.filter (
  number => number._2 >= 2
)

val filteredList: List[Int] = firstList.filter(
  number => !(number >=3)
)

// filterNot
val  filNotList: List[Int] = firstList.filterNot(
  number => number >= 3
)

val filteredMap: Map[String, Int] = firstMap.filterNot (
  number => number._2 >= 2
)

/** Manipulating data - check if an element is present */
// .exists - get boolean result

//if a number exists that returns true, then will return true
val existsSeq: Boolean = firstSeq.exists(
  number => number >= 12
) //false, no numbers more than or equals to 12

val existsList: Boolean = firstList.exists(
  number => number >= 2
) //true

val existsMap: Boolean = firstMap.exists(
  number => number._2 >= 2
) //true

// .contains - give it a specific piece of data to look for

val containsSeq: Boolean = firstSeq.contains(2)

val containsMap: Boolean = firstMap.contains("two") // can only check for keys

val containsOrSeq: Boolean = firstSeq.contains(7) || firstSeq.contains(2)

// Task 1

val nameSeq: Seq[String] = Seq("James", "Ryan", "Charlie", "Hamy", "Bobby")

val colourMap: Map[Int, String] = Map(
  1 -> "red",
  2 -> "yellow",
  3 -> "blue",
  4 -> "green"
)

// filter map for the colour blue
val filterBlue: Map[Int, String] = colourMap.filter(
  colour => colour._2 == "blue"
)

val addOneToList: List[Int] = firstList.map{
  number => number + 1
}

val removeEvenList: List[Int] = firstList.filterNot(
  number => number % 2 == 0
)


val containsR: Seq[Boolean] = nameSeq.map {
  name => name.toLowerCase.contains("r")
}

val containsRExists: Boolean = nameSeq.exists(
  name => name.exists(c => c == 'r' || c == 'R')
)

//val flatMapName: Seq[Char]

/**
 * Prepending and Appending
 */

  // Bad practice. do not use var
var x = Seq[Int]()
x = x :+ 1
x = x :+ 2
x

//Make a new val
val y: Seq[Int] = Seq(3,4,5,6)
//Append
val appendToY = y:+7
//Prepend
val prependToY = 2 +: appendToY
// multiple append with ++ flattens list +: would nest list
val multipleAppend = Seq(0,1,2) ++ y

//Append Map (to order use ListMap rather than Map)
val appendMap = firstMap + ("six" -> 6, "seven" -> 7)

// Deleting
val removeHead = firstSeq.tail
val removeLast = firstSeq.init

// Removing from a map
val removeValueInMap = firstMap - "three"
val removeMultipleValuesInMap = firstMap - ("one", "two", "three")