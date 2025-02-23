package week3.friday.EithersMVP

import week3.friday.EithersMVP.Letter.{GenericPostageError, Letter, Name, Postcode}


object Either extends App{

  val letter:Either[GenericPostageError, Letter] = Letter.apply(Name.apply("Lananh"), Postcode.apply("SO54 7FT"))
  val invalidLetter:Either[GenericPostageError, Letter] = Letter.apply(Name.apply("Lananh"), Postcode.apply("SO54 7FT"))

}
