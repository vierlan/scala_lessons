package Week2.wednesday

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class UsernameSpec extends AnyWordSpec with Matchers {

  // Make a new instance of my class.
  // I can do this at top level because my class doesn't take parameters
  val username = new Username

  "checkUsername" should {

    "return true" when {
      "username is 8 characters long and all lowercase" in {
        val input = username.checkUsername("mercator")
        val expected = true
        input shouldBe expected
      }
      "username is more than 8 characters long and all lowercase" in {
        val input = username.checkUsername("mercatordigital")
        val expected = true
        input shouldBe expected
      }

    }

    // this is a passing test, to prove that method can fail when expected.
    "return false" when {

      "username is < 8 characters long but all in lowercase" in {
        val input = username.checkUsername("merc")
        input shouldBe false
      }

      "username is 8 character but contains UPPERCASE" in {
        val input = username.checkUsername("Mercator")
        val expected = false
        input shouldBe expected
      }

      // Edge cases
      "username is an empty string" in {
        val input = username.checkUsername("")
        input shouldBe false
      }
    }
  }
}
