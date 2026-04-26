package net.mocury.stardewravine.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.mocury.stardewravine.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup lookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.AQUAMARINE_BLOCK)
                .add(ModBlocks.AQUAMARINE_ORE)
                .add(ModBlocks.AQUAMARINE_DEEPSLATE_ORE)
                .add(ModBlocks.TOPAZ_BLOCK)
                .add(ModBlocks.TOPAZ_ORE)
                .add(ModBlocks.TOPAZ_DEEPSLATE_ORE)
                .add(ModBlocks.NETHER_TOPAZ_ORE)
                .add(ModBlocks.JADE_BLOCK)
                .add(ModBlocks.JADE_ORE)
                .add(ModBlocks.JADE_DEEPSLATE_ORE)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.RUBY_DEEPSLATE_ORE)
                .add(ModBlocks.NETHER_RUBY_ORE)
                .add(ModBlocks.NETHER_RADIONITE_ORE)
                .add(ModBlocks.RADIONITE_BLOCK)
                .add(ModBlocks.RAW_RADIONITE_BLOCK)
                .add(ModBlocks.PRISMATIC_SHARD_BLOCK)
                .add(ModBlocks.REFINED_QUARTZ_BLOCK)
                .add(ModBlocks.IRIDIUM_BLOCK)
                .add(ModBlocks.RAW_IRIDIUM_BLOCK)
                .add(ModBlocks.IRIDIUM_DEEPSLATE_ORE)
                .add(ModBlocks.NETHER_IRIDIUM_ORE)
                .add(ModBlocks.ESPERITE)
                .add(ModBlocks.POLISHED_ESPERITE)
                .add(ModBlocks.SMOOTH_ESPERITE)
                .add(ModBlocks.ESPERITE_BRICKS)
                .add(ModBlocks.ESPERITE_PILLAR)
                .add(ModBlocks.CHISELED_ESPERITE)
                .add(ModBlocks.MARBLE)
                .add(ModBlocks.POLISHED_MARBLE)
                .add(ModBlocks.SMOOTH_MARBLE)
                .add(ModBlocks.MARBLE_BRICKS)
                .add(ModBlocks.MARBLE_PILLAR)
                .add(ModBlocks.CHISELED_MARBLE)
                .add(ModBlocks.SOAPSTONE)
                .add(ModBlocks.POLISHED_SOAPSTONE)
                .add(ModBlocks.SMOOTH_SOAPSTONE)
                .add(ModBlocks.SOAPSTONE_BRICKS)
                .add(ModBlocks.SOAPSTONE_PILLAR)
                .add(ModBlocks.CHISELED_SOAPSTONE)
                .add(ModBlocks.LIMESTONE)
                .add(ModBlocks.POLISHED_LIMESTONE)
                .add(ModBlocks.SMOOTH_LIMESTONE)
                .add(ModBlocks.LIMESTONE_BRICKS)
                .add(ModBlocks.LIMESTONE_PILLAR)
                .add(ModBlocks.CHISELED_LIMESTONE)
                .add(ModBlocks.CINDER_SHARD_BLOCK)
                .add(ModBlocks.CINDER_CLUSTER)
                .add(ModBlocks.LARGE_CINDER_BUD)
                .add(ModBlocks.MEDIUM_CINDER_BUD)
                .add(ModBlocks.SMALL_CINDER_BUD)
                .add(ModBlocks.CINDER_SHARD_ORE)
                .add(ModBlocks.HELVINE_BLOCK)
                .add(ModBlocks.PEARL_BLOCK)
                .add(ModBlocks.ESPERITE_WALL)
                .add(ModBlocks.POLISHED_ESPERITE_WALL)
                .add(ModBlocks.MARBLE_WALL)
                .add(ModBlocks.POLISHED_MARBLE_WALL)
                .add(ModBlocks.SOAPSTONE_WALL)
                .add(ModBlocks.POLISHED_SOAPSTONE_WALL)
                .add(ModBlocks.LIMESTONE_WALL)
                .add(ModBlocks.POLISHED_LIMESTONE_WALL);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.AQUAMARINE_BLOCK)
                .add(ModBlocks.AQUAMARINE_ORE)
                .add(ModBlocks.AQUAMARINE_DEEPSLATE_ORE)
                .add(ModBlocks.TOPAZ_BLOCK)
                .add(ModBlocks.TOPAZ_ORE)
                .add(ModBlocks.TOPAZ_DEEPSLATE_ORE)
                .add(ModBlocks.NETHER_TOPAZ_ORE)
                .add(ModBlocks.JADE_BLOCK)
                .add(ModBlocks.JADE_ORE)
                .add(ModBlocks.JADE_DEEPSLATE_ORE)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.RUBY_DEEPSLATE_ORE)
                .add(ModBlocks.NETHER_RUBY_ORE)
                .add(ModBlocks.CINDER_SHARD_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.NETHER_RADIONITE_ORE)
                .add(ModBlocks.RADIONITE_BLOCK)
                .add(ModBlocks.RAW_RADIONITE_BLOCK)
                .add(ModBlocks.PRISMATIC_SHARD_BLOCK)
                .add(ModBlocks.IRIDIUM_BLOCK)
                .add(ModBlocks.RAW_IRIDIUM_BLOCK)
                .add(ModBlocks.IRIDIUM_DEEPSLATE_ORE)
                .add(ModBlocks.NETHER_IRIDIUM_ORE);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.ESPERITE_WALL)
                .add(ModBlocks.POLISHED_ESPERITE_WALL)
                .add(ModBlocks.MARBLE_WALL)
                .add(ModBlocks.POLISHED_MARBLE_WALL)
                .add(ModBlocks.SOAPSTONE_WALL)
                .add(ModBlocks.POLISHED_SOAPSTONE_WALL)
                .add(ModBlocks.LIMESTONE_WALL)
                .add(ModBlocks.POLISHED_LIMESTONE_WALL);
    }
}
