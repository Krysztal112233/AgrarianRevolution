package dev.krysztal.are

import dev.krysztal.are.common.Blocks
import dev.krysztal.are.common.ItemGroups
import dev.krysztal.are.common.Items
import dev.krysztal.are.common.WorldComponents
import net.fabricmc.api.ModInitializer
import net.minecraft.util.Identifier
import org.slf4j.LoggerFactory

class AgrarianRevolution extends ModInitializer {

    def onInitialize() = {
        WorldComponents.initialize()

        ItemGroups.initialize()
        Items.initialize()
        Blocks.initialize()
    }
}

object AgrarianRevolution {
    private lazy val log = LoggerFactory.getLogger("AgrarianRevolution")

    val modID = "are"

    def identifier(id: String) = Identifier.of(modID, id)
}
