package dev.krysztal.advagri.foundation;

import com.ibm.j9ddr.vm29.structure.fieldIndexTableEntry;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class AdvAgriFoodComponents {

  public static final FoodComponent ASPARAGUS;
  public static final FoodComponent PEELED_BAMBOO_SAPLING;
  public static final FoodComponent SWEET_POTATO;
  public static final FoodComponent SOLAR_BERRY;
  public static final FoodComponent WATER_CHESTNUT;
  public static final FoodComponent ROASTED_ACORNS;

  static {
    ASPARAGUS =
      new FoodComponent.Builder()
        .hunger(4)
        .saturationModifier(0.6F)
        .meat()
        .snack()
        .build();

    PEELED_BAMBOO_SAPLING =
      new FoodComponent.Builder()
        .hunger(2)
        .saturationModifier(0.2F)
        .snack()
        .build();

    SWEET_POTATO =
      new FoodComponent.Builder()
        .hunger(4)
        .saturationModifier(0.6F)
        .snack()
        .build();

    SOLAR_BERRY =
      new FoodComponent.Builder()
        .hunger(2)
        .saturationModifier(0.1F)
        .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 60), 1)
        .statusEffect(
          new StatusEffectInstance(StatusEffects.NIGHT_VISION, 120),
          1
        )
        .alwaysEdible()
        .build();

    WATER_CHESTNUT =
      new FoodComponent.Builder()
        .hunger(4)
        .saturationModifier(0.7F)
        .statusEffect(
          new StatusEffectInstance(StatusEffects.POISON, 160),
          0.03F
        )
        .alwaysEdible()
        .build();

    ROASTED_ACORNS =
      new FoodComponent.Builder()
        .hunger(4)
        .saturationModifier(0.5F)
        .statusEffect(
          new StatusEffectInstance(StatusEffects.STRENGTH, 6 * 20),
          0.3F
        )
        .statusEffect(
          new StatusEffectInstance(StatusEffects.SATURATION, 6 * 20),
          0.3F
        )
        .statusEffect(
          new StatusEffectInstance(StatusEffects.ABSORPTION, 6 * 20),
          0.3F
        )
        .snack()
        .alwaysEdible()
        .build();
  }
}
