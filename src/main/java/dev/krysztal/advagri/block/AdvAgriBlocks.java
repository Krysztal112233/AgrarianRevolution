package dev.krysztal.advagri.block;

import dev.krysztal.advagri.AdvAgriConstants;
import dev.krysztal.advagri.AdvAgriItemGroup;
import dev.krysztal.advagri.block.impls.BambooBlock;
import dev.krysztal.advagri.block.impls.machines.*;
import dev.krysztal.advagri.block.impls.ores.NetherSulphurOre;
import dev.krysztal.advagri.block.impls.ores.SulphurOre;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AdvAgriBlocks {

    // MetalOre
    public static Block TIN_ORE;
    public static Block ZINC_ORE;
    public static Block ALUMINUM_ORE;
    public static Block LEAD_ORE;
    public static Block SILVER_ORE;
    public static Block NICKEL_ORE;
    public static Block TUNGSTEN_ORE;
    public static Block TITANIUM_ORE;
    public static Block TIN_BLOCK;
    public static Block ZINC_BLOCK;
    public static Block BRONZE_BLOCK;
    public static Block ALUMINUM_BLOCK;
    public static Block LEAD_BLOCK;
    public static Block SILVER_BLOCK;
    public static Block NICKEL_BLOCK;
    public static Block STEEL_BLOCK;
    public static Block TUNGSTEN_BLOCK;
    public static Block TITANIUM_BLOCK;
    public static Block COPPER_CABLE;
    public static Block TIN_CABLE;
    public static Block SILVER_CABLE;
    public static Block GOLD_CABLE;
    // OtherOre
    public static Block PHOS_ORE;
    public static Block SULPHUR_ORE;
    public static Block NETHER_SULPHUR_ORE;
    public static BambooBlock BAMBOO_BLOCK;
    public static Block VERMICULITE_ORE;
    // Machine blocks
    public static MachineShell MACHINE_SHELL;
    public static ACT ACT;
    public static FermentTank FERMENT_TANK;
    public static BurningTank BURNING_TANK;
    public static SLMachine SLMACHINE;
    public static SHTEMachine SHTEMachine;
    public static Crusher CRUSHER;
    public static Extractor EXTRACTOR;
    public static Centrifuge CENTRIFUGE;
    public static OreWashingMachine ORE_WASHING_MACHINE;
    public static ResinExtractor RESIN_EXTRACTOR;

    static {
        COPPER_CABLE = registry(new Block(FabricBlockSettings.copyOf(Blocks.BAMBOO).requiresTool()), "copper_cable");
        TIN_CABLE = registry(new Block(FabricBlockSettings.copyOf(Blocks.BAMBOO).requiresTool()), "tin_cable");
        SILVER_CABLE = registry(new Block(FabricBlockSettings.copyOf(Blocks.BAMBOO).requiresTool()), "silver_cable");
        GOLD_CABLE = registry(new Block(FabricBlockSettings.copyOf(Blocks.BAMBOO).requiresTool()), "gold_cable");
        SILVER_ORE = registry(new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE).requiresTool()), "silver_ore");
        NICKEL_ORE = registry(new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE).requiresTool()), "nickel_ore");
        TUNGSTEN_ORE = registry(new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool()), "tungsten_ore");
        TITANIUM_ORE = registry(new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool()), "titanium_ore");
        ALUMINUM_ORE = registry(new Block(FabricBlockSettings.copyOf(Blocks.COAL_ORE).requiresTool()), "aluminum_ore");
        LEAD_ORE = registry(new Block(FabricBlockSettings.copyOf(Blocks.COAL_ORE).requiresTool()), "lead_ore");
        TIN_ORE = registry(new Block(FabricBlockSettings.copyOf(Blocks.COAL_ORE).requiresTool()), "tin_ore");
        ZINC_ORE = registry(new Block(FabricBlockSettings.copyOf(Blocks.COAL_ORE).requiresTool()), "zinc_ore");
        TIN_BLOCK = registry(new Block(FabricBlockSettings.copyOf(Blocks.COAL_BLOCK).requiresTool()), "tin_block");
        ZINC_BLOCK = registry(new Block(FabricBlockSettings.copyOf(Blocks.COAL_BLOCK).requiresTool()), "zinc_block");
        BRONZE_BLOCK = registry(new Block(FabricBlockSettings.copyOf(Blocks.COAL_BLOCK).requiresTool()), "bronze_block");
        ALUMINUM_BLOCK = registry(new Block(FabricBlockSettings.copyOf(Blocks.COAL_BLOCK).requiresTool()), "aluminum_block");
        LEAD_BLOCK = registry(new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool()), "lead_block");
        SILVER_BLOCK = registry(new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool()), "silver_block");
        NICKEL_BLOCK = registry(new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool()), "nickel_block");
        STEEL_BLOCK = registry(new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool()), "steel_block");
        TUNGSTEN_BLOCK = registry(new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool()), "tungsten_block");
        TITANIUM_BLOCK = registry(new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool()), "titanium_block");

        PHOS_ORE = registry(new Block(FabricBlockSettings.copyOf(Blocks.COAL_ORE).requiresTool()), "phos_ore");
        SULPHUR_ORE = registry(new SulphurOre(FabricBlockSettings.copyOf(Blocks.COAL_ORE).requiresTool()), "sulphur_ore");
        NETHER_SULPHUR_ORE = registry(new NetherSulphurOre(FabricBlockSettings.copyOf(Blocks.COAL_ORE).requiresTool()), "nether_sulphur_ore");
        BAMBOO_BLOCK = registry(new BambooBlock(FabricBlockSettings.of(Material.BAMBOO)), "bamboo_block");
        VERMICULITE_ORE = registry(new Block(FabricBlockSettings.copyOf(Blocks.DIRT)), "vermiculite_ore");
        MACHINE_SHELL = registry(new MachineShell(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)), "machine_shell");
        ACT = registry(new ACT(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)), "advanced_crafting_table");
        FERMENT_TANK = registry(new FermentTank(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)), "ferment_tank");
        BURNING_TANK = registry(new BurningTank(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)), "burning_tank");
        SLMACHINE = registry(new SLMachine(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)), "sunshine_liquefies_machine");
        SHTEMachine = registry(new SHTEMachine(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)), "solar_high_temperature_electrolyze_machine");
        CRUSHER = registry(new Crusher(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)), "crusher");
        EXTRACTOR = registry(new Extractor(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)), "extractor");
        CENTRIFUGE = registry(new Centrifuge(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)), "centrifuge");
        ORE_WASHING_MACHINE = registry(new OreWashingMachine(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)), "ore_washing_machine");
        RESIN_EXTRACTOR = registry(new ResinExtractor(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)), "resin_extractor");


    }

    private static <T extends Block> T registry(T block, String path) {
        Registry.register(Registry.BLOCK, new Identifier(AdvAgriConstants.ADV_AGRI_NAMESPACE, path), block);
        Registry.register(Registry.ITEM, new Identifier(AdvAgriConstants.ADV_AGRI_NAMESPACE, path), new BlockItem(block, new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_WORLD_ITEM_GROUP)));
        return block;
    }
}
