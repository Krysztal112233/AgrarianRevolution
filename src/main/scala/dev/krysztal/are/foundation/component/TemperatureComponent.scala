package dev.krysztal.are.foundation.component

import dev.krysztal.are.AgrarianRevolution.modID
import dev.krysztal.are.foundation.component.TemperatureComponentImpl.COMPONENT
import net.minecraft.nbt.NbtCompound
import net.minecraft.registry.RegistryWrapper.WrapperLookup
import net.minecraft.util.Identifier
import net.minecraft.world.chunk.Chunk
import org.ladysnake.cca.api.v3.chunk.ChunkComponentFactoryRegistry
import org.ladysnake.cca.api.v3.chunk.ChunkComponentInitializer
import org.ladysnake.cca.api.v3.component.*
import org.ladysnake.cca.api.v3.component.sync.AutoSyncedComponent

trait TemperatureComponent extends ComponentV3 {
    var temperature: Int = 0
}

class TemperatureComponentImpl()
    extends TemperatureComponent,
      AutoSyncedComponent,
      ChunkComponentInitializer {
    private var chunk: Chunk = null

    private def this(chunk: Chunk) = {
        this()
        this.chunk = chunk
    }

    override def registerChunkComponentFactories(
        registry: ChunkComponentFactoryRegistry
    ): Unit = {
        registry.register(COMPONENT, TemperatureComponentImpl(_))
    }

    override def writeToNbt(
        tag: NbtCompound,
        registryLookup: WrapperLookup
    ): Unit = {
        tag.putInt("temperature", temperature)
    }

    override def readFromNbt(
        tag: NbtCompound,
        registryLookup: WrapperLookup
    ): Unit = {
        temperature = tag.getInt("temperature")
    }
}

object TemperatureComponentImpl {
    val COMPONENT: ComponentKey[TemperatureComponent] =
        ComponentRegistryV3.INSTANCE.getOrCreate(
          Identifier.of(modID, "temperature"),
          classOf[TemperatureComponent]
        )
}
