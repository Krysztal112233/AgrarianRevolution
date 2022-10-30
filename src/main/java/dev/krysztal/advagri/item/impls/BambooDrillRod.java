package dev.krysztal.advagri.item.impls;

import dev.krysztal.advagri.block.AdvAgriBlocks;
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
      var b = context
        .getWorld()
        .getBlockState(context.getBlockPos())
        .getBlock();
      if (
        b.equals(AdvAgriBlocks.SULPHUR_ORE) ||
        b.equals(AdvAgriBlocks.NETHER_SULPHUR_ORE)
      ) {
        context.getWorld().breakBlock(context.getBlockPos(), true);
        return ActionResult.SUCCESS;
      }
    }
    return super.useOnBlock(context);
  }
}
