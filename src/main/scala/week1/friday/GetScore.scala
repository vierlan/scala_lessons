import scala.io.StdIn.readInt

object GetScore {
  def main(args: Array[String]) = {
    print("Please enter score for Maths \n")
    val mathScore = readInt()
    print("Please enter score for English \n")
    val englishScore = readInt()
    print("Please enter score for Science \n")
    val scienceScore = readInt()
    val averageScore = (mathScore + englishScore + scienceScore)/3
    val grade = getGrade(mathScore, englishScore, scienceScore)
    println(s"your average score is $averageScore, you got a $grade grade")
  }

  def getGrade(mathsGrade: Int, englishGrade: Int, scienceGrade: Int): String = {
    val averageScore: Double = ((mathsGrade + englishGrade + scienceGrade) / 3)
    val grade: String = if (averageScore >= 90) {
      "A"
    } else if (averageScore >= 80) {
      "B"
    } else if (averageScore > 70) {
      "C"
    } else if (averageScore > 60) {
      "D"
    } else if (averageScore >= 0 && averageScore <= 59) {
      "E"
    } else {
      "Invalid Score"
    }
    grade
  }

}