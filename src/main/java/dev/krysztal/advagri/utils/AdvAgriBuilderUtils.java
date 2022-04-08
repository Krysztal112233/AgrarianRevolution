package dev.krysztal.advagri.utils;

import java.util.ArrayList;
import lombok.Builder;
import lombok.Builder.Default;
import net.minecraft.block.Block;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.CountPlacementModifier;
import net.minecraft.world.gen.decorator.HeightRangePlacementModifier;
import net.minecraft.world.gen.decorator.SquarePlacementModifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.PlacedFeature;

public class AdvAgriBuilderUtils {

    @Builder
    public static class AdvAgriConfiguredFeatureUtil {

        RuleTest rule;
        @Default
        Integer veinSize = 9;
        Float discardOnAirChance;
        Block block;

        public ConfiguredFeature<?, ?> build() {
            return Feature.ORE.configure(
                new OreFeatureConfig(
                    this.rule,
                    block.getDefaultState(),
                    this.veinSize)); // vein size
        }
    }

    /**
     * 设置方块放置特性的实用类
     *
     * @author suibing112233
     */
    @Builder
    public static class AdvAgriPlacedFeatureUtil {

        ConfiguredFeature<?, ?> cfg;

        @Default
        ArrayList<net.minecraft.world.gen.decorator.PlacementModifier> modifiers = new ArrayList<>();

        /**
         * 是否为横向拓展
         * <p>
         * 默认为不横向拓展
         */
        @Default
        boolean spreadingHorizontally = false;

        /**
         * 每个<em>chunk</em>出现的矿丛数量
         */
        Integer numberPerChunk;

        /**
         * 矿物生成的最大高度</br>
         */
        Integer height;

        /**
         * 矿物生成的最低高度</br>
         */
        Integer bottom;

        public PlacedFeature build() {
            if (this.spreadingHorizontally) {
                this.modifiers.add(SquarePlacementModifier.of());
            }

            if (this.numberPerChunk != null) {
                this.modifiers.add(CountPlacementModifier.of(this.numberPerChunk));
            }

            if (this.height != null && this.bottom != null) {
                this.modifiers.add(
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(this.bottom),
                        YOffset.fixed(this.height)));
            }

            return cfg.withPlacement(this.modifiers); // height
        }
    }
}
