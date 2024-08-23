package dev.krysztal.are.provider

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider.ItemTagProvider
import net.minecraft.registry.RegistryWrapper.WrapperLookup

import java.util.concurrent.CompletableFuture

class ConventionalTagProvider(
    val output: FabricDataOutput,
    val completableFuture: CompletableFuture[WrapperLookup]
) extends ItemTagProvider(output, completableFuture) {

    override def configure(
        wrapperLookup: WrapperLookup
    ): Unit = {}
}
