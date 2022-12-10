package dev.krysztal.advagri.entrypoint;

import dev.krysztal.advagri.block.AdvAgriBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class Client implements ClientModInitializer {

  public void onInitializeClient() {
    BlockRenderLayerMap.INSTANCE.putBlocks(
      RenderLayer.getTranslucent(),
      AdvAgriBlocks.GINKGO_LEAVES.get()
    );

    BlockRenderLayerMap.INSTANCE.putBlocks(
      RenderLayer.getCutout(),
      AdvAgriBlocks.SOLAR_BERRY_BUSH_BLOCK.get(),
      AdvAgriBlocks.LETTUCE_BLOCK.get(),
      AdvAgriBlocks.CRON_BLOCK.get(),
      AdvAgriBlocks.GARLIC_BLOCK.get(),
      AdvAgriBlocks.SWEET_POTATO_BLOCK.get(),
      AdvAgriBlocks.WATER_CHESTNUT_BLOCK.get(),
      AdvAgriBlocks.STRAW_BERRY_BLOCK.get(),
      AdvAgriBlocks.CELERY_BLOCK.get(),
      AdvAgriBlocks.CHILI_BLOCK.get(),
      AdvAgriBlocks.RICE_BLOCK.get()
    );
  }
}
