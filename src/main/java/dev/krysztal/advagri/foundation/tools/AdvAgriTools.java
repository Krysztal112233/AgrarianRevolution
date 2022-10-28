package dev.krysztal.advagri.foundation.tools;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;

public class AdvAgriTools {

    public static class AdvAgriAxeItem extends AxeItem {

        public AdvAgriAxeItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
            super(material, attackDamage, attackSpeed, settings);
        }
    }

    public static class AdvAgriHoeItem extends HoeItem {

        public AdvAgriHoeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
            super(material, attackDamage, attackSpeed, settings);
        }
    }

    public static class AdvAgriPickaxeItem extends PickaxeItem {

        public AdvAgriPickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
            super(material, attackDamage, attackSpeed, settings);
        }
    }

    public static class AdvAgriShovelItem extends ShovelItem {

        public AdvAgriShovelItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
            super(material, attackDamage, attackSpeed, settings);
        }
    }

    public static class AdvAgriSwordItem extends SwordItem {

        public AdvAgriSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
            super(toolMaterial, attackDamage, attackSpeed, settings);
        }

        @Override
        public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
            return super.useOnEntity(stack, user, entity, hand);
        }
    }
}
