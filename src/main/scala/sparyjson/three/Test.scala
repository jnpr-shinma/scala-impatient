package sparyjson.three

import sparyjson.two.Color
import spray.json._

/**
 * Created by maxin on 15-7-6.
 */
object MyJsonProtocol extends DefaultJsonProtocol {
  implicit object ColorJsonFormat extends RootJsonFormat[Color] {
    def write(c: Color) = JsObject(
      "name" -> JsString(c.name),
      "red" -> JsNumber(c.red),
      "green" -> JsNumber(c.green),
      "blue" -> JsNumber(c.blue)
    )
    def read(value: JsValue) = {
      value.asJsObject.getFields("name", "red", "green", "blue") match {
        case Seq(JsString(name), JsNumber(red), JsNumber(green), JsNumber(blue)) =>
          new Color(name, red.toInt, green.toInt, blue.toInt)
        case _ => throw new DeserializationException("Color expected")
      }
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
