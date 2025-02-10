package Week2.monday.AnimalSantuary

trait Flyable {
  def canFly: Boolean = true
}

trait EagleWings extends Flyable {
  def wingspan: Int = 12
}