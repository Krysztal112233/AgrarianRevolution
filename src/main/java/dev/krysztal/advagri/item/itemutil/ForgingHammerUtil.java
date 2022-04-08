package dev.krysztal.advagri.item.itemutil;

import dev.krysztal.advagri.block.AdvAgriBlocks;
import dev.krysztal.advagri.item.AdvAgriItems;
import java.util.HashMap;
import java.util.HashSet;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;

public class ForgingHammerUtil {

    private static final ForgingHammerUtil INSTANCE = new ForgingHammerUtil();
    private final HashSet<Block> blockHashSet = new HashSet<>();
    private final HashMap<Block, Item> blockItemHashMap = new HashMap<>();

    private ForgingHammerUtil() {
        blockHashSet.add(AdvAgriBlocks.ALUMINUM_BLOCK);
        blockHashSet.add(AdvAgriBlocks.BRONZE_BLOCK);
        blockHashSet.add(Blocks.COPPER_ORE);
        blockHashSet.add(AdvAgriBlocks.LEAD_BLOCK);
        blockHashSet.add(AdvAgriBlocks.SILVER_BLOCK);
        blockHashSet.add(AdvAgriBlocks.NICKEL_BLOCK);
        blockHashSet.add(AdvAgriBlocks.ZINC_BLOCK);
        blockHashSet.add(AdvAgriBlocks.STEEL_BLOCK);
        blockHashSet.add(AdvAgriBlocks.TUNGSTEN_BLOCK);
        blockHashSet.add(AdvAgriBlocks.TITANIUM_BLOCK);
        blockHashSet.add(AdvAgriBlocks.TIN_BLOCK);

        blockHashSet.add(Blocks.GOLD_BLOCK);
        blockHashSet.add(Blocks.IRON_BLOCK);

        blockItemHashMap.put(AdvAgriBlocks.ALUMINUM_BLOCK,
            AdvAgriItems.ALUMINUM_PLATE);
        blockItemHashMap.put(AdvAgriBlocks.BRONZE_BLOCK,
            AdvAgriItems.BRONZE_PLATE);
        blockItemHashMap.put(Blocks.COPPER_BLOCK,
            AdvAgriItems.COPPER_PLATE);
        blockItemHashMap.put(AdvAgriBlocks.LEAD_BLOCK,
            AdvAgriItems.LEAD_PLATE);
        blockItemHashMap.put(AdvAgriBlocks.SILVER_BLOCK,
            AdvAgriItems.SILVER_PLATE);
        blockItemHashMap.put(AdvAgriBlocks.NICKEL_BLOCK,
            AdvAgriItems.NICKEL_PLATE);
        blockItemHashMap.put(AdvAgriBlocks.ZINC_BLOCK,
            AdvAgriItems.ZINC_PLATE);
        blockItemHashMap.put(AdvAgriBlocks.STEEL_BLOCK,
            AdvAgriItems.STEEL_PLATE);
        blockItemHashMap.put(AdvAgriBlocks.TUNGSTEN_BLOCK,
            AdvAgriItems.TUNGSTEN_PLATE);
        blockItemHashMap.put(AdvAgriBlocks.TITANIUM_BLOCK,
            AdvAgriItems.TITANIUM_PLATE);
        blockItemHashMap.put(AdvAgriBlocks.TIN_BLOCK,
            AdvAgriItems.TIN_PLATE);

        blockItemHashMap.put(Blocks.GOLD_BLOCK, AdvAgriItems.GOLD_PLATE);
        blockItemHashMap.put(Blocks.IRON_BLOCK, AdvAgriItems.IRON_PLATE);
    }

    public boolean isBlockContained(Block block) {
        return blockHashSet.contains(block);
    }

    public Item getPlate(Block block) {
        return blockItemHashMap.get(block);
    }

    public static ForgingHammerUtil getINSTANCE() {
        return INSTANCE;
    }
}
