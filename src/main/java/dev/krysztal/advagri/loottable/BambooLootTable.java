package dev.krysztal.advagri.loottable;

import dev.krysztal.advagri.item.AdvAgriItems;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.block.Blocks;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;

public class BambooLootTable {
    static final LootPool BAMBOO_LEAVES_POOL;
    static final LootPool BAMBOO_SHOOT_POOL;

    static {
        BAMBOO_LEAVES_POOL = LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(1))
                .conditionally(RandomChanceLootCondition.builder(0.7F).build())
                .with(ItemEntry.builder(AdvAgriItems.BAMBOO_LEAVES)
                        .build()).build();

        BAMBOO_SHOOT_POOL = LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(1))
                .conditionally(RandomChanceLootCondition.builder(0.1F).build())
                .with(ItemEntry.builder(AdvAgriItems.BAMBOO_SHOOT)
                        .build()).build();
    }

    static {


        // Bamboo leaves drop event
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            var BAMBOO_LOOT_TABLE_ID = Blocks.BAMBOO.getLootTableId();

            if (BAMBOO_LOOT_TABLE_ID.equals(id)) {
                tableBuilder.pool(BAMBOO_LEAVES_POOL);
            }
        });


        // Bamboo shoot event
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            var BAMBOO_SAPLING_LOOT_TABLE_ID = Blocks.BAMBOO_SAPLING.getLootTableId();

            if (BAMBOO_SAPLING_LOOT_TABLE_ID.equals(id) && source.isBuiltin()) {
                tableBuilder.pool(BAMBOO_SHOOT_POOL);
            }
        });
    }
}
