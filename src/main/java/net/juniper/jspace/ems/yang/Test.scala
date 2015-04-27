package net.juniper.jspace.ems.yang

import com.tailf.jnc.{Tagpath, Element, SchemaTree, SchemaNode}
import net.juniper.jspace.ems.yang.devmgt.devicemgt.Devices
import net.juniper.jspace.ems.yang.devmgt.devicemgt.devices.Device
import net.juniper.jspace.ems.yang.devmgt.devicemgt.devices.device.System

/**
 * Created by maxin on 12/29/14.
 */
object JNC extends App {
  val element = new Device();
  println(element)
  println(element.getRootElement)
  val e = element.createPath("id")
  println(e.tagpath)
  val tagpath = new Tagpath("devmgt/devicemgt/devices/device")
  //  "devmgt/devicemgt/devices/device"
  val currentSchemaNode = SchemaTree.lookup(element.namespace, Device.tagpath)
  val node= SchemaTree.lookup(element.namespace, element.tagpath)
//  val node1= SchemaTree.lookup(element.namespace, element.tp)
//  val c = SchemaNode.get(e)
//  println(node)
//  println(node.yang_node_type)

  println(currentSchemaNode)
//  println(currentSchemaNode.yang_node_type)


}