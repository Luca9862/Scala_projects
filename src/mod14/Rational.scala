package mod14
//ESERCIZIO
//Utilizzando il modello di sostituzione si esegua la valutazione dell’espressione
//new Rational(2,3).max(new Rational(1,2))


class Rational(x: Int, y: Int) {
    def num = x;

    def den = y;

    def less(that: Rational): Boolean =
      this.num * that.den < that.num * this.den

    def max(that: Rational): mod14.Rational =
      if (this.less(that)) that else this
}
