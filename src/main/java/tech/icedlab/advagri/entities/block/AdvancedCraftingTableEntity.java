package tech.icedlab.advagri.entities.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class AdvancedCraftingTableEntity extends BlockEntity {

    public AdvancedCraftingTableEntity(BlockPos pos, BlockState state) {
        super(AdvAgriBlockEntities.ADVANCED_CRAFTING_TABLE_ENTITY, pos, state);
    }
}
