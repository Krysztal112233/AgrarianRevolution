package dev.krysztal.advagri.inventory;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;

public class ForgingTableInventory implements Inventory {

    ArrayList<ItemStack> stackList = new ArrayList<>();

    @Override
    public int size() {
        return this.stackList.size();
    }

    @Override
    public boolean isEmpty() {
        return this.stackList.isEmpty();
    }

    @Override
    public ItemStack getStack(int slot) {
        return this.stackList.get(0);
    }

    @Override
    public ItemStack removeStack(int slot, int amount) {
        var itemStack = this.stackList.remove(0);
        itemStack.decrement(amount);
        this.stackList.set(slot, itemStack);
        return itemStack;
    }

    @Override
    public ItemStack removeStack(int slot) {
        return this.stackList.remove(slot);
    }

    @Override
    public void setStack(int slot, ItemStack stack) {
        this.stackList.set(slot, stack);
    }

    @Override
    public void markDirty() {

    }

    @Override
    public boolean canPlayerUse(PlayerEntity player) {
        return true;
    }

    @Override
    public void clear() {
        this.stackList.clear();
    }
}
