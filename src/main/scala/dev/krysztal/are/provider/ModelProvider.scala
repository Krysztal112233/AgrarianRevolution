package dev.krysztal.are.provider

import dev.krysztal.are.provider.model.BaseBlockProvider
import dev.krysztal.are.provider.model.BaseItemProvider
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider
import net.minecraft.data.client.BlockStateModelGenerator
import net.minecraft.data.client.ItemModelGenerator

class ModelProvider(output: FabricDataOutput)
    extends FabricModelProvider(output) {

    override def generateItemModels(
        itemModelGenerator: ItemModelGenerator
    ): Unit = {
        BaseItemProvider(itemModelGenerator)
    }

    override def generateBlockStateModels(
        blockStateModelGenerator: BlockStateModelGenerator
    ): Unit = {
        BaseBlockProvider(blockStateModelGenerator)
    }
}
