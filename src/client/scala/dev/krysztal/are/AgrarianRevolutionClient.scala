package dev.krysztal.are

import net.fabricmc.api.ClientModInitializer
import org.slf4j.LoggerFactory

class AgrarianRevolutionClient extends ClientModInitializer {

    override def onInitializeClient(): Unit = {}

}

object AgrarianRevolutionClient {

    lazy val logger = LoggerFactory.getLogger("AgrarianRevolutionClient")
}
