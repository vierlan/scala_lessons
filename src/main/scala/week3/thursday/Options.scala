package week3.thursday

object Options extends App {

  trait Pizza {
    val size: Int
    val crust: Option[String]

  }

  object Personal extends Pizza {
    override val size: Int = 7
    override val crust: Option[String] = Some("classic") // Must wrap in a Some if giving it SOMEthing

  }

  object Small extends Pizza {
    override val size: Int = 9
    override val crust: Option[String] = None
  }

  object Medium extends Pizza {
    override val size: Int = 11
    override val crust: Option[String] = Some("classic")  //assigning a default
  }

  object Large extends Pizza {
    override val size: Int = 14
    override val crust: Option[String] = Some("classic")  //assigning a default
  }

  // Pattern matching

  val newPizzaOrder: Pizza = new Pizza {
    override val size: Int = 14
    override val crust: Option[String] = Some("inside Some stuffed")
  }

  val emptyCrustPizzaOrder: Pizza = new Pizza {
    override val size: Int = 14
    override val crust: Option[String] = Some("inside Some stuffed")
  }

  def whatCrust(pizza: Pizza): String =  {
    pizza.crust match {
      case Some("classic") => "Classic crust"
      case Some("italian") => "Italian crust"
      case Some("stuffed") => "Stuffed crust"
      case None => "Just the default classic crust"
    }
  }
  println(whatCrust(newPizzaOrder))
  println(newPizzaOrder.crust.get) // this will not work with none ->Nothing to get , use the Else
  println(emptyCrustPizzaOrder.crust.getOrElse("classic")) //either get the Some or give the value in getOrElse
}
