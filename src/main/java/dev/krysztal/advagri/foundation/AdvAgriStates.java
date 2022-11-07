package dev.krysztal.advagri.foundation;

import net.minecraft.state.property.IntProperty;

public class AdvAgriStates {

  public static final int MAX_DRYNESS = 4;
  public static IntProperty BLOCKSTATE_DRYNESS = IntProperty.of(
    "dryness",
    0,
    4
  );
}
