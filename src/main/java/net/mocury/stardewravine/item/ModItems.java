package net.mocury.stardewravine.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.mocury.stardewravine.StardewRavine;

public class ModItems {
    public static final Item AQUAMARINE = registerItem("aquamarine", new Item(new Item.Settings()));
    public static final Item TOPAZ = registerItem("topaz", new Item(new Item.Settings()));
    public static final Item JADE = registerItem("jade", new Item(new Item.Settings()));
    public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings()));
    public static final Item PRISMATIC_SHARD = registerItem("prismatic_shard", new Item(new Item.Settings()));
    public static final Item RADIONITE_INGOT = registerItem("radionite_ingot", new Item(new Item.Settings()));
    public static final Item RAW_RADIONITE = registerItem("raw_radionite", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(StardewRavine.MOD_ID, name), item);
    }

    public static void registerModItems(){
        StardewRavine.LOGGER.info("Registering Items for "+StardewRavine.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
           entries.add(PRISMATIC_SHARD);
           entries.add(AQUAMARINE);
           entries.add(TOPAZ);
           entries.add(JADE);
           entries.add(RUBY);
           entries.add(RAW_RADIONITE);
           entries.add(RADIONITE_INGOT);
        });
    }
}
