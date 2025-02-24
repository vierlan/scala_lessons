package Week4.Monday

import scala.annotation.tailrec

object RecursionMVP extends App {

  object Euro2024 extends Enumeration {
    type Euro2024 = Value
    val Germany, Switzerland, Spain, Italy, England, Denmark, Slovenia, Austria, France, Netherlands, Romania, Belgium, Slovakia, Portugal, Turkey, Georgia = Value
  }

  def printTeamNames(teams: List[Euro2024.Value], acc: String ): String = {
    if ( teams.isEmpty ) acc
    else {
      val head = teams.head
      val tail = teams.tail
      val addSeperators = if (acc.isEmpty) "" else ", "
      println(s"\nCurrent tail: $tail \nCurrent acc: $acc \nCurrent head: $head ")
      printTeamNames(tail, acc + addSeperators + head.toString)
    }
  }

   val teamList = Euro2024.values.toList
  println(printTeamNames(teamList, ""))

  sealed class Teams(name: String)

  object Teams {
    case object Germany
    case object Switzerland
    case object Spain
    case object Italy
    case object England
    case object Denmark
    case object Slovenia
    case object Austria
    case object France
    case object Netherlands
    case object Romania
    case object Belgium
    case object Slovakia
    case object Portugal
    case object Turkey
    case object Georgia
  }

  val germany = List(Teams)
  println(germany)
  def printCaseObjects(team: List[Teams], acc: String) = {


  }

  // 3)

  def addRecusion(n: Int): Int = {
    if (n == 0) 0
    else {
      val result = n + addRecusion(n - 1)
      result
    }
  }
  println(addRecusion(5))

  // 4)

  class generalError(errorCode: Int, errorMessage: String) extends Exception
  case object IsOddError extends generalError(400, "Number is Odd")

  val myNumList = List(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)

  @tailrec
  def isEven(numList: List[Int], indexPosition: Int): Either[generalError, Boolean] = {
    if ( indexPosition == 0 ) {
      val head = numList.head
        if (head % 2 != 0) Left(IsOddError) else Right(true)
    }
    else {
      val numTail = numList.tail
       isEven(numTail, indexPosition - 1 )
    }
  }
  println(s"Should return isOddError: " + isEven(myNumList, 4))
  println(s"Should return true: " + isEven(myNumList, 5))

  // Ext


}
