package dev.unowly.item;

import dev.unowly.FoodPlus;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FoodPlus.MODID);

    public static final DeferredItem<Item> HAMBURGER = ITEMS.registerSimpleItem(
            "hamburger",
            new Item.Properties().food(
                    new FoodProperties.Builder()
                            .nutrition(6)
                            .saturationModifier(2f)
                            .build()
            )
    );
    public static final DeferredItem<Item> CHEESEBURGER = ITEMS.registerSimpleItem(
            "cheeseburger",
            new Item.Properties().food(
                    new FoodProperties.Builder()
                            .nutrition(8)
                            .saturationModifier(3f)
                            .build()
            )
    );
    public static final DeferredItem<Item> CHEESE_WHEEL = ITEMS.registerSimpleItem(
            "cheese_wheel",
            new Item.Properties().food(
                    new FoodProperties.Builder()
                            .nutrition(8)
                            .saturationModifier(3f)
                            .build()
            )
    );
    public static final DeferredItem<Item> CHEESE = ITEMS.registerSimpleItem(
            "cheese",
            new Item.Properties().food(
                    new FoodProperties.Builder()
                            .nutrition(8)
                            .saturationModifier(3f)
                            .build()
            )
    );
    public static final DeferredItem<Item> CHEESE_SLICE = ITEMS.registerSimpleItem(
            "cheese_slice",
            new Item.Properties().food(
                    new FoodProperties.Builder()
                            .nutrition(8)
                            .saturationModifier(3f)
                            .build()
            )
    );
    public static final DeferredItem<Item> RAW_BACON = ITEMS.registerSimpleItem(
            "raw_bacon",
            new Item.Properties().food(
                    new FoodProperties.Builder()
                            .nutrition(8)
                            .saturationModifier(3f)
                            .build()
            )
    );
    public static final DeferredItem<Item> COOKED_BACON = ITEMS.registerSimpleItem(
            "cooked_bacon",
            new Item.Properties().food(
                    new FoodProperties.Builder()
                            .nutrition(8)
                            .saturationModifier(3f)
                            .build()
            )
    );

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
