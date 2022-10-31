package mod10

import scala.annotation.tailrec

object SumTailRecursive {
  def sum(f: Int=>Int, a:Int, b:Int): Int ={
    @tailrec
    def iter(a:Int, acc: Int): Int ={
      if(a>b) acc
      else
        iter(a+1, acc + f(a))
    }

    iter(a,0)

  }
}
