package dev.krysztal.advagri.loottable;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;

public class GrassLootTable {


    static final LootPool BAMBOO_DROP_POOL;


    static {
        BAMBOO_DROP_POOL = LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(1))
                .conditionally(RandomChanceLootCondition.builder(0.01F).build())
                .with(ItemEntry.builder(Items.BAMBOO)
                        .build()).build();
    }

    static {

        // Grass drop event
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {

            var GRASS_LOOT_TABLE_ID = Blocks.GRASS.getLootTableId();
            var TALL_GRASS_LOOT_TABLE_ID = Blocks.TALL_GRASS.getLootTableId();
            var FERN_LOOT_TABLE_ID = Blocks.FERN.getLootTableId();
            var LARGE_FERN_LOOT_TABLE_ID = Blocks.LARGE_FERN.getLootTableId();

            if ((GRASS_LOOT_TABLE_ID.equals(id)
                    || TALL_GRASS_LOOT_TABLE_ID.equals(id)
                    || FERN_LOOT_TABLE_ID.equals(id)
                    || LARGE_FERN_LOOT_TABLE_ID.equals(id))
                    && source.isBuiltin()) {

                tableBuilder.pool(BAMBOO_DROP_POOL);
            }
        });


    }
}
