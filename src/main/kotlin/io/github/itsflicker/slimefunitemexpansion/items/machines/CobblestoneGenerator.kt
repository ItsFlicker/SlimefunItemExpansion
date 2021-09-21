package io.github.itsflicker.slimefunitemexpansion.items.machines

import io.github.thebusybiscuit.slimefun4.implementation.operations.CraftingOperation
import me.mrCookieSlime.Slimefun.Lists.RecipeType
import me.mrCookieSlime.Slimefun.Objects.Category
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe
import me.mrCookieSlime.Slimefun.api.BlockStorage
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack
import org.bukkit.Material
import org.bukkit.block.Block
import org.bukkit.inventory.ItemStack
import taboolib.common.reflect.Reflex.Companion.setProperty
import taboolib.common.reflect.Reflex.Companion.unsafeInstance
import taboolib.library.xseries.XMaterial
import taboolib.platform.util.buildItem

class CobblestoneGenerator(category: Category, item: SlimefunItemStack, recipeType: RecipeType, recipe: Array<ItemStack?>) :
    AContainer(category, item, recipeType, recipe) {

    private val progressItem = buildItem(XMaterial.BLACK_STAINED_GLASS_PANE) { name = " " }

    override fun getProgressBar(): ItemStack {
        return ItemStack(Material.STONE_PICKAXE)
    }

    override fun getMachineIdentifier(): String {
        return "IE_COBBLESTONE_GENERATOR"
    }

    override fun tick(b: Block) {
        val inv = BlockStorage.getInventory(b)
        val currentOperation = machineProcessor.getOperation(b)

        if (currentOperation != null) {
            if (takeCharge(b.location)) {

                if (!currentOperation.isFinished) {
                    machineProcessor.updateProgressBar(inv, 22, currentOperation)
                    currentOperation.addProgress(1)
                } else {
                    inv.replaceExistingItem(22, progressItem)

                    currentOperation.results.forEach {
                        inv.pushItem(it.clone(), *outputSlots)
                    }

                    machineProcessor.endOperation(b)
                }
            }
        } else {
            if (outputSlots.all { inv.getItemInSlot(it) != null && inv.getItemInSlot(it).amount >= inv.getItemInSlot(it).maxStackSize }) {
                return
            }

            machineProcessor.startOperation(
                b,
                craftingOperation
            )
        }
    }

    companion object {

        val craftingOperation by lazy {
            val r = MachineRecipe(5, emptyArray(), arrayOf(ItemStack(Material.COBBLESTONE)))

            (CraftingOperation::class.java.unsafeInstance() as CraftingOperation).also {
                it.setProperty("ingredients", r.input)
                it.setProperty("results", r.output)
                it.setProperty("totalTicks", r.ticks)
            }
        }
    }
}