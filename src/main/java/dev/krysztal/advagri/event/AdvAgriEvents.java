package dev.krysztal.advagri.event;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerWorldEvents;

public class AdvAgriEvents {

  public static void init() {
    //============================Server world load event===================//
    ServerWorldEvents.LOAD.register(WorldLoadEvent.enableAdvAgriSolarTerm);
    //============================Server world unload event=================//
    ServerWorldEvents.UNLOAD.register(WorldUnloadEvent.disableAdvAgriSolarTerm);
  }
}
