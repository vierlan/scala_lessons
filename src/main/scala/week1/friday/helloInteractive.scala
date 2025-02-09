import scala.io.StdIn.{readLine, readInt}

object helloInteractive {

  def main(args: Array[String]) = {
    println("Please enter your name:")
    val name = readLine()
    println("What year were you born?")
    val yearOfBirth = readInt()
    val age: Int = scala.math.abs(yearOfBirth - 2025)
    println("Hello, " + name + s", and you are $age years old this year! \n What is your favourite coding language?")
    val favLang = readLine().capitalize
    println(s"$favLang is awesome!!  Good luck $name!!")
  }

}