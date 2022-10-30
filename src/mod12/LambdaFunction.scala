package mod12

object LambdaFunction {

  //due esempi di funzioni anonime
  //
  (x: Int) => x * x //un argomento
  (x: Int, y: Int) => x + y //più argomenti
  //

  //riscrittura delle funzioni presenti nell'Object SommatoriaOS
  //
  def sum(f: Int=>Int, a: Int, b: Int): Int={
    if(a>0) 1 else f(a) + sum(f, a+1, b)
  }
  def fact(x: Int): Int = if(x==0) 1 else x * fact(x-1) //si usa fact in quanto è difficile scrivere una F.A. ricorsiva

  def sumInts(a: Int, b: Int) = sum((x: Int) => x, a, b)
  def sumSquares(a: Int, b: Int) = sum((x: Int) => x * x, a, b)
  def sumFactorials(a: Int, b: Int) = sum(fact, a, b)
  //
}

//in questo modo evitiamo di definire separatamente le funzioni: id; square