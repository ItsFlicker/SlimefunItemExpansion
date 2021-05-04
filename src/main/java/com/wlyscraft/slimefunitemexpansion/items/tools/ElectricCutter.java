package com.wlyscraft.slimefunitemexpansion.items.tools;

import com.wlyscraft.slimefunitemexpansion.utils.SfUtils;
import io.github.thebusybiscuit.slimefun4.core.attributes.Rechargeable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.core.handlers.ToolUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunPlugin;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.cscorelib2.protection.ProtectableAction;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public class ElectricCutter extends SlimefunItem implements Rechargeable {
    private static final float COST = 2F;

    private final float capacity;

    public ElectricCutter(Category category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe, float capacity) {
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
            e.cancel();

            ItemStack item = e.getItem();
            Player player = e.getPlayer();

            if (!e.getClickedBlock().isPresent()) {
                return;
            }

            Block b = e.getClickedBlock().get();

            if (!SlimefunPlugin.getProtectionManager().hasPermission(e.getPlayer(), b.getLocation(),
                    ProtectableAction.BREAK_BLOCK)) {
                return;
            }

            if (getItemCharge(item) >= COST && b.getType() == Material.OBSIDIAN) {
                removeItemCharge(item, COST);
                b.setType(Material.AIR);
            }
            else {
                SfUtils.sendActionBar(player, "§c你的电动切割器没电了");;
            }

        };
    }

    protected ToolUseHandler getToolUseHandler() {
        return (e, tool, fortune, drops) -> e.setCancelled(true);
    }

    @Override
    public void preRegister() {
        super.preRegister();

        addItemHandler(getItemUseHandler(), getToolUseHandler());
    }
}
