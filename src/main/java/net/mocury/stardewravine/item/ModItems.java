package net.mocury.stardewravine.item;

import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.mocury.stardewravine.StardewRavine;
import net.mocury.stardewravine.block.ModBlocks;
import net.mocury.stardewravine.entity.ModBoats;
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

    public static final Item GEODE = registerItem("geode", new Item(new Item.Settings()));
    public static final Item GEODE_SHELL = registerItem("geode_shell", new Item(new Item.Settings()));
    public static final Item FROZEN_GEODE = registerItem("frozen_geode", new Item(new Item.Settings()));
    public static final Item FROZEN_GEODE_SHELL = registerItem("frozen_geode_shell", new Item(new Item.Settings()));
    public static final Item MAGMA_GEODE = registerItem("magma_geode", new Item(new Item.Settings()));
    public static final Item MAGMA_GEODE_SHELL = registerItem("magma_geode_shell", new Item(new Item.Settings()));
    public static final Item OMNI_GEODE = registerItem("omni_geode", new Item(new Item.Settings()));
    public static final Item OMNI_GEODE_SHELL = registerItem("omni_geode_shell", new Item(new Item.Settings()));

    public static final Item FAIRY_STONE = registerItem("fairy_stone", new Item(new Item.Settings()));
    public static final Item FAIRY_DUST = registerItem("fairy_dust", new Item(new Item.Settings()));

    public static final Item BIXITE_CHUNK = registerItem("bixite_chunk", new Item(new Item.Settings()));
    public static final Item TERRASINE = registerItem("terrasine", new Item(new Item.Settings()));

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
    public static final Item IRIDIUM_BAND = registerItem("iridium_band", new IridiumBandItem(new Item.Settings().maxCount(1)));
    public static final Item ELVISH_RING = registerItem("elvish_ring", new ElvishRingItem(new Item.Settings().maxCount(1)));
    public static final Item ORNATE_NECKLACE = registerItem("ornate_necklace", new OrnateNecklaceItem(new Item.Settings().maxCount(1)));
    public static final Item GILDED_BRACELET = registerItem("gilded_bracelet", new GildedBraceletItem(new Item.Settings().maxCount(1)));
    public static final Item DWARVEN_TIARA = registerItem("dwarven_tiara", new DwarvenTiaraItem(new Item.Settings().maxCount(1)));

    public static final Item SAP = registerItem("sap", new SapItem(new Item.Settings()));
    public static final Item MYSTIC_SYRUP = registerItem("mystic_syrup", new MysticSyrupItem(new Item.Settings()));
    public static final Item OAK_RESIN = registerItem("oak_resin", new Item(new Item.Settings()));
    public static final Item PINE_TAR = registerItem("pine_tar", new Item(new Item.Settings()));

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
    public static final Item ANCIENT_FRUIT_SEEDS = registerItem("ancient_fruit_seeds", new AliasedBlockItem(ModBlocks.ANCIENT_FRUIT_CROP, new Item.Settings()));
    public static final Item SWEET_GEM_BERRY = registerItem("sweet_gem_berry", new Item(new Item.Settings().food(ModFoodComponents.SWEET_GEM_BERRY)));
    public static final Item RARE_SEED = registerItem("rare_seed", new AliasedBlockItem(ModBlocks.SWEET_GEM_BERRY_CROP, new Item.Settings()));

    public static final Item MIXED_SEEDS = registerItem("mixed_seeds", new AliasedBlockItem(ModBlocks.MIXED_CROP, new Item.Settings()));
    public static final Item GARLIC = registerItem("garlic", new Item(new Item.Settings().food(ModFoodComponents.GARLIC)));
    public static final Item GARLIC_SEEDS = registerItem("garlic_seeds", new AliasedBlockItem(ModBlocks.GARLIC_CROP, new Item.Settings()));
    public static final Item LEEK = registerItem("leek", new AliasedBlockItem(ModBlocks.LEEK_CROP, new Item.Settings().food(ModFoodComponents.LEEK)));
    public static final Item SPRING_ONION = registerItem("spring_onion", new AliasedBlockItem(ModBlocks.SPRING_ONION_CROP, new Item.Settings().food(ModFoodComponents.SPRING_ONION)));
    public static final Item PARSNIP = registerItem("parsnip", new Item(new Item.Settings().food(ModFoodComponents.PARSNIP)));
    public static final Item PARSNIP_SEEDS = registerItem("parsnip_seeds", new AliasedBlockItem(ModBlocks.PARSNIP_CROP, new Item.Settings()));
    public static final Item HORSERADISH = registerItem("horseradish", new AliasedBlockItem(ModBlocks.HORSERADISH_CROP, new Item.Settings().food(ModFoodComponents.HORSERADISH)));
    public static final Item RHUBARB = registerItem("rhubarb", new Item(new Item.Settings().food(ModFoodComponents.RHUBARB)));
    public static final Item RHUBARB_SEEDS = registerItem("rhubarb_seeds", new AliasedBlockItem(ModBlocks.RHUBARB_CROP, new Item.Settings()));
    public static final Item KALE = registerItem("kale", new Item(new Item.Settings().food(ModFoodComponents.KALE)));
    public static final Item KALE_SEEDS = registerItem("kale_seeds", new AliasedBlockItem(ModBlocks.KALE_CROP, new Item.Settings()));
    public static final Item CAULIFLOWER = registerItem("cauliflower", new Item(new Item.Settings().food(ModFoodComponents.CAULIFLOWER)));
    public static final Item CAULIFLOWER_SEEDS = registerItem("cauliflower_seeds", new AliasedBlockItem(ModBlocks.CAULIFLOWER_CROP, new Item.Settings()));
    public static final Item GREEN_BEAN = registerItem("green_bean", new Item(new Item.Settings().food(ModFoodComponents.GREEN_BEAN)));
    public static final Item GREEN_BEAN_SEEDS = registerItem("green_bean_seeds", new AliasedBlockItem(ModBlocks.GREEN_BEAN_CROP, new Item.Settings()));
    public static final Item RICE = registerItem("rice", new Item(new Item.Settings().food(ModFoodComponents.RICE)));
    public static final Item RICE_SEEDS = registerItem("rice_seeds", new AliasedBlockItem(ModBlocks.RICE_CROP, new Item.Settings()));
    public static final Item RED_CABBAGE = registerItem("red_cabbage", new Item(new Item.Settings().food(ModFoodComponents.RED_CABBAGE)));
    public static final Item RED_CABBAGE_SEEDS = registerItem("red_cabbage_seeds", new AliasedBlockItem(ModBlocks.RED_CABBAGE_CROP, new Item.Settings()));
    public static final Item STARFRUIT = registerItem("starfruit", new Item(new Item.Settings().food(ModFoodComponents.STARFRUIT)));
    public static final Item STARFRUIT_SEEDS = registerItem("starfruit_seeds", new AliasedBlockItem(ModBlocks.STARFRUIT_CROP, new Item.Settings()));
    public static final Item HOPS = registerItem("hops", new Item(new Item.Settings().food(ModFoodComponents.HOPS)));
    public static final Item HOPS_SEEDS = registerItem("hops_seeds", new AliasedBlockItem(ModBlocks.HOPS_CROP, new Item.Settings()));
    public static final Item RADISHES = registerItem("radishes", new Item(new Item.Settings().food(ModFoodComponents.RADISHES)));
    public static final Item RADISH_SEEDS = registerItem("radish_seeds", new AliasedBlockItem(ModBlocks.RADISH_CROP, new Item.Settings()));
    public static final Item CHILI_PEPPER = registerItem("chili_pepper", new Item(new Item.Settings().food(ModFoodComponents.CHILI_PEPPER)));
    public static final Item CHILI_PEPPER_SEEDS = registerItem("chili_pepper_seeds", new AliasedBlockItem(ModBlocks.CHILI_PEPPER_CROP, new Item.Settings()));
    public static final Item TOMATO = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.TOMATO)));
    public static final Item TOMATO_SEEDS = registerItem("tomato_seeds", new AliasedBlockItem(ModBlocks.TOMATO_CROP, new Item.Settings()));
    public static final Item SUMMER_SQUASH = registerItem("summer_squash", new Item(new Item.Settings().food(ModFoodComponents.SUMMER_SQUASH)));
    public static final Item SUMMER_SQUASH_SEEDS = registerItem("summer_squash_seeds", new AliasedBlockItem(ModBlocks.SUMMER_SQUASH_CROP, new Item.Settings()));
    public static final Item GRAPES = registerItem("grapes", new Item(new Item.Settings().food(ModFoodComponents.GRAPES)));
    public static final Item GRAPE_SEEDS = registerItem("grape_seeds", new AliasedBlockItem(ModBlocks.GRAPE_CROP, new Item.Settings()));
    public static final Item ARTICHOKE = registerItem("artichoke", new Item(new Item.Settings().food(ModFoodComponents.ARTICHOKE)));
    public static final Item ARTICHOKE_SEEDS = registerItem("artichoke_seeds", new AliasedBlockItem(ModBlocks.ARTICHOKE_CROP, new Item.Settings()));
    public static final Item BOK_CHOY = registerItem("bok_choy", new Item(new Item.Settings().food(ModFoodComponents.BOK_CHOY)));
    public static final Item BOK_CHOY_SEEDS = registerItem("bok_choy_seeds", new AliasedBlockItem(ModBlocks.BOK_CHOY_CROP, new Item.Settings()));
    public static final Item BROCCOLI = registerItem("broccoli", new Item(new Item.Settings().food(ModFoodComponents.BROCCOLI)));
    public static final Item BROCCOLI_SEEDS = registerItem("broccoli_seeds", new AliasedBlockItem(ModBlocks.BROCCOLI_CROP, new Item.Settings()));
    public static final Item EGGPLANT = registerItem("eggplant", new Item(new Item.Settings().food(ModFoodComponents.EGGPLANT)));
    public static final Item EGGPLANT_SEEDS = registerItem("eggplant_seeds", new AliasedBlockItem(ModBlocks.EGGPLANT_CROP, new Item.Settings()));
    public static final Item YAM = registerItem("yam", new AliasedBlockItem(ModBlocks.YAM_CROP, new Item.Settings().food(ModFoodComponents.YAM)));
    public static final Item CORN = registerItem("corn", new Item(new Item.Settings().food(ModFoodComponents.CORN)));
    public static final Item CORN_SEEDS = registerItem("corn_seeds", new AliasedBlockItem(ModBlocks.CORN_CROP, new Item.Settings()));
    public static final Item SNOW_YAM = registerItem("snow_yam", new AliasedBlockItem(ModBlocks.SNOW_YAM_CROP, new Item.Settings().food(ModFoodComponents.SNOW_YAM)));
    public static final Item WINTER_ROOT = registerItem("winter_root", new AliasedBlockItem(ModBlocks.WINTER_ROOT_CROP, new Item.Settings().food(ModFoodComponents.WINTER_ROOT)));

    public static final Item STARDEW_MELON_SLICE = registerItem("stardew_melon_slice", new Item(new Item.Settings().food(ModFoodComponents.STARDEW_MELON_SLICE)));
    public static final Item STARDEW_MELON_SEEDS = registerItem("stardew_melon_seeds", new AliasedBlockItem(ModBlocks.STARDEW_MELON_STEM, new Item.Settings()));
    public static final Item POWDERMELON_SLICE = registerItem("powdermelon_slice", new Item(new Item.Settings().food(ModFoodComponents.POWDERMELON_SLICE)));
    public static final Item POWDERMELON_SEEDS = registerItem("powdermelon_seeds", new AliasedBlockItem(ModBlocks.POWDERMELON_STEM, new Item.Settings()));


    public static final Item BLUEBERRIES = registerItem("blueberries",
            new AliasedBlockItem(ModBlocks.BLUEBERRY_BUSH, new Item.Settings().food(ModFoodComponents.BLUEBERRIES)));
    public static final Item SALMONBERRY = registerItem("salmonberry",
            new AliasedBlockItem(ModBlocks.SALMONBERRY_BUSH, new Item.Settings().food(ModFoodComponents.SALMONBERRY)));
    public static final Item STRAWBERRY = registerItem("strawberry",
            new AliasedBlockItem(ModBlocks.STRAWBERRY_BUSH, new Item.Settings().food(ModFoodComponents.STRAWBERRY)));
    public static final Item COFFEE_BEANS = registerItem("coffee_beans",
            new AliasedBlockItem(ModBlocks.COFFEE_BUSH, new Item.Settings().food(ModFoodComponents.COFFEE_BEANS)));
    public static final Item SPICE_BERRY = registerItem("spice_berry",
            new AliasedBlockItem(ModBlocks.SPICE_BERRY_BUSH, new Item.Settings().food(ModFoodComponents.SPICE_BERRY)));
    public static final Item CRANBERRIES = registerItem("cranberries",
            new AliasedBlockItem(ModBlocks.CRANBERRY_BUSH, new Item.Settings().food(ModFoodComponents.CRANBERRIES)));
    public static final Item BLACKBERRY = registerItem("blackberry",
            new AliasedBlockItem(ModBlocks.BLACKBERRY_BUSH, new Item.Settings().food(ModFoodComponents.BLACKBERRY)));
    public static final Item HAZELNUT = registerItem("hazelnut",
            new AliasedBlockItem(ModBlocks.HAZELNUT_BUSH, new Item.Settings().food(ModFoodComponents.HAZELNUT)));
    public static final Item PLUM = registerItem("plum",
            new AliasedBlockItem(ModBlocks.PLUM_BUSH, new Item.Settings().food(ModFoodComponents.PLUM)));
    public static final Item HOLLY_BERRIES = registerItem("holly_berries",
            new AliasedBlockItem(ModBlocks.HOLLY_BUSH, new Item.Settings().food(ModFoodComponents.HOLLY_BERRIES)));
    public static final Item CRYSTAL_FRUIT = registerItem("crystal_fruit",
            new AliasedBlockItem(ModBlocks.CRYSTAL_FRUIT_BUSH, new Item.Settings().food(ModFoodComponents.CRYSTAL_FRUIT)));




    public static final Item CHERRIES = registerItem("cherries", new Item(new Item.Settings().food(ModFoodComponents.CHERRIES)));
    public static final Item APRICOT = registerItem("apricot", new Item(new Item.Settings().food(ModFoodComponents.APRICOT)));
    public static final Item ORANGE = registerItem("orange", new Item(new Item.Settings().food(ModFoodComponents.ORANGE)));
    public static final Item POMEGRANATE = registerItem("pomegranate", new Item(new Item.Settings().food(ModFoodComponents.POMEGRANATE)));
    public static final Item MANGO = registerItem("mango", new Item(new Item.Settings().food(ModFoodComponents.MANGO)));
    public static final Item BANANA = registerItem("banana", new Item(new Item.Settings().food(ModFoodComponents.BANANA)));
    public static final Item PEACH = registerItem("peach", new Item(new Item.Settings().food(ModFoodComponents.PEACH)));

    public static final Item MAPLE_SYRUP = registerItem(
            "maple_syrup", new MapleSyrupItem(new Item.Settings().food(ModFoodComponents.MAPLE_SYRUP).maxCount(16)));

    public static final Item PETRIFIED_SLIME = registerItem("petrified_slime", new Item(new Item.Settings()));
    public static final Item GHOST_CRYSTAL = registerItem("ghost_crystal", new Item(new Item.Settings()));
    public static final Item BAT_WING = registerItem("bat_wing", new Item(new Item.Settings()));
    public static final Item TRELLIS = registerItem("trellis", new Item(new Item.Settings()));
    public static final Item EARTH_CRYSTAL = registerItem("earth_crystal", new Item(new Item.Settings()));
    public static final Item GALAXY_SOUL = registerItem("galaxy_soul", new Item(new Item.Settings()));

    public static final Item MAPLE_SIGN = registerItem("maple_sign", new SignItem(new Item.Settings().maxCount(16), ModBlocks.STANDING_MAPLE_SIGN, ModBlocks.WALL_MAPLE_SIGN));
    public static final Item HANGING_MAPLE_SIGN = registerItem("maple_hanging_sign", new HangingSignItem(ModBlocks.HANGING_MAPLE_SIGN, ModBlocks.WALL_HANGING_MAPLE_SIGN, new Item.Settings().maxCount(16)));
    public static final Item MAPLE_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.MAPLE_BOAT_ID, ModBoats.MAPLE_BOAT_KEY, false);
    public static final Item MAPLE_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.MAPLE_CHEST_BOAT_ID, ModBoats.MAPLE_BOAT_KEY, true);

    public static final Item MYSTIC_SIGN = registerItem("mystic_sign", new SignItem(new Item.Settings().maxCount(16), ModBlocks.STANDING_MYSTIC_SIGN, ModBlocks.WALL_MYSTIC_SIGN));
    public static final Item HANGING_MYSTIC_SIGN = registerItem("mystic_hanging_sign", new HangingSignItem(ModBlocks.HANGING_MYSTIC_SIGN, ModBlocks.WALL_HANGING_MYSTIC_SIGN, new Item.Settings().maxCount(16)));
    public static final Item MYSTIC_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.MYSTIC_BOAT_ID, ModBoats.MYSTIC_BOAT_KEY, false);
    public static final Item MYSTIC_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.MYSTIC_CHEST_BOAT_ID, ModBoats.MYSTIC_BOAT_KEY, true);

    public static final Item APRICOT_SIGN = registerItem("apricot_sign", new SignItem(new Item.Settings().maxCount(16), ModBlocks.STANDING_APRICOT_SIGN, ModBlocks.WALL_APRICOT_SIGN));
    public static final Item HANGING_APRICOT_SIGN = registerItem("apricot_hanging_sign", new HangingSignItem(ModBlocks.HANGING_APRICOT_SIGN, ModBlocks.WALL_HANGING_APRICOT_SIGN, new Item.Settings().maxCount(16)));
    public static final Item APRICOT_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.APRICOT_BOAT_ID, ModBoats.APRICOT_BOAT_KEY, false);
    public static final Item APRICOT_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.APRICOT_CHEST_BOAT_ID, ModBoats.APRICOT_BOAT_KEY, true);

    public static final Item ORANGE_SIGN = registerItem("orange_sign", new SignItem(new Item.Settings().maxCount(16), ModBlocks.STANDING_ORANGE_SIGN, ModBlocks.WALL_ORANGE_SIGN));
    public static final Item HANGING_ORANGE_SIGN = registerItem("orange_hanging_sign", new HangingSignItem(ModBlocks.HANGING_ORANGE_SIGN, ModBlocks.WALL_HANGING_ORANGE_SIGN, new Item.Settings().maxCount(16)));
    public static final Item ORANGE_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.ORANGE_BOAT_ID, ModBoats.ORANGE_BOAT_KEY, false);
    public static final Item ORANGE_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.ORANGE_CHEST_BOAT_ID, ModBoats.ORANGE_BOAT_KEY, true);

    public static final Item POMEGRANATE_SIGN = registerItem("pomegranate_sign", new SignItem(new Item.Settings().maxCount(16), ModBlocks.STANDING_POMEGRANATE_SIGN, ModBlocks.WALL_POMEGRANATE_SIGN));
    public static final Item HANGING_POMEGRANATE_SIGN = registerItem("pomegranate_hanging_sign", new HangingSignItem(ModBlocks.HANGING_POMEGRANATE_SIGN, ModBlocks.WALL_HANGING_POMEGRANATE_SIGN, new Item.Settings().maxCount(16)));
    public static final Item POMEGRANATE_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.POMEGRANATE_BOAT_ID, ModBoats.POMEGRANATE_BOAT_KEY, false);
    public static final Item POMEGRANATE_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.POMEGRANATE_CHEST_BOAT_ID, ModBoats.POMEGRANATE_BOAT_KEY, true);

    public static final Item MANGO_SIGN = registerItem("mango_sign", new SignItem(new Item.Settings().maxCount(16), ModBlocks.STANDING_MANGO_SIGN, ModBlocks.WALL_MANGO_SIGN));
    public static final Item HANGING_MANGO_SIGN = registerItem("mango_hanging_sign", new HangingSignItem(ModBlocks.HANGING_MANGO_SIGN, ModBlocks.WALL_HANGING_MANGO_SIGN, new Item.Settings().maxCount(16)));
    public static final Item MANGO_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.MANGO_BOAT_ID, ModBoats.MANGO_BOAT_KEY, false);
    public static final Item MANGO_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.MANGO_CHEST_BOAT_ID, ModBoats.MANGO_BOAT_KEY, true);

    public static final Item BANANA_SIGN = registerItem("banana_sign", new SignItem(new Item.Settings().maxCount(16), ModBlocks.STANDING_BANANA_SIGN, ModBlocks.WALL_BANANA_SIGN));
    public static final Item HANGING_BANANA_SIGN = registerItem("banana_hanging_sign", new HangingSignItem(ModBlocks.HANGING_BANANA_SIGN, ModBlocks.WALL_HANGING_BANANA_SIGN, new Item.Settings().maxCount(16)));
    public static final Item BANANA_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.BANANA_BOAT_ID, ModBoats.BANANA_BOAT_KEY, false);
    public static final Item BANANA_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.BANANA_CHEST_BOAT_ID, ModBoats.BANANA_BOAT_KEY, true);

    public static final Item PEACH_SIGN = registerItem("peach_sign", new SignItem(new Item.Settings().maxCount(16), ModBlocks.STANDING_PEACH_SIGN, ModBlocks.WALL_PEACH_SIGN));
    public static final Item HANGING_PEACH_SIGN = registerItem("peach_hanging_sign", new HangingSignItem(ModBlocks.HANGING_PEACH_SIGN, ModBlocks.WALL_HANGING_PEACH_SIGN, new Item.Settings().maxCount(16)));
    public static final Item PEACH_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.PEACH_BOAT_ID, ModBoats.PEACH_BOAT_KEY, false);
    public static final Item PEACH_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.PEACH_CHEST_BOAT_ID, ModBoats.PEACH_BOAT_KEY, true);

    public static final Item FIDDLEHEAD_SIGN = registerItem("fiddlehead_sign", new SignItem(new Item.Settings().maxCount(16), ModBlocks.STANDING_FIDDLEHEAD_SIGN, ModBlocks.WALL_FIDDLEHEAD_SIGN));
    public static final Item HANGING_FIDDLEHEAD_SIGN = registerItem("fiddlehead_hanging_sign", new HangingSignItem(ModBlocks.HANGING_FIDDLEHEAD_SIGN, ModBlocks.WALL_HANGING_FIDDLEHEAD_SIGN, new Item.Settings().maxCount(16)));
    public static final Item FIDDLEHEAD_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.FIDDLEHEAD_BOAT_ID, ModBoats.FIDDLEHEAD_BOAT_KEY, false);
    public static final Item FIDDLEHEAD_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.FIDDLEHEAD_CHEST_BOAT_ID, ModBoats.FIDDLEHEAD_BOAT_KEY, true);


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

        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
           entries.add(STARDROP);
           entries.add(ANCIENT_FRUIT);
           entries.add(CHERRIES);
           entries.add(APRICOT);
           entries.add(ORANGE);
           entries.add(POMEGRANATE);
           entries.add(MANGO);
           entries.add(BANANA);
           entries.add(PEACH);
        });
    }
}
