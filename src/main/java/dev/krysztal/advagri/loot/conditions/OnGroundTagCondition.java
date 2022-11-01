package dev.krysztal.advagri.loot.conditions;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import lombok.Builder;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.condition.LootConditionType;
import net.minecraft.loot.context.LootContext;
import net.minecraft.loot.context.LootContextParameters;
import net.minecraft.state.property.Property;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonSerializer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;

@Builder
public class OnGroundTagCondition implements LootCondition {

  String tag;

  @Override
  public LootConditionType getType() {
    return AdvAgriLootConditionTypes.ON_GROUND;
  }

  @Override
  public boolean test(LootContext lootContext) {
    var tTag = TagKey.of(Registry.BLOCK_KEY, new Identifier(this.tag));
    var origin = lootContext.get(LootContextParameters.ORIGIN);

    if (origin == null) return false;

    var blockPos = new BlockPos(
      origin.getX(),
      origin.getY() - 1,
      origin.getZ()
    );
    var blockState = lootContext.getWorld().getBlockState(blockPos);
    if (blockState == null) return false;
    return blockState.isIn(tTag);
  }

  public static class Serializer
    implements JsonSerializer<OnGroundTagCondition> {

    @Override
    public void toJson(
      JsonObject json,
      OnGroundTagCondition object,
      JsonSerializationContext context
    ) {
      json.addProperty("tag", object.tag);
    }

    @Override
    public OnGroundTagCondition fromJson(
      JsonObject json,
      JsonDeserializationContext context
    ) {
      return new OnGroundTagCondition(json.get("tag").getAsString());
    }
  }
}
