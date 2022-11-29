package dev.krysztal.advagri.block;

import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public abstract class AdvAgriCropBlock extends CropBlock {

  public static final AbstractBlock.Settings CORN_SETTINGS = AbstractBlock.Settings
    .of(Material.PLANT)
    .noCollision()
    .ticksRandomly()
    .breakInstantly()
    .sounds(BlockSoundGroup.CROP);

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

  public AdvAgriCropBlock(VoxelShape[] voxelShapes, IntProperty age) {
    super(AdvAgriCropBlock.CORN_SETTINGS);
    AGE = age;
    this.voxelShapes = voxelShapes;
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
