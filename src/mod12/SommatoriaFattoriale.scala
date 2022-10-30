package mod12

object SommatoriaFattoriale {
  def fact(x: Int): Int = if(x==0) 1 else x * fact(x-1)

  def sumFact(a: Int, b: Int): Int ={
    if(a>b) 0 else fact(a) + sumFact(a+1, b)
  }
}

