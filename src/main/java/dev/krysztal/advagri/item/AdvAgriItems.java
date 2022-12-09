package dev.krysztal.advagri.item;

import com.tterrag.registrate.util.entry.RegistryEntry;
import dev.krysztal.advagri.block.AdvAgriBlocks;
import dev.krysztal.advagri.foundation.AdvAgriConstants;
import dev.krysztal.advagri.foundation.AdvAgriFoodComponents;
import dev.krysztal.advagri.foundation.AdvAgriItemGroups;
import dev.krysztal.advagri.foundation.AdvAgriRegistrates;
import dev.krysztal.advagri.foundation.annotation.GenTypes;
import dev.krysztal.advagri.item.impls.BambooChopper;
import dev.krysztal.advagri.item.impls.BambooDrillRod;
import dev.krysztal.advagri.item.impls.Fertilizer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AdvAgriItems {

  public static RegistryEntry<Fertilizer> FERTILIZER;
  public static RegistryEntry<Item> POTASSIUM_SALT_POWDER;
  public static RegistryEntry<Item> PLANT_ASH;
  public static RegistryEntry<Item> BOTTLE_SMALL;
  public static RegistryEntry<Item> BOTTLE_MEDIUM;
  public static RegistryEntry<Item> BOTTLE_LARGE;
  public static RegistryEntry<Item> SOLARIUM_BOTTLE_LARGE;
  public static RegistryEntry<Item> SOLARIUM_BOTTLE_MEDIUM;
  public static RegistryEntry<Item> SOLARIUM_BOTTLE_SMALL;
  public static RegistryEntry<Item> BAMBOO_LEAVES;
  public static RegistryEntry<Item> BAMBOO_SILK;
  public static RegistryEntry<Item> BAMBOO_SILK_BOARD;
  public static RegistryEntry<Item> BAMBOO_CHARCOAL;
  public static RegistryEntry<Item> BAMBOO_CHARCOAL_BALL;

  public static RegistryEntry<Item> BAMBOO_SAPLING;
  public static RegistryEntry<Item> PHOS;
  public static RegistryEntry<Item> VERMICULITE;
  public static RegistryEntry<Item> SULFUR;
  public static RegistryEntry<BambooChopper> BAMBOO_CHOPPER;

  //===================== Tools ===================/
  public static RegistryEntry<BambooDrillRod> BAMBOO_DRILL_ROD;

  //================== "Seed" ====================/
  public static RegistryEntry<AliasedBlockItem> SEED_BAG_RICE;
  public static RegistryEntry<AliasedBlockItem> SEED_BAG_CHILI;
  public static RegistryEntry<AliasedBlockItem> SEED_BAG_CELERY;
  public static RegistryEntry<AliasedBlockItem> SEED_BAG_LETTUCE;
  public static RegistryEntry<AliasedBlockItem> SEED_BAG_STRAWBERRY;
  public static RegistryEntry<AliasedBlockItem> SEED_BAG_CORN;
  public static RegistryEntry<AliasedBlockItem> SEED_BAG_SWEET_POTATO_BEAN;

  //========= Agricultural Products =============/
  public static RegistryEntry<Item> RICE_UNHUSKED;
  public static RegistryEntry<Item> RICE;
  public static RegistryEntry<Item> CHILI;
  public static RegistryEntry<Item> CELERY;
  public static RegistryEntry<Item> LETTUCE;
  public static RegistryEntry<Item> STRAWBERRY;
  public static RegistryEntry<Item> GARLIC;
  public static RegistryEntry<AliasedBlockItem> WATER_CHESTNUT;
  public static RegistryEntry<Item> STRAW;

  //================ Food =====================/
  public static RegistryEntry<Item> ASPARAGUS;
  public static RegistryEntry<Item> PEELED_BAMBOO_SAPLING;
  public static RegistryEntry<Item> SOLAR_BERRY;
  public static RegistryEntry<Item> SWEET_POTATO;
  public static RegistryEntry<Item> ACORNS;
  public static RegistryEntry<Item> ROASTED_ACORNS;

  public static void init() {}

  static {
    FERTILIZER =
      AdvAgriRegistrates.ITEM_REGISTRATE
        .item("fertilizer", Fertilizer::new)
        .tab(() -> AdvAgriItemGroups.ADV_AGRI_CORE_ITEM_GROUP)
        .register();

    POTASSIUM_SALT_POWDER = defaultItemRegistry("potassium_salt_powder");
    PLANT_ASH = defaultItemRegistry("plant_ash");
    BOTTLE_SMALL = defaultItemRegistry("bottle_small");
    BOTTLE_MEDIUM = defaultItemRegistry("bottle_medium");
    BOTTLE_LARGE = defaultItemRegistry("bottle_large");
    SOLARIUM_BOTTLE_SMALL = defaultItemRegistry("solarium_bottle_small");
    SOLARIUM_BOTTLE_MEDIUM = defaultItemRegistry("solarium_bottle_medium");
    SOLARIUM_BOTTLE_LARGE = defaultItemRegistry("solarium_bottle_large");
    BAMBOO_LEAVES = defaultItemRegistry("bamboo_leaves");
    BAMBOO_SILK = defaultItemRegistry("bamboo_silk");
    BAMBOO_SILK_BOARD = defaultItemRegistry("bamboo_silk_board");
    BAMBOO_CHARCOAL = defaultItemRegistry("bamboo_charcoal");
    BAMBOO_CHARCOAL_BALL = defaultItemRegistry("bamboo_charcoal_ball");
    BAMBOO_SAPLING = defaultItemRegistry("bamboo_sapling");
    PHOS = defaultItemRegistry("phos");
    VERMICULITE = defaultItemRegistry("vermiculite");
    SULFUR = defaultItemRegistry("sulfur");
  }

  static {
    SEED_BAG_RICE = registryAliased("rice_seed_bag", AdvAgriBlocks.RICE_BLOCK);
    SEED_BAG_CHILI =
      registryAliased("chili_seed_bag", AdvAgriBlocks.CHILI_BLOCK);
    SEED_BAG_CELERY =
      registryAliased("celery_seed_bag", AdvAgriBlocks.CELERY_BLOCK);
    SEED_BAG_LETTUCE =
      registryAliased("lettuce_seed_bag", AdvAgriBlocks.LETTUCE_BLOCK);
    SEED_BAG_STRAWBERRY =
      registryAliased("strawberry_seed_bag", AdvAgriBlocks.STRAW_BERRY_BLOCK);
    SEED_BAG_CORN = registryAliased("corn_seed_bag", AdvAgriBlocks.CRON_BLOCK);
    SEED_BAG_SWEET_POTATO_BEAN =
      registryAliased(
        "sweet_potato_bean_seed_bag",
        AdvAgriBlocks.SWEET_POTATO_BLOCK
      );
  }

  static {
    RICE = defaultItemRegistry("rice");
    RICE_UNHUSKED = defaultItemRegistry("rice_unhusked");
    CHILI = defaultItemRegistry("chili");
    CELERY = defaultItemRegistry("celery");
    LETTUCE = defaultItemRegistry("lettuce");
    STRAWBERRY = defaultItemRegistry("strawberry");
    GARLIC = defaultItemRegistry("garlic");
    WATER_CHESTNUT =
      registryAliased("water_chestnut", AdvAgriBlocks.WATER_CHESTNUT_BLOCK);
    STRAW = defaultItemRegistry("straw");
  }

  static {
    BAMBOO_CHOPPER =
      AdvAgriRegistrates.ITEM_REGISTRATE
        .item(
          "bamboo_chopper",
          $ ->
            new BambooChopper(
              ToolMaterials.IRON,
              1,
              0F,
              new FabricItemSettings()
                .group(AdvAgriItemGroups.ADV_AGRI_CORE_ITEM_GROUP)
            )
        )
        .tab(() -> AdvAgriItemGroups.ADV_AGRI_CORE_ITEM_GROUP)
        .register();

    BAMBOO_DRILL_ROD =
      AdvAgriRegistrates.ITEM_REGISTRATE
        .item("bamboo_drill_rod", BambooDrillRod::new)
        .tab(() -> AdvAgriItemGroups.ADV_AGRI_CORE_ITEM_GROUP)
        .register();
  }

  static {
    ASPARAGUS =
      defaultFoodRegistry("asparagus", AdvAgriFoodComponents.ASPARAGUS);

    PEELED_BAMBOO_SAPLING =
      defaultFoodRegistry(
        "peeled_bamboo_shoot",
        AdvAgriFoodComponents.PEELED_BAMBOO_SAPLING
      );

    SWEET_POTATO =
      defaultFoodRegistry("sweet_potato", AdvAgriFoodComponents.SWEET_POTATO);

    SOLAR_BERRY =
      defaultFoodRegistry("solar_berry", AdvAgriFoodComponents.SOLAR_BERRY);

    ACORNS = defaultFoodRegistry("acorns", FoodComponents.DRIED_KELP);

    ROASTED_ACORNS =
      defaultFoodRegistry(
        "roasted_acorns",
        AdvAgriFoodComponents.ROASTED_ACORNS
      );
  }

  static {
    FuelRegistry.INSTANCE.add(BAMBOO_CHARCOAL_BALL.get(), 80 * 20); //80s
    FuelRegistry.INSTANCE.add(BAMBOO_CHARCOAL.get(), 20 * 20); //20s
    FuelRegistry.INSTANCE.add(BAMBOO_LEAVES.get(), 2 * 20); //2s
  }

  private static RegistryEntry<AliasedBlockItem> registryAliased(
    String path,
    Block aliasedBlock
  ) {
    return AdvAgriRegistrates.ITEM_REGISTRATE
      .item(path, s -> new AliasedBlockItem(aliasedBlock, s))
      .tab(() -> AdvAgriItemGroups.ADV_AGRI_CORE_ITEM_GROUP)
      .register();
  }

  private static RegistryEntry<Item> defaultItemRegistry(String path) {
    return AdvAgriRegistrates.ITEM_REGISTRATE
      .item(path, Item::new)
      .tab(() -> AdvAgriItemGroups.ADV_AGRI_CORE_ITEM_GROUP)
      .register();
  }

  private static RegistryEntry<Item> defaultFoodRegistry(
    String path,
    FoodComponent foodComponent
  ) {
    return AdvAgriRegistrates.ITEM_REGISTRATE
      .item(path, s -> new Item(s.food(foodComponent)))
      .tab(() -> AdvAgriItemGroups.ADV_AGRI_CORE_ITEM_GROUP)
      .register();
  }
}
