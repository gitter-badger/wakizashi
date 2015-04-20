package com.nexelem.orient.wakizashi

import com.nexelem.orient.wakizashi.test.GraphSpec
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import scala.collection.JavaConverters._

@RunWith(classOf[JUnitRunner])
class VertexCcConversionSpec extends GraphSpec {
  "mapping vertices to CC" should {
    "work correctly for trivial case" in {
      val vertex = graph.addVertex(null, Map("name" -> "pawel", "lastname" -> "dolega").asJava)
      vertex.getId should not be(null)
    }
  }
}
