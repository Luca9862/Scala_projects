package mod7

//Scrivete una funzione Scala fib(n: Int) ricorsiva per il calcolo del valore Fn.

//Fn = 0 se n = 0
//Fn = 1 se n = 1
//Fn = Fn−1 + Fn−2 se n > 1

object Fibonacci extends App {

  def setFibo(n: Int): Int = {
    if (n == 0) 0 else if (n == 1) 1 else setFibo(n - 1) + setFibo(n - 2)
  }

}
