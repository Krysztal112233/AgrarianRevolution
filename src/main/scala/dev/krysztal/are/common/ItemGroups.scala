package dev.krysztal.are.common

import dev.krysztal.are.AgrarianRevolution.identifier
import dev.krysztal.are.AgrarianRevolution.modID
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.minecraft.item.ItemGroup
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.registry.RegistryKey
import net.minecraft.text.Text

object ItemGroups {
    val BASE_GROUP_KEY: RegistryKey[ItemGroup] =
        RegistryKey.of(Registries.ITEM_GROUP.getKey(), identifier("base"))
    val BASE_GROUP: ItemGroup = register(
      BASE_GROUP_KEY,
      FabricItemGroup
          .builder()
          .displayName(Text.translatable(s"${modID}.group.base"))
          .icon(() => Items.BAMBOO_LEAVES.getDefaultStack)
          .build()
    )

    private def register(key: RegistryKey[ItemGroup], group: ItemGroup) = {
        Registry.register(Registries.ITEM_GROUP, key, group)
    }
    def initialize(): Unit = {}
}
