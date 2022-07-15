package dev.krysztal.advagri.entities.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class WashingMachineEntity extends BlockEntity {

    public WashingMachineEntity(BlockPos pos, BlockState state) {
        super(AdvAgriBlockEntities.WASHING_MACHINE_ENTITY, pos, state);
    }
}
