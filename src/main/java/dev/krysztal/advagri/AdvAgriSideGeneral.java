package dev.krysztal.advagri;

import dev.krysztal.advagri.block.AdvAgriBlocks;
import dev.krysztal.advagri.block.AdvAgriConfiguredFeatures;
import dev.krysztal.advagri.block.AdvAgriPlacedFeatures;
import dev.krysztal.advagri.events.AdvAgriEvents;
import lombok.extern.slf4j.Slf4j;
import net.fabricmc.api.ModInitializer;
import dev.krysztal.advagri.item.AdvAgriItems;

@Slf4j
public class AdvAgriSideGeneral implements ModInitializer {

    @Override
    public void onInitialize() {
        log.info("==========================================");
        log.info("    _       _        _              _");
        log.info("   / \\   __| |_   __/ \\   __ _ _ __(_)");
        log.info("  / _ \\ / _` \\ \\ / / _ \\ / _` | '__| |");
        log.info(" / ___ \\ (_| |\\ V / ___ \\ (_| | |  | |");
        log.info("/_/   \\_\\__,_| \\_/_/   \\_\\__, |_|  |_|");
        log.info("                         |___/");
        log.info("==========================================");
        log.info("Powered by AdvancedAgriculture Developers");
        log.info("==========================================");

        AdvAgriEvents.getInstance();

        new AdvAgriBlocks();
        new AdvAgriItems();
        new AdvAgriPlacedFeatures();
        new AdvAgriConfiguredFeatures();
    }
}