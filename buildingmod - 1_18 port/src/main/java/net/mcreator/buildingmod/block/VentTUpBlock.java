
package net.mcreator.buildingmod.block;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.FaceAttachedHorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.buildingmod.init.DavebuildingmodModBlocks;

import java.util.List;
import java.util.Collections;

public class VentTUpBlock extends Block implements SimpleWaterloggedBlock

{
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
	public static final EnumProperty<AttachFace> FACE = FaceAttachedHorizontalDirectionalBlock.FACE;
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

	public VentTUpBlock() {
		super(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL).strength(3f, 6f).requiresCorrectToolForDrops().noOcclusion()
				.isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(
				this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(FACE, AttachFace.WALL).setValue(WATERLOGGED, false));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return state.getFluidState().isEmpty();
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {

		return switch (state.getValue(FACING)) {
			default -> switch (state.getValue(FACE)) {
				case FLOOR -> Shapes.join(box(0, 0, 0, 16, 16, 16), box(2, 0, 0, 14, 16, 14), BooleanOp.ONLY_FIRST);
				case WALL -> Shapes.join(box(0, 0, 0, 16, 16, 16), box(2, 2, 0, 14, 16, 16), BooleanOp.ONLY_FIRST);
				case CEILING -> Shapes.join(box(0, 0, 0, 16, 16, 16), box(2, 0, 0, 14, 16, 14), BooleanOp.ONLY_FIRST);
			};
			case NORTH -> switch (state.getValue(FACE)) {
				case FLOOR -> Shapes.join(box(0, 0, 0, 16, 16, 16), box(2, 0, 2, 14, 16, 16), BooleanOp.ONLY_FIRST);
				case WALL -> Shapes.join(box(0, 0, 0, 16, 16, 16), box(2, 2, 0, 14, 16, 16), BooleanOp.ONLY_FIRST);
				case CEILING -> Shapes.join(box(0, 0, 0, 16, 16, 16), box(2, 0, 2, 14, 16, 16), BooleanOp.ONLY_FIRST);
			};
			case EAST -> switch (state.getValue(FACE)) {
				case FLOOR -> Shapes.join(box(0, 0, 0, 16, 16, 16), box(0, 0, 2, 14, 16, 14), BooleanOp.ONLY_FIRST);
				case WALL -> Shapes.join(box(0, 0, 0, 16, 16, 16), box(0, 2, 2, 16, 16, 14), BooleanOp.ONLY_FIRST);
				case CEILING -> Shapes.join(box(0, 0, 0, 16, 16, 16), box(0, 0, 2, 14, 16, 14), BooleanOp.ONLY_FIRST);
			};
			case WEST -> switch (state.getValue(FACE)) {
				case FLOOR -> Shapes.join(box(0, 0, 0, 16, 16, 16), box(2, 0, 2, 16, 16, 14), BooleanOp.ONLY_FIRST);
				case WALL -> Shapes.join(box(0, 0, 0, 16, 16, 16), box(0, 2, 2, 16, 16, 14), BooleanOp.ONLY_FIRST);
				case CEILING -> Shapes.join(box(0, 0, 0, 16, 16, 16), box(2, 0, 2, 16, 16, 14), BooleanOp.ONLY_FIRST);
			};
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING, FACE, WATERLOGGED);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		boolean flag = context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER;
		return this.defaultBlockState().setValue(FACE, faceForDirection(context.getNearestLookingDirection()))
				.setValue(FACING, context.getHorizontalDirection().getOpposite()).setValue(WATERLOGGED, flag);
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	private AttachFace faceForDirection(Direction direction) {
		if (direction.getAxis() == Direction.Axis.Y)
			return direction == Direction.UP ? AttachFace.CEILING : AttachFace.FLOOR;
		else
			return AttachFace.WALL;
	}

	@Override
	public FluidState getFluidState(BlockState state) {
		return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
	}

	@Override
	public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor world, BlockPos currentPos,
			BlockPos facingPos) {
		if (state.getValue(WATERLOGGED)) {
			world.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
		}
		return super.updateShape(state, facing, facingState, world, currentPos, facingPos);
	}

	@Override
	public boolean isLadder(BlockState state, LevelReader world, BlockPos pos, LivingEntity entity) {
		return true;
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem() instanceof TieredItem tieredItem)
			return tieredItem.getTier().getLevel() >= 1;
		return false;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(DavebuildingmodModBlocks.VENT_T_UP.get(), renderType -> renderType == RenderType.cutout());
	}
}
