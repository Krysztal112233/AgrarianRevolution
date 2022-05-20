package dev.krysztal.advagri.block;

import dev.krysztal.advagri.AdvAgriConstants;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import org.jetbrains.annotations.NotNull;

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
    }

    private static ConfiguredFeature<?, ?> registry(ConfiguredFeature<?, ?> configuredFeature, PlacedFeature placedFeature, String path) {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(AdvAgriConstants.ADV_AGRI_NAMESPACE, "overworld_wool_ore"), configuredFeature);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(AdvAgriConstants.ADV_AGRI_NAMESPACE, path), placedFeature);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(AdvAgriConstants.ADV_AGRI_NAMESPACE, path)));
        return configuredFeature;
    }

    private static ConfiguredFeature<?, ?> nregistry(ConfiguredFeature<?, ?> configuredFeature, PlacedFeature placedFeature, String path) {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(AdvAgriConstants.ADV_AGRI_NAMESPACE, path), configuredFeature);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(AdvAgriConstants.ADV_AGRI_NAMESPACE, path), placedFeature);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(AdvAgriConstants.ADV_AGRI_NAMESPACE, path)));
        return configuredFeature;
    }

}
