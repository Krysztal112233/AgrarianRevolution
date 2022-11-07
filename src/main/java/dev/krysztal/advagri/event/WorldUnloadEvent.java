package dev.krysztal.advagri.event;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerWorldEvents;

public class WorldUnloadEvent {

  static final ServerWorldEvents.Unload disableAdvAgriSolarTerm = (
    minecraftServer,
    serverWorld
  ) -> {};
}
