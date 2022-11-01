package dev.krysztal.advagri.loot.conditions;

import net.minecraft.loot.condition.LootConditionType;
import net.minecraft.loot.condition.LootConditionTypes;

public class AdvAgriLootConditionTypes {

  public static LootConditionType MATCH_ITEM = LootConditionTypes.register(
    "match_item",
    new MatchItemCondition.Serializer()
  );

  public static LootConditionType MATCH_ITEM_TAG = LootConditionTypes.register(
    "match_item_tag",
    new MatchItemTagCondition.Serializer()
  );
  public static LootConditionType ON_GROUND = LootConditionTypes.register(
    "on_ground_tag",
    new OnGroundTagCondition.Serializer()
  );
}
