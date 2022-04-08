package tech.icedlab.advagri.entities.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class FermentTankEntity extends BlockEntity {

    public FermentTankEntity(BlockPos pos, BlockState state) {
        super(AdvAgriBlockEntities.FERMENT_TANK_ENTITY, pos, state);
    }
}
