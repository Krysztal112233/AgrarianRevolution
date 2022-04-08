package tech.icedlab.advagri.item.itemclass;

import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import tech.icedlab.advagri.item.itemutil.BambooChopperUtil;
import tech.icedlab.advagri.item.tools.AdvAgriTools.AdvAgriSwordItem;

public class BambooChopper extends AdvAgriSwordItem {

    public BambooChopper(ToolMaterial toolMaterial, int attackDamage, float attackSpeed,
        Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos,
        LivingEntity miner) {
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
                if (matchBlock(world.getBlockState(
                    new BlockPos(blockPos.getX() + X, blockPos.getY(), blockPos.getZ() + Z)))) {
                    world.breakBlock(
                        new BlockPos(blockPos.getX() + X, blockPos.getY(), blockPos.getZ() + Z),
                        true);
                }
            }
        }
    }

    private void breakIfNORTH(BlockPos blockPos, BlockState state, World world) {
        for (int X = -2; X <= 2; X++) {
            for (int Z = 0; Z >= -4; Z--) {
                if (matchBlock(world.getBlockState(
                    new BlockPos(blockPos.getX() + X, blockPos.getY(), blockPos.getZ() + Z)))) {
                    world.breakBlock(
                        new BlockPos(blockPos.getX() + X, blockPos.getY(), blockPos.getZ() + Z),
                        true);
                }
            }
        }
    }

    private void breakIfSOUTH(BlockPos blockPos, BlockState state, World world) {
        for (int X = 2; X >= -2; X--) {
            for (int Z = 0; Z <= 4; Z++) {
                if (matchBlock(world.getBlockState(
                    new BlockPos(blockPos.getX() + X, blockPos.getY(), blockPos.getZ() + Z)))) {
                    world.breakBlock(
                        new BlockPos(blockPos.getX() + X, blockPos.getY(), blockPos.getZ() + Z),
                        true);
                }
            }
        }
    }

    private void breakIfWEST(BlockPos blockPos, BlockState state, World world) {
        for (int X = 0; X >= -4; X--) {
            for (int Z = 2; Z >= -2; Z--) {
                if (matchBlock(world.getBlockState(
                    new BlockPos(blockPos.getX() + X, blockPos.getY(), blockPos.getZ() + Z)))) {
                    world.breakBlock(
                        new BlockPos(blockPos.getX() + X, blockPos.getY(), blockPos.getZ() + Z),
                        true);
                }
            }
        }
    }

    private boolean matchBlock(BlockState blockState) {
        return BambooChopperUtil.getInstance().check(blockState);
    }

}
