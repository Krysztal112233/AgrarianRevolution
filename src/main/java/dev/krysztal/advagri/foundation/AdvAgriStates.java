package dev.krysztal.advagri.foundation;

import net.minecraft.state.property.IntProperty;

public class AdvAgriStates {

  public static IntProperty BLOCKSTATE_DRYNESS = IntProperty.of(
    "dryness",
    0,
    AdvAgriConstants.MAX_DRYNESS
  );
}
