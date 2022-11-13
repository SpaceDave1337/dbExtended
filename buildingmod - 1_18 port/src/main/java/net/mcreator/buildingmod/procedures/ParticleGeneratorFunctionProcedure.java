package net.mcreator.buildingmod.procedures;

import org.jline.terminal.Size;

import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.fml.loading.FMLPaths;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.buildingmod.init.DavebuildingmodModItems;

import java.util.concurrent.atomic.AtomicReference;

import java.io.IOException;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;

import com.google.gson.Gson;

public class ParticleGeneratorFunctionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double Yoffset = 0;
		double Size = 0;
		double Count = 0;
		File dbeconfig = new File("");
		com.google.gson.JsonObject mainjsonobject = new com.google.gson.JsonObject();
		dbeconfig = new File((FMLPaths.GAMEDIR.get().toString() + "/config/"), File.separator + "dbe_v5_common.json");
		{
			try {
				BufferedReader bufferedReader = new BufferedReader(new FileReader(dbeconfig));
				StringBuilder jsonstringbuilder = new StringBuilder();
				String line;
				while ((line = bufferedReader.readLine()) != null) {
					jsonstringbuilder.append(line);
				}
				bufferedReader.close();
				mainjsonobject = new Gson().fromJson(jsonstringbuilder.toString(), com.google.gson.JsonObject.class);
				if (mainjsonobject.get("particle_gen").getAsBoolean()) {
					Yoffset = y + 0.5 + new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "Y-Offset");
					Size = (new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "Size")) / 10;
					Count = Math.pow((new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "Size")) / 4, 3);
					if ((new Object() {
						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
										.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
							return _retval.get();
						}
					}.getItemStack(world, new BlockPos(x, y, z), 0)).getItem() == DavebuildingmodModItems.RED_CIRCUIT_BEE_NEST.get()) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.DRIPPING_HONEY, (x + 0.5), Yoffset, (z + 0.5), (int) Count, Size, Size, Size, 0.1);
					} else if ((new Object() {
						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
										.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
							return _retval.get();
						}
					}.getItemStack(world, new BlockPos(x, y, z), 0)).getItem() == DavebuildingmodModItems.RED_CIRCUIT_CAMPFIRE.get()) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, (x + 0.5), Yoffset, (z + 0.5), (int) Count, Size, Size, Size,
									0.1);
					} else if ((new Object() {
						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
										.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
							return _retval.get();
						}
					}.getItemStack(world, new BlockPos(x, y, z), 0)).getItem() == DavebuildingmodModItems.RED_CIRCUIT_FIRE_CHARGE.get()) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.SMALL_FLAME, (x + 0.5), Yoffset, (z + 0.5), (int) Count, Size, Size, Size, 0.1);
					} else if ((new Object() {
						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
										.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
							return _retval.get();
						}
					}.getItemStack(world, new BlockPos(x, y, z), 0)).getItem() == DavebuildingmodModItems.RED_CIRCUIT_FIREWORK.get()) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.FLASH, (x + 0.5), Yoffset, (z + 0.5), (int) (Count / 10), Size, Size, Size, 0.1);
					} else if ((new Object() {
						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
										.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
							return _retval.get();
						}
					}.getItemStack(world, new BlockPos(x, y, z), 0)).getItem() == DavebuildingmodModItems.RED_CIRCUIT_FLINT_AND_STEEL.get()) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.LAVA, (x + 0.5), Yoffset, (z + 0.5), (int) Count, Size, Size, Size, 0.1);
					} else if ((new Object() {
						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
										.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
							return _retval.get();
						}
					}.getItemStack(world, new BlockPos(x, y, z), 0)).getItem() == DavebuildingmodModItems.RED_CIRCUIT_LAVA_BUCKET.get()) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.DRIPPING_DRIPSTONE_LAVA, (x + 0.5), Yoffset, (z + 0.5), (int) Count, Size, Size, Size,
									0.1);
					} else if ((new Object() {
						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
										.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
							return _retval.get();
						}
					}.getItemStack(world, new BlockPos(x, y, z), 0)).getItem() == DavebuildingmodModItems.RED_CIRCUIT_SMALL_SMOKE.get()) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.SMOKE, (x + 0.5), Yoffset, (z + 0.5), (int) Count, Size, Size, Size, 0.1);
					} else if ((new Object() {
						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
										.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
							return _retval.get();
						}
					}.getItemStack(world, new BlockPos(x, y, z), 0)).getItem() == DavebuildingmodModItems.RED_CIRCUIT_STEAM.get()) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), Yoffset, (z + 0.5), (int) Count, Size, Size, Size, 0.1);
					} else if ((new Object() {
						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
										.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
							return _retval.get();
						}
					}.getItemStack(world, new BlockPos(x, y, z), 0)).getItem() == DavebuildingmodModItems.RED_CIRCUIT_TNT.get()) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.EXPLOSION, (x + 0.5), Yoffset, (z + 0.5), (int) (Count / 10), Size, Size, Size, 0.1);
					} else if ((new Object() {
						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
										.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
							return _retval.get();
						}
					}.getItemStack(world, new BlockPos(x, y, z), 0)).getItem() == DavebuildingmodModItems.RED_CIRCUIT_WATER_BUCKET.get()) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.SPLASH, (x + 0.5), Yoffset, (z + 0.5), (int) Count, Size, Size, Size, 0.1);
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
