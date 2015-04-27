package scala

import java.util.UUID

import scala.util.Random

/**
 * Created by maxin on 15-1-29.
 */
object Test extends App{
//  println (Random.nextLong())
  println("1 1"+UUID.randomUUID().getMostSignificantBits.toOctalString)
  println("2 1"+UUID.randomUUID().getLeastSignificantBits.toString)
  println("3 1"+UUID.randomUUID().toString)
  println("4 1"+UUID.randomUUID().getLeastSignificantBits.toBinaryString)
}
