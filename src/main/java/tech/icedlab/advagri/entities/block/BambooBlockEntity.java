package tech.icedlab.advagri.entities.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.BlockPos;

public class BambooBlockEntity extends BlockEntity {

    public int age = 1;
    public int life = 0;

    public BambooBlockEntity(BlockPos pos, BlockState state) {
        super(AdvAgriBlockEntities.BAMBOO_BLOCK_ENTITY, pos, state);
    }

    @Override
    public void writeNbt(NbtCompound tag) {
        super.writeNbt(tag);

        tag.putInt("age", age);
        tag.putInt("life", life);
    }

    @Override
    public void readNbt(NbtCompound tag) {
        age = tag.getInt("age");
        life = tag.getInt("life");
        super.readNbt(tag);
    }

}
