package sparyjson.one

import spray.json.DefaultJsonProtocol

case class Color(name: String, red: Int, green: Int, blue: Int)

object MyJsonProtocol extends DefaultJsonProtocol {
  implicit val colorFormat = jsonFormat4(Color)
}
object Test1 extends App{
  import MyJsonProtocol._
  import spray.json._

  val json = Color("CadetBlue", 95, 158, 160).toJson
  println(json)
  val color = json.convertTo[Color]
  println(color)
}
