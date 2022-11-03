package dev.krysztal.advagri.foundation;

import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AdvAgriTags {

  public static void init() {
    BlockTags.init();
  }

  public static class BlockTags {

    public static final TagKey<Block> FELLABLE;
    public static final TagKey<Block> HIDDEN_BAMBOO;
    public static final TagKey<Block> SULPHUR_ORE;

    public static void init() {}

    static {
      FELLABLE = registry("fellable");
      HIDDEN_BAMBOO = registry("hidden_bamboo");
      SULPHUR_ORE = registry("sulphur_ore");
    }

    private static TagKey<Block> registry(String id) {
      return TagKey.of(
        Registry.BLOCK_KEY,
        new Identifier(AdvAgriConstants.ADV_AGRI_NAMESPACE, id)
      );
    }
  }
}
