package dev.krysztal.advagri;

import dev.krysztal.advagri.block.AdvAgriBlocks;
import dev.krysztal.advagri.item.AdvAgriItems;
import dev.krysztal.advagri.item.AdvAgriTools;
import lombok.extern.slf4j.Slf4j;
import net.fabricmc.api.ModInitializer;

@Slf4j
public class AdvAgriSideGeneral implements ModInitializer {

    @Override
    public void onInitialize() {

        new AdvAgriBlocks();
        new AdvAgriItems();
        new AdvAgriTools();

    }
}