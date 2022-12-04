package dev.krysztal.advagri.block.impls.crops;

import dev.krysztal.advagri.foundation.block.AdvAgriCropBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.shape.VoxelShape;

public class GarlicBlock extends AdvAgriCropBlock {

  private static final IntProperty AGE = IntProperty.of("age", 0, 6);

  private static final VoxelShape[] voxelShapes = new VoxelShape[] {
    Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), // Age 0, 播种
    Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 3.0D, 16.0D), // Age 1, 出苗
    Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), // Age 3, 拔高至半格
    Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 5.0D, 16.0D), // Age 4, 拔高至一格
    Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.0D, 16.0D), // Age 5, 开花
    Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 7.0D, 16.0D), // Age 6, 成熟
  };

  public GarlicBlock(Settings settings) {
    super(settings);
  }

  @Override
  protected void appendProperties(
    StateManager.Builder<Block, BlockState> builder
  ) {
    builder.add(AGE);
  }

  @Override
  public IntProperty getAgeProperty() {
    return AGE;
  }

  @Override
  public int getMaxAge() {
    return AGE.field_37656;
  }
}
