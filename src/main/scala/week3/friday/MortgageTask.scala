package week3.friday

import java.time.LocalDate

object MortgageTask extends App  {

  class NewError(val errorCode: Int, val errorMessage: String) extends Exception
  // custom error
  case object CreditScoreError extends NewError(400, "Credit Score too low")
//  case object UserNameError extends NewError(400, "Username is less than 12 characters")
//  case object PasswordError extends NewError(400, "Password is not a mixture of upper and lower")
//  case object DateOfBirthError extends NewError(400, "Not yet 18")

  case class Application (name: String, salary: Int, purchasePrice: Int, creditScore: Int, deposit: Int)
  case class assessedApplication (name: String, approved: Boolean, maxBorrowing: Int, minDeposit: Int)



  val samantha = Application("Samantha", 45000, 280000, 577, 20000)

  def creditScoreCheck(creditScore: Int): Either[NewError, Boolean] = {
    if (creditScore < 550) Left(CreditScoreError)
    else Right(true)
  }

  println("Credit check good - right" + creditScoreCheck(samantha.creditScore) )

  def maxBorrowing(salary: Int): Int = {
    salary * 4
  }

  def minimumDeposit(purchasePrice: Int): Double = {
    purchasePrice * .1
  }

}
