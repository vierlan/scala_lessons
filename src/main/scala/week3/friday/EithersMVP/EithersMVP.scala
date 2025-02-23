package week3.friday.EithersMVP

import scala.util.matching.Regex

//class NewError(val errorCode: Int, val errorMessage: String) extends Exception
object EithersMVP {

  val nameWithInt: String = "jhb4hj5h3"
  val goodName: String = "Joe Bloggs"
  val badPostcode: String = "jhb4hj5h3"
  val goodPostcode: String = "jh32 7df"
  val invalidName: String = "Lan 99anh"


  case class Letter(name: Name, postcode: Postcode)

  object Letter {
    def letterOrError(maybeName: String, maybePostcode: String): Either[GenericPostageError, Letter] = {
      for {
        name <- Name.nameOrError(maybeName)
        postcode <- Postcode.postcodeOrError(maybePostcode)
        validatedLetter = Letter(name, postcode)
      } yield validatedLetter
    }
  }

  case class Name(value: String)

  object Name {
    def nameOrError(maybeName: String): Either[InvalidNameError, Name] = {
      if (maybeName.matches(".*\\d.*")) Left(InvalidNameError.apply("Name should not contain number"))
      else Right(Name(maybeName))
    }
  }

  case class Postcode(value: String)

  object Postcode {
    def postcodeOrError(maybePostcode: String): Either[InvalidPostcodeError, Postcode] = {
      if (!maybePostcode.trim.contains(" ")) Left(InvalidPostcodeError.apply("The Postcode is Invalid"))
      else Right(Postcode(maybePostcode))
    }
  }

  println("valid postcode" + Postcode.postcodeOrError("768 778"))
  println("invalid postcode" + Postcode.postcodeOrError("768778"))
  println("invalid postcode with whitespace" + Postcode.postcodeOrError("  768778  "))
  println("valid postcode with whitespace" + Postcode.postcodeOrError("  768  778  "))

  trait GenericPostageError {
    def Message: String
  }

  case class InvalidNameError(message: String) extends GenericPostageError {
    override def Message: String = "The Name is Invalid"
  }

  case class InvalidPostcodeError(message: String) extends GenericPostageError {
    override def Message: String = "The Postcode is Invalid"
  }

}