package com.wlyscraft.slimefunitemexpansion;

import org.bukkit.NamespacedKey;
import org.bukkit.persistence.PersistentDataAdapterContext;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;

public class EXPDataType implements PersistentDataType<PersistentDataContainer, EXPDataType.EXP> {

    public static EXPDataType instance = new EXPDataType();

    @Override
    public @NotNull Class<PersistentDataContainer> getPrimitiveType() {
        return PersistentDataContainer.class;
    }

    @Override
    public @NotNull Class<EXP> getComplexType() {
        return EXP.class;
    }

    @Override
    public @NotNull PersistentDataContainer toPrimitive(@Nonnull EXP complex, @NotNull PersistentDataAdapterContext context) {
        PersistentDataContainer container = context.newPersistentDataContainer();
        container.set(new NamespacedKey(SlimefunItemExpansion.getInstance(), "totalexp"), PersistentDataType.INTEGER, complex.totalexp);
        container.set(new NamespacedKey(SlimefunItemExpansion.getInstance(), "level"), PersistentDataType.INTEGER, complex.level);
        return container;
    }

    @Nonnull
    @Override
    public EXP fromPrimitive(@NotNull PersistentDataContainer primitive, @NotNull PersistentDataAdapterContext context) {
        EXP exp = new EXP();
        exp.totalexp = primitive.get(new NamespacedKey(SlimefunItemExpansion.getInstance(), "totalexp"), PersistentDataType.INTEGER);
        exp.level = primitive.get(new NamespacedKey(SlimefunItemExpansion.getInstance(), "level"), PersistentDataType.INTEGER);
        return exp;
    }

    public static class EXP{
        public int totalexp;
        public int level;
    }

}