package tech.icedlab.advagri.entities.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class CrusherEntity extends BlockEntity {

    public CrusherEntity(BlockPos pos, BlockState state) {
        super(AdvAgriBlockEntities.CRUSHER_ENTITY, pos, state);
    }
}
