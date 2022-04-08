package tech.icedlab.advagri.enchantments;


import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;

//Todo: 2/1/21 8:39 PM
// User: suibing
// Aims: While walking on the IceBlock or Ice type block, the player will walking like on the ground(No speed down)
// Desc: Like soulspeed enchantment
// Stat: False

public class IceSpeedEnchantment extends Enchantment {

    public IceSpeedEnchantment() {
        super(Rarity.COMMON, EnchantmentTarget.ARMOR_FEET, new EquipmentSlot[]{});
    }

    public int getMinPower(int level) {
        return level * 10;
    }

    public int getMaxPower(int level) {
        return this.getMinPower(level) + 15;
    }

    public boolean isTreasure() {
        return true;
    }

    public boolean isAvailableForEnchantedBookOffer() {
        return true;
    }

    public boolean isAvailableForRandomSelection() {
        return false;
    }

    public int getMaxLevel() {
        return 3;
    }

}
