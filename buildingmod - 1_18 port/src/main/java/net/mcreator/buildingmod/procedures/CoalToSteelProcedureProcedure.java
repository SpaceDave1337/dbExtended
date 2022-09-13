package net.mcreator.buildingmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.buildingmod.init.DavebuildingmodModBlocks;

import javax.annotation.Nullable;

import java.util.Map;

import java.io.IOException;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;

import com.google.gson.Gson;

@Mod.EventBusSubscriber
public class CoalToSteelProcedureProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		if (event.getHand() != event.getPlayer().getUsedItemHand())
			return;
		execute(event, event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getPlayer());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		File dbeconfig = new File("");
		com.google.gson.JsonObject mainjsonobject = new com.google.gson.JsonObject();
		dbeconfig = new File((FMLPaths.GAMEDIR.get().toString() + "/config/"), File.separator + "dbeconfig.json");
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
				if (mainjsonobject.get("craftable_steel").getAsBoolean()) {
					if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.IRON_BLOCK) {
						if (Items.COAL == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Items.COAL);
								_setstack.setCount(
										(int) (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getCount()
												- 1));
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.WAX_OFF, x, y, z, 5, 1, 1, 1, 1);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, new BlockPos(x, y, z),
											ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.axe.wax_off")), SoundSource.BLOCKS, 1,
											1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.axe.wax_off")),
											SoundSource.BLOCKS, 1, 1, false);
								}
							}
							{
								BlockPos _bp = new BlockPos(x, y, z);
								BlockState _bs = DavebuildingmodModBlocks.STEEL_BLOCK.get().defaultBlockState();
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
						} else if (Items.CHARCOAL == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
								.getItem()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Items.CHARCOAL);
								_setstack.setCount(
										(int) (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getCount()
												- 1));
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.WAX_OFF, x, y, z, 5, 1, 1, 1, 1);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, new BlockPos(x, y, z),
											ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.axe.wax_off")), SoundSource.BLOCKS, 1,
											1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.axe.wax_off")),
											SoundSource.BLOCKS, 1, 1, false);
								}
							}
							{
								BlockPos _bp = new BlockPos(x, y, z);
								BlockState _bs = DavebuildingmodModBlocks.STEEL_BLOCK.get().defaultBlockState();
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
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
