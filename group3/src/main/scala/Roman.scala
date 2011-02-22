package lsug

class Roman(val str: String) {
  
  val legalList = List('I','V','X','L','C','D','M')

  
  if (!(legalList contains str(0))) throw new IllegalArgumentException

  override def equals(obj:Any) = {
    str == obj.asInstanceOf[Roman].str
  }

  def +(other: Roman) = Roman(str + other.str)
}

object Roman { 
  def apply(str: String) = new Roman(str)
}
