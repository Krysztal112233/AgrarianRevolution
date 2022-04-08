package dev.krysztal.advagri.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import dev.krysztal.advagri.AdvAgriConstants;
import dev.krysztal.advagri.AdvAgriItemGroup;
import dev.krysztal.advagri.block.blocks.BambooBlock;
import dev.krysztal.advagri.block.blocks.machines.ACT;
import dev.krysztal.advagri.block.blocks.machines.BurningTank;
import dev.krysztal.advagri.block.blocks.machines.Centrifuge;
import dev.krysztal.advagri.block.blocks.machines.Crusher;
import dev.krysztal.advagri.block.blocks.machines.Extractor;
import dev.krysztal.advagri.block.blocks.machines.FermentTank;
import dev.krysztal.advagri.block.blocks.machines.MachineShell;
import dev.krysztal.advagri.block.blocks.machines.OreWashingMachine;
import dev.krysztal.advagri.block.blocks.machines.ResinExtractor;
import dev.krysztal.advagri.block.blocks.machines.SHTEMachine;
import dev.krysztal.advagri.block.blocks.machines.SLMachine;
import dev.krysztal.advagri.block.blocks.ores.NetherSulphurOre;
import dev.krysztal.advagri.block.blocks.ores.SulphurOre;

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
        registry(
            COPPER_CABLE =
                new Block(FabricBlockSettings.copyOf(Blocks.BAMBOO).requiresTool()),
            "copper_cable");
        registry(
            TIN_CABLE =
                new Block(FabricBlockSettings.copyOf(Blocks.BAMBOO).requiresTool()),
            "tin_cable");
        registry(SILVER_CABLE =
                new Block(FabricBlockSettings.copyOf(Blocks.BAMBOO).requiresTool()),
            "silver_cable");
        registry(
            GOLD_CABLE =
                new Block(FabricBlockSettings.copyOf(Blocks.BAMBOO).requiresTool()),
            "gold_cable");
        registry(
            SILVER_ORE =
                new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE).requiresTool()),
            "silver_ore");
        registry(
            NICKEL_ORE =
                new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE).requiresTool()),
            "nickel_ore");
        registry(
            TUNGSTEN_ORE =
                new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool()),
            "tungsten_ore");
        registry(
            TITANIUM_ORE =
                new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool()),
            "titanium_ore");
        registry(
            ALUMINUM_ORE =
                new Block(FabricBlockSettings.copyOf(Blocks.COAL_ORE).requiresTool()),
            "aluminum_ore");
        registry(
            LEAD_ORE =
                new Block(FabricBlockSettings.copyOf(Blocks.COAL_ORE).requiresTool()),
            "lead_ore");
        registry(
            TIN_ORE =
                new Block(FabricBlockSettings.copyOf(Blocks.COAL_ORE).requiresTool()),
            "tin_ore");
        registry(
            ZINC_ORE =
                new Block(FabricBlockSettings.copyOf(Blocks.COAL_ORE).requiresTool()),
            "zinc_ore");
        registry(
            TIN_BLOCK =
                new Block(FabricBlockSettings.copyOf(Blocks.COAL_BLOCK).requiresTool()),
            "tin_block");
        registry(
            ZINC_BLOCK =
                new Block(FabricBlockSettings.copyOf(Blocks.COAL_BLOCK).requiresTool()),
            "zinc_block");
        registry(
            BRONZE_BLOCK =
                new Block(FabricBlockSettings.copyOf(Blocks.COAL_BLOCK).requiresTool()),
            "bronze_block");
        registry(
            ALUMINUM_BLOCK =
                new Block(FabricBlockSettings.copyOf(Blocks.COAL_BLOCK).requiresTool()),
            "aluminum_block");
        registry(
            LEAD_BLOCK =
                new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool()),
            "lead_block");
        registry(
            SILVER_BLOCK =
                new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool()),
            "silver_block");
        registry(
            NICKEL_BLOCK =
                new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool()),
            "nickel_block");
        registry(
            STEEL_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool()),
            "steel_block");
        registry(
            TUNGSTEN_BLOCK =
                new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool()),
            "tungsten_block");
        registry(
            TITANIUM_BLOCK =
                new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool()),
            "titanium_block");

        registry(
            PHOS_ORE =
                new Block(FabricBlockSettings.copyOf(Blocks.COAL_ORE).requiresTool()),
            "phos_ore");
        registry(
            SULPHUR_ORE =
                new SulphurOre(FabricBlockSettings.copyOf(Blocks.COAL_ORE).requiresTool()),
            "sulphur_ore");
        registry(
            NETHER_SULPHUR_ORE =
                new NetherSulphurOre(
                    FabricBlockSettings.copyOf(Blocks.COAL_ORE).requiresTool()),
            "nether_sulphur_ore");
        registry(
            BAMBOO_BLOCK =
                new BambooBlock(FabricBlockSettings.of(Material.BAMBOO)),
            "bamboo_block");
        registry(
            VERMICULITE_ORE =
                new Block(FabricBlockSettings.copyOf(Blocks.DIRT)),
            "vermiculite_ore");
        registry(
            MACHINE_SHELL =
                new MachineShell(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            "machine_shell");
        registry(
            ACT =
                new ACT(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            "advanced_crafting_table");
        registry(
            FERMENT_TANK =
                new FermentTank(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            "ferment_tank");
        registry(
            BURNING_TANK =
                new BurningTank(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            "burning_tank");
        registry(
            SLMACHINE =
                new SLMachine(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            "sunshine_liquefies_machine");
        registry(
            SHTEMachine =
                new SHTEMachine(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            "solar_high_temperature_electrolyze_machine");
        registry(
            CRUSHER =
                new Crusher(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            "crusher");
        registry(
            EXTRACTOR =
                new Extractor(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            "extractor");
        registry(
            CENTRIFUGE =
                new Centrifuge(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            "centrifuge");
        registry(ORE_WASHING_MACHINE = new OreWashingMachine(
                FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            "ore_washing_machine");
        registry(
            RESIN_EXTRACTOR =
                new ResinExtractor(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            "resin_extractor");


    }

    private static void registry(Block block, String path) {
        Registry.register(
            Registry.BLOCK,
            new Identifier(AdvAgriConstants.ADV_AGRI_NAMESPACE, path),
            block
        );
        Registry.register(
            Registry.ITEM,
            new Identifier(AdvAgriConstants.ADV_AGRI_NAMESPACE, path),
            new BlockItem(block,
                new FabricItemSettings()
                    .group(AdvAgriItemGroup.ADV_AGRI_WORLD_ITEM_GROUP)
            )
        );

    }
}
