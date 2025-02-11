package Week2.monday.AnimalSantuary

import Week2.monday.AnimalSantuary.Animal

sealed trait DietType

case class Cat(override val name: Name, override val age: Age, override val furColour: String, override val hasTail: Boolean, mealsPerDay: Int) extends Mammal(name, age, furColour, hasTail) with DietType
case class Hamster(override val name: Name, override val age: Age, override val furColour: String, override val hasTail: Boolean, mealsPerDay: Int, proteinSource: String) extends Mammal(name, age, furColour, hasTail) with DietType
case class Lion(override val name: Name, override val age: Age, override val furColour: String, override val hasTail: Boolean, mealsPerDay: Int) extends Mammal(name, age, furColour, hasTail) with DietType

object DietSelector {
  def selectDietType(dietType: DietType): String = {
    dietType match {
      case Cat(name, age, furColour, hasTail, mealsPerDay) => "Omnivore"
      case Hamster(name, age, furColour, hasTail, mealsPerDay, proteinSource) => "Herbivore."
      case Lion(name, age, furColour, hasTail, mealsPerDay) => "Carnivore."
    }
  }
}