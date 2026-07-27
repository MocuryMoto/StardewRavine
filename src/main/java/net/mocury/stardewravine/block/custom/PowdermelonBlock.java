package net.mocury.stardewravine.block.custom;

import net.minecraft.block.Block;
import net.mocury.stardewravine.block.ModBlocks;

//Code taken from Nasache AKA PillowFort from their Frights and Foliage mod; go check it out!

public class PowdermelonBlock extends Block {
    public PowdermelonBlock(Settings settings) {
        super(settings);
    }

    public PowdermelonStemBlock getStem() {
        return (PowdermelonStemBlock) ModBlocks.POWDERMELON_STEM;
    }

    public AttachedPowdermelonStemBlock getAttachedStem() {
        return (AttachedPowdermelonStemBlock) ModBlocks.ATTACHED_POWDERMELON_STEM;
    }
}