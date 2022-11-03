package dev.krysztal.advagri.entrypoint;

import dev.krysztal.advagri.block.AdvAgriBlocks;
import dev.krysztal.advagri.foundation.AdvAgriGameRules;
import dev.krysztal.advagri.foundation.AdvAgriTags;
import dev.krysztal.advagri.item.AdvAgriItems;
import dev.krysztal.advagri.loot.BambooLootTable;
import dev.krysztal.advagri.loot.GrassLootTable;
import lombok.extern.slf4j.Slf4j;
import net.fabricmc.api.ModInitializer;

@Slf4j
public class General implements ModInitializer {

  @Override
  public void onInitialize() {
    new AdvAgriBlocks();
    new AdvAgriItems();
    new AdvAgriTags();
    new AdvAgriGameRules();

    new GrassLootTable();
    new BambooLootTable();
  }
}
