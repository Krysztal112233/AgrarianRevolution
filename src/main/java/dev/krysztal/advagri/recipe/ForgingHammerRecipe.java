package dev.krysztal.advagri.recipe;

import dev.krysztal.advagri.inventory.ForgingTableInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class ForgingHammerRecipe implements Recipe<ForgingTableInventory> {

    @Override
    public boolean matches(ForgingTableInventory inventory, World world) {
        return false;
    }

    @Override
    public ItemStack craft(ForgingTableInventory inventory) {
        return null;
    }

    @Override
    public boolean fits(int width, int height) {
        return false;
    }

    @Override
    public ItemStack getOutput() {
        return null;
    }

    @Override
    public Identifier getId() {
        return null;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return null;
    }

    @Override
    public RecipeType<?> getType() {
        return null;
    }
}