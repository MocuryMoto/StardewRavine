package net.mocury.stardewravine.trim;

import net.minecraft.item.Item;
import net.minecraft.item.trim.ArmorTrimMaterial;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.mocury.stardewravine.StardewRavine;
import net.mocury.stardewravine.item.ModItems;

import java.util.Map;

public class ModTrimMaterials {
    public static final RegistryKey<ArmorTrimMaterial> HELVINE = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(StardewRavine.MOD_ID, "helvine"));
    public static final RegistryKey<ArmorTrimMaterial> IRIDIUM = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(StardewRavine.MOD_ID, "iridium"));
    public static final RegistryKey<ArmorTrimMaterial> RADIONITE = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(StardewRavine.MOD_ID, "radionite"));
    public static final RegistryKey<ArmorTrimMaterial> AQUAMARINE = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(StardewRavine.MOD_ID, "aquamarine"));
    public static final RegistryKey<ArmorTrimMaterial> TOPAZ = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(StardewRavine.MOD_ID, "topaz"));
    public static final RegistryKey<ArmorTrimMaterial> JADE = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(StardewRavine.MOD_ID, "jade"));
    public static final RegistryKey<ArmorTrimMaterial> RUBY = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(StardewRavine.MOD_ID, "ruby"));
    public static final RegistryKey<ArmorTrimMaterial> FIRE_QUARTZ = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(StardewRavine.MOD_ID, "fire_quartz"));
    public static final RegistryKey<ArmorTrimMaterial> REFINED_QUARTZ = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(StardewRavine.MOD_ID, "refined_quartz"));
    public static final RegistryKey<ArmorTrimMaterial> CINDER = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(StardewRavine.MOD_ID, "cinder"));
    public static final RegistryKey<ArmorTrimMaterial> LEMON = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(StardewRavine.MOD_ID, "lemon"));
    public static final RegistryKey<ArmorTrimMaterial> TIGER = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(StardewRavine.MOD_ID, "tiger"));
    public static final RegistryKey<ArmorTrimMaterial> KYANITE = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(StardewRavine.MOD_ID, "kyanite"));
    public static final RegistryKey<ArmorTrimMaterial> PYRITE = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(StardewRavine.MOD_ID, "pyrite"));
    public static final RegistryKey<ArmorTrimMaterial> FLUOR = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(StardewRavine.MOD_ID, "fluor"));
    public static final RegistryKey<ArmorTrimMaterial> JAGOITE = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(StardewRavine.MOD_ID, "jagoite"));
    public static final RegistryKey<ArmorTrimMaterial> CELESTINE = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(StardewRavine.MOD_ID, "celestine"));
    public static final RegistryKey<ArmorTrimMaterial> GEMINITE = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(StardewRavine.MOD_ID, "geminite"));
    public static final RegistryKey<ArmorTrimMaterial> JASPER = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(StardewRavine.MOD_ID, "jasper"));
    public static final RegistryKey<ArmorTrimMaterial> AERINITE = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(StardewRavine.MOD_ID, "aerinite"));
    public static final RegistryKey<ArmorTrimMaterial> ORPIMENT = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(StardewRavine.MOD_ID, "orpiment"));
    public static final RegistryKey<ArmorTrimMaterial> DOLOMITE = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(StardewRavine.MOD_ID, "dolomite"));
    public static final RegistryKey<ArmorTrimMaterial> JAMBORITE = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(StardewRavine.MOD_ID, "jamborite"));
    public static final RegistryKey<ArmorTrimMaterial> NEKOITE = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(StardewRavine.MOD_ID, "nekoite"));
    public static final RegistryKey<ArmorTrimMaterial> NEPTUNITE = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(StardewRavine.MOD_ID, "neptunite"));
    public static final RegistryKey<ArmorTrimMaterial> LUNARITE = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(StardewRavine.MOD_ID, "lunarite"));
    public static final RegistryKey<ArmorTrimMaterial> MALACHITE = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(StardewRavine.MOD_ID, "malachite"));
    public static final RegistryKey<ArmorTrimMaterial> OPAL = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(StardewRavine.MOD_ID, "opal"));
    public static final RegistryKey<ArmorTrimMaterial> FIRE_OPAL = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(StardewRavine.MOD_ID, "fire_opal"));

    public static void bootstrap(Registerable<ArmorTrimMaterial> registerable){
        register(registerable, HELVINE, Registries.ITEM.getEntry(ModItems.HELVINE),
                Style.EMPTY.withColor(TextColor.parse("#ae7018").getOrThrow()), 0.5f);
        register(registerable, IRIDIUM, Registries.ITEM.getEntry(ModItems.IRIDIUM_INGOT),
                Style.EMPTY.withColor(TextColor.parse("#dd7ce4").getOrThrow()), 1.0f);
        register(registerable, RADIONITE, Registries.ITEM.getEntry(ModItems.RADIONITE_INGOT),
                Style.EMPTY.withColor(TextColor.parse("#00ff03").getOrThrow()), 0.7f);
        register(registerable, AQUAMARINE, Registries.ITEM.getEntry(ModItems.AQUAMARINE),
                Style.EMPTY.withColor(TextColor.parse("#57cbee").getOrThrow()), 0.9f);
        register(registerable, TOPAZ, Registries.ITEM.getEntry(ModItems.TOPAZ),
                Style.EMPTY.withColor(TextColor.parse("#ffbd00").getOrThrow()), 0.6f);
        register(registerable, JADE, Registries.ITEM.getEntry(ModItems.JADE),
                Style.EMPTY.withColor(TextColor.parse("#82c58a").getOrThrow()), 0.7f);
        register(registerable, RUBY, Registries.ITEM.getEntry(ModItems.RUBY),
                Style.EMPTY.withColor(TextColor.parse("#f12b4f").getOrThrow()), 0.4f);
        register(registerable, FIRE_QUARTZ, Registries.ITEM.getEntry(ModItems.FIRE_QUARTZ),
                Style.EMPTY.withColor(TextColor.parse("#f85a55").getOrThrow()), 0.4f);
        register(registerable, REFINED_QUARTZ, Registries.ITEM.getEntry(ModItems.REFINED_QUARTZ),
                Style.EMPTY.withColor(TextColor.parse("#cac1ff").getOrThrow()), 0.1f);
        register(registerable, CINDER, Registries.ITEM.getEntry(ModItems.CINDER_SHARD),
                Style.EMPTY.withColor(TextColor.parse("#f42f4e").getOrThrow()), 0.4f);
        register(registerable, LEMON, Registries.ITEM.getEntry(ModItems.LEMON_STONE),
                Style.EMPTY.withColor(TextColor.parse("#f96f06").getOrThrow()), 0.5f);
        register(registerable, TIGER, Registries.ITEM.getEntry(ModItems.TIGERS_EYE),
                Style.EMPTY.withColor(TextColor.parse("#c6882d").getOrThrow()), 0.6f);
        register(registerable, KYANITE, Registries.ITEM.getEntry(ModItems.KYANITE),
                Style.EMPTY.withColor(TextColor.parse("#5c86ad").getOrThrow()), 0.9f);
        register(registerable, PYRITE, Registries.ITEM.getEntry(ModItems.PYRITE),
                Style.EMPTY.withColor(TextColor.parse("#bdab65").getOrThrow()), 0.6f);
        register(registerable, FLUOR, Registries.ITEM.getEntry(ModItems.FLUORAPATITE),
                Style.EMPTY.withColor(TextColor.parse("#7d2fbf").getOrThrow()), 1.0f);
        register(registerable, JAGOITE, Registries.ITEM.getEntry(ModItems.JAGOITE),
                Style.EMPTY.withColor(TextColor.parse("#b6ca05").getOrThrow()), 0.7f);
        register(registerable, CELESTINE, Registries.ITEM.getEntry(ModItems.CELESTINE),
                Style.EMPTY.withColor(TextColor.parse("#94bfea").getOrThrow()), 0.8f);
        register(registerable, GEMINITE, Registries.ITEM.getEntry(ModItems.GEMINITE),
                Style.EMPTY.withColor(TextColor.parse("#aee1ab").getOrThrow()), 0.7f);
        register(registerable, JASPER, Registries.ITEM.getEntry(ModItems.JASPER),
                Style.EMPTY.withColor(TextColor.parse("#bd2e25").getOrThrow()), 0.4f);
        register(registerable, AERINITE, Registries.ITEM.getEntry(ModItems.AERINITE),
                Style.EMPTY.withColor(TextColor.parse("#1ec9f3").getOrThrow()), 0.8f);
        register(registerable, ORPIMENT, Registries.ITEM.getEntry(ModItems.ORPIMENT),
                Style.EMPTY.withColor(TextColor.parse("#fa980a").getOrThrow()), 0.5f);
        register(registerable, DOLOMITE, Registries.ITEM.getEntry(ModItems.DOLOMITE),
                Style.EMPTY.withColor(TextColor.parse("#eedeed").getOrThrow()), 0.1f);
        register(registerable, JAMBORITE, Registries.ITEM.getEntry(ModItems.JAMBORITE),
                Style.EMPTY.withColor(TextColor.parse("#37cd3d").getOrThrow()), 0.7f);
        register(registerable, NEKOITE, Registries.ITEM.getEntry(ModItems.NEKOITE),
                Style.EMPTY.withColor(TextColor.parse("#f0e8e3").getOrThrow()), 0.2f);
        register(registerable, NEPTUNITE, Registries.ITEM.getEntry(ModItems.NEPTUNITE),
                Style.EMPTY.withColor(TextColor.parse("#404046").getOrThrow()), 0.3f);
        register(registerable, LUNARITE, Registries.ITEM.getEntry(ModItems.LUNARITE),
                Style.EMPTY.withColor(TextColor.parse("#f5f7f7").getOrThrow()), 0.1f);
        register(registerable, MALACHITE, Registries.ITEM.getEntry(ModItems.MALACHITE),
                Style.EMPTY.withColor(TextColor.parse("#34c884").getOrThrow()), 0.7f);
        register(registerable, OPAL, Registries.ITEM.getEntry(ModItems.OPAL),
                Style.EMPTY.withColor(TextColor.parse("#77ffff").getOrThrow()), 0.8f);
        register(registerable, FIRE_OPAL, Registries.ITEM.getEntry(ModItems.FIRE_OPAL),
                Style.EMPTY.withColor(TextColor.parse("#94077c").getOrThrow()), 0.3f);

    }

    private static void register(Registerable<ArmorTrimMaterial> registerable, RegistryKey<ArmorTrimMaterial> armorTrimKey,
                                 RegistryEntry<Item> item, Style style, float itemModelIndex){
        ArmorTrimMaterial trimMaterial = new ArmorTrimMaterial(armorTrimKey.getValue().getPath(), item, itemModelIndex, Map.of(),
                Text.translatable(Util.createTranslationKey("trim_material", armorTrimKey.getValue())).fillStyle(style));

        registerable.register(armorTrimKey, trimMaterial);
    }
}
