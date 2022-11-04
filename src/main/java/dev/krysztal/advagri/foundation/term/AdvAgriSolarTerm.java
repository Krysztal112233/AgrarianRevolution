package dev.krysztal.advagri.foundation.term;

import dev.krysztal.advagri.foundation.persistents.SolarTermPersistentState;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.Nullable;

public class AdvAgriSolarTerm {

  @Getter
  private AdvAgriSeason currentSeason = AdvAgriSeason.SPRING;

  @Getter
  private Integer currentYear = 0;

  //==================Single Instance======================//
  private AdvAgriSolarTerm() {}

  private static AdvAgriSolarTerm INSTANCE = new AdvAgriSolarTerm();

  public static AdvAgriSolarTerm getInstance() {
    return INSTANCE;
  }
}
