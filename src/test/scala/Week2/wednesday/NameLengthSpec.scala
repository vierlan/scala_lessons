package Week2.wednesday

import org.scalatest.flatspec.AnyFlatSpec

class NameLengthSpec extends AnyFlatSpec {

  val username = new NameLength

  "getNameLength" should "return length of first name when firstname is longer than lastname" in {
      val input = username.getNameLength("lananh", "do")
      val expected = 6
      assert(input == expected)
  }

  "getNameLength" should "return length of last name when firstname is shorter than lastname" in {
      val input = username.getNameLength("do", "nguyen")
      val expected = 6
      assert(input == expected)
  }

  "getNameLength" should "return 0 when firstname is same length as lastname" in {
      val input = username.getNameLength("lananh", "nguyen")
      val expected = 0
      assert(input == expected)
  }



}
