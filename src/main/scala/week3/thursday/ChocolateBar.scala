package week3.thursday

object ChocolateBar extends App {

  case class ChocolateBar(filling: Option[String])

  val newChocBar: ChocolateBar = new ChocolateBar(Some("caramel"))
  val noFillingChocBar: ChocolateBar = new ChocolateBar(None)
  println(newChocBar.filling.getOrElse("fudge"))
  println(noFillingChocBar.filling.getOrElse("fudge"))
}
