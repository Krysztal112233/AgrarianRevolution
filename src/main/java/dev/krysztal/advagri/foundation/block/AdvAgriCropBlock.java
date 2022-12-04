package dev.krysztal.advagri.foundation.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.shape.VoxelShape;

public abstract class AdvAgriCropBlock extends CropBlock {

  public AdvAgriCropBlock(Settings settings) {
    super(settings);
  }

  public static VoxelShape getShapeOfAge(
    BlockState state,
    IntProperty age,
    VoxelShape[] voxelShapes
  ) {
    return voxelShapes[state.get(age)];
  }
}
