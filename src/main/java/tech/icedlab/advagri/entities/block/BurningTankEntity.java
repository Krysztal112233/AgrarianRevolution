package tech.icedlab.advagri.entities.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class BurningTankEntity extends BlockEntity {

    public BurningTankEntity(BlockPos pos, BlockState state) {
        super(AdvAgriBlockEntities.BURNING_TANK_ENTITY, pos, state);
    }
}
