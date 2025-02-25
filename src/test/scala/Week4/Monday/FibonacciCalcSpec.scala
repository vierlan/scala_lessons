package Week4.Monday

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class FibonacciCalcSpec extends AnyWordSpec with Matchers {


  "fibonacciRecursion" should {
    "return the expected number in the fibonacci sequence when a position is given" in {
      val input = FibonacciCalc.fibonacciRecursion(6)
      val expected = 5
      input shouldBe expected
    }
  }
}
