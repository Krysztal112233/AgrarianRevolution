package dev.krysztal.advagri.item.impls;

import dev.krysztal.advagri.foundation.AdvAgriTags;
import dev.krysztal.advagri.foundation.tool.AdvAgriTools.AdvAgriSwordItem;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BambooChopper extends AdvAgriSwordItem {

  public BambooChopper(
    ToolMaterial toolMaterial,
    int attackDamage,
    float attackSpeed,
    Settings settings
  ) {
    super(toolMaterial, attackDamage, attackSpeed, settings);
  }

  @Override
  public boolean postMine(
    ItemStack stack,
    World world,
    BlockState state,
    BlockPos pos,
    LivingEntity miner
  ) {
    var damageAmount = 1;

    for (int i = -2; i <= 2; i++) {
      for (int j = -2; j <= 2; j++) {
        BlockPos tPos = new BlockPos(
          pos.getX() + i,
          pos.getY(),
          pos.getZ() + j
        );
        if (match(world.getBlockState(tPos))) {
          world.breakBlock(tPos, true, miner);
          damageAmount++;
        }
      }
    }

    stack.damage(
      damageAmount,
      miner,
      livingEntity ->
        livingEntity.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND)
    );

    return super.postMine(stack, world, state, pos, miner);
  }

  private boolean match(BlockState blockState) {
    return blockState.isIn(AdvAgriTags.BlockTags.FELLABLE);
  }
}
