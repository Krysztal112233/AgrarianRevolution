package dev.krysztal.advagri.block.impls.crops;

import dev.krysztal.advagri.item.AdvAgriItems;
import lombok.Getter;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SweetBerryBushBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class StrawBerryBlock extends SweetBerryBushBlock {

  private static final IntProperty AGE = Properties.AGE_5;

  @Getter
  private final VoxelShape[] voxelShapes = new VoxelShape[] {
    Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), // Age 0, 播种
    Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 3.0D, 16.0D), // Age 1, 出苗
    Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), // Age 2, 匍匐
    Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), // Age 3, 开花
    Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), // Age 4, 结果
    Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), // Age 5, 枯萎
  };

  public StrawBerryBlock(Settings settings) {
    super(settings);
  }

  @Override
  public ItemStack getPickStack(
    BlockView world,
    BlockPos pos,
    BlockState state
  ) {
    return new ItemStack(AdvAgriItems.STRAWBERRY);
  }
}
