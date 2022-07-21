package dev.krysztal.advagri.item.impls;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.tag.BlockTags;
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


    @Override
    public void onCraft(ItemStack stack, World world, PlayerEntity player) {
        super.onCraft(stack, world, player);
    }

    public boolean isUpperAnvil(BlockPos blockPos, World world) {
        return world.getBlockState(new BlockPos(blockPos.getX(), blockPos.getY() - 1, blockPos.getZ())).isIn(BlockTags.ANVIL);
    }
}