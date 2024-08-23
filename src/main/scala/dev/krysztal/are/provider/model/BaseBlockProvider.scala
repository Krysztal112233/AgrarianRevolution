package dev.krysztal.are.provider.model

import dev.krysztal.are.common.Blocks.*
import net.minecraft.data.client.BlockStateModelGenerator

import scala.compiletime.uninitialized

class BaseBlockProvider {

    private var blockStateModelGenerator: BlockStateModelGenerator =
        uninitialized

    def this(blockStateModelGenerator: BlockStateModelGenerator) = {
        this()
        this.blockStateModelGenerator = blockStateModelGenerator

        registerSimpleCubeAll()
    }

    private def registerSimpleCubeAll() = {
        Array(
          ACIDIFIED_DIRT,
          ALKALIZED_DIRT,
          HARDENED_DIRT,
          APATITE_ORE
        ).foreach(blockStateModelGenerator.registerSimpleCubeAll(_))
    }

}
