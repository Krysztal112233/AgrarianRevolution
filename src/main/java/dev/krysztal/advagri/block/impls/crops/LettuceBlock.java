package dev.krysztal.advagri.block.impls.crops;

import dev.krysztal.advagri.block.AdvAgriCropBlock;
import net.minecraft.block.Block;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.shape.VoxelShape;

public class LettuceBlock extends AdvAgriCropBlock {

  private static final IntProperty AGE = Properties.AGE_4;

  private static final VoxelShape[] voxelShapes = new VoxelShape[] {
    Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), // Age 0, 播种
    Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 3.0D, 16.0D), // Age 1, 出苗
    Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), // Age 2, 拔高至半格，成熟
    Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 5.0D, 16.0D), // Age 4, 开花
    Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 5.0D, 16.0D), // Age 5, 接种
  };

  public LettuceBlock(Settings settings) {
    super(settings, voxelShapes, AGE);
  }
}
