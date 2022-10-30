package mod12

//metodo per calcolare la sommatoria dei quadrati compresi tra [a,b]

object SommatoriaQuadrati {

  def square(x: Int): Int = x*x

  def sumSquare(a: Int, b: Int): Unit ={
    if(a>b) 0 else square(a) + sumSquare(a+1, b)
  }

}
