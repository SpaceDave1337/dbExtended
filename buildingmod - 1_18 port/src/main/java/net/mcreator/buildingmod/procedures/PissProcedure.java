package net.mcreator.buildingmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import net.mcreator.buildingmod.init.DavebuildingmodModBlocks;

public class PissProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		boolean active = false;
		if (entity instanceof LivingEntity _entity) {
			ItemStack _setstack = new ItemStack(DavebuildingmodModBlocks.PISS_OFF.get());
			_setstack.setCount((int) (((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getCount() - 1));
			_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
			if (_entity instanceof Player _player)
				_player.getInventory().setChanged();
		}
		if (world instanceof Level _level && !_level.isClientSide()) {
			ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(DavebuildingmodModBlocks.PISS_ON.get()));
			entityToSpawn.setPickUpDelay(1);
			_level.addFreshEntity(entityToSpawn);
		}
	}
}
