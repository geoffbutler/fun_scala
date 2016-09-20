// see http://www.scalatest.org/user_guide/selecting_a_style

import org.scalatest.FunSuite
import main.Test


class TestSpec extends FunSuite {

  test("Test.ReturnFalse should return false") {
    val test = new Test()
    assert(!test.ReturnFalse())
  }

  test("Test.ReturnTrue should return true") {
    val test = new Test()
    assert(test.ReturnTrue())
  }
}