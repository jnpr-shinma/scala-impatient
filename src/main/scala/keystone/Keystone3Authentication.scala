package keystone

/**
  * Created by maxin on 15-4-21.
  */
import com.woorea.openstack.keystone.v3.Keystone
object Keystone3Authentication {
   /**
    * @param args
    */
   def main(args: Array[String]) {
     val keystone: Keystone = new Keystone("http://10.208.3.144:5000/v3")
 //    val auth: Authentication = new Authentication
 //    auth.setIdentity(Identity.password("super", "juniper123"))
 //    val response: OpenStackResponse = keystone.tokens.authenticate(auth).request
 //    val tokenId: String = response.header("X-Subject-Token")
 //    val token: Token = response.getEntity(classOf[Token])
 //    System.out.println(tokenId)
 //    System.out.println(token)
     keystone.token("netscreen")
 //    val u=keystone.users().list().request().getEntity(classOf[Users])
 //    val role=new Role
 //    role.setEnabled("true")
 //    role.setName("admin1")
 //    val re=keystone.roles().create(role).request()
 //  println(re)
 //    val project =new Project
 //    println (keystone.projects().userRoles("ed1e533d6bcb4f9ca7d9b9a65ae1049a","d62eb637fb7445958f43cb6a5458631e").list().request().getEntity(classOf[Roles]))
 //    println (keystone.projects().userRoles("ed1e533d6bcb4f9ca7d9b9a65ae1049a","d62eb637fb7445958f43cb6a5458631e").delete("60b6e5709db34341a92aa6268146e8df").request())
     println (keystone.projects().userRoles("ed1e533d6bcb4f9ca7d9b9a65ae1049a","d62eb637fb7445958f43cb6a5458631e").add("60b6e5709db34341a92aa6268146e8df").request())
   }
 }