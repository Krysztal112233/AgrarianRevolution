package dev.krysztal.advagri.item.itemutil;

import java.util.HashMap;
import net.minecraft.util.math.BlockPos;

public class ForgingHammerStorage {

    private static final ForgingHammerStorage INSTANCE = new ForgingHammerStorage();

    private static final HashMap<String, Integer> blockPosIntegerHashMap = new HashMap<>(64);

    private ForgingHammerStorage() {
    }

    public static ForgingHammerStorage getINSTANCE() {
        return INSTANCE;
    }

    public void put(BlockPos blockPos, Integer count) {
        blockPosIntegerHashMap.put(blockPos.toString(), count);
    }

    public void remove(BlockPos blockPos) {
        blockPosIntegerHashMap.remove(blockPos.toString());
    }

    public boolean containsKey(BlockPos blockPos) {
        return blockPosIntegerHashMap.containsKey(blockPos.toString());
    }

    public Integer get(BlockPos blockPos) {
        return blockPosIntegerHashMap.get(blockPos.toString());
    }

}
