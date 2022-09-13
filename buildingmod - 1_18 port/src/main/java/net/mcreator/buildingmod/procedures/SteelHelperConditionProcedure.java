package net.mcreator.buildingmod.procedures;

import net.minecraftforge.fml.loading.FMLPaths;

import java.io.IOException;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;

import com.google.gson.Gson;

public class SteelHelperConditionProcedure {
	public static boolean execute() {
		File dbeconfig = new File("");
		com.google.gson.JsonObject mainjsonobject = new com.google.gson.JsonObject();
		boolean craftable_steel = false;
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
				craftable_steel = mainjsonobject.get("craftable_steel").getAsBoolean();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return craftable_steel;
	}
}
