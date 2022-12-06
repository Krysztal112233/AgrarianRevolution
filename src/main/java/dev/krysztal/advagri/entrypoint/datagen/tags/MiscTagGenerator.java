package dev.krysztal.advagri.entrypoint.datagen.tags;

import dev.krysztal.advagri.foundation.AdvAgriTags;
import java.util.List;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;

public class MiscTagGenerator extends FabricTagProvider.ItemTagProvider {

  private static final List<Item> PLANT_TAG_LIST = List.of();

  public MiscTagGenerator(FabricDataGenerator dataGenerator) {
    super(dataGenerator);
  }

  @Override
  protected void generateTags() {
    PLANT_TAG_LIST.forEach(
      super.getOrCreateTagBuilder(AdvAgriTags.ItemTags.PLANT)::add
    );
  }
}
