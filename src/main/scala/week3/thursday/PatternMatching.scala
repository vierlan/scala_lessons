package week3.thursday

import week3.thursday.Enums.BetterWeekdays

object PatternMatching extends App {

  val weather: String = "Cold".toLowerCase

  if (weather == "cold") {
    println(s"It is $weather! Take a coat.")
  } else if (weather == "raining") {
    println(s"It is $weather! Take an umbrella.")
  } else {
    println(s"$weather is not valid")
  }

  weather.toLowerCase match {
    case "cold" => println(s"It is $weather! Take a coat.")
    case "raining" => println(s"It is $weather! Take an umbrella.")
    case _ => println(s"$weather is not valid") // _ underscore is our "wildcard" catch all
  }

  val numOfWatermelons: Int = 9
  numOfWatermelons match {
    case 1 | 2 | 3 =>  println("He can carry them without a bag") // with pattern matching, we only need 1 | line for or
    case 4| 5 => println("He needs a bag")
    case x => println(s"$x is invalid") // if you want to use interpolation with an int, need to assign it to x rather than _
  }

  def matchWithEnum(weekday: BetterWeekdays.Value ): Unit = {
    weekday match {
      case BetterWeekdays.Monday => println(s"Oh it's ${BetterWeekdays.Monday}")
      case BetterWeekdays.Tuesday => println(s"Oh it's ${BetterWeekdays.Tuesday}")
      case BetterWeekdays.Wednesday => println(s"Oh it's ${BetterWeekdays.Wednesday}")
      case BetterWeekdays.Thursday => println(s"Oh it's ${BetterWeekdays.Thursday}")
      case BetterWeekdays.Friday => println(s"Oh it's ${BetterWeekdays.Friday}")
      case BetterWeekdays.Saturday => println(s"Oh it's ${BetterWeekdays.Saturday}")
      case BetterWeekdays.Sunday => println(s"Oh it's ${BetterWeekdays.Sunday}")
    }

  }
  println(BetterWeekdays.values)
  println(BetterWeekdays.Monday)
  matchWithEnum(BetterWeekdays.Thursday)

  abstract class Notification // HAVE TO EXTEND THIS, IT'S ABSTACT
  case class Email (sender: String, subjectLine: String, body: String)  extends Notification
  case class Text (sender: String, body: String) extends Notification
  case class VoiceMail (sender: String, lengthOfBody: Int) extends Notification

  val notification: Notification = Text("Mum", "where are you?")

  notification match {
    case Email(sender, subjectLine, body) => println("Email from " + sender)
    case Text(sender, body) if sender == "Mum" => println("Text from " + sender + " Message: " + body)
    case Text(sender, body) => println("Text from " + sender)
    case VoiceMail(sender, lengthOfBody) => println("Voice note from " + sender + " " + lengthOfBody)
  }


}
