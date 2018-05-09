sealed trait Metric {
  def name: String
}

case class DoubleValueMetric(name: String, value: Double, unit: UnitType) extends Metric

case class IntValueMetric(name: String, value: Int, unit: UnitType) extends Metric

case class StringValueMetric(name: String, value: Int, unit: UnitType) extends Metric