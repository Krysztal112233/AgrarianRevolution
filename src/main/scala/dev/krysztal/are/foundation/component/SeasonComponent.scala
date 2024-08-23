package dev.krysztal.are.foundation.component

import dev.krysztal.are.AgrarianRevolution.modID
import dev.krysztal.are.foundation.Season
import dev.krysztal.are.foundation.component.SeasonComponentImpl.COMPONENT
import net.minecraft.nbt.NbtCompound
import net.minecraft.registry.RegistryWrapper.WrapperLookup
import net.minecraft.util.Identifier
import net.minecraft.world.World
import org.ladysnake.cca.api.v3.component.ComponentKey
import org.ladysnake.cca.api.v3.component.ComponentRegistryV3
import org.ladysnake.cca.api.v3.component.ComponentV3
import org.ladysnake.cca.api.v3.component.sync.AutoSyncedComponent
import org.ladysnake.cca.api.v3.world.WorldComponentFactoryRegistry
import org.ladysnake.cca.api.v3.world.WorldComponentInitializer

trait SeasonComponent extends ComponentV3 {
    var season: Season = Season.Spring
}

class SeasonComponentImpl()
    extends SeasonComponent,
      AutoSyncedComponent,
      WorldComponentInitializer {
    private var world: World = null

    private def this(world: World) = {
        this()
        this.world = world
    }

    override def registerWorldComponentFactories(
        registry: WorldComponentFactoryRegistry
    ): Unit = {
        registry.register(COMPONENT, SeasonComponentImpl(_));
    }

    override def writeToNbt(
        tag: NbtCompound,
        registryLookup: WrapperLookup
    ): Unit = {
        tag.putString("season", season.toString)
    }

    override def readFromNbt(
        tag: NbtCompound,
        registryLookup: WrapperLookup
    ): Unit = {
        season = Season.valueOf(tag.getString("season"))
    }
}

object SeasonComponentImpl {

    val COMPONENT: ComponentKey[SeasonComponent] =
        ComponentRegistryV3.INSTANCE.getOrCreate(
          Identifier.of(modID, "season"),
          classOf[SeasonComponent]
        )

}
