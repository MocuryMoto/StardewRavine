package net.mocury.stardewravine.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
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
    public static final Item FIRE_QUARTZ = registerItem("fire_quartz", new Item(new Item.Settings()));

    public static final Item HELVINE = registerItem("helvine", new Item(new Item.Settings()));
    public static final Item LEMON_STONE = registerItem("lemon_stone", new Item(new Item.Settings()));
    public static final Item TIGERS_EYE = registerItem("tigers_eye", new Item(new Item.Settings()));
    public static final Item KYANITE = registerItem("kyanite", new Item(new Item.Settings()));
    public static final Item PYRITE = registerItem("pyrite", new Item(new Item.Settings()));
    public static final Item FLUORAPATITE = registerItem("fluorapatite", new Item(new Item.Settings()));
    public static final Item JAGOITE = registerItem("jagoite", new Item(new Item.Settings()));
    public static final Item CELESTINE = registerItem("celestine", new Item(new Item.Settings()));
    public static final Item GEMINITE = registerItem("geminite", new Item(new Item.Settings()));
    public static final Item JASPER = registerItem("jasper", new Item(new Item.Settings()));
    public static final Item AERINITE = registerItem("aerinite", new Item(new Item.Settings()));
    public static final Item ORPIMENT = registerItem("orpiment", new Item(new Item.Settings()));
    public static final Item DOLOMITE = registerItem("dolomite", new Item(new Item.Settings()));
    public static final Item JAMBORITE = registerItem("jamborite", new Item(new Item.Settings()));
    public static final Item NEKOITE = registerItem("nekoite", new Item(new Item.Settings()));
    public static final Item NEPTUNITE = registerItem("neptunite", new Item(new Item.Settings()));
    public static final Item LUNARITE = registerItem("lunarite", new Item(new Item.Settings()));
    public static final Item MALACHITE = registerItem("malachite", new Item(new Item.Settings()));
    public static final Item OPAL = registerItem("opal", new Item(new Item.Settings()));
    public static final Item FIRE_OPAL = registerItem("fire_opal", new Item(new Item.Settings()));

    public static final Item FAIRY_BOX = registerItem("fairy_box", new FairyBoxItem(new Item.Settings().maxCount(1)));
    public static final Item MAGIC_QUIVER = registerItem("magic_quiver", new MagicQuiverItem(new Item.Settings().maxCount(1)));
    public static final Item ICE_ROD = registerItem("ice_rod", new IceRodItem(new Item.Settings().maxCount(1)));
    public static final Item BASILISK_PAW = registerItem("basilisk_paw", new BasiliskPawItem(new Item.Settings().maxCount(1)));
    public static final Item RUSTY_SPUR = registerItem("rusty_spur", new RustySpurItem(new Item.Settings().maxCount(1)));
    public static final Item GOLDEN_SPUR = registerItem("golden_spur", new GoldenSpurItem(new Item.Settings().maxCount(1)));
    public static final Item RUSTY_COG = registerItem("rusty_cog", new RustyCogItem(new Item.Settings().maxCount(1)));
    public static final Item IRON_COG = registerItem("iron_cog", new IronCogItem(new Item.Settings().maxCount(1)));
    public static final Item RUSTY_SPOON = registerItem("rusty_spoon", new RustySpoonItem(new Item.Settings().maxCount(1)));
    public static final Item SILVER_SPOON = registerItem("silver_spoon", new SilverSpoonItem(new Item.Settings().maxCount(1)));
    public static final Item DRIED_STARFISH = registerItem("dried_starfish", new DriedStarfishItem(new Item.Settings().maxCount(1)));

    public static final Item IRIDIUM_SWORD = registerItem("iridium_sword", new SwordItem(ModToolMaterials.IRIDIUM, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.IRIDIUM, 3, -2.4f))));
    public static final Item IRIDIUM_PICKAXE = registerItem("iridium_pickaxe", new PickaxeItem(ModToolMaterials.IRIDIUM, new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.IRIDIUM, 1, -2.8f))));
    public static final Item IRIDIUM_SHOVEL = registerItem("iridium_shovel", new ShovelItem(ModToolMaterials.IRIDIUM, new Item.Settings()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.IRIDIUM, 1.5f, -3.0f))));
    public static final Item IRIDIUM_AXE = registerItem("iridium_axe", new AxeItem(ModToolMaterials.IRIDIUM, new Item.Settings()
            .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.IRIDIUM, 6, -3.2f))));
    public static final Item IRIDIUM_HOE = registerItem("iridium_hoe", new HoeItem(ModToolMaterials.IRIDIUM, new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.IRIDIUM, 0, -3.0f))));
    public static final Item NETHER_IRIDIUM_SWORD = registerItem("nether_iridium_sword", new SwordItem(ModToolMaterials.NETHER_IRIDIUM, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.NETHER_IRIDIUM, 3, -2.4f))));
    public static final Item NETHER_IRIDIUM_PICKAXE = registerItem("nether_iridium_pickaxe", new PickaxeItem(ModToolMaterials.NETHER_IRIDIUM, new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.NETHER_IRIDIUM, 1, -2.8f))));
    public static final Item NETHER_IRIDIUM_SHOVEL = registerItem("nether_iridium_shovel", new ShovelItem(ModToolMaterials.NETHER_IRIDIUM, new Item.Settings()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.NETHER_IRIDIUM, 1.5f, -3.0f))));
    public static final Item NETHER_IRIDIUM_AXE = registerItem("nether_iridium_axe", new AxeItem(ModToolMaterials.NETHER_IRIDIUM, new Item.Settings()
            .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.NETHER_IRIDIUM, 6, -3.2f))));
    public static final Item NETHER_IRIDIUM_HOE = registerItem("nether_iridium_hoe", new HoeItem(ModToolMaterials.NETHER_IRIDIUM, new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.NETHER_IRIDIUM, 0, -3.0f))));

    public static final Item IRIDIUM_HELMET = registerItem("iridium_helmet",
            new ArmorItem(ModArmorMaterials.IRIDIUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(35))));
    public static final Item IRIDIUM_CHESTPLATE = registerItem("iridium_chestplate",
            new ArmorItem(ModArmorMaterials.IRIDIUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(35))));
    public static final Item IRIDIUM_LEGGINGS = registerItem("iridium_leggings",
            new ArmorItem(ModArmorMaterials.IRIDIUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(35))));
    public static final Item IRIDIUM_BOOTS = registerItem("iridium_boots",
            new ArmorItem(ModArmorMaterials.IRIDIUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(35))));
    public static final Item NETHER_IRIDIUM_HELMET = registerItem("nether_iridium_helmet",
            new ArmorItem(ModArmorMaterials.NETHER_IRIDIUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(40))));
    public static final Item NETHER_IRIDIUM_CHESTPLATE = registerItem("nether_iridium_chestplate",
            new ArmorItem(ModArmorMaterials.NETHER_IRIDIUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(40))));
    public static final Item NETHER_IRIDIUM_LEGGINGS = registerItem("nether_iridium_leggings",
            new ArmorItem(ModArmorMaterials.NETHER_IRIDIUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(40))));
    public static final Item NETHER_IRIDIUM_BOOTS = registerItem("nether_iridium_boots",
            new ArmorItem(ModArmorMaterials.NETHER_IRIDIUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(40))));

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
