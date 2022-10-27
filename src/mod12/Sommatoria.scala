package mod12

//metodo per effettuare la sommatoria tra due estremi a,b.
object Sommatoria extends App {
  def sumInt(a: Int, b: Int): Int={
    if(a>b) 0 else a + sumInt(a+1, b)
  }

  println(sumInt(1,3))
}

//esempio di esecuzione con a=1 e b=3:
//
//-(1>3) FALSE --> return 1 + sumInt(2,3)
//    -return 1 + 2 + sumInt(3,3)
//        - return1 + 2 + 3 + sumInt(4,3)
//            -(4>3) VERO return 1 + 2 + 3 = 6
