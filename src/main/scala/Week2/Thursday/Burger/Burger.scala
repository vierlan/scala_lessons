package Week2.Thursday.Burger

//bstract class Burger (val bunType: Burger.BunType, val DoublePatty: Boolean, val sauce: List(Sauce)) extends Sauce {

//}

object Burger {
  sealed trait BunType
  case object Seeded extends BunType
  case object Brioche extends BunType
  case object GlutenFree extends BunType
  case object Naked extends BunType
}