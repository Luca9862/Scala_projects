package mod13

class Rational (x: Int, y:Int){

  override def toString(): String={
    if(y==1) x.toString else x + "/" + y
  }

  def add(that: Rational):Rational={
    new Rational(x * that.y + that.x * y, y * that.y)
  }
}
