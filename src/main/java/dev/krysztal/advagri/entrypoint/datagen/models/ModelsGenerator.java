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

  // log & wood type.
  private static final List<Pair<Block, Block>> LOG_WOOD = List.of(
    new Pair<Block, Block>(
      AdvAgriBlocks.GINKGO_LOG.get(),
      AdvAgriBlocks.GINKGO_WOOD.get()
    ),
    new Pair<Block, Block>(
      AdvAgriBlocks.STRIPPED_GINKGO_LOG.get(),
      AdvAgriBlocks.STRIPPED_GINKGO_WOOD.get()
    )
  );

  // Collect simple block states
  private static final List<Block> SIMPLE_BLOCK_STATE = new GeneratorUtils.Collector(
    GenType.SimpleBlockState
  )
    .<Block>collect(AdvAgriBlocks.class);

  // Collect simple block models
  private static final List<Block> SIMPLE_BLOCK_MODEL = new GeneratorUtils.Collector(
    GenType.SimpleBlockModel
  )
    .<Block>collect(AdvAgriBlocks.class);

  public ModelsGenerator(FabricDataGenerator dataGenerator) {
    super(dataGenerator);
  }

  @Override
  public void generateBlockStateModels(
    BlockStateModelGenerator blockStateModelGenerator
  ) {
    SIMPLE_BLOCK_MODEL.forEach(blockStateModelGenerator::registerSimpleCubeAll);

    SIMPLE_BLOCK_STATE.forEach(blockStateModelGenerator::registerSimpleState);

    LOG_WOOD.forEach(block ->
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
