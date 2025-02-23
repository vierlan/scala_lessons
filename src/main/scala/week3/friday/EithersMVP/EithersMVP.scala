package week3.friday.EithersMVP

import scala.util.matching.Regex

object Letter {

  class NewError(val errorCode: Int, val errorMessage: String) extends Exception
  // custom error
//  case object IsOddError extends NewError(400, "Input is not odd")
//  case object UserNameError extends NewError(400, "Username is less than 12 characters")
//  case object PasswordError extends NewError(400, "Password is not a mixture of upper and lower")
//  case object DateOfBirthError extends NewError(400, "Not yet 18")

  case class Name (value: String)
  object Name {
    def nameOrError(maybeName: String): Either[InvalidNameError, Name]= {
      if(maybeName.contains(0 to 9)) Left(InvalidNameError.apply("Name should not contain number"))
      else Right(Name(maybeName))
    }
  }




  case class Postcode (value: String)
  object Postcode {
    def postcodeOrError(maybePostcode: String): Either[InvalidPostcodeError, Postcode] = {
      if (maybePostcode.trim.contains(" ")) Right(Postcode(maybePostcode)) else Left(InvalidPostcodeError.apply("The Postcode is Invalid"))
    }
  }

  println("valid postcode" + Postcode.postcodeOrError("768 778"))
  println("invalid postcode" + Postcode.postcodeOrError("768778"))
  println("invalid postcode with whitespace" + Postcode.postcodeOrError("  768778  "))
  println("valid postcode with whitespace" + Postcode.postcodeOrError("  768  778  "))
  case class Letter (name: Name, postcode: Postcode)

  trait GenericPostageError {
    def Message: String
  }

  case class InvalidNameError (message: String) extends GenericPostageError {
    override def Message: String = "The Name is Invalid"
  }

  case class InvalidPostcodeError (message: String) extends GenericPostageError {
    override def Message: String = "The Postcode is Invalid"
  }




}
