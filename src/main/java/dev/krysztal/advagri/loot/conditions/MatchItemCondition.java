package dev.krysztal.advagri.loot.conditions;

import com.google.gson.*;
import java.util.ArrayList;
import java.util.Objects;

import net.minecraft.item.ItemStack;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.condition.LootConditionType;
import net.minecraft.loot.context.LootContext;
import net.minecraft.loot.context.LootContextParameters;
import net.minecraft.util.JsonSerializer;

public class MatchItemCondition implements LootCondition {

  private final ArrayList<String> items = new ArrayList<>();

  @Override
  public LootConditionType getType() {
    return AdvAgriLootConditionTypes.MATCH_ITEM;
  }

  @Override
  public boolean test(LootContext lootContext) {
    var breaker = lootContext.get(LootContextParameters.THIS_ENTITY);
    if (breaker == null) return false;

    for (ItemStack item : breaker.getHandItems()) if (
      this.items.stream().anyMatch($ -> Objects.equals($, item.getItem().toString()))
    ) return true;

    return false;
  }

  public static class Serializer implements JsonSerializer<MatchItemCondition> {

    @Override
    public void toJson(
      JsonObject json,
      MatchItemCondition object,
      JsonSerializationContext context
    ) {
      var jsonArray = new JsonArray();
      object.items.forEach(jsonArray::add);

      json.add("items", jsonArray);
    }

    @Override
    public MatchItemCondition fromJson(
      JsonObject json,
      JsonDeserializationContext context
    ) {
      var t = new MatchItemCondition();

      for (JsonElement element : json.getAsJsonArray(
        "items"
      )) t.items.add(element.toString());

      return t;
    }
  }
}
