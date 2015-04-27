package yangenum

import net.juniper.yang.mo.deviceManagement.device.MgtConnection
import net.juniper.yang.mo.deviceManagement.{ConnectionStatusEnum, Device}


/**
 * Created by maxin on 15-1-21.
 */
object Test  extends  App{
  val device=new Device()
  val mgtc=new MgtConnection()
  mgtc.setStatusValue("")
  device.addMgtConnection(mgtc)
  val enum=new ConnectionStatusEnum("UP")
  println(enum)
}
