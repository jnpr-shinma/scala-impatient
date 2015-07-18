package sparyjson.nested


import spray.json._
case class Replace(name: String, value:String)
case class Add(path: String, value:String)
case class Remove(path: String, value:String)
case class Diff(add: Option[Seq[Add]],remove: Option[Seq[Remove]],replace: Option[Seq[Replace]])


object PatchProtocol extends DefaultJsonProtocol {
  implicit val replaceFormat = jsonFormat(Replace,"path","value")
  implicit val addFormat = jsonFormat2(Add)
  implicit val removeFormat = jsonFormat2(Remove)
  implicit val diffFormat = jsonFormat3(Diff)
}

object GoSox extends App {
//  import sparyjson.nested.PatchProtocol._
  //  import sparyjson.nested.MyJsonProtoco
  import sparyjson.nested.PatchProtocol._
  val j1son = """{"diff":{"replace":[{"name":"city","value":"Regression_AD1_patch"},{"name":"email","value":"description modified"}]},{"add": [{"name": "address/name","value": "Regression_AD1_patch"},{"name": "address/description","value": "description modified"}]}}"""
  val json1 = """{"diff":{"replace":[{"name":"city","value":"Regression_AD1_patch"},{"name":"email","value":"description modified"}]}}"""
  val json2="""{"diff":{"replace":[{"name":"city","value":"beijing"},{"name":"email","value":"beijing@beijing.com"}],"add":[{"name":"city","value":"beijing"},{"name":"email","value":"beijing@beijing.com"}]}}"""
  //  val obj = Patch(Some(Diff(Some(Seq(Add("city", "beijing"),Add("email", "beijing@beijing.com"))),Some(Seq(Remove("city", "beijing"),Remove("email", "beijing@beijing.com"))),Some(Seq(Replace("city", "beijing"),Replace("email", "beijing@beijing.com"),Replace("city", "beijing"),Replace("email", "beijing@beijing.com"))))))
  val obj = Diff(Some(Seq(Add("city", "beijing"),Add("email", "beijing@beijing.com"))),None,Some(Seq(Replace("city", "beijing"), Replace("email", "beijing@beijing.com"))))
  val ast = obj.toJson
  println(obj)
  println(ast.prettyPrint)
  println(ast.compactPrint)
  println(ast.convertTo[Diff])
//    val diff=json2.git
//    println(diff)

  val diff = Diff(None, None, Some(Seq(Replace("bill-info/bill-country", "china"))))
  println(diff.toJson.compactPrint)
}


//println("==========diff content:" + patch)
//val obj = patch.parseJson.asJsObject
//val patchKind = obj.getFields("diff")(0).asInstanceOf[JsArray]
//println(patchKind)
//for (kind <- patchKind.elements) {
//println(kind)
//val replaces = kind.asJsObject.getFields("replace")
//if (!replaces.isEmpty) {
//for (replace <- replaces(0).asInstanceOf[JsArray].elements) {
//println(replace)
//val path = replace.asJsObject.getFields("path")(0).asInstanceOf[JsString].value
//val value = replace.asJsObject.getFields("value")(0).asInstanceOf[JsString].value
//element.delete(path)
//element.setMethodByPath(path, value)
//}
//}
//}