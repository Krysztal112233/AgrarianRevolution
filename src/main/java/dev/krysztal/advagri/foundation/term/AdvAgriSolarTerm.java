package dev.krysztal.advagri.foundation.term;

import lombok.Getter;

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
