package dev.krysztal.advagri.event;

import dev.krysztal.advagri.foundation.persistents.SolarTermPersistentState;
import dev.krysztal.advagri.foundation.term.AdvAgriSolarTerm;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerWorldEvents;

public class WorldLoadEvent {

  static final ServerWorldEvents.Load enableAdvAgriSolarTerm = (
    minecraftServer,
    serverWorld
  ) -> {
    AdvAgriSolarTerm
      .getInstance()
      .setPersistentState(SolarTermPersistentState.get(serverWorld));
    AdvAgriSolarTerm.getInstance().setEnable(true);
  };
}
