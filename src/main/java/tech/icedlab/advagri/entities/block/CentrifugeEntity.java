package tech.icedlab.advagri.entities.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class CentrifugeEntity extends BlockEntity {

    public CentrifugeEntity(BlockPos pos, BlockState state) {
        super(AdvAgriBlockEntities.CENTRIFUGE_ENTITY, pos, state);
    }
}
