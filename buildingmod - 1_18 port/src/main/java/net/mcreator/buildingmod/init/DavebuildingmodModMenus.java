
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.buildingmod.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.buildingmod.world.inventory.VocalsGeneratorGuiMenu;
import net.mcreator.buildingmod.world.inventory.SoundGeneratorGuiMenu;
import net.mcreator.buildingmod.world.inventory.ParticleGeneratorGuiMenu;
import net.mcreator.buildingmod.world.inventory.HelpPaperMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DavebuildingmodModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<SoundGeneratorGuiMenu> SOUND_GENERATOR_GUI = register("sound_generator_gui",
			(id, inv, extraData) -> new SoundGeneratorGuiMenu(id, inv, extraData));
	public static final MenuType<ParticleGeneratorGuiMenu> PARTICLE_GENERATOR_GUI = register("particle_generator_gui",
			(id, inv, extraData) -> new ParticleGeneratorGuiMenu(id, inv, extraData));
	public static final MenuType<VocalsGeneratorGuiMenu> VOCALS_GENERATOR_GUI = register("vocals_generator_gui",
			(id, inv, extraData) -> new VocalsGeneratorGuiMenu(id, inv, extraData));
	public static final MenuType<HelpPaperMenu> HELP_PAPER = register("help_paper", (id, inv, extraData) -> new HelpPaperMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
