package dev.krysztal.advagri.item.impls;

import java.util.Objects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import dev.krysztal.advagri.block.impls.machines.Machine;

public class Wench extends Item {

    public Wench(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if (Machine.class.isAssignableFrom(
            context.getWorld().getBlockState(context.getBlockPos()).getBlock().getClass())
            && Objects.requireNonNull(context.getPlayer()).isInSneakingPose()) {
            if (!context.getWorld().isClient) {
                context.getWorld().breakBlock(context.getBlockPos(), true);
            }
            return ActionResult.SUCCESS;
        }
        return super.useOnBlock(context);
    }
}
