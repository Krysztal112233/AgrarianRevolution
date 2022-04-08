package dev.krysztal.advagri.item.itemclass;

import dev.krysztal.advagri.item.itemutil.ForgingHammerStorage;
import java.util.Objects;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import dev.krysztal.advagri.item.itemutil.ForgingHammerUtil;


public class ForgingHammer extends Item {

    public ForgingHammer(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {

        var blockList = ForgingHammerStorage.getINSTANCE();
        var block = context.getWorld().getBlockState(context.getBlockPos()).getBlock();
        var blockPos = context.getBlockPos();

        if (context.getWorld().isClient()) {
            if (matchMetalBlock(block)) {
                if (isUnderBlockAnvil(blockPos, context.getWorld())) {
                    Objects.requireNonNull(context.getPlayer())
                        .playSound(SoundEvents.BLOCK_ANVIL_LAND, 0.7F, 1F);
                }
            }
        }

        if (!context.getWorld().isClient()) {
            if (!isUnderBlockAnvil(blockPos, context.getWorld()) && matchMetalBlock(block)) {
                return ActionResult.PASS;
            }

            if (matchMetalBlock(block)) {
                if (!blockList.containsKey(context.getBlockPos())) {//不存在但是是可敲打方块
                    blockList.put(context.getBlockPos(), 1);
                    return ActionResult.SUCCESS;
                } else if (blockList.get(context.getBlockPos()) > 8) {//存在但是敲打次数超过了9次
                    blockList.remove(blockPos);
                    if (matchMetalBlock(block)) {
                        dropPlate(block, context.getBlockPos(), context.getWorld());
                    }
                    return ActionResult.SUCCESS;
                } else {//敲打累增
                    blockList.put(blockPos, blockList.get(context.getBlockPos()) + 1);
                    return ActionResult.SUCCESS;
                }
            }
        }
        return ActionResult.PASS;
    }

    public boolean matchMetalBlock(Block block) {
        return ForgingHammerUtil.getINSTANCE().isBlockContained(block);
    }

    public void dropPlate(Block block, BlockPos blockPos, World world) {
        world.breakBlock(blockPos, false);
        new ItemEntity(world, blockPos.getX(), blockPos.getY(), blockPos.getZ(),
            new ItemStack(ForgingHammerUtil.getINSTANCE().getPlate(block))).dropStack(
            new ItemStack(ForgingHammerUtil.getINSTANCE().getPlate(block), 18));
    }

    public boolean isUnderBlockAnvil(BlockPos blockPos, World world) {
        Block getBlock = world.getBlockState(
            new BlockPos(blockPos.getX(), blockPos.getY() - 1, blockPos.getZ())).getBlock();
        return getBlock.equals(Blocks.ANVIL) || getBlock.equals(Blocks.CHIPPED_ANVIL)
            || getBlock.equals(Blocks.DAMAGED_ANVIL);
    }
}