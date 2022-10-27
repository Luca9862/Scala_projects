package mod6

//Si scrivano delle funzioni
//- not(x: Boolan): Boolean
//- and(x:Boolen, y:Boolean): Boolean
//- or(x:Boolen, y:Boolean): Boolean
//- xor(x:Boolen, y:Boolean): Boolean

//tali che:

//- not(x) == !x
//- and(x,y) == x && y
//- or(x,y) == x || y
//- xor(x,y) == (x || y) && !(x && y)

//senza utilizzare, nel corpo delle funzioni, gli operatori !, && e ||.

object FunzioniBooleane {

  def not(x: Boolean): Boolean={
    if(x) false
    else true
  }

  def and(x: Boolean, y: Boolean): Boolean={
    if(x) y else false
    //se x è vera ritorna y, in quanto il valore dell'espressione dipenderà esclusivamente da quest'ultima
  }

  def or(x: Boolean, y: Boolean): Boolean={
    if(x) true else y //se x è falsa ritorna y, in quanto il valore dell'espressione dipenderà esclusivamente da quest'ultima
  }

  def xor(x: Boolean, y: Boolean): Boolean={
    if (x) if(y) false else true else y //se x ed y sono uguali ritorna falso. Se sono diversi ritorna vero
  }

}
