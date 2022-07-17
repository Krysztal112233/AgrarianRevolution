package dev.krysztal.advagri.item.impls;

import dev.krysztal.advagri.AdvAgriTagBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;

import java.util.Objects;

public class Wrench extends Item {

    public Wrench(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if (Objects.requireNonNull(context.getPlayer()).isInSneakingPose()) {
            if (!context.getWorld().isClient && context.getWorld().getBlockState(context.getBlockPos()).isIn(AdvAgriTagBlock.MACHINE)) {
                context.getWorld().breakBlock(context.getBlockPos(), true);
            }
            return ActionResult.SUCCESS;
        }
        return super.useOnBlock(context);
    }
}
