package dev.krysztal.advagri.recipe;

import net.minecraft.item.ItemStack;
import net.minecraft.recipe.AbstractCookingRecipe;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.util.Identifier;

public class ForgingHammerRecipe extends AbstractCookingRecipe {
    public ForgingHammerRecipe(RecipeType<?> type, Identifier id, String group, Ingredient input, ItemStack output, float experience, int cookTime) {
        super(type, id, group, input, output, experience, cookTime);
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return null;
    }
}
