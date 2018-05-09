
import cats.effect.IO
import com.sksamuel.avro4s.SchemaFor
import fs2.Stream

case class Machine(id: Long, name: String, locationIn3DGrid: List[Int], sensors: List[Sensor]) {
  def addSensor(s: Sensor): Machine = {
    Machine(this.id, this.name, this.locationIn3DGrid, s :: this.sensors)
  }

  def removeSensor(s: Sensor): Machine = {
    Machine(this.id, this.name, this.locationIn3DGrid, this.sensors.filter(_ != s))
  }

  def getSensorState: Stream[IO,Array[Byte]] = {
    new Stream[IO,Array[Byte]](Array(), Array())
  }
}

case class Grid3DLocation(x: Int, y: Int, z: Int) {
  implicit val schemaFor: SchemaFor[Machine] = SchemaFor[Machine]
}