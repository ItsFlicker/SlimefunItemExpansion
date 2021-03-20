package com.wlyscraft.slimefunitemexpansion.items.tools;

import io.github.thebusybiscuit.slimefun4.core.attributes.Rechargeable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ToolUseHandler;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

import static com.wlyscraft.slimefunitemexpansion.utils.SfUtils.sendMessage;


public class Drill extends SlimefunItem implements Rechargeable {

    private static final float COST = 0.1F;

    private final float capacity;

    public Drill(Category category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe, float capacity) {
        super(category, item, recipeType, recipe);

        this.capacity = capacity;
    }

    @Override
    public float getMaxItemCharge(ItemStack item) {
        return capacity;
    }

    @Nonnull
    protected ToolUseHandler getToolUseHandler() {
        return (e, tool, fortune, drops) -> {
            if (getItemCharge(tool) >= COST) removeItemCharge(tool, COST);
            else {
                Player player = e.getPlayer();
                sendMessage(player, "§c§l你的手钻没电了！");
                e.setCancelled(true);
            }

        };
    }

    @Override
    public void preRegister() {
        super.preRegister();

        addItemHandler(getToolUseHandler());
    }

}
