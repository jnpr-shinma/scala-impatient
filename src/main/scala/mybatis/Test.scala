package mybatis

import java.io.InputStream
import java.lang.reflect.ParameterizedType
import javax.sql.DataSource

import org.apache.ibatis.io.Resources
import org.apache.ibatis.mapping.Environment
import org.apache.ibatis.session.{SqlSession, Configuration, SqlSessionFactory, SqlSessionFactoryBuilder}
import org.apache.ibatis.transaction.TransactionFactory
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory
import scala.collection.JavaConverters._
/**
 * Created by maxin on 15-1-12.
 */
object Test extends App {
  val resource = "mybatis/mybatis-config.xml";
  val inputStream = Resources.getResourceAsStream(resource);
  val sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
  //sqlSessionFactory

  //  val dataSource = BlogDataSourceFactory.getBlogDataSource();
  //  val transactionFactory = new JdbcTransactionFactory();
  //  val environment = new Environment("development", transactionFactory, dataSource);
  //  val configuration = new Configuration(environment);
  //  configuration.addMapper(BlogMapper.class);
  //  val sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);

  val session = sqlSessionFactory.openSession();
  val r = session.selectOne("selectBlog", "uuid1").asInstanceOf[java.util.Map[String, Long]]
  var paramMap = Map[String, Any]()
  paramMap += ("uuid" -> "uuid1")
  paramMap += ("easyRestParamSql" -> "SELECT o.uuid, o.name, o.orderdate, o.shipaddr, o.id FROM order1 o WHERE o.uuid = #{uuid,jdbcType=VARCHAR}")
  val result = session.selectList("easy-rest-query", paramMap.asJava).asScala
  println(result)


  //  println(r)
  //  try {
  //    val  blog = session.selectOne("org.mybatis.example.BlogMapper.selectBlog", 101);
  //  } finally {
  //    session.close();
  //  }
}
