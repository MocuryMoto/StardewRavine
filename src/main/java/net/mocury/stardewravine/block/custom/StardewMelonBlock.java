package net.mocury.stardewravine.block.custom;

import net.minecraft.block.Block;
import net.mocury.stardewravine.block.ModBlocks;

//Code taken from Nasache AKA PillowFort from their Frights and Foliage mod; go check it out!

public class StardewMelonBlock extends Block {
    public StardewMelonBlock(Settings settings) {
        super(settings);
    }

    public StardewMelonStemBlock getStem() {
        return (StardewMelonStemBlock) ModBlocks.STARDEW_MELON_STEM;
    }

    public AttachedStardewMelonStemBlock getAttachedStem() {
        return (AttachedStardewMelonStemBlock) ModBlocks.ATTACHED_STARDEW_MELON_STEM;
    }
}