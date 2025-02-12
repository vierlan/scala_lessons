package Week2.wednesday

import org.scalatest.flatspec.AnyFlatSpec

class TwoNumbersSpec extends AnyFlatSpec {

  "add" should "add 2 numbers" in {
    val numbers = new TwoNumbers(1,2) // making a new instance of my class, so I can access the methods.
    assert(numbers.add == 3) // Returns a Boolean. Must evaluate to true to pass.  use keyword should be for wordspec
  }

  "subtract" should "subtract y from x" in {
    val numbers = new TwoNumbers(20,10)
    assert(numbers.subtract == 10)
  }

  "multiply" should "multiply x with y" in {
    val numbers = new TwoNumbers(2,3)
    assert(numbers.multiply == 6)
  }

  //We want to test edge cases.  We want our tests to fail, but still compile
//  "multiply" should "error when input is a double" in {
//    val numbers = TwoNumbers(4.5,5)
//    assert(numbers.multiply != 22)
//  }


}
