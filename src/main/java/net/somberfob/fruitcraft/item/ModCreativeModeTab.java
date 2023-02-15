package net.somberfob.fruitcraft.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab FRUITS = new CreativeModeTab("fruits") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BANANA.get());
        }
    };
    public static final CreativeModeTab TOOLS_TAB = new CreativeModeTab("tools_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CUTTING_KNIFE.get());
        }
    };
}