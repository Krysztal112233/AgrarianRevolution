package dev.krysztal.advagri.item.impls;

import dev.krysztal.advagri.foundation.AdvAgriTagBlock;
import dev.krysztal.advagri.foundation.tools.AdvAgriTools.AdvAgriSwordItem;
import lombok.extern.log4j.Log4j2;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

@Log4j2
public class BambooChopper extends AdvAgriSwordItem {

    public BambooChopper(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        Direction minerFacing = miner.getHorizontalFacing();
        if (minerFacing.equals(Direction.EAST)) {
            //Z-2,X
            breakIfEAST(pos, state, world);
        } else if (minerFacing.equals(Direction.NORTH)) {
            //X-2,Z
            breakIfNORTH(pos, state, world);
        } else if (minerFacing.equals(Direction.SOUTH)) {
            //X+2,Z
            breakIfSOUTH(pos, state, world);
        } else if (minerFacing.equals(Direction.WEST)) {
            //Z+2,X
            breakIfWEST(pos, state, world);
        }
        return super.postMine(stack, world, state, pos, miner);
    }

    private void breakIfEAST(BlockPos blockPos, BlockState state, World world) {
        for (int X = 0; X <= 4; X++) {
            for (int Z = -2; Z <= 2; Z++) {
                if (matchBlock(world.getBlockState(new BlockPos(blockPos.getX() + X, blockPos.getY(), blockPos.getZ() + Z)))) {
                    world.breakBlock(new BlockPos(blockPos.getX() + X, blockPos.getY(), blockPos.getZ() + Z), true);
                }
            }
        }
    }

    private void breakIfNORTH(BlockPos blockPos, BlockState state, World world) {
        for (int X = -2; X <= 2; X++) {
            forward(blockPos, world, X, 0, 4);
        }
    }

    private void breakIfSOUTH(BlockPos blockPos, BlockState state, World world) {
        for (int X = 2; X >= -2; X--) {
            for (int Z = 0; Z <= 4; Z++) {
                if (matchBlock(world.getBlockState(new BlockPos(blockPos.getX() + X, blockPos.getY(), blockPos.getZ() + Z)))) {
                    world.breakBlock(new BlockPos(blockPos.getX() + X, blockPos.getY(), blockPos.getZ() + Z), true);
                }
            }
        }
    }

    private void breakIfWEST(BlockPos blockPos, BlockState state, World world) {
        for (int X = 0; X >= -4; X--) {
            forward(blockPos, world, X, 2, 2);
        }
    }

    private void forward(BlockPos blockPos, World world, int x, int i, int i2) {
        for (int Z = i; Z >= -i2; Z--) {
            if (matchBlock(world.getBlockState(new BlockPos(blockPos.getX() + x, blockPos.getY(), blockPos.getZ() + Z)))) {
                world.breakBlock(new BlockPos(blockPos.getX() + x, blockPos.getY(), blockPos.getZ() + Z), true);
            }
        }
    }

    private boolean matchBlock(BlockState blockState) {
        return blockState.isIn(AdvAgriTagBlock.FELLABLE);
    }


}
