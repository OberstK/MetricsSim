case class Sensor(id: Long, name: String, metrics: List[Metric], intervalInSeconds: Int) {

}

object Sensor {
  def apply(id: Long, name: String, metrics: List[Metric], intervalInSeconds: Int): Sensor = new Sensor(id, name, metrics, intervalInSeconds)
}
