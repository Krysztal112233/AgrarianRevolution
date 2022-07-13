package dev.krysztal.advagri.block.impls.machines;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;
import dev.krysztal.advagri.entities.block.OreWashingMachineEntity;

public class OreWashingMachine extends Machine implements BlockEntityProvider {

    public OreWashingMachine(FabricBlockSettings settings) {
        super(settings);
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new OreWashingMachineEntity(pos, state);
    }
}
