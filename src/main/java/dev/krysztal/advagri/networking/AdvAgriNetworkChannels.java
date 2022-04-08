package dev.krysztal.advagri.networking;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking.PlayChannelHandler;
import net.fabricmc.fabric.impl.networking.client.ClientNetworkingImpl;
import net.minecraft.util.Identifier;

public class AdvAgriNetworkChannels {

    public static boolean registerGlobalReceiver(Identifier FirecrackerEntitySpawn,
        PlayChannelHandler FirecrackerEntitySpawnHandler) {
        return ClientNetworkingImpl.PLAY.registerGlobalReceiver(FirecrackerEntitySpawn,
            FirecrackerEntitySpawnHandler);
    }

}