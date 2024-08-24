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
import dev.krysztal.are.common.block.SpecimenRepository
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.minecraft.block.AbstractBlock
import net.minecraft.block.Block
import net.minecraft.block.Blocks as MBlocks
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.item.Item.Settings
import net.minecraft.item.ItemGroup
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.registry.RegistryKey
import org.slf4j.LoggerFactory

object Blocks {
    private lazy val log = LoggerFactory.getLogger("AgrarianBlocks")

    // Dirt
    val ACIDIFIED_DIRT: Block = register(
      "acidified_dirt",
      Block(AbstractBlock.Settings.copy(MBlocks.DIRT_PATH))
    )
    val ALKALIZED_DIRT: Block = register(
      "alkalized_dirt",
      Block(AbstractBlock.Settings.copy(MBlocks.DIRT_PATH))
    )
    val HARDENED_DIRT: Block = register(
      "hardened_dirt",
      Block(AbstractBlock.Settings.copy(MBlocks.NETHERRACK))
    )

    // Ore
    val APATITE_ORE: Block = register(
      "apatite_ore",
      Block(AbstractBlock.Settings.copy(MBlocks.COAL_ORE))
    )

    // Workstation
    val TRAIT_BOOKSHELF: Block = register(
      "specimen_repository",
      SpecimenRepository(AbstractBlock.Settings.copy(MBlocks.CHEST))
    )

    private def register(
        id: String,
        block: Block,
        shouldRegisterItem: Boolean = true,
        itemSettings: Item.Settings = Item.Settings(),
        key: RegistryKey[ItemGroup] = BASE_GROUP_KEY
    ) = {
        log.trace(s"Registering block: $id -> $block")
        Registry.register(Registries.BLOCK, identifier(id), block)

        if (shouldRegisterItem) {
            val blockItem = BlockItem(block, itemSettings)
            log.trace(s"Registering block item: $id -> $blockItem")
            Registry.register(Registries.ITEM, identifier(id), blockItem)
        }

        ItemGroupEvents.modifyEntriesEvent(key).register(_.add(block.asItem()))

        block
    }

    def initialize(): Unit = {}
}
