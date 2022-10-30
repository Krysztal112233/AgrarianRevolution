package dev.krysztal.advagri.item.impls;

import dev.krysztal.advagri.foundation.AdvAgriTags;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;

public class BambooDrillRod extends Item {

  public BambooDrillRod(Settings settings) {
    super(settings);
  }

  @Override
  public ActionResult useOnBlock(ItemUsageContext context) {
    if (!context.getWorld().isClient) {
      var block = context
        .getWorld()
        .getBlockState(context.getBlockPos())
        .getBlock();

      if (block.getDefaultState().isIn(AdvAgriTags.BlockTags.SULPHUR_ORE)) {
        context.getWorld().breakBlock(context.getBlockPos(), true);
        return ActionResult.SUCCESS;
      }
    }
    return super.useOnBlock(context);
  }
}
