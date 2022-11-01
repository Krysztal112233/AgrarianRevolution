package dev.krysztal.advagri.loot.conditions;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import lombok.Builder;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.condition.LootConditionType;
import net.minecraft.loot.context.LootContext;
import net.minecraft.loot.context.LootContextParameters;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonSerializer;
import net.minecraft.util.registry.Registry;

@Builder
public class MatchItemTagCondition implements LootCondition {

  private String tag;

  @Override
  public LootConditionType getType() {
    return AdvAgriLootConditionTypes.MATCH_ITEM;
  }

  @Override
  public boolean test(LootContext lootContext) {
    Entity entity = lootContext.get(LootContextParameters.DIRECT_KILLER_ENTITY);
    var itemTagKey = TagKey.of(Registry.ITEM_KEY, new Identifier(this.tag));

    if (entity == null) return false;

    for (ItemStack handItem : entity.getHandItems()) if (
      handItem.isIn(itemTagKey)
    ) return true;

    return false;
  }

  public static class Serializer
    implements JsonSerializer<MatchItemTagCondition> {

    @Override
    public void toJson(
      JsonObject json,
      MatchItemTagCondition object,
      JsonSerializationContext context
    ) {
      json.addProperty("tag", object.tag);
    }

    @Override
    public MatchItemTagCondition fromJson(
      JsonObject json,
      JsonDeserializationContext context
    ) {
      return MatchItemTagCondition
        .builder()
        .tag(json.get("tag").getAsString())
        .build();
    }
  }
}
