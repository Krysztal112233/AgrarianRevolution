package dev.krysztal.are.foundation.as

import net.minecraft.component.ComponentMap
import net.minecraft.item.ItemStack

type AsComponentMap = As[ComponentMap]

object AsComponentMap {

    implicit class ImplComponentMap(map: ComponentMap) extends AsComponentMap {
        override def as(): ComponentMap = map
    }

    implicit class ImplItemStack(item: ItemStack) extends AsComponentMap {
        override def as(): ComponentMap = {
            item.getComponents()
        }
    }

}
