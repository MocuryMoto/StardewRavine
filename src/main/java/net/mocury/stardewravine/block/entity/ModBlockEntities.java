package net.mocury.stardewravine.block.entity;

import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.mocury.stardewravine.StardewRavine;
import net.mocury.stardewravine.block.ModBlocks;
import net.mocury.stardewravine.block.entity.custom.CrystalariumBlockEntity;
import net.mocury.stardewravine.block.entity.custom.RefineryBlockEntity;

public class ModBlockEntities {
    public static final BlockEntityType<RefineryBlockEntity> REFINERY_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(StardewRavine.MOD_ID, "refinery_be"),
                    BlockEntityType.Builder.create(RefineryBlockEntity::new, ModBlocks.REFINERY).build(null));
    public static final BlockEntityType<CrystalariumBlockEntity> CRYSTALARIUM_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(StardewRavine.MOD_ID, "crystalarium_be"),
                    BlockEntityType.Builder.create(CrystalariumBlockEntity::new, ModBlocks.CRYSTALARIUM).build(null));

    public static void registerBlockEntities() {
        StardewRavine.LOGGER.info("Registering Block Entities for " + StardewRavine.MOD_ID);
    }
}
