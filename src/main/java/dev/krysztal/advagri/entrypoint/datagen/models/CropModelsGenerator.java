package dev.krysztal.advagri.entrypoint.datagen.models;

import dev.krysztal.advagri.block.AdvAgriBlocks;
import java.util.stream.IntStream;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class CropModelsGenerator extends FabricModelProvider {

  public CropModelsGenerator(FabricDataGenerator dataGenerator) {
    super(dataGenerator);
  }

  @Override
  public void generateBlockStateModels(
    BlockStateModelGenerator blockStateModelGenerator
  ) {
    blockStateModelGenerator.registerCrop(
      AdvAgriBlocks.CRON_BLOCK,
      AdvAgriBlocks.CRON_BLOCK.getAgeProperty(),
      IntStream.rangeClosed(0, AdvAgriBlocks.CRON_BLOCK.getMaxAge()).toArray()
    );

    blockStateModelGenerator.registerCrop(
      AdvAgriBlocks.SWEET_POTATO_BLOCK,
      AdvAgriBlocks.SWEET_POTATO_BLOCK.getAgeProperty(),
      IntStream
        .rangeClosed(0, AdvAgriBlocks.SWEET_POTATO_BLOCK.getMaxAge())
        .toArray()
    );

    blockStateModelGenerator.registerCrop(
      AdvAgriBlocks.LETTUCE_BLOCK,
      AdvAgriBlocks.LETTUCE_BLOCK.getAgeProperty(),
      IntStream
        .rangeClosed(0, AdvAgriBlocks.LETTUCE_BLOCK.getMaxAge())
        .toArray()
    );
  }

  @Override
  public void generateItemModels(ItemModelGenerator itemModelGenerator) {}
}
