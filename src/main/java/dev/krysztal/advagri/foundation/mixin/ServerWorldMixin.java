package dev.krysztal.advagri.foundation.mixin;

import net.minecraft.server.world.ServerWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ServerWorld.class)
public class ServerWorldMixin {

  @Inject(method = "setTimeOfDay", at = @At("HEAD"))
  public void beforeDayChange(long timeOfDay, CallbackInfo ci) {}

  @Inject(method = "setTimeOfDay", at = @At("TAIL"))
  public void afterDayChange(long timeOfDay, CallbackInfo ci) {}
}
