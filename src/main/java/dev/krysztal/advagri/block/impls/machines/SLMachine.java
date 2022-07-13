package dev.krysztal.advagri.block.impls.machines;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;
import dev.krysztal.advagri.entities.block.SunshineLiquefiesMachineEntity;

/**
 * SunshineLiquefiesMachine
 */
public class SLMachine extends Machine implements BlockEntityProvider {

    public SLMachine(FabricBlockSettings settings) {
        super(settings);
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new SunshineLiquefiesMachineEntity(pos, state);
    }
}
