package week3.friday

import java.time.LocalDate

/**
 * Eithers with For Comprehensions
 * Fail fast - As soon a condition fails and hits a left, we will exit the For Comprehension.
 *
 * username must be 12 characters long
 * Password must be mixture of upper and lower case
 * DOB - must be over 18
 */

object EithersWithForComprehensions extends App {

  case class User (username: String, password: String, dateOfBirth: LocalDate)

  case class ValidatedUser (username: String, password: String, dateOfBirth: LocalDate)


  class NewError(val errorCode: Int, val errorMessage: String) extends Exception
  // custom error
  case object IsOddError extends NewError(400, "Input is not odd")
  case object UserNameError extends NewError(400, "Username is less than 12 characters")
  case object PasswordError extends NewError(400, "Password is not a mixture of upper and lower")
  case object DateOfBirthError extends NewError(400, "Not yet 18")


  def validateUsername(username: String): Either[NewError, String] ={
    if (username.length < 12) Left(UserNameError)
    else Right(username)
  }

  val usernameBad = User("user", "Password", LocalDate.of(1978,2,10))
  val validUsername = User("validUsername", "Password", LocalDate.of(2007,2,21))
  val tooYoung = User("validUsername", "Password", LocalDate.of(2007,2,22))
  val passwordBad = User("validUsername", "password", LocalDate.of(1992,6,14))
  val passwordGood = User("validUsername", "Password", LocalDate.of(1992,6,14))

  println("\nValidate username (bad-left): " + validateUsername(usernameBad.username))
  println("\nValidate username (good-right): " + validateUsername(validUsername.username))
  println(validateUsername(validUsername.username))

  def validatePassword(password: String): Either[NewError, String] = {
    if (password.toUpperCase == password || password.toLowerCase == password ) Left(PasswordError)
    else Right(password)
  }

  println("\n Validate password (bad-left): " + validatePassword(passwordBad.password))
  println("\n Validate password (good-right): " + validatePassword(passwordGood.password))

  // D.O.B

  def validateAge(dateOfBirth: LocalDate): Either[NewError, LocalDate] = {
    if (dateOfBirth.plusYears(18)isAfter(LocalDate.now)) Left(DateOfBirthError)
    else Right(dateOfBirth)
  }

  println("\nValidate age(bad-left): " + validateAge(tooYoung.dateOfBirth))
  println("\nValidate age(good-right): " + validateAge(validUsername.dateOfBirth))

  //Put all the methods together and return the validated user if they are all happy

  def validateUser(user: User): Either[NewError, ValidatedUser] = {
    for {
      username <- validateUsername(user.username) // calling method, store in the val called username, if unhappy -exit
      password <- validatePassword(user.password)
      dateOfBirth <- validateAge(user.dateOfBirth)
      validatedUser = ValidatedUser(username, password, dateOfBirth)
    } yield validatedUser
  }

  println("\n Validate User (good- Right): " + validateUser(validUsername))
  println("\n Validate User (bad-Left): " + validateUser(passwordBad))
  println("\n Validate User (bad-Left): " + validateUser(usernameBad))
  println("\n Validate User (bad-Left): " + validateUser(tooYoung))

}
