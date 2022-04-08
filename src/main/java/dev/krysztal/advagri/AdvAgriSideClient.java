package dev.krysztal.advagri;

import dev.krysztal.advagri.renderer.AdvAgriItemEntitiesRenderers;
import net.fabricmc.api.ClientModInitializer;

public class AdvAgriSideClient implements ClientModInitializer {

    public void onInitializeClient() {

        AdvAgriItemEntitiesRenderers advAgriItemEntitiesRenderers = AdvAgriItemEntitiesRenderers.getInstance();

        advAgriItemEntitiesRenderers.InitAllItemEntitiesRenderers();

    }
}