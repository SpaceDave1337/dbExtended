
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.buildingmod.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.buildingmod.client.gui.VocalsGeneratorGuiScreen;
import net.mcreator.buildingmod.client.gui.SoundGeneratorGuiScreen;
import net.mcreator.buildingmod.client.gui.ParticleGeneratorGuiScreen;
import net.mcreator.buildingmod.client.gui.HelpPaperScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DavebuildingmodModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(DavebuildingmodModMenus.SOUND_GENERATOR_GUI, SoundGeneratorGuiScreen::new);
			MenuScreens.register(DavebuildingmodModMenus.PARTICLE_GENERATOR_GUI, ParticleGeneratorGuiScreen::new);
			MenuScreens.register(DavebuildingmodModMenus.VOCALS_GENERATOR_GUI, VocalsGeneratorGuiScreen::new);
			MenuScreens.register(DavebuildingmodModMenus.HELP_PAPER, HelpPaperScreen::new);
		});
	}
}
