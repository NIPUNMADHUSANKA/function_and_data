object Q1 {

  def main(args: Array[String]): Unit = {
    val x = new Rational(1,2);
    println(x.neg)
  }

}

class Rational(x:Int,y:Int){
  def numer = x;
  def denom=y;

  def neg = new Rational(numer * -1, denom)

  override def toString = numer + "/" + denom;

}
