package dev.krysztal.advagri.block;

import dev.krysztal.advagri.foundation.AdvAgriConstants;
import dev.krysztal.advagri.foundation.AdvAgriItemGroup;
import dev.krysztal.advagri.foundation.util.annotations.GenType;
import dev.krysztal.advagri.foundation.util.annotations.GenTypes;
import dev.krysztal.advagri.block.impls.BambooBundleBlock;
import dev.krysztal.advagri.block.impls.NetherSulphurOreBlock;
import dev.krysztal.advagri.block.impls.SulphurOreBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AdvAgriBlocks {
    @GenTypes(types = {GenType.BlockModel, GenType.LootTableSimpleBlockType, GenType.MineShovel})
    public static final Block ACIDIFIED_SOIL;
    @GenTypes(types = {GenType.BlockModel, GenType.LootTableSimpleBlockType, GenType.MineShovel})
    public static final Block HARDENED_SOIL;
    @GenTypes(types = {GenType.BlockModel, GenType.MineLevel1})
    public static final Block PHOS_ORE;
    @GenTypes(types = {GenType.BlockModel, GenType.MineLevel1})
    public static final Block SULPHUR_ORE;
    @GenTypes(types = {GenType.BlockModel, GenType.MineLevel1})
    public static final Block NETHER_SULPHUR_ORE;

    @GenTypes(types = {GenType.MineAxe})
    public static final BambooBundleBlock BAMBOO_BUNDLE;
    @GenTypes(types = {GenType.BlockModel, GenType.MineShovel})
    public static final Block VERMICULITE_ORE;

    static {
        ACIDIFIED_SOIL = registry(new Block(FabricBlockSettings.copyOf(Blocks.DIRT)), "acidified_soil");
        HARDENED_SOIL = registry(new Block(FabricBlockSettings.copyOf(Blocks.DIRT)), "hardened_soil");
        PHOS_ORE = registry(new Block(FabricBlockSettings.copyOf(Blocks.COAL_ORE).luminance(8).requiresTool()), "phos_ore");
        SULPHUR_ORE = registry(new SulphurOreBlock(FabricBlockSettings.copyOf(Blocks.COAL_ORE).requiresTool()), "sulphur_ore");
        NETHER_SULPHUR_ORE = registry(new NetherSulphurOreBlock(FabricBlockSettings.copyOf(Blocks.COAL_ORE).requiresTool()), "nether_sulphur_ore");
        BAMBOO_BUNDLE = registry(new BambooBundleBlock(FabricBlockSettings.of(Material.BAMBOO).ticksRandomly()), "bamboo_bundle");
        VERMICULITE_ORE = registry(new Block(FabricBlockSettings.copyOf(Blocks.DIRT)), "vermiculite_ore");
    }

    private static <T extends Block> T registry(T block, String path) {
        Registry.register(Registry.BLOCK, new Identifier(AdvAgriConstants.ADV_AGRI_NAMESPACE, path), block);
        Registry.register(Registry.ITEM, new Identifier(AdvAgriConstants.ADV_AGRI_NAMESPACE, path), new BlockItem(block, new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)));
        return block;
    }
}
