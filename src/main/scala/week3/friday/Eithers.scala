package week3.friday

object Eithers extends App {

  /**
   * Either takes 2 parameters. A left (normally error) and Right (Success)
   * Right biased, if it can get to the right, then it will.
   * Main use is error handling.
   */

  def isOdd(x: Int): Either[Boolean, String] = if (x % 2 != 0) Right(s"$x is odd") else Left(false)
  println(isOdd(4))
  println(isOdd(7))

  //error handling using extends exception --> custom error but make sure we declare val to make params reachable
  // Not bottom level
  class NewError(val errorCode: Int, val errorMessage: String) extends Exception
  // custom error
  case object IsOddError extends NewError(400, "Input is not odd")


  def isOddBetter(x: Int): Either[NewError, String] = if (x % 2 != 0) Right(s"$x is odd") else Left(IsOddError)
  println(isOddBetter(4))
  println(isOddBetter(7))

  // Error handling using Try/Catch

  def plusOne(x: Int): Either[String, Int] ={
    try {
      Right(x + 1)
    } catch {
      case e: Exception => Left(s"failed due to: $e")
    }

  }
  println(plusOne(2))
  println(plusOne(7))

  def plusOneFail(x: String): Either[String, Int] ={
    try {
      Right(x.toInt + 1)
    } catch {
      case e: Exception => Left(s"failed due to: $e")
    }

  }
  println(plusOneFail("2"))  // will work
  println(plusOneFail("seven")) // will fail and hit left 

}
