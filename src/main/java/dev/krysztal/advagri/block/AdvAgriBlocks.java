package dev.krysztal.advagri.block;

import dev.krysztal.advagri.block.impls.BambooBundleBlock;
import dev.krysztal.advagri.block.impls.NetherSulphurOreBlock;
import dev.krysztal.advagri.block.impls.SulphurOreBlock;
import dev.krysztal.advagri.block.impls.crops.*;
import dev.krysztal.advagri.foundation.AdvAgriConstants;
import dev.krysztal.advagri.foundation.AdvAgriItemGroups;
import dev.krysztal.advagri.foundation.util.annotations.GenType;
import dev.krysztal.advagri.foundation.util.annotations.GenTypes;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AdvAgriBlocks {

  @GenTypes(
    types = {
      GenType.BlockModel, GenType.LootTableSimpleBlockType, GenType.MineShovel,
    }
  )
  public static Block ACIDIFIED_SOIL;

  @GenTypes(
    types = {
      GenType.BlockModel, GenType.LootTableSimpleBlockType, GenType.MineShovel,
    }
  )
  public static Block HARDENED_SOIL;

  @GenTypes(
    types = { GenType.BlockModel, GenType.MinePickaxe, GenType.MineLevel1 }
  )
  public static Block PHOS_ORE;

  @GenTypes(
    types = { GenType.BlockModel, GenType.MinePickaxe, GenType.MineLevel1 }
  )
  public static Block SULPHUR_ORE;

  @GenTypes(
    types = { GenType.BlockModel, GenType.MinePickaxe, GenType.MineLevel1 }
  )
  public static Block NETHER_SULPHUR_ORE;

  @GenTypes(types = { GenType.BlockModel, GenType.MineShovel })
  public static Block VERMICULITE_ORE;

  @GenTypes(types = { GenType.MineAxe })
  public static BambooBundleBlock BAMBOO_BUNDLE;

  //====================== Wood ====================//
  @GenTypes(
    types = {
      GenType.LootTableSimpleBlockType,
      GenType.MineAxe,
      GenType.SimpleBlockState,
    }
  )
  public static Block GINKGO_LOG;

  //====================== Stripped wood ==========//
  @GenTypes(
    types = {
      GenType.LootTableSimpleBlockType,
      GenType.MineAxe,
      GenType.SimpleBlockState,
    }
  )
  public static Block STRIPPED_GINKGO_LOG;

  //====================== Planks =================//
  @GenTypes(
    types = {
      GenType.LootTableSimpleBlockType,
      GenType.MineAxe,
      GenType.SimpleBlockState,
    }
  )
  public static Block GINKGO_PLANKS;

  //====================== Leaves =================//
  @GenTypes(types = { GenType.MineAxe, GenType.BlockModel })
  public static Block GINKGO_LEAVES;

  //================= Plants Blocks ===============//
  public static CornBlock CRON_BLOCK;
  public static GarlicBlock GARLIC_BLOCK;
  public static LettuceBlock LETTUCE_BLOCK;
  public static SolarBerryBlock SOLAR_BERRY_BLOCK;
  public static StrawBerryBlock STRAW_BERRY_BLOCK;
  public static SweetPotatoBlock SWEET_POTATO_BLOCK;
  public static WaterChestnutBlock WATER_CHESTNUT_BLOCK;

  public static void init() {
    ACIDIFIED_SOIL = registry(defaultBlock(Blocks.DIRT), "acidified_soil");
    HARDENED_SOIL = registry(defaultBlock(Blocks.DIRT), "hardened_soil");
    PHOS_ORE =
      registry(
        new Block(
          FabricBlockSettings
            .copyOf(Blocks.COAL_ORE)
            .luminance(8)
            .requiresTool()
        ),
        "phos_ore"
      );
    SULPHUR_ORE =
      registry(
        new SulphurOreBlock(
          FabricBlockSettings.copyOf(Blocks.COAL_ORE).requiresTool()
        ),
        "sulphur_ore"
      );
    NETHER_SULPHUR_ORE =
      registry(
        new NetherSulphurOreBlock(
          FabricBlockSettings.copyOf(Blocks.COAL_ORE).requiresTool()
        ),
        "nether_sulphur_ore"
      );
    VERMICULITE_ORE = registry(defaultBlock(Blocks.DIRT), "vermiculite_ore");
    BAMBOO_BUNDLE =
      registry(
        new BambooBundleBlock(
          FabricBlockSettings.of(Material.BAMBOO).ticksRandomly()
        ),
        "bamboo_bundle"
      );

    //====================== Wood ====================//
    GINKGO_LOG =
      registry(
        new Block(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).luminance(4)),
        "ginkgo_log"
      );

    //====================== Stripped wood ==========//
    STRIPPED_GINKGO_LOG =
      registry(
        new Block(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).luminance(4)),
        "stripped_ginkgo_log"
      );

    //====================== Planks =================//
    GINKGO_PLANKS =
      registry(
        new Block(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).luminance(4)),
        "ginkgo_planks"
      );

    //====================== Leaves =================//
    GINKGO_LEAVES =
      registry(
        new Block(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).luminance(4)),
        "ginkgo_leaves"
      );

    //================= Plants Blocks ===============//
    CRON_BLOCK =
      registryPlant(
        new CornBlock(FabricBlockSettings.copyOf(Blocks.CARROTS)),
        "cron_block"
      );

    GARLIC_BLOCK =
      registryPlant(
        new GarlicBlock(FabricBlockSettings.copyOf(Blocks.CARROTS)),
        "garlic_block"
      );

    LETTUCE_BLOCK =
      registryPlant(
        new LettuceBlock(AdvAgriCropBlock.CORN_SETTINGS),
        "lettuce_block"
      );

    SOLAR_BERRY_BLOCK =
      registryPlant(
        new SolarBerryBlock(AdvAgriCropBlock.CORN_SETTINGS),
        "solar_berry_block"
      );

    STRAW_BERRY_BLOCK =
      registryPlant(
        new StrawBerryBlock(AdvAgriCropBlock.CORN_SETTINGS),
        "strawberry_block"
      );

    SWEET_POTATO_BLOCK =
      registryPlant(
        new SweetPotatoBlock(AdvAgriCropBlock.CORN_SETTINGS),
        "sweet_potato_block"
      );

    WATER_CHESTNUT_BLOCK =
      registryPlant(
        new WaterChestnutBlock(AdvAgriCropBlock.CORN_SETTINGS),
        "water_chestnut_block"
      );
  }

  private static <T extends Block> T registry(T block, String path) {
    Registry.register(
      Registry.BLOCK,
      new Identifier(AdvAgriConstants.ADV_AGRI_NAMESPACE, path),
      block
    );
    Registry.register(
      Registry.ITEM,
      new Identifier(AdvAgriConstants.ADV_AGRI_NAMESPACE, path),
      new BlockItem(
        block,
        new FabricItemSettings()
          .group(AdvAgriItemGroups.ADV_AGRI_CORE_ITEM_GROUP)
      )
    );
    return block;
  }

  private static <T extends Block> T registryPlant(T block, String path) {
    Registry.register(
      Registry.BLOCK,
      new Identifier(AdvAgriConstants.ADV_AGRI_NAMESPACE, path),
      block
    );
    Registry.register(
      Registry.ITEM,
      new Identifier(AdvAgriConstants.ADV_AGRI_NAMESPACE, path),
      new BlockItem(block, new FabricItemSettings())
    );
    return block;
  }

  private static Block defaultBlock(Block block) {
    return defaultBlock(block, true);
  }

  private static Block defaultBlock(Block block, boolean requiresTool) {
    return requiresTool
      ? new Block(FabricBlockSettings.copyOf(block).requiresTool())
      : new Block(FabricBlockSettings.copyOf(block));
  }
}
