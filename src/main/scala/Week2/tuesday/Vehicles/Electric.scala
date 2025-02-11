package Week2.tuesday.Vehicles

trait Electric {
  val hoursToCharge: Int // Can leave as an abstract field - Must be declared at subclass level
  def charge: String = s"Charge me for $hoursToCharge hours."
}
