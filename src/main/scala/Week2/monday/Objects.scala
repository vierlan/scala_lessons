package Week2.monday

object Objects extends App{
  object PrimaryColours {
    val blue: String = "blue"
    val yellow: String = "yellow"
    val red: String = "Red"
  }
  //calling the objects
  println(PrimaryColours.red)
  println(PrimaryColours.red.toUpperCase)

  object DaysOfTheWeek {
    val monday: String = "monday"
    val tuesday: String = "tuesday"
    val wednesday: String = "wednesday"
    val thursday: String = "thursday"
    val friday: String = "friday"
    val saturday: String = "saturday"
    val sunday: String = "sunday"
  }
  //calling the object
  println(DaysOfTheWeek.monday)
  println(DaysOfTheWeek.wednesday.capitalize)

}
