package dev.krysztal.are.common

import com.mojang.serialization.Codec
import dev.krysztal.are.AgrarianRevolution.identifier
import dev.krysztal.are.common.data.CaffeineComponent
import net.minecraft.component.ComponentType
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry

object DataComponentTypes {

    val CAFFEINE: ComponentType[CaffeineComponent] =
        register("caffeine", CaffeineComponent.CODEC)

    private inline def register[T](
        id: String,
        codec: Codec[T]
    ): ComponentType[T] = {
        Registry.register(
          Registries.DATA_COMPONENT_TYPE,
          identifier(id),
          ComponentType
              .builder()
              .codec(codec)
              .build()
        )
    }

    def initialize() = {}
}
