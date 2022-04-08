package dev.krysztal.advagri.entities.block;

import dev.krysztal.advagri.block.AdvAgriBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.registry.Registry;
import org.jetbrains.annotations.NotNull;
import dev.krysztal.advagri.AdvAgriConstants;

public class AdvAgriBlockEntities {

    @NotNull
    public static BlockEntityType<BambooBlockEntity> BAMBOO_BLOCK_ENTITY;
    @NotNull
    public static BlockEntityType<FermentTankEntity> FERMENT_TANK_ENTITY;
    @NotNull
    public static BlockEntityType<BurningTankEntity> BURNING_TANK_ENTITY;
    @NotNull
    public static BlockEntityType<SolarHighTemperatureElectrolyzeMachineEntity> SHTE_ENTITY;
    @NotNull
    public static BlockEntityType<SunshineLiquefiesMachineEntity> SL_ENTITY;
    @NotNull
    public static BlockEntityType<CrusherEntity> CRUSHER_ENTITY;
    @NotNull
    public static BlockEntityType<ExtractorEntity> EXTRACTOR_ENTITY;
    @NotNull
    public static BlockEntityType<CentrifugeEntity> CENTRIFUGE_ENTITY;
    @NotNull
    public static BlockEntityType<OreWashingMachineEntity> ORE_WASHING_MACHINE_ENTITY;
    @NotNull
    public static BlockEntityType<ResinExtractorEntity> RESIN_EXTRACTOR_ENTITY;
    @NotNull
    public static BlockEntityType<AdvancedCraftingTableEntity> ADVANCED_CRAFTING_TABLE_ENTITY;

    static {
        BAMBOO_BLOCK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
            AdvAgriConstants.ADV_AGRI_NAMESPACE + ":bamboo_block",
            FabricBlockEntityTypeBuilder.create(BambooBlockEntity::new,
                AdvAgriBlocks.BAMBOO_BLOCK).build(null));

        FERMENT_TANK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
            AdvAgriConstants.ADV_AGRI_NAMESPACE + ":ferment_tank.json",
            FabricBlockEntityTypeBuilder.create(FermentTankEntity::new,
                AdvAgriBlocks.FERMENT_TANK).build(null));

        BURNING_TANK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
            AdvAgriConstants.ADV_AGRI_NAMESPACE + ":burning_tank",
            FabricBlockEntityTypeBuilder.create(BurningTankEntity::new,
                AdvAgriBlocks.BURNING_TANK).build(null));

        SHTE_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
            AdvAgriConstants.ADV_AGRI_NAMESPACE
                + ":shte",
            FabricBlockEntityTypeBuilder.create(SolarHighTemperatureElectrolyzeMachineEntity::new,
                    AdvAgriBlocks.SHTEMachine)
                .build(null));

        SL_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
            AdvAgriConstants.ADV_AGRI_NAMESPACE
                + ":sl",
            FabricBlockEntityTypeBuilder.create(SunshineLiquefiesMachineEntity::new,
                AdvAgriBlocks.SLMACHINE).build(null));

        CRUSHER_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
            AdvAgriConstants.ADV_AGRI_NAMESPACE
                + ":crusher",
            FabricBlockEntityTypeBuilder.create(CrusherEntity::new,
                    AdvAgriBlocks.CRUSHER)
                .build(null));

        EXTRACTOR_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
            AdvAgriConstants.ADV_AGRI_NAMESPACE + ":extractor",
            FabricBlockEntityTypeBuilder.create(ExtractorEntity::new,
                AdvAgriBlocks.EXTRACTOR).build(null));

        CENTRIFUGE_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
            AdvAgriConstants.ADV_AGRI_NAMESPACE + ":centrifuge",
            FabricBlockEntityTypeBuilder.create(CentrifugeEntity::new,
                AdvAgriBlocks.CENTRIFUGE).build(null));

        ORE_WASHING_MACHINE_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
            AdvAgriConstants.ADV_AGRI_NAMESPACE + ":ore_washing_machine",
            FabricBlockEntityTypeBuilder.create(OreWashingMachineEntity::new,
                AdvAgriBlocks.ORE_WASHING_MACHINE).build(null));

        RESIN_EXTRACTOR_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
            AdvAgriConstants.ADV_AGRI_NAMESPACE + ":resin_extractor",
            FabricBlockEntityTypeBuilder.create(ResinExtractorEntity::new,
                AdvAgriBlocks.RESIN_EXTRACTOR).build(null));

        ADVANCED_CRAFTING_TABLE_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
            AdvAgriConstants.ADV_AGRI_NAMESPACE + ":advanced_crafting_table",
            FabricBlockEntityTypeBuilder.create(AdvancedCraftingTableEntity::new,
                AdvAgriBlocks.ACT).build(null));
    }

}
