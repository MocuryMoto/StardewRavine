package net.mocury.stardewravine.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.mocury.stardewravine.StardewRavine;
import net.mocury.stardewravine.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup STARDEW_RAVINE_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(StardewRavine.MOD_ID, "stardew_ravine_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.AQUAMARINE))
                    .displayName(Text.translatable("itemgroup.stardewravine.stardew_ravine_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.AQUAMARINE);
                        entries.add(ModBlocks.AQUAMARINE_BLOCK);
                        entries.add(ModItems.TOPAZ);
                        entries.add(ModBlocks.TOPAZ_BLOCK);
                        entries.add(ModItems.JADE);
                        entries.add(ModBlocks.JADE_BLOCK);
                        entries.add(ModItems.RUBY);
                        entries.add(ModBlocks.RUBY_BLOCK);
                    }).build());


    public static void registerItemGroups() {
        StardewRavine.LOGGER.info("Registering Item Groups for " + StardewRavine.MOD_ID);
    }
}
