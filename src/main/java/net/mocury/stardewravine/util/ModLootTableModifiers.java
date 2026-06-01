package net.mocury.stardewravine.util;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import net.mocury.stardewravine.item.ModItems;

public class ModLootTableModifiers {
    private static final Identifier GRASS_BLOCK_ID
            = Identifier.of("minecraft","blocks/short_grass");

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registry) -> {
            if(GRASS_BLOCK_ID.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f)) //10% chance of dropping
                        .with(ItemEntry.builder(ModItems.MIXED_SEEDS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f)).build()); //drops 1-3

                tableBuilder.pool(poolBuilder.build());
            }
        });
    }
}
