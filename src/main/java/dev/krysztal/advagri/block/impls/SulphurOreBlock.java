package dev.krysztal.advagri.block.impls;

import dev.krysztal.advagri.item.AdvAgriItems;
import java.util.Random;
import lombok.Setter;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;

public class SulphurOreBlock extends Block {

  @Setter
  private int explosionChance = 15;

  public SulphurOreBlock(Settings settings) {
    super(settings);
  }

  @Environment(EnvType.SERVER)
  @Override
  public void onBreak(
    World world,
    BlockPos pos,
    BlockState state,
    PlayerEntity player
  ) {
    super.onBreak(world, pos, state, player);
    int rad = new Random().nextInt(100);

    if (
      !player.isCreative() &&
      rad <= explosionChance &&
      !(player.getMainHandStack().getItem() == AdvAgriItems.BAMBOO_DRILL_ROD)
    ) {
      world.createExplosion(
        player,
        pos.getX(),
        pos.getY(),
        pos.getZ(),
        2F,
        Explosion.DestructionType.BREAK
      );
    }
  }
}
