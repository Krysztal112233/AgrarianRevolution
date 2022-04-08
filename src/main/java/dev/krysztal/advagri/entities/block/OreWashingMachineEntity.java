package dev.krysztal.advagri.entities.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class OreWashingMachineEntity extends BlockEntity {

    public OreWashingMachineEntity(BlockPos pos, BlockState state) {
        super(AdvAgriBlockEntities.ORE_WASHING_MACHINE_ENTITY, pos, state);
    }
}
