package tech.icedlab.advagri.item.tools;

import lombok.Getter;
import lombok.Setter;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import tech.icedlab.advagri.item.AdvAgriItems;


public class AdvAgriToolMaterials implements ToolMaterial {

    @Setter
    @Getter
    private float miningSpeedMultiplier;
    @Setter
    @Getter
    private int durability;
    @Setter
    @Getter
    private float attackDamage;
    @Setter
    @Getter
    private int miningLevel;
    @Setter
    @Getter
    private int enchantability;
    @Setter
    @Getter
    private Ingredient repairIngredient;


    public static class AluminumMaterial extends AdvAgriToolMaterials {

        public static final AluminumMaterial INSTANCE = new AluminumMaterial();

        public AluminumMaterial() {
            super.setDurability(80);
            super.setMiningSpeedMultiplier(10F);
            super.setAttackDamage(2F);
            super.setMiningLevel(1);
            super.setEnchantability(22);
            super.setRepairIngredient(Ingredient.ofItems(AdvAgriItems.ALUMINUM_INGOT));
        }

    }

    public static class BronzeMaterial extends AdvAgriToolMaterials {

        public static final ToolMaterial INSTANCE = new BronzeMaterial();

        public BronzeMaterial() {
            super.setDurability(350);
            super.setMiningSpeedMultiplier(6F);
            super.setAttackDamage(2F);
            super.setMiningLevel(2);
            super.setEnchantability(8);
            super.setRepairIngredient(Ingredient.ofItems(AdvAgriItems.BRONZE_INGOT));
        }
    }

    public static class CopperMaterial extends AdvAgriToolMaterials {

        public static final CopperMaterial INSTANCE = new CopperMaterial();

        public CopperMaterial() {
            super.setDurability(250);
            super.setMiningSpeedMultiplier(6F);
            super.setAttackDamage(2F);
            super.setMiningLevel(1);
            super.setEnchantability(8);
            super.setRepairIngredient(Ingredient.ofItems(Items.COPPER_INGOT));
        }
    }

    public static class LeadMaterial extends AdvAgriToolMaterials {

        public static final LeadMaterial INSTANCE = new LeadMaterial();

        public LeadMaterial() {
            super.setDurability(100);
            super.setMiningSpeedMultiplier(3F);
            super.setAttackDamage(2F);
            super.setMiningLevel(1);
            super.setEnchantability(6);
            super.setRepairIngredient(Ingredient.ofItems(AdvAgriItems.LEAD_INGOT));
        }

    }

    public static class NickelMaterial extends AdvAgriToolMaterials {

        public static final NickelMaterial INSTANCE = new NickelMaterial();

        public NickelMaterial() {
            super.setDurability(230);
            super.setMiningSpeedMultiplier(6F);
            super.setAttackDamage(2F);
            super.setMiningLevel(2);
            super.setEnchantability(8);
            super.setRepairIngredient(Ingredient.ofItems(AdvAgriItems.NICKEL_INGOT));
        }
    }

    public static class SilverMaterial extends AdvAgriToolMaterials {

        public static final SilverMaterial INSTANCE = new SilverMaterial();

        public SilverMaterial() {
            super.setDurability(280);
            super.setMiningSpeedMultiplier(5F);
            super.setAttackDamage(2F);
            super.setMiningLevel(1);
            super.setEnchantability(12);
            super.setRepairIngredient(Ingredient.ofItems(AdvAgriItems.SILVER_INGOT));
        }
    }

    public static class SteelMaterial extends AdvAgriToolMaterials {

        public final static SteelMaterial INSTANCE = new SteelMaterial();

        public SteelMaterial() {
            super.setDurability(560);
            super.setMiningSpeedMultiplier(6F);
            super.setAttackDamage(2F);
            super.setMiningLevel(3);
            super.setEnchantability(9);
            super.setRepairIngredient(Ingredient.ofItems(AdvAgriItems.STEEL_INGOT));
        }
    }

    public static class TinMaterial extends AdvAgriToolMaterials {

        public final static TinMaterial INSTANCE = new TinMaterial();

        public TinMaterial() {
            super.setDurability(150);
            super.setMiningSpeedMultiplier(5F);
            super.setAttackDamage(2F);
            super.setMiningLevel(1);
            super.setEnchantability(6);
            super.setRepairIngredient(Ingredient.ofItems(AdvAgriItems.TIN_INGOT));
        }
    }

    public static class TitaniumMaterial extends AdvAgriToolMaterials {

        public static final TitaniumMaterial INSTANCE = new TitaniumMaterial();

        public TitaniumMaterial() {
            super.setDurability(3400);
            super.setMiningSpeedMultiplier(9F);
            super.setAttackDamage(2F);
            super.setMiningLevel(3);
            super.setEnchantability(15);
            super.setRepairIngredient(Ingredient.ofItems(AdvAgriItems.TITANIUM_INGOT));
        }
    }

    public static class TungstenMaterial extends AdvAgriToolMaterials {

        public static final TungstenMaterial INSTANCE = new TungstenMaterial();

        public TungstenMaterial() {
            super.setDurability(2200);
            super.setMiningSpeedMultiplier(6F);
            super.setAttackDamage(2F);
            super.setMiningLevel(3);
            super.setEnchantability(9);
            super.setRepairIngredient(Ingredient.ofItems(AdvAgriItems.TUNGSTEN_INGOT));
        }
    }

    public static class ZincMaterial extends AdvAgriToolMaterials {

        public static final ZincMaterial INSTANCE = new ZincMaterial();

        public ZincMaterial() {
            super.setDurability(150);
            super.setMiningSpeedMultiplier(6F);
            super.setAttackDamage(2F);
            super.setMiningLevel(2);
            super.setEnchantability(6);
            super.setRepairIngredient(Ingredient.ofItems(AdvAgriItems.ZINC_INGOT));
        }
    }
}
