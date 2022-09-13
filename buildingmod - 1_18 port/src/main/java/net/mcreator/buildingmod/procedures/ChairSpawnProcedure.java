package net.mcreator.buildingmod.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.buildingmod.init.DavebuildingmodModEntities;
import net.mcreator.buildingmod.entity.ChairEntity;

public class ChairSpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		new Object() {
			private int ticks = 0;
			private float waitTicks;
			private LevelAccessor world;

			public void start(LevelAccessor world, int waitTicks) {
				this.waitTicks = waitTicks;
				MinecraftForge.EVENT_BUS.register(this);
				this.world = world;
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					this.ticks += 1;
					if (this.ticks >= this.waitTicks)
						run();
				}
			}

			private void run() {
				if ((new Object() {
					public Direction getDirection(BlockPos pos) {
						BlockState _bs = world.getBlockState(pos);
						Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (property != null && _bs.getValue(property) instanceof Direction _dir)
							return _dir;
						property = _bs.getBlock().getStateDefinition().getProperty("axis");
						if (property != null && _bs.getValue(property) instanceof Direction.Axis _axis)
							return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
						return Direction.NORTH;
					}
				}.getDirection(new BlockPos(x, y, z))) == Direction.NORTH) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new ChairEntity(DavebuildingmodModEntities.CHAIR.get(), _level);
						entityToSpawn.moveTo((x + 0.5), (y + 0.5), (z + 0.5), 180, 0);
						entityToSpawn.setYBodyRot(180);
						entityToSpawn.setYHeadRot(180);
						entityToSpawn.setDeltaMovement(0, 0, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
									null, null);
						world.addFreshEntity(entityToSpawn);
					}
				} else if ((new Object() {
					public Direction getDirection(BlockPos pos) {
						BlockState _bs = world.getBlockState(pos);
						Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (property != null && _bs.getValue(property) instanceof Direction _dir)
							return _dir;
						property = _bs.getBlock().getStateDefinition().getProperty("axis");
						if (property != null && _bs.getValue(property) instanceof Direction.Axis _axis)
							return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
						return Direction.NORTH;
					}
				}.getDirection(new BlockPos(x, y, z))) == Direction.SOUTH) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new ChairEntity(DavebuildingmodModEntities.CHAIR.get(), _level);
						entityToSpawn.moveTo((x + 0.5), (y + 0.5), (z + 0.5), 0, 0);
						entityToSpawn.setYBodyRot(0);
						entityToSpawn.setYHeadRot(0);
						entityToSpawn.setDeltaMovement(0, 0, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
									null, null);
						world.addFreshEntity(entityToSpawn);
					}
				} else if ((new Object() {
					public Direction getDirection(BlockPos pos) {
						BlockState _bs = world.getBlockState(pos);
						Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (property != null && _bs.getValue(property) instanceof Direction _dir)
							return _dir;
						property = _bs.getBlock().getStateDefinition().getProperty("axis");
						if (property != null && _bs.getValue(property) instanceof Direction.Axis _axis)
							return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
						return Direction.NORTH;
					}
				}.getDirection(new BlockPos(x, y, z))) == Direction.WEST) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new ChairEntity(DavebuildingmodModEntities.CHAIR.get(), _level);
						entityToSpawn.moveTo((x + 0.5), (y + 0.5), (z + 0.5), 90, 0);
						entityToSpawn.setYBodyRot(90);
						entityToSpawn.setYHeadRot(90);
						entityToSpawn.setDeltaMovement(0, 0, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
									null, null);
						world.addFreshEntity(entityToSpawn);
					}
				} else if ((new Object() {
					public Direction getDirection(BlockPos pos) {
						BlockState _bs = world.getBlockState(pos);
						Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (property != null && _bs.getValue(property) instanceof Direction _dir)
							return _dir;
						property = _bs.getBlock().getStateDefinition().getProperty("axis");
						if (property != null && _bs.getValue(property) instanceof Direction.Axis _axis)
							return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
						return Direction.NORTH;
					}
				}.getDirection(new BlockPos(x, y, z))) == Direction.EAST) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new ChairEntity(DavebuildingmodModEntities.CHAIR.get(), _level);
						entityToSpawn.moveTo((x + 0.5), (y + 0.5), (z + 0.5), 270, 0);
						entityToSpawn.setYBodyRot(270);
						entityToSpawn.setYHeadRot(270);
						entityToSpawn.setDeltaMovement(0, 0, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
									null, null);
						world.addFreshEntity(entityToSpawn);
					}
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 2);
	}
}
