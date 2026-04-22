package net.mocury.stardewravine.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.fluid.Fluids;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.mocury.stardewravine.block.ModBlocks;

public class BuddingCinderShardBlock extends CinderShardBlock{
    public static final MapCodec<BuddingCinderShardBlock> CODEC = createCodec(BuddingCinderShardBlock::new);
    public static final int GROW_CHANCE = 5;
    private static final Direction[] DIRECTIONS = Direction.values();

    @Override
    public MapCodec<BuddingCinderShardBlock> getCodec() {
        return CODEC;
    }

    public BuddingCinderShardBlock(AbstractBlock.Settings settings) {
        super(settings);
    }


    @Override
    protected void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (random.nextInt(5) == 0) {
            Direction direction = DIRECTIONS[random.nextInt(DIRECTIONS.length)];
            BlockPos blockPos = pos.offset(direction);
            BlockState blockState = world.getBlockState(blockPos);
            Block block = null;
            if (canGrowIn(blockState)) {
                block = ModBlocks.SMALL_CINDER_BUD;
            } else if (blockState.isOf(ModBlocks.SMALL_CINDER_BUD) && blockState.get(CinderClusterBlock.FACING) == direction) {
                block = ModBlocks.MEDIUM_CINDER_BUD;
            } else if (blockState.isOf(ModBlocks.MEDIUM_CINDER_BUD) && blockState.get(CinderClusterBlock.FACING) == direction) {
                block = ModBlocks.LARGE_CINDER_BUD;
            } else if (blockState.isOf(ModBlocks.LARGE_CINDER_BUD) && blockState.get(CinderClusterBlock.FACING) == direction) {
                block = ModBlocks.CINDER_CLUSTER;
            }

            if (block != null) {
                BlockState blockState2 = block.getDefaultState()
                        .with(CinderClusterBlock.FACING, direction)
                        .with(CinderClusterBlock.WATERLOGGED, blockState.getFluidState().getFluid() == Fluids.WATER);
                world.setBlockState(blockPos, blockState2);
            }
        }
    }

    public static boolean canGrowIn(BlockState state) {
        return state.isAir() || state.isOf(Blocks.WATER) && state.getFluidState().getLevel() == 8;
    }
}
