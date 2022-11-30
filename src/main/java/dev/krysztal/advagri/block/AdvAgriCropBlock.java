package dev.krysztal.advagri.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public abstract class AdvAgriCropBlock extends CropBlock {

  private static IntProperty AGE = Properties.AGE_7;

  private final VoxelShape[] voxelShapes;

  @Override
  public int getMaxAge() {
    return AGE.field_37656;
  }

  @Override
  public VoxelShape getOutlineShape(
    BlockState state,
    BlockView world,
    BlockPos pos,
    ShapeContext context
  ) {
    return this.voxelShapes[state.get(AGE)];
  }

  public AdvAgriCropBlock(
    Settings settings,
    VoxelShape[] voxelShapes,
    IntProperty age
  ) {
    super(settings);
    AGE = age;
    this.voxelShapes = voxelShapes;
  }
}
