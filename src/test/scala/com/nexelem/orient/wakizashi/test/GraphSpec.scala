package com.nexelem.orient.wakizashi.test

import com.tinkerpop.blueprints.impls.orient.{OrientBaseGraph, OrientGraphFactory}
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{BeforeAndAfter, Matchers, WordSpecLike}

@RunWith(classOf[JUnitRunner])
trait GraphSpec extends WordSpecLike with Matchers with BeforeAndAfter {

  implicit var graph: OrientBaseGraph = null

  before {
    val factory = new OrientGraphFactory("memory:test-db", "admin", "admin")
    graph = factory.getNoTx
    setup
  }

  after {
    graph.drop()
    graph.shutdown()
  }

  protected def setup {

  }
}
