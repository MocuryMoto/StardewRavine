package net.mocury.stardewravine.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.mocury.stardewravine.block.ModBlocks;
import net.mocury.stardewravine.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AQUAMARINE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TOPAZ_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.JADE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRISMATIC_SHARD_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RADIONITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_RADIONITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_RADIONITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AQUAMARINE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AQUAMARINE_DEEPSLATE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TOPAZ_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TOPAZ_DEEPSLATE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_TOPAZ_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.JADE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.JADE_DEEPSLATE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_DEEPSLATE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.REFINED_QUARTZ_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.IRIDIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.IRIDIUM_DEEPSLATE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_IRIDIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PEARL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ESPERITE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_ESPERITE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SMOOTH_ESPERITE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ESPERITE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MARBLE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_MARBLE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SMOOTH_MARBLE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MARBLE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOAPSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_SOAPSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SMOOTH_SOAPSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOAPSTONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIMESTONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_LIMESTONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SMOOTH_LIMESTONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIMESTONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BUDDING_CINDER_SHARD_BLOCK);

        blockStateModelGenerator.registerAmethyst(ModBlocks.CINDER_CLUSTER);
        blockStateModelGenerator.registerAmethyst(ModBlocks.LARGE_CINDER_BUD);
        blockStateModelGenerator.registerAmethyst(ModBlocks.MEDIUM_CINDER_BUD);
        blockStateModelGenerator.registerAmethyst(ModBlocks.SMALL_CINDER_BUD);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.AQUAMARINE, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOPAZ, Models.GENERATED);
        itemModelGenerator.register(ModItems.JADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.PRISMATIC_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.RADIONITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_RADIONITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.REFINED_QUARTZ, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRIDIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_IRIDIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.CINDER_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.PEARL, Models.GENERATED);
        itemModelGenerator.register(ModItems.HELVINE, Models.GENERATED);

        itemModelGenerator.register(ModItems.FAIRY_BOX, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAGIC_QUIVER, Models.GENERATED);
        itemModelGenerator.register(ModItems.ICE_ROD, Models.GENERATED);
        itemModelGenerator.register(ModItems.BASILISK_PAW, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUSTY_SPUR, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_SPUR, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUSTY_COG, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_COG, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUSTY_SPOON, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILVER_SPOON, Models.GENERATED);
        itemModelGenerator.register(ModItems.DRIED_STARFISH, Models.GENERATED);

        itemModelGenerator.register(ModItems.STARDROP, Models.GENERATED);
        itemModelGenerator.register(ModItems.ANCIENT_FRUIT, Models.GENERATED);
    }
}
