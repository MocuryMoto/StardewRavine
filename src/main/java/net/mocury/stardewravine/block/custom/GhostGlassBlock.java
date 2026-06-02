package net.mocury.stardewravine.block.custom;


import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class GhostGlassBlock extends TransparentBlock {
    public GhostGlassBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        if (context instanceof EntityShapeContext entityShapeContext){
            Entity entity = entityShapeContext.getEntity();
            if (!(entity instanceof PlayerEntity)) {
                return VoxelShapes.fullCube();
            }
        }
        return VoxelShapes.empty();
    }
}

