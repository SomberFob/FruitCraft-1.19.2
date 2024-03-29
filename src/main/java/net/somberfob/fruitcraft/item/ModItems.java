package net.somberfob.fruitcraft.item;

import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.somberfob.fruitcraft.FruitCraft;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FruitCraft.MOD_ID);

    public static final RegistryObject<Item> BANANA = ITEMS.register("banana",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FRUITS).food(ModFoods.BANANA)));
    public static final RegistryObject<Item> ORANGE = ITEMS.register("orange",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FRUITS).food(ModFoods.BANANA)));
    public static final RegistryObject<Item> PEAR = ITEMS.register("pear",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FRUITS).food(ModFoods.BANANA)));
    public static final RegistryObject<Item> AVOCADO = ITEMS.register("avocado",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FRUITS).stacksTo(64)));
    public static final RegistryObject<Item> AVOCADO_OPEN = ITEMS.register("avocado_open",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FRUITS).food(ModFoods.BANANA)));

    public static final RegistryObject<Item> CUTTING_KNIFE = ITEMS.register("cutting_knife",
            () -> new SwordItem(Tiers.GOLD, 1, 2f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB).stacksTo(1)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}