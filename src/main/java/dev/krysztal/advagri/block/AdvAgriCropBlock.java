package dev.krysztal.advagri.block;

import lombok.Getter;
import lombok.Setter;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public abstract class AdvAgriCropBlock extends CropBlock {

  @Setter
  @Getter
  private IntProperty age;

  @Setter
  @Getter
  private VoxelShape[] voxelShapes;

  @Override
  public IntProperty getAgeProperty() {
    return this.age;
  }

  @Override
  public int getMaxAge() {
    return this.age.field_37656;
  }

  @Override
  public VoxelShape getOutlineShape(
    BlockState state,
    BlockView world,
    BlockPos pos,
    ShapeContext context
  ) {
    return this.voxelShapes[state.get(this.age)];
  }

  private AdvAgriCropBlock(Settings settings) {
    super(settings);
  }

  public AdvAgriCropBlock(
    Settings settings,
    VoxelShape[] voxelShapes,
    IntProperty age
  ) {
    super(settings);
    this.age = age;
    this.voxelShapes = voxelShapes;
  }
}
