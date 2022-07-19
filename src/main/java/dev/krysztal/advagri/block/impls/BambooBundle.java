package dev.krysztal.advagri.block.impls;

import dev.krysztal.advagri.AdvAgriConstants;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

public class BambooBundle extends Block {
    public static IntProperty BLOCKSTATE_DRYNESS = IntProperty.of("dryness", 0, AdvAgriConstants.MAX_DRYNESS);

    public BambooBundle(Settings settings) {
        super(settings);
        super.setDefaultState(super.getStateManager().getDefaultState().with(BLOCKSTATE_DRYNESS, 0));
    }

    @Override
    public void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(BLOCKSTATE_DRYNESS);
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (random.nextInt(100) <= 5)
            this.applyDry(state, world, pos, random);
    }


    private void applyDry(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        System.out.println(state.get(BLOCKSTATE_DRYNESS));

        var dryness = state.get(BLOCKSTATE_DRYNESS);
        dryness += 1;

        if (dryness > AdvAgriConstants.MAX_DRYNESS)
            dryness = AdvAgriConstants.MAX_DRYNESS;

        world.setBlockState(pos, state.with(BLOCKSTATE_DRYNESS, dryness), Block.NOTIFY_LISTENERS);
    }
}
