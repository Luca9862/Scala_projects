package mod13

//definizione della funzione sum vista nel modulo 12
//la differenza è che vogliamo una funzione che non riceva come argomento i due estremi: a,b.

object sumCurrying {
  def sum(f: Int => Int): (Int, Int) => Int = {
    def sumF(a: Int, b: Int): Int =
      if (a > b) 0 else f(a) + sumF(a + 1, b)
    sumF
  }
}
