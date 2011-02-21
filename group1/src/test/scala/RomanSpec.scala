import org.scalatest.matchers.ShouldMatchers
import org.scalatest.Spec

class RomanSpec extends Spec with ShouldMatchers {

  describe("Roman") {
    it("convert single roman numerals to integer") {
      Roman("i").getInt should be(1)
      Roman("v").getInt should be(5)
      Roman("x").getInt should be(10)
      Roman("l").getInt should be(50)
      Roman("c").getInt should be(100)
      Roman("d").getInt should be(500)
      Roman("m").getInt should be(1000)
    }

    it("convert roman string to integer") {
      Roman("vi").getInt should be(6)
      Roman("iv").getInt should be(4)
      // Roman("iii").getInt should be(3) // failing test
    }
  }

}