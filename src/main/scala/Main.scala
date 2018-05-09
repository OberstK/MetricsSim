import java.io.ByteArrayInputStream

import com.sksamuel.avro4s.{AvroInputStream, AvroSchema}

object Main extends App {


  val machine1 = Machine(1L, "Machine 1", List(1, 1, 1), List()).addSensor(Sensor(id = 1L, "Temp1", List()))


}

