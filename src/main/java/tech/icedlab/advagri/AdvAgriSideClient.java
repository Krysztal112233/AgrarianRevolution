package tech.icedlab.advagri;

import net.fabricmc.api.ClientModInitializer;
import tech.icedlab.advagri.renderer.AdvAgriItemEntitiesRenderers;

public class AdvAgriSideClient implements ClientModInitializer {

    public void onInitializeClient() {

        AdvAgriItemEntitiesRenderers advAgriItemEntitiesRenderers = AdvAgriItemEntitiesRenderers.getInstance();

        advAgriItemEntitiesRenderers.InitAllItemEntitiesRenderers();

    }
}