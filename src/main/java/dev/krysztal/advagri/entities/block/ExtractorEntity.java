package dev.krysztal.advagri.entities.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class ExtractorEntity extends BlockEntity {

    public ExtractorEntity(BlockPos pos, BlockState state) {
        super(AdvAgriBlockEntities.EXTRACTOR_ENTITY, pos, state);
    }
}
