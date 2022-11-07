package dev.krysztal.advagri.event;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerWorldEvents;

public class WorldLoadEvent {

  static final ServerWorldEvents.Load enableAdvAgriSolarTerm = (
    minecraftServer,
    serverWorld
  ) -> {};
}
