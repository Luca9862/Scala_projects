package mod14
//ESERCIZIO
//Si valuti l’espressione Circle(15,10,10).isIncluded(new Circle(12,14, 5)) utilizzando il modello di sostituzione.
// Si assuma che la valutazione di un’espressione del tipo
//Math.sqrt(e) avvenga in un solo passo, come nel caso delle operazioni aritmetiche;
//ad esempio, Math.sqrt(25) viene valutata direttamente nel valore 5.

class Circle(cx: Double, cy:Double, rad: Double) {
  val centre_x = cx
  val centre_y = cy
  val radius = rad
  private def square(d: Double) = d * d
  def centreDistance(other: Circle) : Double =
    Math.sqrt(this.square(this.centre_x - other.centre_x) +
      this.square(this.centre_y - other.centre_y))
  def isIncluded(other: Circle): Boolean =
    this.centreDistance(other) <= this.radius - other.radius
}

