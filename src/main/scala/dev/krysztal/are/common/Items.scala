/*
 * MIT License
 *
 * Copyright (c) 2024 KrysztalHuang
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package dev.krysztal.are.common

import dev.krysztal.are.AgrarianRevolution.identifier
import dev.krysztal.are.common.ItemGroups.BASE_GROUP_KEY
import dev.krysztal.are.common.item.HybridNote
import dev.krysztal.are.common.item.TraitLens
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.minecraft.item.Item
import net.minecraft.item.Item.Settings
import net.minecraft.item.ItemGroup
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.registry.RegistryKey
import org.slf4j.LoggerFactory

object Items {
    private lazy val log = LoggerFactory.getLogger("AgrarianItems")

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

    // Tools
    val TRAIT_LENS: Item = register(TraitLens(Settings()), "trait_lens")
    val HYBRID_NOTE: Item = register(HybridNote(Settings()), "hybrid_note")

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
