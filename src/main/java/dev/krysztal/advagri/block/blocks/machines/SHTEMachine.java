package dev.krysztal.advagri.block.blocks.machines;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;
import dev.krysztal.advagri.entities.block.SolarHighTemperatureElectrolyzeMachineEntity;

/**
 * SolarHighTemperatureElectrolyzeMachine
 */
public class SHTEMachine extends Machine implements BlockEntityProvider {

    public SHTEMachine(FabricBlockSettings settings) {
        super(settings);
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new SolarHighTemperatureElectrolyzeMachineEntity(pos, state);
    }
}
