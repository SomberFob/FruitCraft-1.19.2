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
}