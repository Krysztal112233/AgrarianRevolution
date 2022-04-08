package dev.krysztal.advagri.item.armors;

import dev.krysztal.advagri.AdvAgriConstants;
import dev.krysztal.advagri.AdvAgriItemGroup;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class AdvAgriArmors {


    //Bamboo armor
    public static Item BAMBOO_HELMET;
    public static Item BAMBOO_BREASTPLATE;

    ///GENERATE
    public static Item BAMBOO_LEGGINGS;
    public static Item BAMBOO_BOOTS;
    //Leather-bamboo armor
    public static Item LEATHER_BAMBOO_MIXED_HELMET;
    public static Item LEATHER_BAMBOO_MIXED_BREASTPLATE;
    public static Item LEATHER_BAMBOO_MIXED_LEGGINGS;
    public static Item LEATHER_BAMBOO_MIXED_BOOTS;
    //Iron-bamboo armor
    public static Item IRON_BAMBOO_MIXED_HELMET;
    public static Item IRON_BAMBOO_MIXED_BREASTPLATE;
    public static Item IRON_BAMBOO_MIXED_LEGGINGS;
    public static Item IRON_BAMBOO_MIXED_BOOTS;

    public static ArmorMaterial IRON_BAMBOO_MIXED;
    public static ArmorMaterial BAMBOO;
    ///GENERATE
    public static ArmorMaterial LEATHER_BAMBOO_MIXED;

    static {
        LEATHER_BAMBOO_MIXED = new LeatherBambooMixedArmor();
        BAMBOO = new BambooArmor();
        IRON_BAMBOO_MIXED = new IronBambooMixedArmor();

        BAMBOO_HELMET = FastAddTool(EquipmentSlot.HEAD, BAMBOO);
        BAMBOO_BREASTPLATE = FastAddTool(EquipmentSlot.CHEST, BAMBOO);
        BAMBOO_LEGGINGS = FastAddTool(EquipmentSlot.LEGS, BAMBOO);
        BAMBOO_BOOTS = FastAddTool(EquipmentSlot.FEET, BAMBOO);

        LEATHER_BAMBOO_MIXED_HELMET = FastAddTool(EquipmentSlot.HEAD, LEATHER_BAMBOO_MIXED);
        LEATHER_BAMBOO_MIXED_BREASTPLATE = FastAddTool(EquipmentSlot.CHEST, LEATHER_BAMBOO_MIXED);
        LEATHER_BAMBOO_MIXED_LEGGINGS = FastAddTool(EquipmentSlot.LEGS, LEATHER_BAMBOO_MIXED);
        LEATHER_BAMBOO_MIXED_BOOTS = FastAddTool(EquipmentSlot.FEET, LEATHER_BAMBOO_MIXED);

        IRON_BAMBOO_MIXED_HELMET = FastAddTool(EquipmentSlot.HEAD, IRON_BAMBOO_MIXED);
        IRON_BAMBOO_MIXED_BREASTPLATE = FastAddTool(EquipmentSlot.CHEST, IRON_BAMBOO_MIXED);
        IRON_BAMBOO_MIXED_LEGGINGS = FastAddTool(EquipmentSlot.LEGS, IRON_BAMBOO_MIXED);
        IRON_BAMBOO_MIXED_BOOTS = FastAddTool(EquipmentSlot.FEET, IRON_BAMBOO_MIXED);
    }

    static {
        //Bamboo
        Registry.register(Registry.ITEM,
            new Identifier(AdvAgriConstants.ADV_AGRI_NAMESPACE, "bamboo_helmet"), BAMBOO_HELMET);
        Registry.register(Registry.ITEM,
            new Identifier(AdvAgriConstants.ADV_AGRI_NAMESPACE, "bamboo_breastplate"),
            BAMBOO_BREASTPLATE);
        Registry.register(Registry.ITEM,
            new Identifier(AdvAgriConstants.ADV_AGRI_NAMESPACE, "bamboo_leggings"),
            BAMBOO_LEGGINGS);
        Registry.register(Registry.ITEM,
            new Identifier(AdvAgriConstants.ADV_AGRI_NAMESPACE, "bamboo_boots"), BAMBOO_BOOTS);

        //Leather-bamboo mixed armor
        Registry.register(Registry.ITEM,
            new Identifier(AdvAgriConstants.ADV_AGRI_NAMESPACE, "leather_bamboo_mixed_helmet"),
            LEATHER_BAMBOO_MIXED_HELMET);
        Registry.register(Registry.ITEM,
            new Identifier(AdvAgriConstants.ADV_AGRI_NAMESPACE, "leather_bamboo_mixed_breastplate"),
            LEATHER_BAMBOO_MIXED_BREASTPLATE);
        Registry.register(Registry.ITEM,
            new Identifier(AdvAgriConstants.ADV_AGRI_NAMESPACE, "leather_bamboo_mixed_leggings"),
            LEATHER_BAMBOO_MIXED_LEGGINGS);
        Registry.register(Registry.ITEM,
            new Identifier(AdvAgriConstants.ADV_AGRI_NAMESPACE, "leather_bamboo_mixed_boots"),
            LEATHER_BAMBOO_MIXED_BOOTS);

        //Iron-Bamboo mixed armor
        Registry.register(Registry.ITEM,
            new Identifier(AdvAgriConstants.ADV_AGRI_NAMESPACE, "iron_bamboo_mixed_helmet"),
            IRON_BAMBOO_MIXED_HELMET);
        Registry.register(Registry.ITEM,
            new Identifier(AdvAgriConstants.ADV_AGRI_NAMESPACE, "iron_bamboo_mixed_breastplate"),
            IRON_BAMBOO_MIXED_BREASTPLATE);
        Registry.register(Registry.ITEM,
            new Identifier(AdvAgriConstants.ADV_AGRI_NAMESPACE, "iron_bamboo_mixed_leggings"),
            IRON_BAMBOO_MIXED_LEGGINGS);
        Registry.register(Registry.ITEM,
            new Identifier(AdvAgriConstants.ADV_AGRI_NAMESPACE, "iron_bamboo_mixed_boots"),
            IRON_BAMBOO_MIXED_BOOTS);
    }


    public static ArmorItem FastAddTool(EquipmentSlot component, ArmorMaterial ArmorMaterial) {
        return new ArmorItem(ArmorMaterial, component,
            new Item.Settings().group(AdvAgriItemGroup.ADV_AGRI_TOOL_ITEM_GROUP));

    }
}
