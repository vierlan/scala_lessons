package Week2.tuesday.Vehicles

object VehicleLogic extends App {

  println("\nCar\n")
  val ford = new Car("Ford", "Petrol")
  println(ford.fuelType)
  println(ford.drive)
  println(ford.brand)
  println(ford.desciption)

  println("\n--------Electric Car---------\n")
  val electricFord = ElectricCar("Ford")
  println(electricFord.desciption)
  println(electricFord.fuelType)
  println(electricFord.brand)
  println(electricFord.drive)
  println(electricFord.noisyToDrive) //coming from electric trait
  println(electricFord.hoursToCharge)
  println(electricFord.charge)



}
