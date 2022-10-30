package mod13

object FunzioniListeArgomentiMultiple {
  def sum(f: Int => Int)(a: Int, b: Int): Int =
    if (a > b) 0 else f(a) + sum(f)(a + 1, b)

  def fact(x: Int): Int = if(x==0) 1 else x * fact(x-1)

  def sumInts: (Int, Int) => Int = sum(x => x)
  def sumSquares: (Int, Int) => Int = sum(x => x * x)
  def sumFactorials: (Int, Int) => Int = sum(fact)
}
