package tech.icedlab.advagri.block.blocks.ores;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.WorldAccess;
import tech.icedlab.advagri.block.AdvAgriBlocks;

public class AdvAgriOreBlock extends Block {

    public AdvAgriOreBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onBroken(WorldAccess world, BlockPos pos, BlockState state) {
        super.onBroken(world, pos, state);
    }

    protected int getExperienceWhenMined(Random random) {
        if (this == AdvAgriBlocks.SULPHUR_ORE
            || this == AdvAgriBlocks.NETHER_SULPHUR_ORE
            || this == AdvAgriBlocks.PHOS_ORE) {
            return MathHelper.nextInt(random, 0, 2);
        } else {
            return 0;
        }
    }

    @Override
    public void onStacksDropped(BlockState state, ServerWorld world, BlockPos pos,
        ItemStack stack) {
        super.onStacksDropped(state, world, pos, stack);
        if (EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, stack) == 0) {
            int expCount = getExperienceWhenMined(world.random);
            if (expCount >= 0) {
                this.dropExperience(world, pos, expCount);
            }
        }
    }
}
