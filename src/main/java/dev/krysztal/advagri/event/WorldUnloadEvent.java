package dev.krysztal.advagri.event;

import dev.krysztal.advagri.foundation.persistents.SolarTermPersistentState;
import dev.krysztal.advagri.foundation.term.AdvAgriSolarTerm;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerWorldEvents;

public class WorldUnloadEvent {

  static final ServerWorldEvents.Unload disableAdvAgriSolarTerm = (
    minecraftServer,
    serverWorld
  ) -> {
    SolarTermPersistentState.set(
      serverWorld,
      AdvAgriSolarTerm.getInstance().getPersistentState()
    );
    AdvAgriSolarTerm.getInstance().setEnable(false);
    AdvAgriSolarTerm.getInstance().setPersistentState(null);
  };
}
