package net.mocury.stardewravine.block.custom;


import net.minecraft.block.BlockState;
import net.minecraft.block.TransparentBlock;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class GhostGlassBlock extends TransparentBlock {
    public GhostGlassBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        super.onEntityCollision(state, world, pos, entity);
    }
}

