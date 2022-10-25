package mod11

//una funzione è detta tail-recursive se e solo se l'ultima operazione che essa svolge è una chiamata ricorsiva
object TailRecursion {


  def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)

  def factorial(n: Int): Int = {
    if (n == 0) 1 else n * factorial(n - 1)
    //NO! in quanto l'ultima operazione che essa deve svolgere è la moltiplicazione con n
  }

  def f(x: Int): Int = {
    if (x > 0) f(x - 1)
    else if (x < 0) f(x + 1) + 1
    else x
    //NO! In quanto la ricorsione è l'ultima operazione solo se x>0.
    // Nel ramo else l'ultima operazione svolta è l'addizione +1
  }

}

