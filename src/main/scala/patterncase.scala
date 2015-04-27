import java.lang.reflect.ParameterizedType

import com.tailf.jnc.YangElement
import org.apache.ibatis.session.{SqlSessionManager, SqlSession}

/**
 * Created by maxin on 15-1-19.
 */
object patterncase extends  App{
  val getByPattern = "^get[a-zA-Z].*Uuid$".r
  val getListPattern = "^get[a-zA-Z].*list$".r
  val name="getdddByUuid"

//  val name="getDDDlist"
  name match {
    case getByPattern() => {
      println("----")
      println("ddddd")
    }
    case getListPattern() => {
//      println(clazz)
      println("daaa")
    }
    case _ => {
      println("ffffffffffffff")
    }
  }

  "Cat".matches("^[a-cA-C].*")
  println("getCatlist".matches("^get[a-cA-C].*list"))
  println("getDDDlist".matches("^get[a-cA-C].*Uuid"))
  println("getDDDlist".matches("^get[a-zA-Z].*list$"))

  val MY_RE = "(foo|bar).*".r
  val result = "foo123" match { case MY_RE(m) => m; case _ => "No match" }
  println(result)
}
