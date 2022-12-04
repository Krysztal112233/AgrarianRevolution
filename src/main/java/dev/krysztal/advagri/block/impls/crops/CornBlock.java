package dev.krysztal.advagri.block.impls.crops;

import dev.krysztal.advagri.foundation.AdvAgriSolarTerm;
import dev.krysztal.advagri.foundation.block.AdvAgriCropBlock;
import dev.krysztal.advagri.item.AdvAgriItems;
import lombok.Getter;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemConvertible;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class CornBlock extends AdvAgriCropBlock {

  private static final IntProperty AGE = Properties.AGE_7;

  @Getter
  private static final VoxelShape[] voxelShapes = new VoxelShape[] {
    Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), // Age 0, 播种
    Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 3.0D, 16.0D), // Age 1, 出苗
    Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), // Age 3, 拔高至半格
    Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 5.0D, 16.0D), // Age 4, 拔高至一格
    Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.0D, 16.0D), // Age 5, 拔高至两格，开花
    Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 7.0D, 16.0D), // Age 6, 两格，育果
    Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D), // Age 7. 结果
  };

  @Override
  public IntProperty getAgeProperty() {
    return AGE;
  }

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
    return AdvAgriCropBlock.getShapeOfAge(state, AGE, voxelShapes);
  }

  @Override
  protected void appendProperties(
    StateManager.Builder<Block, BlockState> builder
  ) {
    builder.add(AGE);
  }

  @Override
  protected ItemConvertible getSeedsItem() {
    return AdvAgriItems.SEED_BAG_CORN;
  }

  public CornBlock(Settings settings) {
    super(settings, AdvAgriSolarTerm.CLEAR_AND_BRIGHT);
  }
}
