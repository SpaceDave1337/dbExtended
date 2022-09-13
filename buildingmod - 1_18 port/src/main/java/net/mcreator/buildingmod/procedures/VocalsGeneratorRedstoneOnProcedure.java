package net.mcreator.buildingmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.buildingmod.init.DavebuildingmodModItems;

import java.util.concurrent.atomic.AtomicReference;

public class VocalsGeneratorRedstoneOnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 0)).getItem() == DavebuildingmodModItems.VOCAL_WARNING.get()) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("davebuildingmod:vocals_warning")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("davebuildingmod:vocals_warning")),
							SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		} else if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 0)).getItem() == DavebuildingmodModItems.VOCAL_EMPTY.get()) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("davebuildingmod:vocals_emtpy")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("davebuildingmod:vocals_emtpy")),
							SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		} else if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 0)).getItem() == DavebuildingmodModItems.VOCAL_ATTENTION.get()) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("davebuildingmod:vocals_attention")), SoundSource.NEUTRAL, 1,
							1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("davebuildingmod:vocals_attention")),
							SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		} else if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 0)).getItem() == DavebuildingmodModItems.VOCAL_CLOSE_HATCH.get()) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("davebuildingmod:vocals_closehatch")), SoundSource.NEUTRAL, 1,
							1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("davebuildingmod:vocals_closehatch")),
							SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		} else if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 0)).getItem() == DavebuildingmodModItems.VOCAL_OPEN_HATCH.get()) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("davebuildingmod:vocals_openhatch")), SoundSource.NEUTRAL, 1,
							1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("davebuildingmod:vocals_openhatch")),
							SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		} else if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 0)).getItem() == DavebuildingmodModItems.VOCAL_BOOTUP.get()) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("davebuildingmod:vocals_bootup")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("davebuildingmod:vocals_bootup")),
							SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		} else if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 0)).getItem() == DavebuildingmodModItems.VOCAL_STANDBY.get()) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("davebuildingmod:vocals_standby")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("davebuildingmod:vocals_standby")),
							SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		} else if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 0)).getItem() == DavebuildingmodModItems.VOCAL_EXPERIMENT.get()) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("davebuildingmod:vocals_experiment")), SoundSource.NEUTRAL, 1,
							1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("davebuildingmod:vocals_experiment")),
							SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		} else if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 0)).getItem() == DavebuildingmodModItems.VOCAL_FACLILTY_LEAVE.get()) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("davebuildingmod:vocals_facilityleave")), SoundSource.NEUTRAL,
							1, 1);
				} else {
					_level.playLocalSound(x, y, z,
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("davebuildingmod:vocals_facilityleave")), SoundSource.NEUTRAL,
							1, 1, false);
				}
			}
		} else if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 0)).getItem() == DavebuildingmodModItems.VOCAL_MELTDOWN.get()) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("davebuildingmod:vocals_reactormeltdown")),
							SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z,
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("davebuildingmod:vocals_reactormeltdown")),
							SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		} else if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 0)).getItem() == DavebuildingmodModItems.VOCAL_AIRLOCK.get()) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("davebuildingmod:vocals_airlock")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("davebuildingmod:vocals_airlock")),
							SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		} else if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 0)).getItem() == DavebuildingmodModItems.VOCAL_SYSTEMFAIL.get()) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("davebuildingmod:vocals_systemfail")), SoundSource.NEUTRAL, 1,
							1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("davebuildingmod:vocals_systemfail")),
							SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		} else if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 0)).getItem() == DavebuildingmodModItems.VOCAL_CALCULATING.get()) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("davebuildingmod:vocals_calculating")), SoundSource.NEUTRAL, 1,
							1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("davebuildingmod:vocals_calculating")),
							SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		} else if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 0)).getItem() == DavebuildingmodModItems.VOCAL_SYSTEMINTEGRITY.get()) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("davebuildingmod:vocal_systemintegrity")), SoundSource.NEUTRAL,
							1, 1);
				} else {
					_level.playLocalSound(x, y, z,
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("davebuildingmod:vocal_systemintegrity")), SoundSource.NEUTRAL,
							1, 1, false);
				}
			}
		} else if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 0)).getItem() == DavebuildingmodModItems.VOCAL_SELFDESTRUCT.get()) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("davebuildingmod:vocals_selfdestruct")), SoundSource.NEUTRAL,
							1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("davebuildingmod:vocals_selfdestruct")),
							SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		} else if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 0)).getItem() == DavebuildingmodModItems.VOCAL_CONTAINMENTFAIL.get()) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("davebuildingmod:vocals_containmentfail")),
							SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z,
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("davebuildingmod:vocals_containmentfail")),
							SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		} else if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 0)).getItem() == DavebuildingmodModItems.VOCAL_LIFESUPPORT.get()) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("davebuildingmod:vocal_lifesupport")), SoundSource.NEUTRAL, 1,
							1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("davebuildingmod:vocal_lifesupport")),
							SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
	}
}
