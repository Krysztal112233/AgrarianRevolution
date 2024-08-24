package dev.krysztal.are.common.data

import com.mojang.serialization.Codec
import com.mojang.serialization.codecs.RecordCodecBuilder

case class CaffeineComponent(caffeine: Integer)

object CaffeineComponent {
    val CODEC: Codec[CaffeineComponent] =
        RecordCodecBuilder.create[CaffeineComponent] { builder =>
            builder
                .group(Codec.INT.fieldOf("caffeine").forGetter(_.caffeine))
                .apply(builder, CaffeineComponent(_))
        }
}
