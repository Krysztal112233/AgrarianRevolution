package dev.krysztal.advagri.entrypoint.datagen.tags;

import dev.krysztal.advagri.annotations.GenType;
import dev.krysztal.advagri.block.AdvAgriBlocks;
import dev.krysztal.advagri.util.GeneratorUtils;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MineLevelGenerator extends FabricTagProvider.BlockTagProvider {
    private static final TagKey<Block> MINE_LEVEL_0 = TagKey.of(Registry.BLOCK_KEY, new Identifier("fabric:needs_tool_level_0"));
    private static final TagKey<Block> MINE_LEVEL_1 = TagKey.of(Registry.BLOCK_KEY, new Identifier("fabric:needs_tool_level_1"));
    private static final TagKey<Block> MINE_LEVEL_2 = TagKey.of(Registry.BLOCK_KEY, new Identifier("fabric:needs_tool_level_2"));
    private static final TagKey<Block> MINE_LEVEL_3 = TagKey.of(Registry.BLOCK_KEY, new Identifier("fabric:needs_tool_level_3"));
    private static final TagKey<Block> MINE_LEVEL_4 = TagKey.of(Registry.BLOCK_KEY, new Identifier("fabric:needs_tool_level_4"));

    public MineLevelGenerator(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateTags() {
        new GeneratorUtils
                .Collector(GenType.MineLevel0)
                .<Block>collect(AdvAgriBlocks.class).forEach(super.getOrCreateTagBuilder(MINE_LEVEL_0)::add);
        new GeneratorUtils
                .Collector(GenType.MineLevel1)
                .<Block>collect(AdvAgriBlocks.class).forEach(super.getOrCreateTagBuilder(MINE_LEVEL_1)::add);
        new GeneratorUtils
                .Collector(GenType.MineLevel2)
                .<Block>collect(AdvAgriBlocks.class).forEach(super.getOrCreateTagBuilder(MINE_LEVEL_2)::add);
        new GeneratorUtils
                .Collector(GenType.MineLevel3)
                .<Block>collect(AdvAgriBlocks.class).forEach(super.getOrCreateTagBuilder(MINE_LEVEL_3)::add);
        new GeneratorUtils
                .Collector(GenType.MineLevel4)
                .<Block>collect(AdvAgriBlocks.class).forEach(super.getOrCreateTagBuilder(MINE_LEVEL_4)::add);
    }
}
