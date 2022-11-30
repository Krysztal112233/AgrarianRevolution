package dev.krysztal.advagri.foundation;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class AdvAgriFoodComponents {

  public static final FoodComponent ASPARAGUS;
  public static final FoodComponent PEELED_BAMBOO_SAPLING;
  public static final FoodComponent SWEET_POTATO;
  public static final FoodComponent SOLAR_BERRY;

  static {
    ASPARAGUS =
      new FoodComponent.Builder()
        .meat()
        .snack()
        .hunger(4)
        .saturationModifier(0.6F)
        .build();

    PEELED_BAMBOO_SAPLING =
      new FoodComponent.Builder()
        .hunger(2)
        .snack()
        .saturationModifier(0.2F)
        .build();

    SWEET_POTATO =
      new FoodComponent.Builder()
        .hunger(4)
        .snack()
        .saturationModifier(0.6F)
        .build();

    SOLAR_BERRY =
      new FoodComponent.Builder()
        .hunger(2)
        .saturationModifier(0.1F)
        .alwaysEdible()
        .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 60), 1)
        .statusEffect(
          new StatusEffectInstance(StatusEffects.NIGHT_VISION, 120),
          1
        )
        .build();
  }
}
