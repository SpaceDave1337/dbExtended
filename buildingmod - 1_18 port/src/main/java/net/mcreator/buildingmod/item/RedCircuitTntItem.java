
package net.mcreator.buildingmod.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.buildingmod.init.DavebuildingmodModTabs;

public class RedCircuitTntItem extends Item {
	public RedCircuitTntItem() {
		super(new Item.Properties().tab(DavebuildingmodModTabs.TAB_DAVES_MOD_TAB).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}
}
