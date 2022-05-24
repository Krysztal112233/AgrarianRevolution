package dev.krysztal.advagri.item;

import dev.krysztal.advagri.AdvAgriConstants;
import dev.krysztal.advagri.AdvAgriItemGroup;
import dev.krysztal.advagri.item.tools.AdvAgriToolMaterials.*;
import dev.krysztal.advagri.item.tools.AdvAgriTools.*;
import net.minecraft.item.Item;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AdvAgriTools {


    public static final Integer BASE_SWORD_ATTACK_DAMAGE = 3;
    public static final Integer BASE_HOE_ATTACK_DAMAGE = -2;
    public static final Float BASE_AXE_ATTACK_DAMAGE = 4F;
    public static final Integer BASE_PICKAXE_ATTACK_DAMAGE = 1;
    public static final Float BASE_SHOVEL_ATTACK_DAMAGE = 1.5F;
    public static final Float BASE_SHOVEL_ATTACK_SPEED = -3F;
    public static final Float BASE_PICKAXE_ATTACK_SPEED = -2.8F;
    public static final Float BASE_AXE_ATTACK_SPEED = -3.2F;
    public static final Float BASE_HOE_ATTACK_SPEED = -3F;
    public static final Float BASE_SWORD_ATTACK_SPEED = -2.4F;
    ///GENERATE
    public static ToolItem COPPER_SHOVEL;
    public static ToolItem COPPER_PICKAXE;
    public static ToolItem COPPER_AXE;
    public static ToolItem COPPER_HOE;
    public static ToolItem COPPER_SWORD;
    public static ToolItem ZINC_SHOVEL;
    public static ToolItem ZINC_PICKAXE;
    public static ToolItem ZINC_AXE;
    public static ToolItem ZINC_HOE;
    public static ToolItem ZINC_SWORD;
    public static ToolItem TIN_SHOVEL;
    public static ToolItem TIN_PICKAXE;
    public static ToolItem TIN_AXE;
    public static ToolItem TIN_HOE;
    public static ToolItem TIN_SWORD;
    public static ToolItem BRONZE_SHOVEL;
    public static ToolItem BRONZE_PICKAXE;
    public static ToolItem BRONZE_AXE;
    public static ToolItem BRONZE_HOE;
    public static ToolItem BRONZE_SWORD;
    public static ToolItem ALUMINUM_SHOVEL;
    public static ToolItem ALUMINUM_PICKAXE;
    public static ToolItem ALUMINUM_AXE;
    public static ToolItem ALUMINUM_HOE;
    public static ToolItem ALUMINUM_SWORD;
    public static ToolItem LEAD_SHOVEL;
    public static ToolItem LEAD_PICKAXE;
    public static ToolItem LEAD_AXE;
    public static ToolItem LEAD_HOE;
    public static ToolItem LEAD_SWORD;
    public static ToolItem SILVER_SHOVEL;
    public static ToolItem SILVER_PICKAXE;
    public static ToolItem SILVER_AXE;
    public static ToolItem SILVER_HOE;
    public static ToolItem SILVER_SWORD;
    public static ToolItem STEEL_SHOVEL;
    public static ToolItem STEEL_PICKAXE;
    public static ToolItem STEEL_AXE;
    public static ToolItem STEEL_HOE;
    public static ToolItem STEEL_SWORD;
    public static ToolItem NICKEL_SHOVEL;
    public static ToolItem NICKEL_PICKAXE;
    public static ToolItem NICKEL_AXE;
    public static ToolItem NICKEL_HOE;
    public static ToolItem NICKEL_SWORD;
    public static ToolItem TUNGSTEN_SHOVEL;
    public static ToolItem TUNGSTEN_PICKAXE;
    public static ToolItem TUNGSTEN_AXE;
    public static ToolItem TUNGSTEN_HOE;
    public static ToolItem TUNGSTEN_SWORD;
    public static ToolItem TITANIUM_SHOVEL;
    public static ToolItem TITANIUM_PICKAXE;
    public static ToolItem TITANIUM_AXE;
    public static ToolItem TITANIUM_HOE;
    public static ToolItem TITANIUM_SWORD;

    static {


        COPPER_SHOVEL = registry(new AdvAgriShovelItem(CopperMaterial.INSTANCE, BASE_SHOVEL_ATTACK_DAMAGE, BASE_SHOVEL_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "copper_shovel");
        COPPER_PICKAXE = registry(new AdvAgriPickaxeItem(CopperMaterial.INSTANCE, BASE_PICKAXE_ATTACK_DAMAGE, BASE_PICKAXE_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "copper_pickaxe");
        COPPER_AXE = registry(new AdvAgriAxeItem(CopperMaterial.INSTANCE, BASE_AXE_ATTACK_DAMAGE + 2F, BASE_AXE_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "copper_axe");
        COPPER_HOE = registry(new AdvAgriHoeItem(CopperMaterial.INSTANCE, BASE_HOE_ATTACK_DAMAGE, BASE_HOE_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "copper_hoe");
        COPPER_SWORD = registry(new AdvAgriSwordItem(CopperMaterial.INSTANCE, BASE_SWORD_ATTACK_DAMAGE, BASE_SWORD_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "copper_sword");

        ZINC_SHOVEL = registry(new AdvAgriShovelItem(ZincMaterial.INSTANCE, BASE_SHOVEL_ATTACK_DAMAGE, BASE_SHOVEL_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "zinc_shovel");
        ZINC_PICKAXE = registry(new AdvAgriPickaxeItem(ZincMaterial.INSTANCE, BASE_PICKAXE_ATTACK_DAMAGE, BASE_PICKAXE_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "zinc_pickaxe");
        ZINC_AXE = registry(new AdvAgriAxeItem(ZincMaterial.INSTANCE, BASE_AXE_ATTACK_DAMAGE + 2F, BASE_AXE_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "zinc_axe");
        ZINC_HOE = registry(new AdvAgriHoeItem(ZincMaterial.INSTANCE, BASE_HOE_ATTACK_DAMAGE, BASE_HOE_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "zinc_hoe");
        ZINC_SWORD = registry(new AdvAgriSwordItem(ZincMaterial.INSTANCE, BASE_SWORD_ATTACK_DAMAGE, BASE_SWORD_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "zinc_sword");

        TIN_SHOVEL = registry(new AdvAgriShovelItem(TinMaterial.INSTANCE, BASE_SHOVEL_ATTACK_DAMAGE, BASE_SHOVEL_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "tin_shovel");
        TIN_PICKAXE = registry(new AdvAgriPickaxeItem(TinMaterial.INSTANCE, BASE_PICKAXE_ATTACK_DAMAGE, BASE_PICKAXE_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "tin_pickaxe");
        TIN_AXE = registry(new AdvAgriAxeItem(TinMaterial.INSTANCE, BASE_AXE_ATTACK_DAMAGE + 2F, BASE_AXE_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "tin_axe");
        TIN_HOE = registry(new AdvAgriHoeItem(TinMaterial.INSTANCE, BASE_HOE_ATTACK_DAMAGE, BASE_HOE_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "tin_hoe");
        TIN_SWORD = registry(new AdvAgriSwordItem(TinMaterial.INSTANCE, BASE_SWORD_ATTACK_DAMAGE, BASE_SWORD_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "tin_sword");

        BRONZE_SHOVEL = registry(new AdvAgriShovelItem(BronzeMaterial.INSTANCE, BASE_SHOVEL_ATTACK_DAMAGE, BASE_SHOVEL_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "bronze_shovel");
        BRONZE_PICKAXE = registry(new AdvAgriPickaxeItem(BronzeMaterial.INSTANCE, BASE_PICKAXE_ATTACK_DAMAGE, BASE_PICKAXE_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "bronze_pickaxe");
        BRONZE_AXE = registry(new AdvAgriAxeItem(BronzeMaterial.INSTANCE, BASE_AXE_ATTACK_DAMAGE + 2F, BASE_AXE_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "bronze_axe");
        BRONZE_HOE = registry(new AdvAgriHoeItem(BronzeMaterial.INSTANCE, BASE_HOE_ATTACK_DAMAGE, BASE_HOE_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "bronze_hoe");
        BRONZE_SWORD = registry(new AdvAgriSwordItem(BronzeMaterial.INSTANCE, BASE_SWORD_ATTACK_DAMAGE, BASE_SWORD_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "bronze_sword");

        ALUMINUM_SHOVEL = registry(new AdvAgriShovelItem(AluminumMaterial.INSTANCE, BASE_SHOVEL_ATTACK_DAMAGE, BASE_SHOVEL_ATTACK_SPEED + 0.1F, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "aluminum_shovel");
        ALUMINUM_PICKAXE = registry(new AdvAgriPickaxeItem(AluminumMaterial.INSTANCE, BASE_PICKAXE_ATTACK_DAMAGE, BASE_PICKAXE_ATTACK_SPEED + 0.1F, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "aluminum_pickaxe");
        ALUMINUM_AXE = registry(new AdvAgriAxeItem(AluminumMaterial.INSTANCE, BASE_AXE_ATTACK_DAMAGE + 2F, BASE_AXE_ATTACK_SPEED + 0.2F, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "aluminum_axe");
        ALUMINUM_HOE = registry(new AdvAgriHoeItem(AluminumMaterial.INSTANCE, BASE_HOE_ATTACK_DAMAGE, BASE_HOE_ATTACK_SPEED + 0.1F, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "aluminum_hoe");
        ALUMINUM_SWORD = registry(new AdvAgriSwordItem(AluminumMaterial.INSTANCE, BASE_SWORD_ATTACK_DAMAGE - 1, BASE_SWORD_ATTACK_SPEED + 0.3F, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "aluminum_sword");

        LEAD_SHOVEL = registry(new AdvAgriShovelItem(LeadMaterial.INSTANCE, BASE_SHOVEL_ATTACK_DAMAGE, BASE_SHOVEL_ATTACK_SPEED - 0.1F, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "lead_shovel");
        LEAD_PICKAXE = registry(new AdvAgriPickaxeItem(LeadMaterial.INSTANCE, BASE_PICKAXE_ATTACK_DAMAGE, BASE_PICKAXE_ATTACK_SPEED - 0.2F, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "lead_pickaxe");
        LEAD_AXE = registry(new AdvAgriAxeItem(LeadMaterial.INSTANCE, BASE_AXE_ATTACK_DAMAGE + 3F, BASE_AXE_ATTACK_SPEED - 0.3F, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "lead_axe");
        LEAD_HOE = registry(new AdvAgriHoeItem(LeadMaterial.INSTANCE, BASE_HOE_ATTACK_DAMAGE, BASE_HOE_ATTACK_SPEED - 0.1F, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "lead_hoe");
        LEAD_SWORD = registry(new AdvAgriSwordItem(LeadMaterial.INSTANCE, BASE_SWORD_ATTACK_DAMAGE, BASE_SWORD_ATTACK_SPEED - 0.1F, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "lead_sword");

        SILVER_SHOVEL = registry(new AdvAgriShovelItem(SilverMaterial.INSTANCE, BASE_SHOVEL_ATTACK_DAMAGE, BASE_SHOVEL_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "silver_shovel");
        SILVER_PICKAXE = registry(new AdvAgriPickaxeItem(SilverMaterial.INSTANCE, BASE_PICKAXE_ATTACK_DAMAGE, BASE_PICKAXE_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "silver_pickaxe");
        SILVER_AXE = registry(new AdvAgriAxeItem(SilverMaterial.INSTANCE, BASE_AXE_ATTACK_DAMAGE + 2F, BASE_AXE_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "silver_axe");
        SILVER_HOE = registry(new AdvAgriHoeItem(SilverMaterial.INSTANCE, BASE_HOE_ATTACK_DAMAGE, BASE_HOE_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "silver_hoe");
        SILVER_SWORD = registry(new AdvAgriSwordItem(SilverMaterial.INSTANCE, BASE_SWORD_ATTACK_DAMAGE, BASE_SWORD_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "silver_sword");

        STEEL_SHOVEL = registry(new AdvAgriShovelItem(SteelMaterial.INSTANCE, BASE_SHOVEL_ATTACK_DAMAGE + 2, BASE_SHOVEL_ATTACK_SPEED + 1, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "steel_shovel");
        STEEL_PICKAXE = registry(new AdvAgriPickaxeItem(SteelMaterial.INSTANCE, BASE_PICKAXE_ATTACK_DAMAGE + 2, BASE_PICKAXE_ATTACK_SPEED + 1, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "steel_pickaxe");
        STEEL_AXE = registry(new AdvAgriAxeItem(SteelMaterial.INSTANCE, BASE_AXE_ATTACK_DAMAGE + 2F, BASE_AXE_ATTACK_SPEED + 1, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "steel_axe");
        STEEL_HOE = registry(new AdvAgriHoeItem(SteelMaterial.INSTANCE, BASE_HOE_ATTACK_DAMAGE + 2, BASE_HOE_ATTACK_SPEED + 1, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "steel_hoe");
        STEEL_SWORD = registry(new AdvAgriSwordItem(SteelMaterial.INSTANCE, BASE_SWORD_ATTACK_DAMAGE + 2, BASE_SWORD_ATTACK_SPEED + 1, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "steel_sword");

        NICKEL_SHOVEL = registry(new AdvAgriShovelItem(NickelMaterial.INSTANCE, BASE_SHOVEL_ATTACK_DAMAGE, BASE_SHOVEL_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "nickel_shovel");
        NICKEL_PICKAXE = registry(new AdvAgriPickaxeItem(NickelMaterial.INSTANCE, BASE_PICKAXE_ATTACK_DAMAGE, BASE_PICKAXE_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "nickel_pickaxe");
        NICKEL_AXE = registry(new AdvAgriAxeItem(NickelMaterial.INSTANCE, BASE_AXE_ATTACK_DAMAGE + 2F, BASE_AXE_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "nickel_axe");
        NICKEL_HOE = registry(new AdvAgriHoeItem(NickelMaterial.INSTANCE, BASE_HOE_ATTACK_DAMAGE, BASE_HOE_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "nickel_hoe");
        NICKEL_SWORD = registry(new AdvAgriSwordItem(NickelMaterial.INSTANCE, BASE_SWORD_ATTACK_DAMAGE, BASE_SWORD_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "nickel_sword");

        TUNGSTEN_SHOVEL = registry(new AdvAgriShovelItem(TungstenMaterial.INSTANCE, BASE_SHOVEL_ATTACK_DAMAGE, BASE_SHOVEL_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "tungsten_shovel");
        TUNGSTEN_PICKAXE = registry(new AdvAgriPickaxeItem(TungstenMaterial.INSTANCE, BASE_PICKAXE_ATTACK_DAMAGE, BASE_PICKAXE_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "tungsten_pickaxe");
        TUNGSTEN_AXE = registry(new AdvAgriAxeItem(TungstenMaterial.INSTANCE, BASE_AXE_ATTACK_DAMAGE + 2F, BASE_AXE_ATTACK_SPEED - 0.1F, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "tungsten_axe");
        TUNGSTEN_HOE = registry(new AdvAgriHoeItem(TungstenMaterial.INSTANCE, BASE_HOE_ATTACK_DAMAGE, BASE_HOE_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "tungsten_hoe");
        TUNGSTEN_SWORD = registry(new AdvAgriSwordItem(TungstenMaterial.INSTANCE, BASE_SWORD_ATTACK_DAMAGE, BASE_SWORD_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "tungsten_sword");

        TITANIUM_SHOVEL = registry(new AdvAgriShovelItem(TitaniumMaterial.INSTANCE, BASE_SHOVEL_ATTACK_DAMAGE + 1, BASE_SHOVEL_ATTACK_SPEED + 0.1F, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "titanium_shovel");
        TITANIUM_PICKAXE = registry(new AdvAgriPickaxeItem(TitaniumMaterial.INSTANCE, BASE_PICKAXE_ATTACK_DAMAGE + 1, BASE_PICKAXE_ATTACK_SPEED + 0.1F, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "titanium_pickaxe");
        TITANIUM_AXE = registry(new AdvAgriAxeItem(TitaniumMaterial.INSTANCE, BASE_AXE_ATTACK_DAMAGE + 3F, BASE_AXE_ATTACK_SPEED + 0.3F, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "titanium_axe");
        TITANIUM_HOE = registry(new AdvAgriHoeItem(TitaniumMaterial.INSTANCE, BASE_HOE_ATTACK_DAMAGE, BASE_HOE_ATTACK_SPEED + 2, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "titanium_hoe");
        TITANIUM_SWORD = registry(new AdvAgriSwordItem(TitaniumMaterial.INSTANCE, BASE_SWORD_ATTACK_DAMAGE + 2, BASE_SWORD_ATTACK_SPEED + 0.1F, new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP)), "titanium_sword");

    }

    private static <T extends Item> T registry(T item, String PATH) {
        Registry.register(Registry.ITEM, new Identifier(AdvAgriConstants.ADV_AGRI_NAMESPACE, PATH), item);
        return item;
    }


}
