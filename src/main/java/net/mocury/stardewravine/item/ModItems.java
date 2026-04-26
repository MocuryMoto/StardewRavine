package net.mocury.stardewravine.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.mocury.stardewravine.StardewRavine;
import net.mocury.stardewravine.item.custom.*;

public class ModItems {
    public static final Item AQUAMARINE = registerItem("aquamarine", new Item(new Item.Settings()));
    public static final Item TOPAZ = registerItem("topaz", new Item(new Item.Settings()));
    public static final Item JADE = registerItem("jade", new Item(new Item.Settings()));
    public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings()));
    public static final Item PRISMATIC_SHARD = registerItem("prismatic_shard", new Item(new Item.Settings()));
    public static final Item RADIONITE_INGOT = registerItem("radionite_ingot", new Item(new Item.Settings()));
    public static final Item RAW_RADIONITE = registerItem("raw_radionite", new Item(new Item.Settings()));
    public static final Item REFINED_QUARTZ = registerItem("refined_quartz", new Item(new Item.Settings()));
    public static final Item IRIDIUM_INGOT = registerItem("iridium_ingot", new Item(new Item.Settings()));
    public static final Item RAW_IRIDIUM = registerItem("raw_iridium", new Item(new Item.Settings()));
    public static final Item CINDER_SHARD = registerItem("cinder_shard", new Item(new Item.Settings()));
    public static final Item PEARL = registerItem("pearl", new Item(new Item.Settings()));
    public static final Item HELVINE = registerItem("helvine", new Item(new Item.Settings()));
    public static final Item FIRE_QUARTZ = registerItem("fire_quartz", new Item(new Item.Settings()));

    public static final Item FAIRY_BOX = registerItem("fairy_box", new FairyBoxItem(new Item.Settings()));
    public static final Item MAGIC_QUIVER = registerItem("magic_quiver", new MagicQuiverItem(new Item.Settings()));
    public static final Item ICE_ROD = registerItem("ice_rod", new IceRodItem(new Item.Settings()));
    public static final Item BASILISK_PAW = registerItem("basilisk_paw", new BasiliskPawItem(new Item.Settings()));
    public static final Item RUSTY_SPUR = registerItem("rusty_spur", new RustySpurItem(new Item.Settings()));
    public static final Item GOLDEN_SPUR = registerItem("golden_spur", new GoldenSpurItem(new Item.Settings()));
    public static final Item RUSTY_COG = registerItem("rusty_cog", new RustyCogItem(new Item.Settings()));
    public static final Item IRON_COG = registerItem("iron_cog", new IronCogItem(new Item.Settings()));
    public static final Item RUSTY_SPOON = registerItem("rusty_spoon", new RustySpoonItem(new Item.Settings()));
    public static final Item SILVER_SPOON = registerItem("silver_spoon", new SilverSpoonItem(new Item.Settings()));
    public static final Item DRIED_STARFISH = registerItem("dried_starfish", new DriedStarfishItem(new Item.Settings()));

    public static final Item STARDROP = registerItem("stardrop", new Item(new Item.Settings().food(ModFoodComponents.STARDROP)));
    public static final Item ANCIENT_FRUIT = registerItem("ancient_fruit", new Item(new Item.Settings().food(ModFoodComponents.ANCIENT_FRUIT)));

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
           entries.add(REFINED_QUARTZ);
           entries.add(IRIDIUM_INGOT);
           entries.add(RAW_IRIDIUM);

        });ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
           entries.add(STARDROP);
           entries.add(ANCIENT_FRUIT);
        });
    }
}
