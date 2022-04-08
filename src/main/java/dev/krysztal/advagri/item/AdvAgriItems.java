package dev.krysztal.advagri.item;

import dev.krysztal.advagri.AdvAgriConstants;
import dev.krysztal.advagri.AdvAgriItemGroup;
import dev.krysztal.advagri.item.itemclass.BambooChopper;
import dev.krysztal.advagri.item.itemclass.BambooDrillRod;
import dev.krysztal.advagri.item.itemclass.ForgingHammer;
import dev.krysztal.advagri.item.itemclass.Wench;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class AdvAgriItems {


    public static Item COM_FERT;
    public static Item POTASSIUM_SALT_POWDER;
    public static Item PLANT_ASH;
    public static Item BOTTLE_SMALL;
    public static Item BOTTLE_MEDIUM;
    public static Item BOTTLE_LARGE;
    public static Item SOLARIUM_BOTTLE_LARGE;
    public static Item SOLARIUM_BOTTLE_MEDIUM;
    public static Item SOLARIUM_BOTTLE_SMALL;
    public static Item BAMBOO_LEAVES;
    public static Item BAMBOO_SILK;
    public static Item BAMBOO_SILK_BOARD;
    public static Item BAMBOO_CHARCOAL;
    public static Item BAMBOO_CHARCOAL_BALL;
    public static Item BAMBOO_SHOOT;
    public static Item PHOS;
    public static Item VERMICULITE;
    public static Item SULFUR;

    public static Item RAW_TIN;
    public static Item RAW_ZINC;
    public static Item RAW_ALUMINUM;
    public static Item RAW_LEAD;
    public static Item RAW_SILVER;
    public static Item RAW_NICKEL;
    public static Item RAW_TUNGSTEN;
    public static Item RAW_TITANIUM;

    public static Item TIN_INGOT;
    public static Item ZINC_INGOT;
    public static Item BRONZE_INGOT;
    public static Item ALUMINUM_INGOT;
    public static Item LEAD_INGOT;
    public static Item SILVER_INGOT;
    public static Item NICKEL_INGOT;
    public static Item STEEL_INGOT;
    public static Item TUNGSTEN_INGOT;
    public static Item TITANIUM_INGOT;


    public static Item TIN_POWDER;
    public static Item ZINC_POWDER;
    public static Item COPPER_POWDER;
    public static Item BRONZE_POWDER;
    public static Item ALUMINUM_POWDER;
    public static Item LEAD_POWDER;
    public static Item SILVER_POWDER;
    public static Item NICKEL_POWDER;
    public static Item STEEL_POWDER;
    public static Item TUNGSTEN_POWDER;
    public static Item TITANIUM_POWDER;
    public static Item IRON_POWDER;
    public static Item GOLD_POWDER;

    public static Item TIN_PLATE;
    public static Item ZINC_PLATE;
    public static Item COPPER_PLATE;
    public static Item BRONZE_PLATE;
    public static Item ALUMINUM_PLATE;
    public static Item LEAD_PLATE;
    public static Item SILVER_PLATE;
    public static Item NICKEL_PLATE;
    public static Item STEEL_PLATE;
    public static Item TUNGSTEN_PLATE;
    public static Item TITANIUM_PLATE;
    public static Item IRON_PLATE;
    public static Item GOLD_PLATE;

    public static Item TIN_GEAR;
    public static Item ZINC_GEAR;
    public static Item COPPER_GEAR;
    public static Item BRONZE_GEAR;
    public static Item ALUMINUM_GEAR;
    public static Item LEAD_GEAR;
    public static Item SILVER_GEAR;
    public static Item NICKEL_GEAR;
    public static Item STEEL_GEAR;
    public static Item TUNGSTEN_GEAR;
    public static Item TITANIUM_GEAR;
    public static Item IRON_GEAR;
    public static Item GOLD_GEAR;

    public static Item TIN_ROD;
    public static Item ZINC_ROD;
    public static Item COPPER_ROD;
    public static Item BRONZE_ROD;
    public static Item ALUMINUM_ROD;
    public static Item LEAD_ROD;
    public static Item SILVER_ROD;
    public static Item NICKEL_ROD;
    public static Item STEEL_ROD;
    public static Item TUNGSTEN_ROD;
    public static Item TITANIUM_ROD;
    public static Item IRON_ROD;
    public static Item GOLD_ROD;


    public static Item CRUSHED_TIN_ORE;
    public static Item CRUSHED_ZINC_ORE;
    public static Item CRUSHED_COPPER_ORE;
    public static Item CRUSHED_ALUMINUM_ORE;
    public static Item CRUSHED_LEAD_ORE;
    public static Item CRUSHED_SILVER_ORE;
    public static Item CRUSHED_NICKEL_ORE;
    public static Item CRUSHED_STEEL_ORE;
    public static Item CRUSHED_TUNGSTEN_ORE;
    public static Item CRUSHED_TITANIUM_ORE;
    public static Item CRUSHED_IRON_ORE;
    public static Item CRUSHED_GOLD_ORE;

    // Conductor Core
    public static Item COPPER_CONDUCTOR_CORE;
    public static Item SILVER_CONDUCTOR_CORE;
    public static Item TITANIUM_CONDUCTOR_CORE;

    //Machine Manufacturing Materials
    public static Item COPPER_COIL;
    public static Item ELECTRIC_MOTOR_SMALL;
    public static Item ELECTRIC_MOTOR_BIG;

    // Ore By-products
    public static Item MINERAL_MUD;
    public static Item CORASE_ORE_POWDER;
    public static BambooChopper BAMBOO_CHOPPER;
    // Tools
    public static Wench WENCH;
    public static BambooDrillRod BAMBOO_DRILL_ROD;
    // Plant "Seed"
    public static Item RICE_SEED_BAG;
    public static Item CHILI_SEED_BAG;
    public static Item CELERY_SEED_BAG;
    public static ForgingHammer FORGING_HAMMER;
    public static Item LETTUCE_SEED_BAG;
    public static Item STRAWBERRY_SEED_BAG;
    public static Item CORN_SEED_BAG;
    public static Item SWEET_POTATO_VINE;
    // Farming Product
    public static Item RICE_UNHUSKED;
    public static Item RICE;
    public static Item PLANT_STRAW;
    public static Item SWEET_POTATO;
    public static Item CHILI;
    public static Item CELERY;
    public static Item LETTUCE;
    public static Item STRAWBERRY;
    public static Item GARLIC;
    public static Item CHUFA;
    //Solar Bush
    public static Item SOLAR_BERRY;

    static {
        registry(COM_FERT =
                new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "com_fert");
        registry(POTASSIUM_SALT_POWDER = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "potassium_salt_powder");
        registry(PLANT_ASH = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "plant_ash");
        registry(BOTTLE_SMALL = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "bottle_small");
        registry(BOTTLE_MEDIUM = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "bottle_medium");
        registry(BOTTLE_LARGE = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "bottle_large");
        registry(SOLARIUM_BOTTLE_LARGE = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "solarium_bottle_large");
        registry(SOLARIUM_BOTTLE_MEDIUM = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "solarium_bottle_medium");
        registry(SOLARIUM_BOTTLE_SMALL = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "solarium_bottle_small");
        registry(BAMBOO_LEAVES = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "bamboo_leaves");
        registry(BAMBOO_SILK = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "bamboo_silk");
        registry(BAMBOO_SILK_BOARD = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "bamboo_silk_broad");
        registry(BAMBOO_CHARCOAL = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "bamboo_charcoal");
        registry(BAMBOO_CHARCOAL_BALL = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "bamboo_charcoal_ball");
        registry(BAMBOO_SHOOT = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "bamboo_shoot");
        registry(PHOS = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "phos");
        registry(VERMICULITE = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "vermiculite");
        registry(SULFUR = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "sulfur");
        registry(RAW_TIN = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "raw_tin");
        registry(RAW_ZINC = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "raw_zinc");
        registry(RAW_ALUMINUM = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "raw_aluminum");
        registry(RAW_LEAD = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "raw_lead");
        registry(RAW_SILVER = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "raw_silver");
        registry(RAW_NICKEL = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "raw_nickel");
        registry(RAW_TUNGSTEN = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "raw_tungsten");
        registry(RAW_TITANIUM = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "raw_titanium");
        registry(TIN_INGOT = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "tin_ingot");
        registry(ZINC_INGOT = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "zinc_ingot");
        registry(BRONZE_INGOT = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "bronze_ingot");
        registry(ALUMINUM_INGOT = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "aluminum_ingot");
        registry(LEAD_INGOT = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "lead_ingot");
        registry(SILVER_INGOT = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "silver_ingot");
        registry(NICKEL_INGOT = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "nickel_ingot");
        registry(STEEL_INGOT = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "steel_ingot");
        registry(TUNGSTEN_INGOT = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "tungsten_ingot");
        registry(TITANIUM_INGOT = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "titanium_ingot");
        registry(TIN_POWDER = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "tin_powder");
        registry(ZINC_POWDER = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "zinc_powder");
        registry(COPPER_POWDER = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "copper_powder");
        registry(BRONZE_POWDER = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "bronze_powder");
        registry(ALUMINUM_POWDER = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "aluminum_powder");
        registry(LEAD_POWDER = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "lead_powder");
        registry(SILVER_POWDER = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "silver_powder");
        registry(NICKEL_POWDER = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "nickel_powder");
        registry(STEEL_POWDER = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "steel_powder");
        registry(TUNGSTEN_POWDER = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "tungsten_powder");
        registry(TITANIUM_POWDER = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "titanium_powder");
        registry(IRON_POWDER = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "iron_powder");
        registry(GOLD_POWDER = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "gold_powder");
        registry(TIN_PLATE = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "tin_plate");
        registry(ZINC_PLATE = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "zinc_plate");
        registry(COPPER_PLATE = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "copper_plate");
        registry(BRONZE_PLATE = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "bronze_plate");
        registry(ALUMINUM_PLATE = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "aluminum_plate");
        registry(LEAD_PLATE = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "lead_plate");
        registry(SILVER_PLATE = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "silver_plate");
        registry(NICKEL_PLATE = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "nickel_plate");
        registry(STEEL_PLATE = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "steel_plate");
        registry(TUNGSTEN_PLATE = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "tungsten_plate");
        registry(TITANIUM_PLATE = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "titanium_plate");
        registry(IRON_PLATE = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "iron_plate");
        registry(GOLD_PLATE = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "gold_plate");
        registry(TIN_GEAR = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "tin_gear");
        registry(ZINC_GEAR = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "zinc_gear");
        registry(COPPER_GEAR = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "copper_gear");
        registry(BRONZE_GEAR = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "bronze_gear");
        registry(ALUMINUM_GEAR = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "aluminum_gear");
        registry(LEAD_GEAR = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "lead_gear");
        registry(SILVER_GEAR = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "silver_gear");
        registry(NICKEL_GEAR = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "nickel_gear");
        registry(STEEL_GEAR = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "steel_gear");
        registry(TUNGSTEN_GEAR = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "tungsten_gear");
        registry(TITANIUM_GEAR = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "titanium_gear");
        registry(IRON_GEAR = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "iron_gear");
        registry(GOLD_GEAR = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "gold_gear");
        registry(TIN_ROD = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "tin_rod");
        registry(ZINC_ROD = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "zinc_rod");
        registry(COPPER_ROD = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "copper_rpd");
        registry(BRONZE_ROD = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "bronze_rod");
        registry(ALUMINUM_ROD = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "aluminum_rod");
        registry(LEAD_ROD = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "lead_rod");
        registry(SILVER_ROD = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "silver_rod");
        registry(NICKEL_ROD = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "nickel_rod");
        registry(STEEL_ROD = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "steel_rod");
        registry(TUNGSTEN_ROD = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "tungsten_rod");
        registry(TITANIUM_ROD = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "titanium_row");
        registry(IRON_ROD = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "iron_rod");
        registry(GOLD_ROD = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "gold_rod");
        registry(CRUSHED_TIN_ORE = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "crushed_tin_ore");
        registry(CRUSHED_ZINC_ORE = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "crushed_zinc_ore");
        registry(CRUSHED_COPPER_ORE = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "crushed_copper_ore");
        registry(CRUSHED_ALUMINUM_ORE = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "crushed_aluminum_ore");
        registry(CRUSHED_LEAD_ORE = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "crushed_lead_ore");
        registry(CRUSHED_SILVER_ORE = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "crushed_silver_ore");
        registry(CRUSHED_NICKEL_ORE = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "crushed_nickel_ore");
        registry(CRUSHED_TUNGSTEN_ORE = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "crushed_tungsten_ore");
        registry(CRUSHED_TITANIUM_ORE = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "crushed_titanium_ore");
        registry(CRUSHED_IRON_ORE = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "crushed_iron_ore");
        registry(CRUSHED_GOLD_ORE = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "crushed_gold_ore");
        registry(COPPER_CONDUCTOR_CORE = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "copper_conductor_core");
        registry(SILVER_CONDUCTOR_CORE = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "silver_conductor_core");
        registry(TITANIUM_CONDUCTOR_CORE = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "titanium_conductor_core");
//        registry(COPPER_COIL = new Item(
//                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
//            "copper_coil");
        registry(ELECTRIC_MOTOR_SMALL = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "electric_motor_small");
        registry(ELECTRIC_MOTOR_BIG = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "electric_motor_big");
        registry(MINERAL_MUD = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "mineral_mud");
        registry(RICE_SEED_BAG = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "rice_seed_bag");
        registry(CHILI_SEED_BAG = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "chili_seed_bag");
        registry(CELERY_SEED_BAG = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "celery_seed_bag");
        registry(LETTUCE_SEED_BAG = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "lettuce_seed_bag");
        registry(STRAWBERRY_SEED_BAG = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "strawberry_seed_bag");
        registry(CORN_SEED_BAG = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "corn_seed_bag");
        registry(SWEET_POTATO_VINE = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "sweet_potato_vine");
        registry(RICE_UNHUSKED = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "rice_unhusked");
        registry(RICE = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "rice");
        registry(PLANT_STRAW = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "plant_straw");
        registry(SWEET_POTATO = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "sweet_potato");
        registry(CHILI = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "chili");
        registry(CELERY = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "celery");
        registry(LETTUCE = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "lettuce");
        registry(STRAWBERRY = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "strawberry");
        registry(GARLIC = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "garlic");
        registry(CHUFA = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "chufa");
        registry(SOLAR_BERRY = new Item(
                new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)),
            "solar_berry");
    }

    static {
        FuelRegistry.INSTANCE.add(BAMBOO_CHARCOAL_BALL, 80 * 20);
        FuelRegistry.INSTANCE.add(BAMBOO_CHARCOAL, 20 * 20);
        FuelRegistry.INSTANCE.add(BAMBOO_LEAVES, 2 * 20);
    }

    static {
        BAMBOO_CHOPPER = new BambooChopper(ToolMaterials.IRON, 1, 0F,
            new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP));
        WENCH = new Wench(
            new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP).maxCount(1));
        BAMBOO_DRILL_ROD = new BambooDrillRod(
            new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP));
        FORGING_HAMMER = new ForgingHammer(
            new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP).maxCount(1)
                .recipeRemainder(FORGING_HAMMER));
    }

    private static void registry(Item item, String path) {
        Registry.register(
            Registry.ITEM,
            new Identifier(AdvAgriConstants.ADV_AGRI_NAMESPACE, path),
            item);
    }
}
