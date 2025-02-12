package Week2.wednesday

import Week2.wednesday.FizzBuzz.FizzBuzz
import org.scalatest.flatspec.AnyFlatSpec

class FizzBuzzSpec extends AnyFlatSpec {
  "fizzBuzz" should "return 'FizzBuzz' when parameter is a multiple of both 3 and 5" in {
    val fizzy = new FizzBuzz(15)
    assert(fizzy.fizzBuzz(15) == "FizzBuzz")
  }

  "fizzBuzz" should "return 'Fizz' when parameter is a multiple of 3" in {
    val fizzy = new FizzBuzz(9)
    assert(fizzy.fizzBuzz(9) == "Fizz")
  }

  "fizzBuzz" should "return 'Buzz' when parameter is a multiple of 5" in {
    val fizzy = new FizzBuzz(20)
    assert(fizzy.fizzBuzz(20) == "Fizz")
  }

}
