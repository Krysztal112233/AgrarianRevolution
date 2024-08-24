package dev.krysztal.are.common.data

import com.mojang.serialization.Codec
import com.mojang.serialization.codecs.RecordCodecBuilder

case class SugarComponent(sugar: Int)

object SugarComponent {
    val CODEC: Codec[SugarComponent] =
        RecordCodecBuilder.create[SugarComponent] { builder =>
            builder
                .group(Codec.INT.fieldOf("sugar").forGetter(_.sugar))
                .apply(builder, SugarComponent(_))
        }
}
