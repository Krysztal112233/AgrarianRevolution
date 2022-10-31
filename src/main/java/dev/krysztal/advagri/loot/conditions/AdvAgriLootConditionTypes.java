package dev.krysztal.advagri.loot.conditions;

import net.minecraft.loot.condition.LootConditionType;
import net.minecraft.loot.condition.LootConditionTypes;

public class AdvAgriLootConditionTypes {

  public static LootConditionType MATCH_ITEM = LootConditionTypes.register(
    "match_tool",
    new MatchItemCondition.Serializer()
  );
}
