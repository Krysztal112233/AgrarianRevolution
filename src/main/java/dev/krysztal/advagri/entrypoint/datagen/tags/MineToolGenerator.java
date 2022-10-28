package dev.krysztal.advagri.entrypoint.datagen.tags;

import dev.krysztal.advagri.foundation.util.annotations.GenType;
import dev.krysztal.advagri.block.AdvAgriBlocks;
import dev.krysztal.advagri.foundation.util.GeneratorUtils;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MineToolGenerator extends FabricTagProvider<Block> {

    private static final TagKey<Block> MINE_AXE = TagKey.of(Registry.BLOCK_KEY, new Identifier("minecraft:axe"));
    private static final TagKey<Block> MINE_PICKAXE = TagKey.of(Registry.BLOCK_KEY, new Identifier("minecraft:pickaxe"));
    private static final TagKey<Block> MINE_SWORD = TagKey.of(Registry.BLOCK_KEY, new Identifier("minecraft:sword"));
    private static final TagKey<Block> MINE_HOE = TagKey.of(Registry.BLOCK_KEY, new Identifier("minecraft:hoe"));
    private static final TagKey<Block> MINE_SHOVEL = TagKey.of(Registry.BLOCK_KEY, new Identifier("minecraft:shovel"));

    public MineToolGenerator(FabricDataGenerator dataGenerator) {
        super(dataGenerator, Registry.BLOCK, "mineable", "Mineable Tag");
    }

    @Override
    protected void generateTags() {
        new GeneratorUtils
                .Collector(GenType.MineAxe)
                .<Block>collect(AdvAgriBlocks.class).forEach(super.getOrCreateTagBuilder(MINE_AXE)::add);

        new GeneratorUtils
                .Collector(GenType.MineShovel)
                .<Block>collect(AdvAgriBlocks.class).forEach(super.getOrCreateTagBuilder(MINE_SHOVEL)::add);

        new GeneratorUtils
                .Collector(GenType.MinePickaxe)
                .<Block>collect(AdvAgriBlocks.class).forEach(super.getOrCreateTagBuilder(MINE_PICKAXE)::add);

        new GeneratorUtils
                .Collector(GenType.MineSword)
                .<Block>collect(AdvAgriBlocks.class).forEach(super.getOrCreateTagBuilder(MINE_SWORD)::add);

        new GeneratorUtils
                .Collector(GenType.MineHoe)
                .<Block>collect(AdvAgriBlocks.class).forEach(super.getOrCreateTagBuilder(MINE_HOE)::add);
    }
}

