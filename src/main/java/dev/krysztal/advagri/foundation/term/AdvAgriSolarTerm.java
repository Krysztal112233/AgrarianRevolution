package dev.krysztal.advagri.foundation.term;

import dev.krysztal.advagri.foundation.persistents.SolarTermPersistentState;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.Nullable;

public class AdvAgriSolarTerm {

  @Nullable
  @Getter
  @Setter
  private SolarTermPersistentState persistentState = null;

  @Getter
  @Setter
  private boolean enable = false;

  //==================Single Instance======================//
  private AdvAgriSolarTerm() {}

  private static AdvAgriSolarTerm INSTANCE = new AdvAgriSolarTerm();

  public static AdvAgriSolarTerm getInstance() {
    return INSTANCE;
  }
}
