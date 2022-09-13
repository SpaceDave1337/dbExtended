
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.buildingmod.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class DavebuildingmodModTabs {
	public static CreativeModeTab TAB_DAVES_MOD_TAB;

	public static void load() {
		TAB_DAVES_MOD_TAB = new CreativeModeTab("tabdaves_mod_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(DavebuildingmodModBlocks.CREATE_BOILER.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
