package dev.krysztal.advagri.entities.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class SunshineLiquefiesMachineEntity extends BlockEntity {

    public SunshineLiquefiesMachineEntity(BlockPos pos, BlockState state) {
        super(AdvAgriBlockEntities.SL_ENTITY, pos, state);
    }
}
