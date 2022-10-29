package dev.krysztal.advagri.entrypoint;

import dev.krysztal.advagri.block.AdvAgriBlocks;
import dev.krysztal.advagri.foundation.AdvAgriTagBlock;
import dev.krysztal.advagri.item.AdvAgriItems;
import dev.krysztal.advagri.loottable.BambooLootTable;
import dev.krysztal.advagri.loottable.GrassLootTable;
import lombok.extern.slf4j.Slf4j;
import net.fabricmc.api.ModInitializer;

@Slf4j
public class General implements ModInitializer {

    @Override
    public void onInitialize() {

        new AdvAgriBlocks();
        new AdvAgriItems();
        new AdvAgriTagBlock();

        new GrassLootTable();
        new BambooLootTable();
    }
}