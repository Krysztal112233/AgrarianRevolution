package dev.krysztal.advagri;

import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AdvAgriTagBlock {

    public static final TagKey<Block> FELLABLE;
    public static final TagKey<Block> FORGEABLE;

    static {
        FELLABLE = TagKey.of(Registry.BLOCK_KEY, new Identifier(AdvAgriConstants.ADV_AGRI_NAMESPACE, "fellable"));
        FORGEABLE = TagKey.of(Registry.BLOCK_KEY, new Identifier(AdvAgriConstants.ADV_AGRI_NAMESPACE, "forgeable"));
    }
}
