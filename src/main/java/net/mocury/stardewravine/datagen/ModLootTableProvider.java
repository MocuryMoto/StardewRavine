package net.mocury.stardewravine.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.mocury.stardewravine.block.ModBlocks;
import net.mocury.stardewravine.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.AQUAMARINE_BLOCK);
        addDrop(ModBlocks.CHISELED_ESPERITE);
        addDrop(ModBlocks.CHISELED_SOAPSTONE);
        addDrop(ModBlocks.CHISELED_LIMESTONE);
        addDrop(ModBlocks.CHISELED_MARBLE);
        addDrop(ModBlocks.CINDER_SHARD_BLOCK);
        addDrop(ModBlocks.ESPERITE);
        addDrop(ModBlocks.ESPERITE_BRICKS);
        addDrop(ModBlocks.ESPERITE_PILLAR);
        addDrop(ModBlocks.HELVINE_BLOCK);
        addDrop(ModBlocks.IRIDIUM_BLOCK);
        addDrop(ModBlocks.JADE_BLOCK);
        addDrop(ModBlocks.LIMESTONE);
        addDrop(ModBlocks.LIMESTONE_BRICKS);
        addDrop(ModBlocks.LIMESTONE_PILLAR);
        addDrop(ModBlocks.MARBLE);
        addDrop(ModBlocks.MARBLE_BRICKS);
        addDrop(ModBlocks.MARBLE_PILLAR);
        addDrop(ModBlocks.PEARL_BLOCK);
        addDrop(ModBlocks.POLISHED_ESPERITE);
        addDrop(ModBlocks.POLISHED_MARBLE);
        addDrop(ModBlocks.POLISHED_LIMESTONE);
        addDrop(ModBlocks.POLISHED_SOAPSTONE);
        addDrop(ModBlocks.PRISMATIC_SHARD_BLOCK);
        addDrop(ModBlocks.RADIONITE_BLOCK);
        addDrop(ModBlocks.RAW_RADIONITE_BLOCK);
        addDrop(ModBlocks.RAW_IRIDIUM_BLOCK);
        addDrop(ModBlocks.REFINED_QUARTZ_BLOCK);
        addDrop(ModBlocks.RUBY_BLOCK);
        addDrop(ModBlocks.SMOOTH_ESPERITE);
        addDrop(ModBlocks.SMOOTH_LIMESTONE);
        addDrop(ModBlocks.SMOOTH_MARBLE);
        addDrop(ModBlocks.SMOOTH_SOAPSTONE);
        addDrop(ModBlocks.SOAPSTONE);
        addDrop(ModBlocks.SOAPSTONE_BRICKS);
        addDrop(ModBlocks.SOAPSTONE_PILLAR);
        addDrop(ModBlocks.TOPAZ_BLOCK);
        addDrop(ModBlocks.ESPERITE_STAIRS);
        addDrop(ModBlocks.MARBLE_STAIRS);
        addDrop(ModBlocks.SOAPSTONE_STAIRS);
        addDrop(ModBlocks.LIMESTONE_STAIRS);
        addDrop(ModBlocks.POLISHED_ESPERITE_STAIRS);
        addDrop(ModBlocks.POLISHED_MARBLE_STAIRS);
        addDrop(ModBlocks.POLISHED_SOAPSTONE_STAIRS);
        addDrop(ModBlocks.POLISHED_LIMESTONE_STAIRS);
        addDrop(ModBlocks.ESPERITE_WALL);
        addDrop(ModBlocks.MARBLE_WALL);
        addDrop(ModBlocks.SOAPSTONE_WALL);
        addDrop(ModBlocks.LIMESTONE_WALL);
        addDrop(ModBlocks.POLISHED_ESPERITE_WALL);
        addDrop(ModBlocks.POLISHED_MARBLE_WALL);
        addDrop(ModBlocks.POLISHED_SOAPSTONE_WALL);
        addDrop(ModBlocks.POLISHED_LIMESTONE_WALL);

        addDrop(ModBlocks.ESPERITE_SLAB, slabDrops(ModBlocks.ESPERITE_SLAB));
        addDrop(ModBlocks.MARBLE_SLAB, slabDrops(ModBlocks.MARBLE_SLAB));
        addDrop(ModBlocks.SOAPSTONE_SLAB, slabDrops(ModBlocks.SOAPSTONE_SLAB));
        addDrop(ModBlocks.LIMESTONE_SLAB, slabDrops(ModBlocks.LIMESTONE_SLAB));
        addDrop(ModBlocks.POLISHED_ESPERITE_SLAB, slabDrops(ModBlocks.POLISHED_ESPERITE_SLAB));
        addDrop(ModBlocks.POLISHED_MARBLE_SLAB, slabDrops(ModBlocks.POLISHED_MARBLE_SLAB));
        addDrop(ModBlocks.POLISHED_SOAPSTONE_SLAB, slabDrops(ModBlocks.POLISHED_SOAPSTONE_SLAB));
        addDrop(ModBlocks.POLISHED_LIMESTONE_SLAB, slabDrops(ModBlocks.POLISHED_LIMESTONE_SLAB));

        addDrop(ModBlocks.AQUAMARINE_ORE, oreDrops(ModBlocks.AQUAMARINE_ORE, ModItems.AQUAMARINE));
        addDrop(ModBlocks.AQUAMARINE_DEEPSLATE_ORE, oreDrops(ModBlocks.AQUAMARINE_DEEPSLATE_ORE, ModItems.AQUAMARINE));
        addDrop(ModBlocks.JADE_ORE, oreDrops(ModBlocks.JADE_ORE, ModItems.JADE));
        addDrop(ModBlocks.JADE_DEEPSLATE_ORE, oreDrops(ModBlocks.JADE_DEEPSLATE_ORE, ModItems.JADE));
        addDrop(ModBlocks.TOPAZ_ORE, oreDrops(ModBlocks.TOPAZ_ORE, ModItems.TOPAZ));
        addDrop(ModBlocks.TOPAZ_DEEPSLATE_ORE, oreDrops(ModBlocks.TOPAZ_DEEPSLATE_ORE, ModItems.TOPAZ));
        addDrop(ModBlocks.NETHER_TOPAZ_ORE, oreDrops(ModBlocks.NETHER_TOPAZ_ORE, ModItems.TOPAZ));
        addDrop(ModBlocks.RUBY_ORE, oreDrops(ModBlocks.RUBY_ORE, ModItems.RUBY));
        addDrop(ModBlocks.RUBY_DEEPSLATE_ORE, oreDrops(ModBlocks.RUBY_DEEPSLATE_ORE, ModItems.RUBY));
        addDrop(ModBlocks.NETHER_RUBY_ORE, oreDrops(ModBlocks.NETHER_RUBY_ORE, ModItems.RUBY));
        addDrop(ModBlocks.NETHER_RADIONITE_ORE, oreDrops(ModBlocks.NETHER_RADIONITE_ORE, ModItems.RAW_RADIONITE));
        addDrop(ModBlocks.IRIDIUM_DEEPSLATE_ORE, oreDrops(ModBlocks.IRIDIUM_DEEPSLATE_ORE, ModItems.RAW_IRIDIUM));
        addDrop(ModBlocks.NETHER_IRIDIUM_ORE, oreDrops(ModBlocks.NETHER_IRIDIUM_ORE, ModItems.RAW_IRIDIUM));

        addDrop(ModBlocks.CINDER_SHARD_ORE, multipleOreDrops(ModBlocks.CINDER_SHARD_ORE, ModItems.CINDER_SHARD, 2,5));
        addDrop(ModBlocks.CINDER_CLUSTER, multipleOreDrops(ModBlocks.CINDER_CLUSTER, ModItems.CINDER_SHARD, 1,4));
        addDrop(ModBlocks.FIRE_QUARTZ_ORE, multipleOreDrops(ModBlocks.FIRE_QUARTZ_ORE, ModItems.FIRE_QUARTZ, 2,4));

        addDropWithSilkTouch(ModBlocks.LARGE_CINDER_BUD);
        addDropWithSilkTouch(ModBlocks.MEDIUM_CINDER_BUD);
        addDropWithSilkTouch(ModBlocks.SMALL_CINDER_BUD);
    }

    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }
}
