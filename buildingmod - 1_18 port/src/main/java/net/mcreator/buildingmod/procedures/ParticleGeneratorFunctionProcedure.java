package net.mcreator.buildingmod.procedures;

import org.jline.terminal.Size;

import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.buildingmod.init.DavebuildingmodModItems;

import java.util.concurrent.atomic.AtomicReference;

public class ParticleGeneratorFunctionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double Yoffset = 0;
		double Size = 0;
		double Count = 0;
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
		}.getValue(world, new BlockPos(x, y, z), "Size")) / 2;
		Count = (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "Size")) * 100;
		if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 0)).getItem() == DavebuildingmodModItems.PARTICLE_CARD_TNT.get()) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.EXPLOSION, (x + 0.5), Yoffset, (z + 0.5), (int) (Count / 5), Size, Size, Size, 1);
		} else if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 0)).getItem() == DavebuildingmodModItems.PARTICLE_CARD_FIRE.get()) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.FLAME, (x + 0.5), Yoffset, (z + 0.5), (int) Count, Size, Size, Size, 0.1);
		} else if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 0)).getItem() == DavebuildingmodModItems.PARTICLE_CARD_SMOKE.get()) {
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
		}.getItemStack(world, new BlockPos(x, y, z), 0)).getItem() == DavebuildingmodModItems.PARTICLE_CARD_CAMPFIRE.get()) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, (x + 0.5), Yoffset, (z + 0.5), (int) Count, Size, Size, Size, 0.1);
		} else if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 0)).getItem() == DavebuildingmodModItems.PARTICLE_CARD_STEAM.get()) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.POOF, (x + 0.5), Yoffset, (z + 0.5), (int) Count, Size, Size, Size, 0.1);
		} else if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 0)).getItem() == DavebuildingmodModItems.PARTICLE_CARD_WATER.get()) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SPLASH, (x + 0.5), Yoffset, (z + 0.5), (int) Count, Size, Size, Size, 0.1);
		}
	}
}
