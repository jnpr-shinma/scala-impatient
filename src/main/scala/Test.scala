import com.tailf.jnc.{SchemaTree, Tagpath}
import net.juniper.jspace.ems.yang.devmgt.devicemgt.devices.Device
import net.juniper.yang.mo.tcPetStore.TcOrder

/**
 * Created by maxin on 12/29/14.
 */
object JNC extends App {
  val element = new Device();

//  println(element)
//  println(element.getRootElement)
  val e = element.createPath("id")
//  println(e.tagpath)
  val tagpath = new Tagpath("devmgt/devicemgt/devices/device")
  //  "devmgt/devicemgt/devices/device"
  val currentSchemaNode = SchemaTree.lookup(element.namespace, Device.tagpath)
  val node = SchemaTree.lookup(element.namespace, element.tagpath)
  val path=element.getClass.getField("tqqp").get(null);

  val node1= SchemaTree.lookup(element.namespace, Device.tqqp)
  //  val c = SchemaNode.get(e)
  //  println(node)
  //  println(node.yang_node_type)

//  println(currentSchemaNode)
  //  println(currentSchemaNode.yang_node_type)

  val order = new TcOrder()
  order.setUuidValue("111111111")
  order.setBilladdrValue("beijing china")
  order.setNameValue("maxin")

  println(order.getValue("uuid"))

}

