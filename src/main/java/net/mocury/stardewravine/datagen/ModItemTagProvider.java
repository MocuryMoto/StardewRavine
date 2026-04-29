package net.mocury.stardewravine.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
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
                .add(ModItems.LEMON_STONE)
                .add(ModItems.TIGERS_EYE)
                .add(ModItems.KYANITE)
                .add(ModItems.PYRITE)
                .add(ModItems.FLUORAPATITE)
                .add(ModItems.JAGOITE)
                .add(ModItems.CELESTINE)
                .add(ModItems.GEMINITE)
                .add(ModItems.JASPER)
                .add(ModItems.AERINITE)
                .add(ModItems.ORPIMENT)
                .add(ModItems.DOLOMITE)
                .add(ModItems.JAMBORITE)
                .add(ModItems.NEKOITE)
                .add(ModItems.NEPTUNITE)
                .add(Items.EMERALD)
                .add(Items.DIAMOND)
                .add(Items.LAPIS_LAZULI)
                .add(Items.QUARTZ)
                .add(Items.AMETHYST_SHARD)
        ;

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.IRIDIUM_SWORD)
                .add(ModItems.NETHER_IRIDIUM_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.IRIDIUM_PICKAXE)
                .add(ModItems.NETHER_IRIDIUM_PICKAXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.IRIDIUM_SHOVEL)
                .add(ModItems.NETHER_IRIDIUM_SHOVEL);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.IRIDIUM_AXE)
                .add(ModItems.NETHER_IRIDIUM_AXE);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.IRIDIUM_HOE)
                .add(ModItems.NETHER_IRIDIUM_HOE);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.IRIDIUM_HELMET)
                .add(ModItems.IRIDIUM_CHESTPLATE)
                .add(ModItems.IRIDIUM_LEGGINGS)
                .add(ModItems.IRIDIUM_BOOTS)
                .add(ModItems.NETHER_IRIDIUM_HELMET)
                .add(ModItems.NETHER_IRIDIUM_CHESTPLATE)
                .add(ModItems.NETHER_IRIDIUM_LEGGINGS)
                .add(ModItems.NETHER_IRIDIUM_BOOTS)
        ;
    }
}
