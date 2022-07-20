package dev.krysztal.advagri.block.impls.ores;

import dev.krysztal.advagri.item.AdvAgriItems;
import lombok.Setter;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;

import java.util.Random;

public class SulphurOre extends AdvAgriOreBlock {

    @Setter
    private int explosionChance = 15;

    public SulphurOre(Settings settings) {
        super(settings);
    }

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {

        super.onBreak(world, pos, state, player);
        int rad = new Random().nextInt(100);

        if (!player.isCreative()
                && rad <= explosionChance
                && (!player.getMainHandStack().isItemEqual(new ItemStack(AdvAgriItems.BAMBOO_DRILL_ROD)))) {
            world.createExplosion(
                    player,
                    pos.getX(),
                    pos.getY(),
                    pos.getZ(),
                    2F,
                    Explosion.DestructionType.BREAK);
        }
    }
}
