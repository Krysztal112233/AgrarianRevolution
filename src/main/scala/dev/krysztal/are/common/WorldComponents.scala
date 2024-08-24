package dev.krysztal.are.common

import dev.krysztal.are.AgrarianRevolution.modID
import dev.krysztal.are.common.WorldComponents.SEASON_COMPONENT
import dev.krysztal.are.common.component.SeasonComponent
import dev.krysztal.are.common.component.SeasonComponentImpl
import net.minecraft.util.Identifier
import net.minecraft.world.World
import org.ladysnake.cca.api.v3.component.ComponentKey
import org.ladysnake.cca.api.v3.component.ComponentRegistryV3
import org.ladysnake.cca.api.v3.world.WorldComponentFactoryRegistry
import org.ladysnake.cca.api.v3.world.WorldComponentInitializer

class WorldComponents extends WorldComponentInitializer {
    override def registerWorldComponentFactories(
        registry: WorldComponentFactoryRegistry
    ): Unit = {
        registry.register(
          SEASON_COMPONENT,
          classOf[SeasonComponentImpl],
          SeasonComponentImpl(_)
        );
    }
}

object WorldComponents {
    val SEASON_COMPONENT: ComponentKey[SeasonComponent] =
        ComponentRegistryV3.INSTANCE.getOrCreate(
          Identifier.of(modID, "season"),
          classOf[SeasonComponent]
        )

    def initialize(): Unit = {}
}
