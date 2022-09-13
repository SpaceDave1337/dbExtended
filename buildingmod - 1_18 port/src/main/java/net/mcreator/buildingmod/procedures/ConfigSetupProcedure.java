package net.mcreator.buildingmod.procedures;

import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

import java.io.IOException;
import java.io.FileWriter;
import java.io.File;

import com.google.gson.GsonBuilder;
import com.google.gson.Gson;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ConfigSetupProcedure {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		execute();
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
		File dbeconfig = new File("");
		com.google.gson.JsonObject mainjsonobject = new com.google.gson.JsonObject();
		dbeconfig = new File((FMLPaths.GAMEDIR.get().toString() + "/config/"), File.separator + "dbeconfig.json");
		if (!dbeconfig.exists()) {
			try {
				dbeconfig.getParentFile().mkdirs();
				dbeconfig.createNewFile();
			} catch (IOException exception) {
				exception.printStackTrace();
			}
			mainjsonobject.addProperty("craftable_steel", (true));
			{
				Gson mainGSONBuilderVariable = new GsonBuilder().setPrettyPrinting().create();
				try {
					FileWriter fileWriter = new FileWriter(dbeconfig);
					fileWriter.write(mainGSONBuilderVariable.toJson(mainjsonobject));
					fileWriter.close();
				} catch (IOException exception) {
					exception.printStackTrace();
				}
			}
		}
	}
}
