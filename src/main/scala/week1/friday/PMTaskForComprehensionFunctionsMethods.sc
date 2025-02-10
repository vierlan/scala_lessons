// 1)

def getSquare(number:Int): Int = number * number

getSquare(4)

// 2)
def isOdd(number:Int): Boolean = !(number % 2 == 0)

isOdd(7)
isOdd(222)

// 3)
val numList: List[Int] = List(1,2,3,4,5,6,7,8)

def sumOfOddNumbers(numberList: List[Int]): Int = numberList.map(getSquare).filter(isOdd).sum

sumOfOddNumbers(numList)

def sumTwo(numberList: List[Int]): Int = {
  val oddSquare: List[Int] = for (number <- numberList if isOdd(number)) yield getSquare(number)
  oddSquare.sum
}
sumTwo(numList)

// 4)

def getGrade(mathsGrade: Int, englishGrade: Int, scienceGrade: Int): String = {
  val averageScore: Double = ((mathsGrade + englishGrade + scienceGrade) / 3)
  val grade: String = if (averageScore >= 90) {
    "A"
  } else if (averageScore >= 80) {
    "B"
  } else if (averageScore > 70) {
    "C"
  } else if (averageScore >60) {
    "D"
  } else if (averageScore >= 0 && averageScore <= 59 ) {
    "E"
  } else {
    "Invalid Score"
  }
  s"You got a $grade!"
}

getGrade(57, 98, 78)

// Extension tasks in helloInteractive.scala and GetScore.scala files

// Research -- Pure functions are functions that take an input and give an output without
// making changes to, or reading from, any other data from outside of that function.
// Therefore, given the same input, it will always output the same output.
