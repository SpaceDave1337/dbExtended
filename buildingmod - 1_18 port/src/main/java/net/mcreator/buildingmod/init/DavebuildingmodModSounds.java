
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.buildingmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DavebuildingmodModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("davebuildingmod", "nuclear_siren"),
				new SoundEvent(new ResourceLocation("davebuildingmod", "nuclear_siren")));
		REGISTRY.put(new ResourceLocation("davebuildingmod", "vocals_emtpy"),
				new SoundEvent(new ResourceLocation("davebuildingmod", "vocals_emtpy")));
		REGISTRY.put(new ResourceLocation("davebuildingmod", "vocals_warning"),
				new SoundEvent(new ResourceLocation("davebuildingmod", "vocals_warning")));
		REGISTRY.put(new ResourceLocation("davebuildingmod", "vocals_attention"),
				new SoundEvent(new ResourceLocation("davebuildingmod", "vocals_attention")));
		REGISTRY.put(new ResourceLocation("davebuildingmod", "vocals_closehatch"),
				new SoundEvent(new ResourceLocation("davebuildingmod", "vocals_closehatch")));
		REGISTRY.put(new ResourceLocation("davebuildingmod", "vocals_openhatch"),
				new SoundEvent(new ResourceLocation("davebuildingmod", "vocals_openhatch")));
		REGISTRY.put(new ResourceLocation("davebuildingmod", "vocals_bootup"),
				new SoundEvent(new ResourceLocation("davebuildingmod", "vocals_bootup")));
		REGISTRY.put(new ResourceLocation("davebuildingmod", "vocals_standby"),
				new SoundEvent(new ResourceLocation("davebuildingmod", "vocals_standby")));
		REGISTRY.put(new ResourceLocation("davebuildingmod", "vocals_experiment"),
				new SoundEvent(new ResourceLocation("davebuildingmod", "vocals_experiment")));
		REGISTRY.put(new ResourceLocation("davebuildingmod", "vocals_facilityleave"),
				new SoundEvent(new ResourceLocation("davebuildingmod", "vocals_facilityleave")));
		REGISTRY.put(new ResourceLocation("davebuildingmod", "vocals_reactormeltdown"),
				new SoundEvent(new ResourceLocation("davebuildingmod", "vocals_reactormeltdown")));
		REGISTRY.put(new ResourceLocation("davebuildingmod", "vocals_airlock"),
				new SoundEvent(new ResourceLocation("davebuildingmod", "vocals_airlock")));
		REGISTRY.put(new ResourceLocation("davebuildingmod", "vocals_systemfail"),
				new SoundEvent(new ResourceLocation("davebuildingmod", "vocals_systemfail")));
		REGISTRY.put(new ResourceLocation("davebuildingmod", "vocals_calculating"),
				new SoundEvent(new ResourceLocation("davebuildingmod", "vocals_calculating")));
		REGISTRY.put(new ResourceLocation("davebuildingmod", "vocal_systemintegrity"),
				new SoundEvent(new ResourceLocation("davebuildingmod", "vocal_systemintegrity")));
		REGISTRY.put(new ResourceLocation("davebuildingmod", "vocals_selfdestruct"),
				new SoundEvent(new ResourceLocation("davebuildingmod", "vocals_selfdestruct")));
		REGISTRY.put(new ResourceLocation("davebuildingmod", "vocals_containmentfail"),
				new SoundEvent(new ResourceLocation("davebuildingmod", "vocals_containmentfail")));
		REGISTRY.put(new ResourceLocation("davebuildingmod", "vocal_lifesupport"),
				new SoundEvent(new ResourceLocation("davebuildingmod", "vocal_lifesupport")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
