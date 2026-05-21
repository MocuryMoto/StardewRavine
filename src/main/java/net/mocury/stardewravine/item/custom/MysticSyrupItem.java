package net.mocury.stardewravine.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;
import net.mocury.stardewravine.block.ModBlocks;

import java.util.Map;

public class MysticSyrupItem extends Item {
    public static final Map<Block, Block> MYSTIC_SYRUP_MAP =
            Map.of(
                    ModBlocks.APRICOT_LEAVES, ModBlocks.FRUITING_APRICOT_LEAVES,
                    ModBlocks.ORANGE_LEAVES, ModBlocks.FRUITING_ORANGE_LEAVES,
                    ModBlocks.POMEGRANATE_LEAVES, ModBlocks.FRUITING_POMEGRANATE_LEAVES,
                    ModBlocks.MANGO_LEAVES, ModBlocks.FRUITING_MANGO_LEAVES,
                    ModBlocks.BANANA_LEAVES, ModBlocks.FRUITING_BANANA_LEAVES,
                    ModBlocks.PEACH_LEAVES, ModBlocks.FRUITING_PEACH_LEAVES,
                    Blocks.CHERRY_LEAVES, ModBlocks.FRUITING_CHERRY_LEAVES,
                    Blocks.SAND, Blocks.SUSPICIOUS_SAND,
                    Blocks.GRAVEL, Blocks.SUSPICIOUS_GRAVEL
            );

    public MysticSyrupItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        Block clickedBlock = world.getBlockState(context.getBlockPos()).getBlock();

        if(MYSTIC_SYRUP_MAP.containsKey(clickedBlock)){
            if(!world.isClient()) {
                world.setBlockState(context.getBlockPos(), MYSTIC_SYRUP_MAP.get(clickedBlock).getDefaultState());

                context.getStack().decrement(1);

                world.playSound(null, context.getBlockPos(), SoundEvents.ITEM_BONE_MEAL_USE, SoundCategory.BLOCKS);
            }

        }

        return ActionResult.SUCCESS;
    }

}
