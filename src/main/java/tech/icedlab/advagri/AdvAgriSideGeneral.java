package tech.icedlab.advagri;

import lombok.extern.slf4j.Slf4j;
import net.fabricmc.api.ModInitializer;
import tech.icedlab.advagri.block.AdvAgriBlocks;
import tech.icedlab.advagri.block.AdvAgriConfiguredFeatures;
import tech.icedlab.advagri.block.AdvAgriPlacedFeatures;
import tech.icedlab.advagri.events.AdvAgriEvents;
import tech.icedlab.advagri.item.AdvAgriItems;

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