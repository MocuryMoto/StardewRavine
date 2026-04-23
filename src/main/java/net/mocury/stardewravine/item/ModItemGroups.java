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
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.STARDROP))
                    .displayName(Text.translatable("itemgroup.stardewravine.stardew_ravine_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.STARDROP);
                        entries.add(ModItems.ANCIENT_FRUIT);
                        entries.add(ModItems.PRISMATIC_SHARD);
                        entries.add(ModBlocks.PRISMATIC_SHARD_BLOCK);
                        entries.add(ModItems.AQUAMARINE);
                        entries.add(ModBlocks.AQUAMARINE_BLOCK);
                        entries.add(ModBlocks.AQUAMARINE_ORE);
                        entries.add(ModBlocks.AQUAMARINE_DEEPSLATE_ORE);
                        entries.add(ModItems.TOPAZ);
                        entries.add(ModBlocks.TOPAZ_BLOCK);
                        entries.add(ModBlocks.TOPAZ_ORE);
                        entries.add(ModBlocks.TOPAZ_DEEPSLATE_ORE);
                        entries.add(ModBlocks.NETHER_TOPAZ_ORE);
                        entries.add(ModItems.JADE);
                        entries.add(ModBlocks.JADE_BLOCK);
                        entries.add(ModBlocks.JADE_ORE);
                        entries.add(ModBlocks.JADE_DEEPSLATE_ORE);
                        entries.add(ModItems.RUBY);
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.RUBY_DEEPSLATE_ORE);
                        entries.add(ModBlocks.NETHER_RUBY_ORE);
                        entries.add(ModItems.RADIONITE_INGOT);
                        entries.add(ModItems.RAW_RADIONITE);
                        entries.add(ModBlocks.RADIONITE_BLOCK);
                        entries.add(ModBlocks.RAW_RADIONITE_BLOCK);
                        entries.add(ModBlocks.NETHER_RADIONITE_ORE);
                        entries.add(ModItems.IRIDIUM_INGOT);
                        entries.add(ModItems.RAW_IRIDIUM);
                        entries.add(ModBlocks.IRIDIUM_BLOCK);
                        entries.add(ModBlocks.RAW_IRIDIUM_BLOCK);
                        entries.add(ModBlocks.IRIDIUM_DEEPSLATE_ORE);
                        entries.add(ModBlocks.NETHER_IRIDIUM_ORE);
                        entries.add(ModItems.REFINED_QUARTZ);
                        entries.add(ModBlocks.REFINED_QUARTZ_BLOCK);
                        entries.add(ModItems.FAIRY_BOX);
                        entries.add(ModItems.MAGIC_QUIVER);
                        entries.add(ModItems.BASILISK_PAW);
                        entries.add(ModItems.ICE_ROD);
                        entries.add(ModItems.RUSTY_SPUR);
                        entries.add(ModItems.GOLDEN_SPUR);
                        entries.add(ModItems.RUSTY_COG);
                        entries.add(ModItems.IRON_COG);
                        entries.add(ModItems.RUSTY_SPOON);
                        entries.add(ModItems.SILVER_SPOON);
                        entries.add(ModItems.DRIED_STARFISH);
                        entries.add(ModBlocks.ESPERITE);
                        entries.add(ModBlocks.POLISHED_ESPERITE);
                        entries.add(ModBlocks.SMOOTH_ESPERITE);
                        entries.add(ModBlocks.ESPERITE_BRICKS);
                        entries.add(ModBlocks.ESPERITE_PILLAR);
                        entries.add(ModBlocks.CHISELED_ESPERITE);
                        entries.add(ModBlocks.MARBLE);
                        entries.add(ModBlocks.POLISHED_MARBLE);
                        entries.add(ModBlocks.SMOOTH_MARBLE);
                        entries.add(ModBlocks.MARBLE_BRICKS);
                        entries.add(ModBlocks.MARBLE_PILLAR);
                        entries.add(ModBlocks.CHISELED_MARBLE);
                        entries.add(ModBlocks.SOAPSTONE);
                        entries.add(ModBlocks.POLISHED_SOAPSTONE);
                        entries.add(ModBlocks.SMOOTH_SOAPSTONE);
                        entries.add(ModBlocks.SOAPSTONE_BRICKS);
                        entries.add(ModBlocks.SOAPSTONE_PILLAR);
                        entries.add(ModBlocks.CHISELED_SOAPSTONE);
                        entries.add(ModBlocks.LIMESTONE);
                        entries.add(ModBlocks.POLISHED_LIMESTONE);
                        entries.add(ModBlocks.SMOOTH_LIMESTONE);
                        entries.add(ModBlocks.LIMESTONE_BRICKS);
                        entries.add(ModBlocks.LIMESTONE_PILLAR);
                        entries.add(ModBlocks.CHISELED_LIMESTONE);
                        entries.add(ModItems.CINDER_SHARD);
                        entries.add(ModBlocks.CINDER_SHARD_BLOCK);
                        entries.add(ModBlocks.BUDDING_CINDER_SHARD_BLOCK);
                        entries.add(ModBlocks.CINDER_CLUSTER);
                        entries.add(ModBlocks.LARGE_CINDER_BUD);
                        entries.add(ModBlocks.MEDIUM_CINDER_BUD);
                        entries.add(ModBlocks.SMALL_CINDER_BUD);
                        entries.add(ModBlocks.CINDER_SHARD_ORE);
                        entries.add(ModItems.PEARL);
                        entries.add(ModBlocks.PEARL_BLOCK);
                        entries.add(ModItems.HELVINE);
                        entries.add(ModBlocks.HELVINE_BLOCK);

                    }).build());


    public static void registerItemGroups() {
        StardewRavine.LOGGER.info("Registering Item Groups for " + StardewRavine.MOD_ID);
    }
}
