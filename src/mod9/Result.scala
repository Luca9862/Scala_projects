//Qual'è il valore di result? Spiegatene il motivo

package mod9

object Result {
  val x = 1
  def f(y: Int) = y + 1
  val result = {
    val x = f(3)
    x*x} + x
}

//result = 17
//questo perchè, secondo le regole di scope lessicale, all'interno del blocco result la x assume valore 4 (riga 9)
//nella riga 10 viene eseguita l'operazione 4*4
//l'ultima occorrenza x al di fuori del blocco ha valore 1 in quanto fa riferimento alla prima dichiarazione (riga 6)