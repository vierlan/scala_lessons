package week3.friday.EithersMVP

import week3.friday.EithersMVP.EithersMVP.{GenericPostageError, InvalidNameError, Letter, Name, Postcode, badPostcode, goodName, goodPostcode, invalidName, nameWithInt}


object EitherLogic extends App{

  val letter: Either[Nothing, Letter] = Right(Letter.apply(Name.apply("Lananh"), Postcode.apply("SO54 7FT")))
  val invalidLetter: Either[GenericPostageError, Nothing] = Left(InvalidNameError.apply("The Letter is Invalid"))

  println(letter)
  println(invalidLetter)
  println("valid postcode" + Postcode.postcodeOrError("768 778"))
  println("invalid postcode" + Postcode.postcodeOrError("768778"))
  println("invalid postcode with whitespace" + Postcode.postcodeOrError("  768778  "))
  println("valid postcode with whitespace" + Postcode.postcodeOrError("  768  778  "))
  println("Valid Name: " + Name.nameOrError(("Lan anh")))
  println("Invalid Name: " + Name.nameOrError(("Lan 99anh")))
  println("Invalid Name: " + Name.nameOrError(("4535")))

  println("Good Letter: " + Letter.letterOrError(goodName, goodPostcode))
  println("Letter, bad name: " + Letter.letterOrError(nameWithInt, goodPostcode))
  println("Letter, bad name: " + Letter.letterOrError(invalidName, goodPostcode))
  println("Letter, bad postcode: " + Letter.letterOrError(goodName, badPostcode))
  println("Letter, bad name and postcode: " + Letter.letterOrError(nameWithInt, badPostcode))

}
