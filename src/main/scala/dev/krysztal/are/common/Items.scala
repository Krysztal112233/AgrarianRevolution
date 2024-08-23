package dev.krysztal.are.common

import dev.krysztal.are.AgrarianRevolution.identifier
import dev.krysztal.are.AgrarianRevolution.log
import dev.krysztal.are.common.ItemGroups.BASE_GROUP_KEY
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.minecraft.item.Item
import net.minecraft.item.Item.Settings
import net.minecraft.item.ItemGroup
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.registry.RegistryKey

object Items {
    // Mineral Products
    val ASHES: Item = register(Item(Settings()), "ashes")
    val SULFUR: Item = register(Item(Settings()), "sulfur")
    val PHOSPHORCOAL: Item = register(Item(Settings()), "phosphorcoal")
    val PHOSPHORUS: Item = register(Item(Settings()), "phosphorus")
    val RAW_VERMICULITE: Item = register(Item(Settings()), "raw_vermiculite")
    val VERMICULITE: Item = register(Item(Settings()), "vermiculite")

    // Agricultural Products
    val GINKGO_NUT: Item = register(Item(Settings()), "ginkgo_nut")
    val CORN: Item = register(Item(Settings()), "corn")
    val GRAPE: Item = register(Item(Settings()), "grape")
    val STRAWBERRY: Item = register(Item(Settings()), "strawberry")
    val WATER_CHESTNUT: Item = register(Item(Settings()), "water_chestnut")
    val SWEET_POTATO: Item = register(Item(Settings()), "sweet_potato")
    val GARLIC: Item = register(Item(Settings()), "garlic")
    val LETTUCE: Item = register(Item(Settings()), "lettuce")
    val JICAMA: Item = register(Item(Settings()), "jicama")
    val BAMBOO_LEAVES: Item = register(Item(Settings()), "bamboo_leaves")

    private def register(
        item: Item,
        id: String,
        key: RegistryKey[ItemGroup] = BASE_GROUP_KEY
    ) = {
        log.trace(s"Registering item $id -> $item")
        Registry.register(Registries.ITEM, identifier(id), item)
        ItemGroupEvents.modifyEntriesEvent(key).register(_.add(item))

        item
    }

    def initialize(): Unit = {}
}
