package dev.krysztal.advagri.loottable;

import dev.krysztal.advagri.foundation.AdvAgriTags;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.registry.Registry;

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

        // Inject bamboo drop loot table into grass-like block's loot table.
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            var block = Registry.BLOCK.get(id);
            if (block.getDefaultState().isIn(AdvAgriTags.BlockTags.HIDDEN_BAMBOO)
                    && source.isBuiltin()) {
                tableBuilder.pool(BAMBOO_DROP_POOL);
            }
        });


    }
}
