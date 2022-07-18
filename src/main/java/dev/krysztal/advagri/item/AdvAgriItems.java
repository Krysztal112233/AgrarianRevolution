package dev.krysztal.advagri.item;

import dev.krysztal.advagri.AdvAgriConstants;
import dev.krysztal.advagri.AdvAgriItemGroup;
import dev.krysztal.advagri.item.impls.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class AdvAgriItems {


    public static Item FERTILIZER;
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

    public static Item INGOT_TIN;
    public static Item INGOT_ZINC;
    public static Item INGOT_BRONZE;
    public static Item INGOT_ALUMINUM;
    public static Item INGOT_LEAD;
    public static Item INGOT_SILVER;
    public static Item INGOT_NICKEL;
    public static Item INGOT_STEEL;
    public static Item INGOT_TUNGSTEN;
    public static Item INGOT_TITANIUM;


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
    public static BambooChopper BAMBOO_CHOPPER;

    // Tools
    public static Wrench Wrench;
    public static BambooDrillRod BAMBOO_DRILL_ROD;
    public static ForgingHammer FORGING_HAMMER;

    // Plant "Seed"
    public static Item SEED_BAG_RICE;
    public static Item SEED_BAG_CHILI;
    public static Item SEED_BAG_CELERY;
    public static Item SEED_BAG_LETTUCE;
    public static Item SEED_BAG_STRAWBERRY;
    public static Item SEED_BAG_CORN;
    public static Item SWEET_POTATO_VINE;

    // Crops
    public static Item RICE_UNHUSKED;
    public static Item RICE;
    public static Item PLANT_STRAW;
    public static Item SWEET_POTATO;
    public static Item CHILI;
    public static Item CELERY;
    public static Item LETTUCE;
    public static Item STRAWBERRY;
    public static Item GARLIC;
    public static Item WATER_CHESTNUT;

    // Bushes
    public static Item SOLAR_BERRY;


    static {
        FERTILIZER = registry(new Fertilizer(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "fertilizer");
        POTASSIUM_SALT_POWDER = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "potassium_salt_powder");
        PLANT_ASH = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "plant_ash");
        BOTTLE_SMALL = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "bottle_small");
        BOTTLE_MEDIUM = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "bottle_medium");
        BOTTLE_LARGE = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "bottle_large");
        SOLARIUM_BOTTLE_SMALL = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "solarium_bottle_small");
        SOLARIUM_BOTTLE_MEDIUM = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "solarium_bottle_medium");
        SOLARIUM_BOTTLE_LARGE = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "solarium_bottle_large");
        BAMBOO_LEAVES = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "bamboo_leaves");
        BAMBOO_SILK = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "bamboo_silk");
        BAMBOO_SILK_BOARD = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "bamboo_silk_board");
        BAMBOO_CHARCOAL = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "bamboo_charcoal");
        BAMBOO_CHARCOAL_BALL = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "bamboo_charcoal_ball");
        BAMBOO_SHOOT = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "bamboo_shoot");
        PHOS = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "phos");
        VERMICULITE = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "vermiculite");
        SULFUR = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "sulfur");

        RAW_TIN = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "raw_tin");
        RAW_ZINC = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "raw_zinc");
        RAW_ALUMINUM = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "raw_aluminum");
        RAW_LEAD = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "raw_lead");
        RAW_SILVER = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "raw_silver");
        RAW_NICKEL = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "raw_nickel");
        RAW_TUNGSTEN = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "raw_tungsten");
        RAW_TITANIUM = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "raw_titanium");

        INGOT_TIN = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "tin_ingot");
        INGOT_ZINC = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "zinc_ingot");
        INGOT_BRONZE = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "bronze_ingot");
        INGOT_ALUMINUM = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "aluminum_ingot");
        INGOT_LEAD = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "lead_ingot");
        INGOT_SILVER = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "silver_ingot");
        INGOT_NICKEL = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "nickel_ingot");
        INGOT_STEEL = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "steel_ingot");
        INGOT_TUNGSTEN = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "tungsten_ingot");
        INGOT_TITANIUM = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "titanium_ingot");

        TIN_POWDER = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "tin_powder");
        ZINC_POWDER = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "zinc_powder");
        COPPER_POWDER = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "copper_powder");
        BRONZE_POWDER = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "bronze_powder");
        ALUMINUM_POWDER = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "aluminum_powder");
        LEAD_POWDER = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "lead_powder");
        SILVER_POWDER = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "silver_powder");
        NICKEL_POWDER = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "nickel_powder");
        STEEL_POWDER = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "steel_powder");
        TUNGSTEN_POWDER = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "tungsten_powder");
        TITANIUM_POWDER = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "titanium_powder");
        IRON_POWDER = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "iron_powder");
        GOLD_POWDER = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "gold_powder");

        TIN_PLATE = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "tin_plate");
        ZINC_PLATE = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "zinc_plate");
        COPPER_PLATE = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "copper_plate");
        BRONZE_PLATE = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "bronze_plate");
        ALUMINUM_PLATE = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "aluminum_plate");
        LEAD_PLATE = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "lead_plate");
        SILVER_PLATE = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "silver_plate");
        NICKEL_PLATE = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "nickel_plate");
        STEEL_PLATE = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "steel_plate");
        TUNGSTEN_PLATE = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "tungsten_plate");
        TITANIUM_PLATE = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "titanium_plate");
        IRON_PLATE = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "iron_plate");
        GOLD_PLATE = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "gold_plate");

        TIN_GEAR = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "tin_gear");
        ZINC_GEAR = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "zinc_gear");
        COPPER_GEAR = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "copper_gear");
        BRONZE_GEAR = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "bronze_gear");
        ALUMINUM_GEAR = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "aluminum_gear");
        LEAD_GEAR = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "lead_gear");
        SILVER_GEAR = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "silver_gear");
        NICKEL_GEAR = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "nickel_gear");
        STEEL_GEAR = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "steel_gear");
        TUNGSTEN_GEAR = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "tungsten_gear");
        TITANIUM_GEAR = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "titanium_gear");
        IRON_GEAR = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "iron_gear");
        GOLD_GEAR = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "gold_gear");

        TIN_ROD = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "tin_rod");
        ZINC_ROD = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "zinc_rod");
        COPPER_ROD = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "copper_rod");
        BRONZE_ROD = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "bronze_rod");
        ALUMINUM_ROD = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "aluminum_rod");
        LEAD_ROD = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "lead_rod");
        SILVER_ROD = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "silver_rod");
        NICKEL_ROD = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "nickel_rod");
        STEEL_ROD = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "steel_rod");
        TUNGSTEN_ROD = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "tungsten_rod");
        TITANIUM_ROD = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "titanium_rod");
        IRON_ROD = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "iron_rod");
        GOLD_ROD = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "gold_rod");

        CRUSHED_TIN_ORE = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "crushed_tin_ore");
        CRUSHED_ZINC_ORE = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "crushed_zinc_ore");
        CRUSHED_COPPER_ORE = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "crushed_copper_ore");
        CRUSHED_ALUMINUM_ORE = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "crushed_aluminum_ore");
        CRUSHED_LEAD_ORE = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "crushed_lead_ore");
        CRUSHED_SILVER_ORE = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "crushed_silver_ore");
        CRUSHED_NICKEL_ORE = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "crushed_nickel_ore");
        CRUSHED_TUNGSTEN_ORE = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "crushed_tungsten_ore");
        CRUSHED_TITANIUM_ORE = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "crushed_titanium_ore");
        CRUSHED_IRON_ORE = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "crushed_iron_ore");
        CRUSHED_GOLD_ORE = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "crushed_gold_ore");
        COPPER_CONDUCTOR_CORE = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "copper_conductor_core");
        SILVER_CONDUCTOR_CORE = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "silver_conductor_core");
        TITANIUM_CONDUCTOR_CORE = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "titanium_conductor_core");

        COPPER_COIL = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "copper_coil");
        ELECTRIC_MOTOR_SMALL = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "electric_motor_small");
        ELECTRIC_MOTOR_BIG = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "electric_motor_big");

        MINERAL_MUD = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "mineral_mud");
        SEED_BAG_RICE = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "rice_seed_bag");
        SEED_BAG_CHILI = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "chili_seed_bag");
        SEED_BAG_CELERY = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "celery_seed_bag");
        SEED_BAG_LETTUCE = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "lettuce_seed_bag");
        SEED_BAG_STRAWBERRY = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "strawberry_seed_bag");
        SEED_BAG_CORN = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "corn_seed_bag");
        SWEET_POTATO_VINE = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "sweet_potato_vine");
        RICE_UNHUSKED = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "rice_unhusked");
        RICE = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "rice");
        PLANT_STRAW = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "plant_straw");
        SWEET_POTATO = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "sweet_potato");
        CHILI = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "chili");
        CELERY = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "celery");
        LETTUCE = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "lettuce");
        STRAWBERRY = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "strawberry");
        GARLIC = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "garlic");
        WATER_CHESTNUT = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "water_chestnut");

        SOLAR_BERRY = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "solar_berry");

        BAMBOO_CHOPPER = registry(new BambooChopper(ToolMaterials.IRON, 1, 0F, new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "bamboo_chopper");
        Wrench = registry(new Wrench(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP).maxCount(1)), "wrench");
        BAMBOO_DRILL_ROD = registry(new BambooDrillRod(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "bamboo_drill_rod");
        FORGING_HAMMER = registry(new ForgingHammer(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP).maxCount(1).recipeRemainder(FORGING_HAMMER)), "forging_hammer");
    }

    static {
        FuelRegistry.INSTANCE.add(BAMBOO_CHARCOAL_BALL, 80 * 20);   //80s
        FuelRegistry.INSTANCE.add(BAMBOO_CHARCOAL, 20 * 20);        //20s
        FuelRegistry.INSTANCE.add(BAMBOO_LEAVES, 2 * 20);           //2s
    }

    private static <T extends Item> T registry(T item, String path) {
        Registry.register(Registry.ITEM, new Identifier(AdvAgriConstants.ADV_AGRI_NAMESPACE, path), item);
        return item;
    }
}
