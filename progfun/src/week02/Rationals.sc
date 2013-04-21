package week02

object Rationals {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val x = new Rational(1, 3)                      //> x  : week02.Rational = 1/3
  val y = new Rational(5, 7)                      //> y  : week02.Rational = 5/7
  val z = new Rational(3, 2)                      //> z  : week02.Rational = 3/2

  assert(x.sub(y).sub(z).toString == "-79/42")
  assert(y.add(y).toString() == "10/7")
  assert(x.less(y) == true)
  assert(x.max(y).toString() == "5/7")

  //val strange = new Rational (1,0)
  val bigX = new Rational(1000000000, 2000000000) //> bigX  : week02.Rational = 1/2
  val bigY = new Rational(1500000000, 2000000000) //> bigY  : week02.Rational = 3/4
  assert (bigX.less(bigY)==true)
  assert(bigX.add(bigY).toString == "5/4")
  assert(bigX.max(bigY).toString == "3/4")

}

class Rational(x: Int, y: Int) {
  require(y != 0, "denominator must be non zero")
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  private val g = gcd(x, y)
  def numer = x / g
  def denom = y / g

  def add(that: Rational) =
    new Rational(numer * that.denom + that.numer * denom,
      denom * that.denom)
  def neg = new Rational(-numer, denom)
  def sub(that: Rational) = add(that.neg)

  def less(that: Rational) = numer * that.denom < that.numer * denom
  def max(that: Rational) = if (this.less(that)) that else this

  override def toString() = {
    val g = gcd(numer, denom)
    //numer/g+"/"+denom/g
    numer + "/" + denom
  }
}