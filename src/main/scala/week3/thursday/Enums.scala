package week3.thursday

/**
 * Enumaration
 * Useful for finite set of data - day of week, eyecolours
 * // extends enumeration
 *
 */

object Enums extends App  {

  object Weekday extends Enumeration {
    val Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday = Value
  }

  println(Weekday.values)
  println(Weekday.Monday)

  //splitting them up
  // below is useful with Acronyms
  object BetterWeekdays extends Enumeration {
    val Monday = Value("Mon")
    val Tuesday = Value("Tue")
    val Wednesday = Value("Wed")
    val Thursday = Value("Thurs")
    val Friday = Value("Fri")
    val Saturday = Value("Sat")
    val Sunday = Value("Sun")
  }

  // Pattern Match example
  // We want an exhaustive match - all enums should be used
  // We won't see a error message/warning if we miss values

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

  object ReorderdedWeekdays extends Enumeration {
    val Monday = Value(1)
    val Tuesday = Value(2)
    val Wednesday = Value(3)
    val Thursday = Value(4)
    val Friday = Value(5)
    val Saturday = Value(6)
    val Sunday = Value(0)
  }

  println(ReorderdedWeekdays.values)

  //sealed case objects --> preferred way
  //  No easy way to print them all out
  // No Default ordering

  sealed trait Weekday
  case object Monday extends Weekday
  case object Tuesday extends Weekday
  case object Wednesday extends Weekday
  case object Thursday extends Weekday
  case object Friday extends Weekday
  case object Saturday extends Weekday
  case object Sunday extends Weekday

  // Custom errors

  abstract class Error (name: String, errorCode: Int)
  case object NotFound extends Error("Not found", 404)
  case object HairColourError extends Error("Hair Colour is invalid", 404)


}
