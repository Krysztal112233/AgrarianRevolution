package dev.krysztal.advagri.api.event;

import dev.krysztal.advagri.foundation.AdvAgriSolarTerm;
import java.util.Arrays;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.world.ServerWorld;

@SuppressWarnings("unused")
public class SolarTermChangeEvent {

  public static Event<SeasonChange> BEFORE = EventFactory.createArrayBacked(
    SeasonChange.class,
    listeners ->
      (minecraftServer, serverWorld) ->
        Arrays
          .stream(listeners)
          .forEach($ -> $.interact(minecraftServer, serverWorld))
  );

  public static Event<SeasonChange> AFTER = EventFactory.createArrayBacked(
    SeasonChange.class,
    listeners ->
      (minecraftServer, serverWorld) ->
        Arrays
          .stream(listeners)
          .forEach($ -> $.interact(minecraftServer, serverWorld))
  );

  @FunctionalInterface
  public interface SeasonChange {
    public void interact(
      MinecraftServer minecraftServer,
      ServerWorld serverWorld
    );
  }
}
