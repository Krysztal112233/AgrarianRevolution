package dev.krysztal.advagri.events;

import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import dev.krysztal.advagri.item.AdvAgriItems;

public class LootTableEvent implements EventInterface {

    private static final LootTableEvent GRASS_DROP_EVENT = new LootTableEvent();

    private LootTableEvent() {

    }

    public static LootTableEvent getInstance() {
        return GRASS_DROP_EVENT;
    }

    private static final FabricLootPoolBuilder BAMBOO_DROP_POOL = FabricLootPoolBuilder.builder()
        .rolls(ConstantLootNumberProvider.create(1))
        .withCondition(RandomChanceLootCondition.builder(0.01F).build())
        .withEntry(ItemEntry.builder(Items.BAMBOO)
            .build());

    private static final FabricLootPoolBuilder BAMBOO_LEAVES_POOL = FabricLootPoolBuilder.builder()
        .rolls(ConstantLootNumberProvider.create(1))
        .withCondition(RandomChanceLootCondition.builder(0.7F).build())
        .withEntry(ItemEntry.builder(AdvAgriItems.BAMBOO_LEAVES)
            .build());

    private static final FabricLootPoolBuilder BAMBOO_SHOOT_POOL = FabricLootPoolBuilder.builder()
        .rolls(ConstantLootNumberProvider.create(1))
        .withCondition(RandomChanceLootCondition.builder(0.1F).build())
        .withEntry(ItemEntry.builder(AdvAgriItems.BAMBOO_SHOOT)
            .build());

    @Override
    public void Init() {

        // Grass drop event
        LootTableLoadingCallback.EVENT.register(
            (resourceManager, lootManager, id, supplier, setter) -> {

                var GRASS_LOOT_TABLE_ID = Blocks.GRASS.getLootTableId();
                var TALL_GRASS_LOOT_TABLE_ID = Blocks.TALL_GRASS.getLootTableId();
                var FERN_LOOT_TABLE_ID = Blocks.FERN.getLootTableId();
                var LARGE_FERN_LOOT_TABLE_ID = Blocks.LARGE_FERN.getLootTableId();

                if (GRASS_LOOT_TABLE_ID.equals(id) || TALL_GRASS_LOOT_TABLE_ID.equals(id)
                    || FERN_LOOT_TABLE_ID.equals(id) || LARGE_FERN_LOOT_TABLE_ID.equals(id)) {

                    supplier.withPool(BAMBOO_DROP_POOL.build());
                }
            });

        // Bamboo leaves drop event
        LootTableLoadingCallback.EVENT.register(
            (resourceManager, lootManager, id, supplier, setter) -> {

                var BAMBOO_LOOT_TABLE_ID = Blocks.BAMBOO.getLootTableId();

                if (BAMBOO_LOOT_TABLE_ID.equals(id)) {
                    supplier.withPool(BAMBOO_LEAVES_POOL.build());
                }
            });

        // Bamboo shoot event
        LootTableLoadingCallback.EVENT.register(
            (resourceManager, lootManager, id, supplier, setter) -> {
                var BAMBOO_SAPLING_LOOT_TABLE_ID = Blocks.BAMBOO_SAPLING.getLootTableId();

                if (BAMBOO_SAPLING_LOOT_TABLE_ID.equals(id)) {
                    supplier.withPool(BAMBOO_SHOOT_POOL.build());
                }
            });
    }
}
