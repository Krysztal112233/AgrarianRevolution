package tech.icedlab.advagri.block;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.CountPlacementModifier;
import net.minecraft.world.gen.decorator.HeightRangePlacementModifier;
import net.minecraft.world.gen.decorator.SquarePlacementModifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreConfiguredFeatures;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.PlacedFeature;
import org.jetbrains.annotations.NotNull;
import tech.icedlab.advagri.AdvAgriConstants;
import tech.icedlab.advagri.utils.AdvAgriBuilderUtils.AdvAgriConfiguredFeatureUtil;
import tech.icedlab.advagri.utils.AdvAgriBuilderUtils.AdvAgriPlacedFeatureUtil;

public class AdvAgriConfiguredFeatures {

    public static ConfiguredFeature<?, ?> SILVER_ORES;
    @NotNull
    public static PlacedFeature ORE_SILVER_OVERWORLD_PLACED_FEATURE;
    @NotNull
    public static ConfiguredFeature<?, ?> TIN_ORES;
    @NotNull
    public static PlacedFeature ORE_TIN_OVERWORLD_PLACED_FEATURE;
    @NotNull
    public static ConfiguredFeature<?, ?> ZINC_ORES;
    @NotNull
    public static PlacedFeature ORE_ZINC_OVERWORLD_PLACED_FEATURE;
    @NotNull
    public static ConfiguredFeature<?, ?> ALUMINUM_ORES;
    @NotNull
    public static PlacedFeature ORE_ALUMINUM_OVERWORLD_PLACED_FEATURE;
    @NotNull
    public static ConfiguredFeature<?, ?> LEAD_ORES;
    @NotNull
    public static PlacedFeature ORE_LEAD_OVERWORLD_PLACED_FEATURE;
    @NotNull
    public static ConfiguredFeature<?, ?> NICKEL_ORES;
    @NotNull
    public static PlacedFeature ORE_NICKEL_OVERWORLD_PLACED_FEATURE;
    @NotNull
    public static ConfiguredFeature<?, ?> TUNGSTEN_ORES;
    @NotNull
    public static PlacedFeature ORE_TUNGSTEN_OVERWORLD_PLACED_FEATURE;
    @NotNull
    public static ConfiguredFeature<?, ?> TITANIUM_ORES;
    @NotNull
    public static PlacedFeature ORE_TITANIUM_OVERWORLD_PLACED_FEATURE;
    @NotNull
    public static ConfiguredFeature<?, ?> SULPHUR_ORES;
    @NotNull
    public static PlacedFeature ORE_SULPHUR_OVERWORLD_PLACED_FEATURE;
    @NotNull
    public static ConfiguredFeature<?, ?> VERMICULITE_ORES;
    @NotNull
    public static PlacedFeature ORE_VERMICULITE_OVERWORLD_PLACED_FEATURE;
    @NotNull
    public static ConfiguredFeature<?, ?> PHOS_ORES;
    @NotNull
    public static PlacedFeature ORE_PHOS_OVERWORLD_PLACED_FEATURE;
    @NotNull
    public static ConfiguredFeature<?, ?> NETHER_SULPHUR_ORES;
    @NotNull
    public static PlacedFeature ORE_NETHER_SULPHUR_NETHER_PLACED_FEATURE;

    static {

        SILVER_ORES = Feature.ORE
            .configure(new OreFeatureConfig(
                OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                AdvAgriBlocks.SILVER_ORE.getDefaultState(),
                4));

        TIN_ORES = Feature.ORE
            .configure(new OreFeatureConfig(
                OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                AdvAgriBlocks.TIN_ORE.getDefaultState(),
                8));

        ZINC_ORES = Feature.ORE
            .configure(new OreFeatureConfig(
                OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                AdvAgriBlocks.ZINC_ORE.getDefaultState(),
                4));

        ALUMINUM_ORES = Feature.ORE
            .configure(new OreFeatureConfig(
                OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                AdvAgriBlocks.ALUMINUM_ORE.getDefaultState(),
                2));

        LEAD_ORES = Feature.ORE
            .configure(new OreFeatureConfig(
                OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                AdvAgriBlocks.LEAD_ORE.getDefaultState(),
                8));

        NICKEL_ORES = registry(AdvAgriConfiguredFeatureUtil.builder()
                .rule(OreConfiguredFeatures.STONE_ORE_REPLACEABLES)
                .block(AdvAgriBlocks.NICKEL_ORE)
                .veinSize(4)
                .build().build(),
            ORE_NICKEL_OVERWORLD_PLACED_FEATURE,
            "nickel_ores");

        TUNGSTEN_ORES = registry(AdvAgriConfiguredFeatureUtil.builder()
                .rule(OreConfiguredFeatures.STONE_ORE_REPLACEABLES)
                .block(AdvAgriBlocks.TUNGSTEN_ORE)
                .veinSize(4)
                .build().build(),
            ORE_TUNGSTEN_OVERWORLD_PLACED_FEATURE,
            "tungsten_ores");

        TITANIUM_ORES = registry(AdvAgriConfiguredFeatureUtil.builder()
                .rule(OreConfiguredFeatures.STONE_ORE_REPLACEABLES)
                .block(AdvAgriBlocks.TITANIUM_ORE)
                .veinSize(4)
                .build().build(),
            ORE_TITANIUM_OVERWORLD_PLACED_FEATURE,
            "titanium_ores");

        SULPHUR_ORES = registry(AdvAgriConfiguredFeatureUtil.builder()
                .rule(OreConfiguredFeatures.STONE_ORE_REPLACEABLES)
                .block(AdvAgriBlocks.SULPHUR_ORE)
                .veinSize(4)
                .build().build(),
            ORE_SULPHUR_OVERWORLD_PLACED_FEATURE,
            "sulphur_ores");

        VERMICULITE_ORES = registry(AdvAgriConfiguredFeatureUtil.builder()
                .rule(OreConfiguredFeatures.STONE_ORE_REPLACEABLES)
                .block(AdvAgriBlocks.VERMICULITE_ORE)
                .veinSize(4)
                .build().build(),
            ORE_VERMICULITE_OVERWORLD_PLACED_FEATURE,
            "vermiculite");

        PHOS_ORES = registry(AdvAgriConfiguredFeatureUtil.builder()
                .rule(OreConfiguredFeatures.STONE_ORE_REPLACEABLES)
                .block(AdvAgriBlocks.PHOS_ORE)
                .veinSize(8)
                .build().build(),
            ORE_PHOS_OVERWORLD_PLACED_FEATURE,
            "phos_ores");

        NETHER_SULPHUR_ORES = registry(AdvAgriConfiguredFeatureUtil.builder()
                .rule(OreConfiguredFeatures.NETHERRACK)
                .block(AdvAgriBlocks.NETHER_SULPHUR_ORE)
                .veinSize(16)
                .build().build(),
            ORE_NETHER_SULPHUR_NETHER_PLACED_FEATURE,
            "nether_sulphur_ore");

        ORE_PHOS_OVERWORLD_PLACED_FEATURE = AdvAgriPlacedFeatureUtil.builder()
            .cfg(PHOS_ORES)
            .numberPerChunk(4)
            .spreadingHorizontally(true)
            .bottom(0).height(192)
            .build().build();
        ORE_VERMICULITE_OVERWORLD_PLACED_FEATURE = AdvAgriPlacedFeatureUtil.builder()
            .cfg(VERMICULITE_ORES)
            .numberPerChunk(32)
            .spreadingHorizontally(true)
            .bottom(48).height(160)
            .build().build();
        ORE_SULPHUR_OVERWORLD_PLACED_FEATURE = AdvAgriPlacedFeatureUtil.builder()
            .cfg(SULPHUR_ORES)
            .numberPerChunk(16)
            .spreadingHorizontally(true)
            .bottom(16).height(96)
            .build().build();
        ORE_TITANIUM_OVERWORLD_PLACED_FEATURE = AdvAgriPlacedFeatureUtil.builder()
            .cfg(TITANIUM_ORES)
            .numberPerChunk(1)
            .spreadingHorizontally(true)
            .bottom(-64).height(-32)
            .build().build();
        ORE_TUNGSTEN_OVERWORLD_PLACED_FEATURE = AdvAgriPlacedFeatureUtil.builder()
            .cfg(TUNGSTEN_ORES)
            .numberPerChunk(4)
            .spreadingHorizontally(true)
            .bottom(-64).height(-16)
            .build().build();
        ORE_NICKEL_OVERWORLD_PLACED_FEATURE = AdvAgriPlacedFeatureUtil.builder()
            .cfg(NICKEL_ORES)
            .numberPerChunk(8)
            .spreadingHorizontally(true)
            .bottom(-64).height(48)
            .build().build();
        ORE_LEAD_OVERWORLD_PLACED_FEATURE = AdvAgriPlacedFeatureUtil.builder()
            .cfg(LEAD_ORES)
            .numberPerChunk(4)
            .spreadingHorizontally(true)
            .bottom(0).height(160)
            .build().build();
        ORE_ALUMINUM_OVERWORLD_PLACED_FEATURE = AdvAgriPlacedFeatureUtil.builder()
            .cfg(ALUMINUM_ORES)
            .numberPerChunk(32)
            .spreadingHorizontally(true)
            .bottom(-64).height(256)
            .build().build();
        ORE_ZINC_OVERWORLD_PLACED_FEATURE = AdvAgriPlacedFeatureUtil.builder()
            .cfg(ZINC_ORES)
            .numberPerChunk(16)
            .spreadingHorizontally(true)
            .bottom(-64).height(64)
            .build().build();
        ORE_TIN_OVERWORLD_PLACED_FEATURE = AdvAgriPlacedFeatureUtil.builder()
            .cfg(TIN_ORES)
            .numberPerChunk(16)
            .spreadingHorizontally(true)
            .bottom(0).height(256)
            .build().build();
        ORE_SILVER_OVERWORLD_PLACED_FEATURE =
            SILVER_ORES.withPlacement(
                CountPlacementModifier.of(8),
                SquarePlacementModifier.of(),
                HeightRangePlacementModifier.uniform(YOffset.aboveBottom(-32),
                    YOffset.fixed(64))
            );

        ORE_NETHER_SULPHUR_NETHER_PLACED_FEATURE =
            NETHER_SULPHUR_ORES.withPlacement(
                CountPlacementModifier.of(8),
                SquarePlacementModifier.of(),
                HeightRangePlacementModifier.uniform(YOffset.aboveBottom(-32), YOffset.fixed(64))
            );
    }

    private static ConfiguredFeature<?, ?> registry(ConfiguredFeature<?, ?> configuredFeature,
        PlacedFeature placedFeature, String path) {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
            new Identifier(AdvAgriConstants.ADV_AGRI_NAMESPACE, "overworld_wool_ore"),
            configuredFeature);
        Registry.register(BuiltinRegistries.PLACED_FEATURE,
            new Identifier(AdvAgriConstants.ADV_AGRI_NAMESPACE, path),
            placedFeature);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
            GenerationStep.Feature.UNDERGROUND_ORES,
            RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                new Identifier(AdvAgriConstants.ADV_AGRI_NAMESPACE, path)));
        return configuredFeature;
    }

    private static ConfiguredFeature<?, ?> nregistry(ConfiguredFeature<?, ?> configuredFeature,
        PlacedFeature placedFeature, String path) {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
            new Identifier(AdvAgriConstants.ADV_AGRI_NAMESPACE, path), configuredFeature);
        Registry.register(BuiltinRegistries.PLACED_FEATURE,
            new Identifier(AdvAgriConstants.ADV_AGRI_NAMESPACE, path),
            placedFeature);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(),
            GenerationStep.Feature.UNDERGROUND_ORES,
            RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                new Identifier(AdvAgriConstants.ADV_AGRI_NAMESPACE, path)));
        return configuredFeature;
    }

}
