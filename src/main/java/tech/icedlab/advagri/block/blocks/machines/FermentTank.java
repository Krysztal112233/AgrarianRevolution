package tech.icedlab.advagri.block.blocks.machines;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;
import tech.icedlab.advagri.entities.block.FermentTankEntity;

public class FermentTank extends Machine implements BlockEntityProvider {

    public FermentTank(FabricBlockSettings settings) {
        super(settings);
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new FermentTankEntity(pos, state);
    }
}
