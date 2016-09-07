//package opendaylight
//
//import java.io.{File, FilenameFilter}
//
//import org.opendaylight.yangtools.yang.model.parser.api.YangContextParser
//import org.opendaylight.yangtools.yang.parser.impl.YangParserImpl
//
//import scala.collection.JavaConverters._
//
//object OpenDayLight extends App {
//  val parser: YangContextParser = new YangParserImpl
//  val files = new File("/home/maxin/yang/submodule/").listFiles(new FilenameFilter() {
//    override def accept(dir: File, name: String): Boolean = name.endsWith(".yang")
//  })
//  for (m <- parser.parseFiles(files.toList.asJava).getModules.asScala) {
//    println("+---" + m.getName)
//    for (s <- m.getSubmodules.asScala) {
//      println("|   +---" + s.getName)
//      for (ss <- s.getSubmodules.asScala) {
//        println("|   |   +---" + ss.getName)
//      }
//    }
//  }
//}
