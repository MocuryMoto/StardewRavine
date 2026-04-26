package net.mocury.stardewravine.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.mocury.stardewravine.item.ModItems;
import net.mocury.stardewravine.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup lookup) {
        getOrCreateTagBuilder(ModTags.Items.CRYSTALARIUM_ITEMS)
                .add(ModItems.AQUAMARINE)
                .add(ModItems.TOPAZ)
                .add(ModItems.JADE)
                .add(ModItems.RUBY)
                .add(ModItems.FIRE_QUARTZ)
                .add(ModItems.HELVINE)
                .add(Items.EMERALD)
                .add(Items.DIAMOND)
                .add(Items.LAPIS_LAZULI)
                .add(Items.QUARTZ);
    }
}
