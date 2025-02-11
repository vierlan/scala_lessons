package Week2.tuesday.Vehicles

class Car (brand: String, val fuelType: String) extends Vehicle(brand) {

  override def drive: String = s"This $brand car is using $fuelType"
}
