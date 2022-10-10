
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
		REGISTRY.put(new ResourceLocation("davebuildingmod", "vocal_labrepair"),
				new SoundEvent(new ResourceLocation("davebuildingmod", "vocal_labrepair")));
		REGISTRY.put(new ResourceLocation("davebuildingmod", "vocal_experiment_start"),
				new SoundEvent(new ResourceLocation("davebuildingmod", "vocal_experiment_start")));
		REGISTRY.put(new ResourceLocation("davebuildingmod", "vocal_reactor_breach"),
				new SoundEvent(new ResourceLocation("davebuildingmod", "vocal_reactor_breach")));
		REGISTRY.put(new ResourceLocation("davebuildingmod", "vocal_systems_loading"),
				new SoundEvent(new ResourceLocation("davebuildingmod", "vocal_systems_loading")));
		REGISTRY.put(new ResourceLocation("davebuildingmod", "vocal_decontamination"),
				new SoundEvent(new ResourceLocation("davebuildingmod", "vocal_decontamination")));
		REGISTRY.put(new ResourceLocation("davebuildingmod", "vocal_decompression"),
				new SoundEvent(new ResourceLocation("davebuildingmod", "vocal_decompression")));
		REGISTRY.put(new ResourceLocation("davebuildingmod", "vocal_lockdown"),
				new SoundEvent(new ResourceLocation("davebuildingmod", "vocal_lockdown")));
		REGISTRY.put(new ResourceLocation("davebuildingmod", "vocal_lifesystem_fail"),
				new SoundEvent(new ResourceLocation("davebuildingmod", "vocal_lifesystem_fail")));
		REGISTRY.put(new ResourceLocation("davebuildingmod", "vocal_leave_facility"),
				new SoundEvent(new ResourceLocation("davebuildingmod", "vocal_leave_facility")));
		REGISTRY.put(new ResourceLocation("davebuildingmod", "vocal_unauthorized_activity"),
				new SoundEvent(new ResourceLocation("davebuildingmod", "vocal_unauthorized_activity")));
		REGISTRY.put(new ResourceLocation("davebuildingmod", "vocal_evacuate_complex"),
				new SoundEvent(new ResourceLocation("davebuildingmod", "vocal_evacuate_complex")));
		REGISTRY.put(new ResourceLocation("davebuildingmod", "vocal_attention"),
				new SoundEvent(new ResourceLocation("davebuildingmod", "vocal_attention")));
		REGISTRY.put(new ResourceLocation("davebuildingmod", "vocal_warning"),
				new SoundEvent(new ResourceLocation("davebuildingmod", "vocal_warning")));
		REGISTRY.put(new ResourceLocation("davebuildingmod", "vocal_alert"), new SoundEvent(new ResourceLocation("davebuildingmod", "vocal_alert")));
		REGISTRY.put(new ResourceLocation("davebuildingmod", "vocal_nuke_alert"),
				new SoundEvent(new ResourceLocation("davebuildingmod", "vocal_nuke_alert")));
		REGISTRY.put(new ResourceLocation("davebuildingmod", "vocal_emergency_exit"),
				new SoundEvent(new ResourceLocation("davebuildingmod", "vocal_emergency_exit")));
		REGISTRY.put(new ResourceLocation("davebuildingmod", "vocal_security_breach"),
				new SoundEvent(new ResourceLocation("davebuildingmod", "vocal_security_breach")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
