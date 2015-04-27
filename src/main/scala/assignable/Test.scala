package assignable

import com.tailf.jnc._
import net.juniper.yang.mo.deviceManagement._
import net.juniper.yang.mo.ietfInetTypes.{IpAddress, Uri}
import net.juniper.yang.mo.ietfYangTypes.{DateAndTime, Timestamp, Uuid}
import net.juniper.yang.mo.iqAcmTypes.Access

/**
 * Created by maxin on 15-1-21.
 */
object Test extends App {
  val clazz: Class[_] = classOf[B]
  val class1: Class[_] = classOf[YangType[_]]
  System.out.println(clazz)
  println(class1)
  if (class1.isAssignableFrom(clazz)) {
    System.out.println("A是B的父类")
  }
  else {
    System.out.println("A不是B的父类")
  }
  println(classOf[Uuid])
  println(classOf[YangString])
  println(classOf[Uuid].isAssignableFrom(classOf[YangString]))
  println(classOf[B].isAssignableFrom(classOf[YangString]))
 println(getYangBuildInTypeHandler(getYangType("yang:uuid")))

  def getYangBuildInTypeHandler(clazz: Class[_ <: Any]): Unit = {

    println(clazz.isAssignableFrom(classOf[YangString]))
    if (clazz.isAssignableFrom(classOf[YangInt8])) {
      println("----YangInt8------")
    }
    else if (clazz.isAssignableFrom(classOf[YangInt16])) {
      println("---YangInt16-------")
    }
    else if (clazz.isAssignableFrom(classOf[YangUInt32])) {
      println("----YangUInt32------")
    }
    else if (clazz.isAssignableFrom(classOf[YangString])) {
      println("----YangString------")
    }
    else if (clazz.isAssignableFrom(classOf[YangEnumeration])) {
      println("-----YangEnumeration-----")
    }
    else if (clazz.isAssignableFrom(classOf[YangDecimal64])) {
      println("----YangDecimal64------")
    }
    else if (clazz.isAssignableFrom(classOf[YangBoolean])) {
      println("----YangBoolean------")
    }
  }

  def getYangType(yangType: String): Class[_ <: Any] = {
    yangType match {
      case "int8" => classOf[YangInt8]
      case "int16" => classOf[YangInt16]
      case "int32" => classOf[YangInt32]
      case "int64" => classOf[YangInt64]
      case "uint8" => classOf[YangUInt8]
      case "uint16" => classOf[YangUInt16]
      case "uint32" => classOf[YangUInt32]
      case "uint64" => classOf[YangUInt64]
      case "decimal64" => classOf[YangDecimal64]
      case "boolean" => classOf[YangBoolean]
      case "string" => classOf[YangString]
      case "empty" => classOf[YangEmpty]
      case "yang:uuid" => classOf[Uuid]
      case "connectionTypeEnum" => classOf[YangEnumeration]
      case "connectionStatusEnum" => classOf[ConnectionStatusEnum]
      case "inet:ip-address" => classOf[IpAddress]
      case "authEnum" => classOf[AuthEnum]
      case "redundancyStatusEnum" => classOf[RedundancyStatusEnum]
      case "deviceConfigStatusEnum" => classOf[DeviceConfigStatusEnum]
      case "candidateConfigStateEnum" => classOf[CandidateConfigStateEnum]
      case "yang:date-and-time" => classOf[DateAndTime]
      case "inet:uri" => classOf[Uri]
      case "enumeration" => classOf[YangEnumeration]
      case "Access" => classOf[Access]
      case "holderStateEnum" => classOf[HolderStateEnum]
      case "encaptulationEnum" => classOf[EncaptulationEnum]
      case "yang:timestamp" => classOf[Timestamp]
      case "deviceIdRef" => classOf[DeviceIdRef]
      case "holderTypeEnum" => classOf[HolderTypeEnum]
      case _ => classOf[YangInt8]
    }
  }
}
