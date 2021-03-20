package com.wlyscraft.slimefunitemexpansion.items.tools;

import com.wlyscraft.slimefunitemexpansion.utils.SfUtils;
import io.github.thebusybiscuit.slimefun4.core.attributes.Rechargeable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public class SlimechunkChecker extends SlimefunItem implements Rechargeable {
    private static final float COST = 100F;

    private final float capacity;

    public SlimechunkChecker(Category category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe, float capacity) {
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
            Player player = e.getPlayer();
            if (getItemCharge(item) >= COST) {
                removeItemCharge(item, COST);
                if (player.getChunk().isSlimeChunk()) SfUtils.sendMessage(player, "§a你所在的区块是史莱姆区块!");
                else SfUtils.sendMessage(player, "§c你所在的区块不是史莱姆区块!");
            }
            else {
                SfUtils.sendMessage(player, "§c§l你的史莱姆区块检测器没电了！");
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
