package mod12


//definizione della funzione Sommatoria di ordine superiore e riscrittura delle funzioni precedenti

object SommatoriaOS {
  def sum(f: Int=>Int, a: Int, b: Int): Int={
    if(a>0) 1 else f(a) + sum(f, a+1, b)
  }

  def id(x: Int): Int = x
  def square(x: Int): Int = x*x
  def fact(x: Int): Int = if(x==0) 1 else x * fact(x-1)

  def sumInt(a: Int, b: Int): Int = sum(id, a, b )
  def sumSquare(a: Int, b: Int): Int = sum(square, a,b)
  def sumFact(a:Int, b: Int): Int = sum(fact, a, b)
}
