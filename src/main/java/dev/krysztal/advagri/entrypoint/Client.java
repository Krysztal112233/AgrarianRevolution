package dev.krysztal.advagri.entrypoint;

import dev.krysztal.advagri.block.AdvAgriBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class Client implements ClientModInitializer {

  public void onInitializeClient() {
    BlockRenderLayerMap.INSTANCE.putBlock(AdvAgriBlocks.GINKGO_LEAVES, RenderLayer.getTranslucent());
  }
}
