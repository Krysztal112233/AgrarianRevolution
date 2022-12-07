package dev.krysztal.advagri.entrypoint.datagen.models;

import dev.krysztal.advagri.block.AdvAgriBlocks;
import dev.krysztal.advagri.foundation.annotation.GenType;
import dev.krysztal.advagri.foundation.util.GeneratorUtils;
import dev.krysztal.advagri.item.AdvAgriItems;
import java.util.List;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.Item;
import net.minecraft.util.Pair;

public class ModelsGenerator extends FabricModelProvider {

  private static final List<Pair<Block, Block>> LOGS = List.of(
    new Pair<Block, Block>(AdvAgriBlocks.GINKGO_LOG, AdvAgriBlocks.GINKGO_WOOD)
  );

  public ModelsGenerator(FabricDataGenerator dataGenerator) {
    super(dataGenerator);
  }

  @Override
  public void generateBlockStateModels(
    BlockStateModelGenerator blockStateModelGenerator
  ) {
    new GeneratorUtils.Collector(GenType.SimpleBlockModel)
      .<Block>collect(AdvAgriBlocks.class)
      .forEach(blockStateModelGenerator::registerSimpleCubeAll);

    new GeneratorUtils.Collector(GenType.SimpleBlockState)
      .<Block>collect(AdvAgriBlocks.class)
      .forEach(blockStateModelGenerator::registerSimpleState);

    LOGS.forEach(block ->
      blockStateModelGenerator
        .registerLog(block.getLeft())
        .log(block.getLeft())
        .wood(block.getRight())
    );
  }

  @Override
  public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    new GeneratorUtils.Collector(GenType.SimpleItemModel)
      .<Item>collect(AdvAgriItems.class)
      .forEach(item -> itemModelGenerator.register(item, Models.GENERATED));
  }
}
