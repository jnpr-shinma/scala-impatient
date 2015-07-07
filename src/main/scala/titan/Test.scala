package titan

import com.thinkaurelius.titan.core.{TitanFactory, TitanGraph}

/**
 * Created by maxin on 15-4-27.
 */
object Test extends App{
  val g: TitanGraph = TitanFactory.open("/home/maxin/3rdParty/titan-0.5.4-hadoop2/conf/titan-berkeleydb-es.properties")
  GraphOfTheGodsFactory.load(g)

  g.shutdown
}
