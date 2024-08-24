package dev.krysztal.are.foundation.as

import net.minecraft.entity.Entity
import net.minecraft.world.World

type AsWorld = As[World]

object AsWorld {

    implicit class ImplEntity(val entity: Entity) extends AsWorld {
        override def as(): World = entity.getWorld
    }

    implicit class ImplWorld(val world: World) extends AsWorld {
        override def as(): World = world
    }
}
