package dev.krysztal.advagri;

import dev.krysztal.advagri.block.AdvAgriBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import dev.krysztal.advagri.item.AdvAgriItems;
import dev.krysztal.advagri.item.armors.AdvAgriArmors;

public class AdvAgriItemGroup {

    public static final ItemGroup ADV_AGRI_TOOL_ITEM_GROUP = FabricItemGroupBuilder.build(
        new Identifier("adv_agri_core", "agriculture_tool_and_armors"),
        () -> new ItemStack(AdvAgriArmors.BAMBOO_HELMET));
    public static final ItemGroup ADV_AGRI_CORE_ITEM_GROUP = FabricItemGroupBuilder.build(
        new Identifier("adv_agri_core", "agriculture"),
        () -> new ItemStack(AdvAgriItems.BAMBOO_LEAVES));
    public static final ItemGroup ADV_AGRI_WORLD_ITEM_GROUP = FabricItemGroupBuilder.build(
        new Identifier("adv_agri_core", "agriculture_world"),
        () -> new ItemStack(AdvAgriBlocks.TITANIUM_BLOCK));
}
