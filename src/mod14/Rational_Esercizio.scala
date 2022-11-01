package mod14
//ESERCIZIO
//Utilizzando il modello di sostituzione si esegua la valutazione dell’espressione
//new Rational(2,3).max(new Rational(1,2))


class Rational_Esercizio(x: Int, y: Int) {
    def num = x;

    def den = y;

    def less(that: Rational_Esercizio): Boolean =
      this.num * that.den < that.num * this.den

    def max(that: Rational_Esercizio): mod14.Rational_Esercizio =
      if (this.less(that)) that else this
}
