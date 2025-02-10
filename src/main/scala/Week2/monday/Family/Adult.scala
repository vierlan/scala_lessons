package Week2.monday.Family

class Adult (val forename: Forename, val surname: Surname) {
  val under18: Boolean = true
}

class Forename (val name: String)

class Surname (val surname: String)

object Adult {
  def apply(forename: Forename, surname: Surname): Adult = new Adult(forename, surname)
}
