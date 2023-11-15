package com.hlysine.create_power_loader.content.emptyandesitechunkloader.andesitechunkloader;

import com.hlysine.create_power_loader.CPLBlockEntityTypes;
import com.simibubi.create.content.kinetics.base.DirectionalKineticBlock;
import com.simibubi.create.foundation.block.IBE;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Direction.Axis;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class EmptyAndesiteChunkLoaderBlock extends DirectionalKineticBlock implements IBE<EmptyAndesiteChunkLoaderBlockEntity> {

    public EmptyAndesiteChunkLoaderBlock(Properties properties) {
        super(properties);
    }

    @Override
    public Axis getRotationAxis(BlockState state) {
        return state.getValue(FACING).getAxis();
    }

    @Override
    public boolean hasShaftTowards(LevelReader world, BlockPos pos, BlockState state, Direction face) {
        return face == state.getValue(FACING).getOpposite();
    }

    @Override
    public Class<EmptyAndesiteChunkLoaderBlockEntity> getBlockEntityClass() {
        return EmptyAndesiteChunkLoaderBlockEntity.class;
    }

    @Override
    public BlockEntityType<? extends EmptyAndesiteChunkLoaderBlockEntity> getBlockEntityType() {
        return CPLBlockEntityTypes.EMPTY_ANDESITE_CHUNK_LOADER.get();
    }

}