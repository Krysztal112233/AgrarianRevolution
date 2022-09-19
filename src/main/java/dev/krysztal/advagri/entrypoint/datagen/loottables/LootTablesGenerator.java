package dev.krysztal.advagri.entrypoint.datagen.loottables;

import dev.krysztal.advagri.AdvAgriConstants;
import dev.krysztal.advagri.annotations.GenType;
import dev.krysztal.advagri.block.AdvAgriBlocks;
import dev.krysztal.advagri.util.GeneratorUtils;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.BlockLootTableGenerator;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;

public class LootTablesGenerator extends SimpleFabricLootTableProvider {

    public LootTablesGenerator(FabricDataGenerator dataGenerator) {
        super(dataGenerator, LootContextTypes.BLOCK);
    }


    @Override
    public void accept(BiConsumer<Identifier, LootTable.Builder> identifierBuilderBiConsumer) {
        new GeneratorUtils.Collector(GenType.LootTableSimpleBlockType).<Block>collect(AdvAgriBlocks.class).forEach(block -> {
            identifierBuilderBiConsumer.accept(
                    new Identifier(AdvAgriConstants.ADV_AGRI_NAMESPACE, block.getLootTableId().getPath()),
                    BlockLootTableGenerator.drops(
                            block,
                            block.asItem(),
                            ConstantLootNumberProvider.create(1.0F)
                    )
            );
        });


    }
}

