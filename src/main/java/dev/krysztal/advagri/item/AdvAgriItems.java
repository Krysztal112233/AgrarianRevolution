package dev.krysztal.advagri.item;

import dev.krysztal.advagri.foundation.AdvAgriConstants;
import dev.krysztal.advagri.foundation.AdvAgriFoodComponents;
import dev.krysztal.advagri.foundation.AdvAgriItemGroups;
import dev.krysztal.advagri.foundation.util.annotations.GenTypes;
import dev.krysztal.advagri.item.impls.BambooChopper;
import dev.krysztal.advagri.item.impls.BambooDrillRod;
import dev.krysztal.advagri.item.impls.Fertilizer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AdvAgriItems {

  @GenTypes
  public static Item FERTILIZER;

  @GenTypes
  public static Item POTASSIUM_SALT_POWDER;

  @GenTypes
  public static Item PLANT_ASH;

  @GenTypes
  public static Item BOTTLE_SMALL;

  @GenTypes
  public static Item BOTTLE_MEDIUM;

  @GenTypes
  public static Item BOTTLE_LARGE;

  @GenTypes
  public static Item SOLARIUM_BOTTLE_LARGE;

  @GenTypes
  public static Item SOLARIUM_BOTTLE_MEDIUM;

  @GenTypes
  public static Item SOLARIUM_BOTTLE_SMALL;

  @GenTypes
  public static Item BAMBOO_LEAVES;

  @GenTypes
  public static Item BAMBOO_SILK;

  @GenTypes
  public static Item BAMBOO_SILK_BOARD;

  @GenTypes
  public static Item BAMBOO_CHARCOAL;

  @GenTypes
  public static Item BAMBOO_CHARCOAL_BALL;

  public static Item BAMBOO_SAPLING;

  @GenTypes
  public static Item PHOS;

  @GenTypes
  public static Item VERMICULITE;

  @GenTypes
  public static Item SULFUR;

  @GenTypes
  public static BambooChopper BAMBOO_CHOPPER;

  //===================== Tools ===================//
  @GenTypes
  public static BambooDrillRod BAMBOO_DRILL_ROD;

  //================== "Seed" ====================//
  @GenTypes
  public static Item SEED_BAG_RICE;

  @GenTypes
  public static Item SEED_BAG_CHILI;

  @GenTypes
  public static Item SEED_BAG_CELERY;

  @GenTypes
  public static Item SEED_BAG_LETTUCE;

  @GenTypes
  public static Item SEED_BAG_STRAWBERRY;

  @GenTypes
  public static Item SEED_BAG_CORN;

  @GenTypes
  public static Item SWEET_POTATO_VINE;

  //========= Agricultural Products =============//
  @GenTypes
  public static Item RICE_UNHUSKED;

  @GenTypes
  public static Item RICE;

  @GenTypes
  public static Item PLANT_STRAW;

  @GenTypes
  public static Item SWEET_POTATO;

  @GenTypes
  public static Item CHILI;

  @GenTypes
  public static Item CELERY;

  @GenTypes
  public static Item LETTUCE;

  @GenTypes
  public static Item STRAWBERRY;

  @GenTypes
  public static Item GARLIC;

  @GenTypes
  public static Item WATER_CHESTNUT;

  @GenTypes
  public static Item SOLAR_BERRY;

  //================ Food =====================//
  @GenTypes
  public static Item ASPARAGUS;

  @GenTypes
  public static Item PEELED_BAMBOO_SAPLING;

  public static void init() {}

  static {
    FERTILIZER =
      registry(
        new Fertilizer(
          new FabricItemSettings()
            .group(AdvAgriItemGroups.ADV_AGRI_CORE_ITEM_GROUP)
        ),
        "fertilizer"
      );
    POTASSIUM_SALT_POWDER = registry(defaultItem(), "potassium_salt_powder");
    PLANT_ASH = registry(defaultItem(), "plant_ash");
    BOTTLE_SMALL = registry(defaultItem(), "bottle_small");
    BOTTLE_MEDIUM = registry(defaultItem(), "bottle_medium");
    BOTTLE_LARGE = registry(defaultItem(), "bottle_large");
    SOLARIUM_BOTTLE_SMALL = registry(defaultItem(), "solarium_bottle_small");
    SOLARIUM_BOTTLE_MEDIUM = registry(defaultItem(), "solarium_bottle_medium");
    SOLARIUM_BOTTLE_LARGE = registry(defaultItem(), "solarium_bottle_large");
    BAMBOO_LEAVES = registry(defaultItem(), "bamboo_leaves");
    BAMBOO_SILK = registry(defaultItem(), "bamboo_silk");
    BAMBOO_SILK_BOARD = registry(defaultItem(), "bamboo_silk_board");
    BAMBOO_CHARCOAL = registry(defaultItem(), "bamboo_charcoal");
    BAMBOO_CHARCOAL_BALL = registry(defaultItem(), "bamboo_charcoal_ball");
    BAMBOO_SAPLING = registry(defaultItem(), "bamboo_sapling");
    PHOS = registry(defaultItem(), "phos");
    VERMICULITE = registry(defaultItem(), "vermiculite");
    SULFUR = registry(defaultItem(), "sulfur");
  }

  static {
    SEED_BAG_RICE = registry(defaultItem(), "rice_seed_bag");
    SEED_BAG_CHILI = registry(defaultItem(), "chili_seed_bag");
    SEED_BAG_CELERY = registry(defaultItem(), "celery_seed_bag");
    SEED_BAG_LETTUCE = registry(defaultItem(), "lettuce_seed_bag");
    SEED_BAG_STRAWBERRY = registry(defaultItem(), "strawberry_seed_bag");
    SEED_BAG_CORN = registry(defaultItem(), "corn_seed_bag");
    SWEET_POTATO_VINE = registry(defaultItem(), "sweet_potato_vine");
    RICE_UNHUSKED = registry(defaultItem(), "rice_unhusked");
    RICE = registry(defaultItem(), "rice");
    PLANT_STRAW = registry(defaultItem(), "plant_straw");
    SWEET_POTATO = registry(defaultItem(), "sweet_potato");
    CHILI = registry(defaultItem(), "chili");
    CELERY = registry(defaultItem(), "celery");
    LETTUCE = registry(defaultItem(), "lettuce");
    STRAWBERRY = registry(defaultItem(), "strawberry");
    GARLIC = registry(defaultItem(), "garlic");
    WATER_CHESTNUT = registry(defaultItem(), "water_chestnut");

    SOLAR_BERRY = registry(defaultItem(), "solar_berry");

    BAMBOO_CHOPPER =
      registry(
        new BambooChopper(
          ToolMaterials.IRON,
          1,
          0F,
          new FabricItemSettings()
            .group(AdvAgriItemGroups.ADV_AGRI_CORE_ITEM_GROUP)
        ),
        "bamboo_chopper"
      );
    BAMBOO_DRILL_ROD =
      registry(
        new BambooDrillRod(
          new FabricItemSettings()
            .group(AdvAgriItemGroups.ADV_AGRI_CORE_ITEM_GROUP)
        ),
        "bamboo_drill_rod"
      );
  }

  static {
    ASPARAGUS =
      registry(
        new Item(
          new FabricItemSettings()
            .group(ItemGroup.FOOD)
            .food(AdvAgriFoodComponents.ASPARAGUS)
        ),
        "asparagus"
      );

    PEELED_BAMBOO_SAPLING =
      registry(
        new Item(
          new FabricItemSettings()
            .group(ItemGroup.FOOD)
            .food(AdvAgriFoodComponents.PEELED_BAMBOO_SAPLING)
        ),
        "peeled_bamboo_shoot"
      );
  }

  static {
    FuelRegistry.INSTANCE.add(BAMBOO_CHARCOAL_BALL, 80 * 20); //80s
    FuelRegistry.INSTANCE.add(BAMBOO_CHARCOAL, 20 * 20); //20s
    FuelRegistry.INSTANCE.add(BAMBOO_LEAVES, 2 * 20); //2s
  }

  private static <T extends Item> T registry(T item, String path) {
    Registry.register(
      Registry.ITEM,
      new Identifier(AdvAgriConstants.ADV_AGRI_NAMESPACE, path),
      item
    );
    return item;
  }

  private static Item defaultItem() {
    return new Item(
      new FabricItemSettings().group(AdvAgriItemGroups.ADV_AGRI_CORE_ITEM_GROUP)
    );
  }
}
