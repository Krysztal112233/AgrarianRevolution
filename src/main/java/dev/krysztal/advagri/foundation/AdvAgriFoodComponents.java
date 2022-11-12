package dev.krysztal.advagri.foundation;

import net.minecraft.item.FoodComponent;

public class AdvAgriFoodComponents {

  public static FoodComponent ASPARAGUS;
  public static FoodComponent PEELED_BAMBOO_SAPLING;

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
  }
}
