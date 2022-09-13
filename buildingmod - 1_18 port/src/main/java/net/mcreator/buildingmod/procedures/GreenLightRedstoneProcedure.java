package net.mcreator.buildingmod.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.buildingmod.init.DavebuildingmodModBlocks;

import java.util.Map;

public class GreenLightRedstoneProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.isClientSide()) {
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == DavebuildingmodModBlocks.GREEN_LIGHT_OFF.get()) {
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = DavebuildingmodModBlocks.GREEN_LIGHT_ON.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			} else {
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = DavebuildingmodModBlocks.GREEN_LIGHT_OFF.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
		}
	}
}
