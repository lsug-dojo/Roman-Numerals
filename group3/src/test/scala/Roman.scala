package lsug

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FunSuite



class RomanNumeralSuite extends FunSuite with ShouldMatchers {
  test("I is I") { 
    Roman("II") should be(Roman("II"))
  }

  test("II is not I") { 
    Roman("II") should not be Roman("I")
  }

  test("invalid letters are not Roman") {
    val legalList = List('I','V','X','L','C','D','M')
    val illegalList = ('A' to 'Z').toList -- legalList
    
    for(l <- illegalList){
      intercept[IllegalArgumentException] {
	Roman(l toString)
      }
    }
  }

  test("I + I == II") {
    Roman("I") + Roman("I") should be(Roman("II"))
  }

  test("I + II == III") {
    Roman("I") + Roman("II") should be(Roman("III"))
  }
}
