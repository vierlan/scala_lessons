package week3.thursday

import java.sql.Date
import java.time.{LocalDate, Month}
import java.time.temporal.ChronoUnit
import scala.math.Ordered.orderingToOrdered

object EnumMVP extends App {


  def getCapital(country: String): String = {
    country.trim.toLowerCase.capitalize match {
      case "England" => "London"
      case "Wales" => "Cardiff"
      case "Scotland" => "Edinburgh"
      case "N.Ireland" => "Belfast"
      case "Ireland" => "Dublin"
      case _ => "Please enter a country in the British Isles"
    }
  }

  println(getCapital("  enGland "))
  println(getCapital("  SCOTLAND "))
  println(getCapital("  wales "))
  println(getCapital("France"))


  //2)

  sealed trait Animal
    case object Pig extends Animal
    case object Cow extends Animal
    case object Sheep extends Animal
    case object Dog extends Animal
    case object Cat extends Animal

  def animalFacts(animal: Animal): String = {
    animal match {
      case Pig => "Bacon!!"
      case Cow => "Steak!!"
      case Sheep => "Woolly Jumpers"
      case Dog => "Man's best friend"
      case Cat => "World domination"
    }

  }
  println(animalFacts(Pig))
  println(animalFacts(Cow))
  println(animalFacts(Sheep))
  println(animalFacts(Dog))
  println(animalFacts(Cat))

  //3)

  sealed trait StarSign
    case object Aries extends StarSign
    case object Taurus extends StarSign
    case object Gemini extends StarSign
    case object Cancer extends StarSign
    case object Leo extends StarSign
    case object Virgo extends StarSign
    case object Libra extends StarSign
    case object Scorpio extends StarSign
    case object Sagittarius extends StarSign
    case object Capricorn extends StarSign
    case object Aquarius extends StarSign
    case object Pisces extends StarSign

  case class InputPerson(fullName: String, dateOfBirth: LocalDate, occupation: Option[String], lastCountry: String, dateOfDeath: Option[LocalDate] ) {
    //val deceased: Boolean = if (dateOfDeath) true else false
  }

  case class Person(fullName: String, dateOfBirth: LocalDate, occupation: Option[String], lastCountry: String, dateOfDeath: Option[LocalDate], age: Option[Int], starSign: StarSign, ageAtDeath: Option[Int] ) {

  }

  def createPerson(person: InputPerson): Person = {
    val fullName: String = person.fullName
    val dateOfBirth: LocalDate = person.dateOfBirth
    val occupation: Option[String] = getOccupation(person)
    val lastCountry: String = person.lastCountry
    val age: Option[Int] = getAge(person)
    val dateOfDeath: Option[LocalDate] = person.dateOfDeath
    val ageAtDeath: Option[Int] = getAgeAtDeath(person)
    val starsign: StarSign = getStarSign(dateOfBirth)
    new Person(fullName, dateOfBirth, occupation, lastCountry, dateOfDeath, age, starsign, ageAtDeath)
  }

  def getOccupation(person: InputPerson): Option[String] =
    person.occupation match {
      case Some(occupation) => Some(s"$occupation")
      case None => None
    }

  def getAgeAtDeath(person: InputPerson):Option[Int]  =
   person.dateOfDeath match {
     case Some(deathDate) => Some(ChronoUnit.YEARS.between(person.dateOfBirth, deathDate).toInt )
     case None => None
   }

  def getAge(person: InputPerson):Option[Int]  =
   person.dateOfDeath match {
     case Some(deathDate) => Some(ChronoUnit.YEARS.between(person.dateOfBirth, deathDate).toInt )
     case None => Some(ChronoUnit.YEARS.between(person.dateOfBirth, LocalDate.now ).toInt)
   }

  def getStarSign(date: LocalDate): StarSign = {
    val month = date.getMonth
    val day = date.getDayOfMonth
    month match {
      case Month.JANUARY if day <= 19 =>  Capricorn
      case Month.JANUARY if day >= 20 =>  Aquarius
      case Month.FEBRUARY if day <= 18 =>  Aquarius
      case Month.FEBRUARY if day >= 19 =>  Pisces
      case Month.MARCH if day <= 20 =>  Pisces
      case Month.MARCH if day >= 21 =>  Aries
      case Month.APRIL if day <= 19 =>  Aries
      case Month.APRIL if day >= 20 =>  Taurus
      case Month.MAY if day <= 20 =>  Taurus
      case Month.MAY if day >= 21 =>  Gemini
      case Month.JUNE if day <= 21 =>  Gemini
      case Month.JUNE if day >= 22 =>  Cancer
      case Month.JULY if day <= 22 =>  Cancer
      case Month.JULY if day >= 23 =>  Leo
      case Month.AUGUST if day <= 22 =>  Leo
      case Month.AUGUST if day >= 23 =>  Virgo
      case Month.SEPTEMBER if day <= 22 =>  Virgo
      case Month.SEPTEMBER if day >= 23 =>  Libra
      case Month.OCTOBER if day <= 23 =>  Libra
      case Month.OCTOBER if day >= 24 =>  Scorpio
      case Month.NOVEMBER if day <= 21 =>  Scorpio
      case Month.NOVEMBER if day >= 22 =>  Sagittarius
      case Month.DECEMBER if day <= 21 =>  Sagittarius
      case Month.DECEMBER if day >= 22 =>  Capricorn
    }
  }

  val firstInputPerson = InputPerson("lananh", LocalDate.of(1978, Month.FEBRUARY, 10), Some("software dev"), "UK", None )
  val deadPerson = InputPerson("hannah", LocalDate.of(1978, Month.FEBRUARY, 20), Some("software dev"), "UK", Some(LocalDate.of(2020, Month.APRIL, 11)) )
  println(getStarSign(firstInputPerson.dateOfBirth))
  println(LocalDate.now)
  println(createPerson(firstInputPerson))
  println(createPerson(deadPerson))

  def horoscope(date: LocalDate): Tuple2[StarSign, String] = {
    val sign:StarSign = getStarSign(date)
    val horoscope = sign match {
      case Aries => s"$sign will have a great dat today!!!"
      case Taurus => s"$sign will have a great dat today!!!"
      case Gemini => s"$sign will have a great dat today!!!"
      case Cancer => s"$sign will have a great dat today!!!"
      case Leo => s"$sign will have a great dat today!!!"
      case Virgo => s"$sign will have a great dat today!!!"
      case Libra => s"$sign will have a great dat today!!!"
      case Scorpio => s"$sign will have a great dat today!!!"
      case Sagittarius => s"$sign will have a great dat today!!!"
      case Capricorn => s"$sign will have a great dat today!!!"
      case Aquarius => s"$sign will have a great dat today!!!"
      case Pisces => s"$sign will have a great dat today!!!"
    }
    Tuple2(sign, horoscope)
  }

  println(horoscope(LocalDate.of(1978, Month.FEBRUARY, 10)))

}
