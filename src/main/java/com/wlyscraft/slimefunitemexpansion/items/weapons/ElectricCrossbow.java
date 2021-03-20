package com.wlyscraft.slimefunitemexpansion.items.weapons;

import io.github.thebusybiscuit.slimefun4.core.attributes.Rechargeable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

import static com.wlyscraft.slimefunitemexpansion.utils.SfUtils.sendMessage;

public class ElectricCrossbow extends SlimefunItem implements Rechargeable {

    private static final float COST = 5F;

    private final float capacity;

    public ElectricCrossbow(Category category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe, float capacity) {
        super(category, item, recipeType, recipe);

        this.capacity = capacity;
    }


    @Override
    public float getMaxItemCharge(ItemStack item) {
        return capacity;
    }

    @Nonnull
    protected ItemUseHandler getItemUseHandler() {
        return (e) -> {
            ItemStack item = e.getItem();
            if (getItemCharge(item) >= COST) removeItemCharge(item, COST);
            else {
                Player player = e.getPlayer();
                sendMessage(player, "§c§l你的电动弩没电了！");
                e.cancel();
            }

        };
    }

    @Override
    public void preRegister() {
        super.preRegister();

        addItemHandler(getItemUseHandler());
    }
}
