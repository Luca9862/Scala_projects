package mod12

//definizione della funzione sum vista nel modulo 12
//la differenza è che vogliamo una funzione che non riceva come argomento i due estremi: a,b.

object sumCurrying {
  def sum(f: Int => Int): (Int, Int) => Int = {
    def sumF(a: Int, b: Int): Int =
      if (a > b) 0 else f(a) + sumF(a + 1, b)
    sumF
  }

  //riscriviamo le funzioni viste precedentemente con questa nuova versione di sum
  //
  def fact(x: Int): Int = if(x==0) 1 else x * fact(x-1)

  def sumInts = sum(x => x) // sumInts: (Int, Int) => Int
  def sumSquares = sum(x => x * x) // sumSquares: (Int, Int) => Int
  def sumFactorials = sum(fact) // sumFactorials: (Int, Int) => Int
  //
}
