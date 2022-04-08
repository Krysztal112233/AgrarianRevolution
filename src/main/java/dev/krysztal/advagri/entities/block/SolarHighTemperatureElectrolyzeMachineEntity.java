package dev.krysztal.advagri.entities.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class SolarHighTemperatureElectrolyzeMachineEntity extends BlockEntity {

    public SolarHighTemperatureElectrolyzeMachineEntity(BlockPos pos, BlockState state) {
        super(AdvAgriBlockEntities.SHTE_ENTITY, pos, state);
    }
}
