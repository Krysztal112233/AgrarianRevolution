package dev.krysztal.advagri.event;

import dev.krysztal.advagri.api.event.server.DayChangeEvent.DayChange;
import dev.krysztal.advagri.foundation.persistents.SolarTermPersistentState;

public class DayChangeEvents {

  public static DayChange afterDayChange = (minecraftServer, serverWorld) -> {
    var solarTermPersistentState = SolarTermPersistentState.get(serverWorld);
    solarTermPersistentState.incSeason();
    SolarTermPersistentState.set(serverWorld, solarTermPersistentState);
  };
}
