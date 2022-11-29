package dev.krysztal.advagri.block.impls.crops;

import dev.krysztal.advagri.block.AdvAgriCropBlock;
import dev.krysztal.advagri.foundation.AdvAgriTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class WaterChestnutBlock extends AdvAgriCropBlock {

  public static final IntProperty AGE = Properties.AGE_5;

  private static final VoxelShape[] voxelShapes = new VoxelShape[] {
    Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D),
    Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 3.0D, 16.0D), // Age 0, 播种
    Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), // Age 1, 出苗
    Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 5.0D, 16.0D), // Age 2, 半格
    Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.0D, 16.0D), // Age 3, 开花
    Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 7.0D, 16.0D), // Age 4, 枯死
  };

  public WaterChestnutBlock(Settings settings) {
    super(settings, voxelShapes, AGE);
  }

  @Override
  protected boolean canPlantOnTop(
    BlockState floor,
    BlockView world,
    BlockPos pos
  ) {
    return floor.isIn(AdvAgriTags.BlockTags.SILT);
  }
}
