package sparyjson.two

import spray.json._

/**
 * Created by maxin on 15-7-6.
 */
case class Color(val name: String, val red: Int, val green: Int, val blue: Int)

object MyJsonProtocol extends DefaultJsonProtocol {
  implicit object ColorJsonFormat extends RootJsonFormat[Color] {
    def write(c: Color) =
      JsArray(JsString(c.name), JsNumber(c.red), JsNumber(c.green), JsNumber(c.blue))

    def read(value: JsValue) = value match {
      case JsArray(Vector(JsString(name), JsNumber(red), JsNumber(green), JsNumber(blue))) =>
        new Color(name, red.toInt, green.toInt, blue.toInt)
      case _ => deserializationError("Color expected")
    }
  }
}
object Test extends App{
  import MyJsonProtocol._

  val json = sparyjson.two.Color("CadetBlue", 95, 158, 160).toJson
  println(json)
  val color = json.convertTo[Color]
  println(color)
}
