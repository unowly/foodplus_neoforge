package dev.unowly.ui;

import dev.unowly.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static dev.unowly.FoodPlus.MODID;

public class ModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> FOOD_PLUS_TAB = CREATIVE_MODE_TABS.register("foodplus", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.foodplus"))
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> ModItems.HAMBURGER.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(ModItems.HAMBURGER.get());
                output.accept(ModItems.CHEESEBURGER.get());
                output.accept(ModItems.CHEESE_WHEEL.get());
                output.accept(ModItems.CHEESE.get());
                output.accept(ModItems.CHEESE_SLICE.get());
                output.accept(ModItems.RAW_BACON.get());
                output.accept(ModItems.COOKED_BACON.get());


            }).build());
}
