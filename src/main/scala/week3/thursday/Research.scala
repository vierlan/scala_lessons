package week3.thursday

object Research extends App {
  class Research {
    def checkListType[T](list: List[T]): String = list match {
      case _: List[Double] => "List of Doubles"
      case _: List[String] => "List of Strings"
      case _: List[Int] => "List of Ints"
      case _ => "unknown"
    }

    val numList: List[Int] = List(1, 2, 3)
    val doubleList: List[Double] = List(1.0, 2.0, 3.0)
    val stringList: List[String] = List("1", "2", "3")

    println(checkListType(numList))
    println(checkListType(doubleList))
    println(checkListType(stringList))
  }


}
