class Roman(i: Int) extends Ordered[Roman] {

  def getInt = i

  def compare(a: Roman) = this.getInt.compareTo(a.getInt)

}

object Roman {

  def apply(s: String): Roman = s map {
    c => convert(c)
  } reduceRight ((a, b) => if (a < b) new Roman(b.getInt - a.getInt)
  else new Roman(b.getInt + a.getInt))

  def convert(c: Char) = c match {
    case 'i' => new Roman(1)
    case 'v' => new Roman(5)
    case 'x' => new Roman(10)
    case 'l' => new Roman(50)
    case 'c' => new Roman(100)
    case 'd' => new Roman(500)
    case 'm' => new Roman(1000)
  }

}