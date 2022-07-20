package dev.krysztal.advagri.block.impls;

import dev.krysztal.advagri.AdvAgriConstants;
import dev.krysztal.advagri.AdvAgriStates;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

public class BambooBundle extends Block {

    public BambooBundle(Settings settings) {
        super(settings);
        super.setDefaultState(super.getStateManager().getDefaultState().with(AdvAgriStates.BLOCKSTATE_DRYNESS, 0));
    }

    @Override
    public void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AdvAgriStates.BLOCKSTATE_DRYNESS);
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (random.nextInt(100) <= 5) {

            var dryness = state.get(AdvAgriStates.BLOCKSTATE_DRYNESS);
            dryness += 1;

            if (dryness > AdvAgriConstants.MAX_DRYNESS)
                dryness = AdvAgriConstants.MAX_DRYNESS;

            world.setBlockState(pos, state.with(AdvAgriStates.BLOCKSTATE_DRYNESS, dryness), Block.NOTIFY_LISTENERS);
        }
    }


}
