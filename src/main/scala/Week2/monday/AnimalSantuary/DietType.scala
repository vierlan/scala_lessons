package Week2.monday.AnimalSantuary

import Week2.monday.AnimalSantuary.Animal

sealed trait DietType

//case class Cat(name: Name, age: Age, furColour: String, hasTail: Boolean, mealsPerDay: Int) extends Mammal(name, age, furColour, hasTail) with DietType
case class Cat(mealsPerDay: Int) extends DietType
case class Hamster(mealsPerDay: Int, proteinSource: String) extends DietType
case class Lion(mealsPerDay: Int) extends DietType

object DietSelector {
  def selectDietType(dietType: DietType): String = {
    dietType match {
    //  case Cat(name, age, furColour, hasTail, mealsPerDay) => "Omnivore"
      case Cat(mealsPerDay) => "Omnivore"
      case Hamster(mealsPerDay, proteinSource) => "Herbivore."
      case Lion(mealsPerDay) => "Carnivore."
    }
  }
}