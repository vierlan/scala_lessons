package Week2.tuesday.Vehicles

case class ElectricCar(override val brand: String)
  extends Car(brand, fuelType = "Electric") with Electric {
  override val hoursToCharge: Int = 8
  val noisyToDrive: Boolean = false // Specific to ElectricCar
}


/**
 * override val - WHY?
 * Class -> Case class - brand is already associated with a val, inherited for parent class.
 */