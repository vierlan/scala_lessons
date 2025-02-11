package Week2.tuesday.Vehicles

abstract class Vehicle (val brand: String) {
  def drive: String // abstract method
  val desciption: String = s"This Vehicle is a $brand."
}

/**
 * Abstract Class
 * Prevents instantiating of the Class.
 * Instantiations are made only on subclasses.
 * Allows for constructor parameters
 */
