package mod12

object SommatoriaOS {
  def sum(f: Int=>Int, a: Int, b: Int): Int={
    if(a>0) 1 else f(a) + sum(f, a+1, b)
  }
}
