package dev.krysztal.advagri.block.impls.crops;

import lombok.Getter;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SweetBerryBushBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;

public class SolarBerryBushBlock extends SweetBerryBushBlock {

  @Getter
  private static final IntProperty AGE = Properties.AGE_3;

  @Getter
  private static final VoxelShape[] AGE_TO_SHAPE = new VoxelShape[] {
    Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), // Age 0, 播种
    Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 3.0D, 16.0D), // Age 1, 出苗
    Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), // Age 2, 拔高至半格，成熟
    Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 5.0D, 16.0D), // Age 4, 开花
  };

  public SolarBerryBushBlock(Settings settings) {
    super(settings);
  }

  @Override
  public void grow(
    ServerWorld world,
    Random random,
    BlockPos pos,
    BlockState state
  ) {
    super.grow(world, random, pos, state);
  }
}
