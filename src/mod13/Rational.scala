package mod13

//definizione della classe Rational illustrata nel modulo 13

class Rational(x: Int, y: Int) {
  require(y>0, "denominator must be positive")
  val num = x / abs(gcd(x, y))
  val den = y / abs(gcd(x, y))

  def this(x: Int) = this(x, 1)

  def abs(a: Int): Int =
    if (a < 0) -a else a

  def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)


  override def toString(): String =
    if (this.y == 1) this.num.toString else this.num + "/" + this.den


  def add(that: Rational): Rational =
    new Rational(this.num * that.den + that.num * this.den, this.den * that.den)

}