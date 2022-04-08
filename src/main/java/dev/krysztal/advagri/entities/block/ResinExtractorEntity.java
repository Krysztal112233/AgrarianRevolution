package dev.krysztal.advagri.entities.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class ResinExtractorEntity extends BlockEntity {

    public ResinExtractorEntity(BlockPos pos, BlockState state) {
        super(AdvAgriBlockEntities.RESIN_EXTRACTOR_ENTITY, pos, state);
    }
}
