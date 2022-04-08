package tech.icedlab.advagri.item.itemutil;


import java.util.HashSet;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;

public class BambooChopperUtil {

    private static final BambooChopperUtil INSTANCE = new BambooChopperUtil();

    private final HashSet<Block> blockHashSet = new HashSet<>();

    private BambooChopperUtil() {
        blockHashSet.add(Blocks.BAMBOO);
        blockHashSet.add(Blocks.TALL_GRASS);
        blockHashSet.add(Blocks.GRASS);
        blockHashSet.add(Blocks.SEAGRASS);
        blockHashSet.add(Blocks.TALL_SEAGRASS);
        blockHashSet.add(Blocks.FERN);
        blockHashSet.add(Blocks.LARGE_FERN);
        blockHashSet.add(Blocks.SUGAR_CANE);
        blockHashSet.add(Blocks.VINE);
        blockHashSet.add(Blocks.WEEPING_VINES_PLANT);
        blockHashSet.add(Blocks.TWISTING_VINES_PLANT);
        blockHashSet.add(Blocks.WEEPING_VINES);
        blockHashSet.add(Blocks.TWISTING_VINES);
        blockHashSet.add(Blocks.KELP);
        blockHashSet.add(Blocks.KELP_PLANT);
    }

    public boolean check(BlockState blockState) {
        for (Block I : this.blockHashSet) {
            if (I == blockState.getBlock()) {
                return true;
            }
        }
        return false;
    }

    public static BambooChopperUtil getInstance() {
        return INSTANCE;
    }


}
