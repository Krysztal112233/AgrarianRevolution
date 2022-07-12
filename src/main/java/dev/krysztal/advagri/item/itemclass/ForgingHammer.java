package dev.krysztal.advagri.item.itemclass;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


public class ForgingHammer extends Item {

    public ForgingHammer(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {

        return ActionResult.PASS;
    }


    public boolean isUnderBlockAnvil(BlockPos blockPos, World world) {
        Block getBlock = world.getBlockState(new BlockPos(blockPos.getX(), blockPos.getY() - 1, blockPos.getZ())).getBlock();
        return getBlock.equals(Blocks.ANVIL) || getBlock.equals(Blocks.CHIPPED_ANVIL) || getBlock.equals(Blocks.DAMAGED_ANVIL);
    }
}