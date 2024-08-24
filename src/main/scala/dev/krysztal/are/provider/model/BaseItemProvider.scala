package dev.krysztal.are.provider.model

import dev.krysztal.are.common.Blocks.*
import dev.krysztal.are.common.Items.*
import net.minecraft.data.client.ItemModelGenerator
import net.minecraft.data.client.Models

import scala.compiletime.uninitialized

class BaseItemProvider {
    private var itemModelGenerator: ItemModelGenerator = uninitialized

    def this(itemModelGenerator: ItemModelGenerator) = {
        this()
        this.itemModelGenerator = itemModelGenerator

        registerItemGenerated()
    }

    private def registerItemGenerated() = {

        Array(
          ASHES,
          SULFUR,
          PHOSPHORCOAL,
          PHOSPHORUS,
          RAW_VERMICULITE,
          VERMICULITE
        ).foreach(itemModelGenerator.register(_, Models.GENERATED))

        Array(
          GINKGO_NUT,
          CORN,
          GRAPE,
          STRAWBERRY,
          WATER_CHESTNUT,
          SWEET_POTATO,
          GARLIC,
          LETTUCE,
          JICAMA,
          BAMBOO_LEAVES
        ).foreach(itemModelGenerator.register(_, Models.GENERATED))

        Array(HYBRID_NOTE, TRAIT_LENS).foreach(
          itemModelGenerator.register(_, Models.GENERATED)
        )
    }

    private def registerBlockGenerated() = {
        Array(ACIDIFIED_DIRT, ALKALIZED_DIRT, HARDENED_DIRT, APATITE_ORE)
            .foreach(block =>
                itemModelGenerator.register(block.asItem(), Models.CUBE)
            )
    }
}
