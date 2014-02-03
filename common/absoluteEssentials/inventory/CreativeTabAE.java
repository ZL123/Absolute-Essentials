package absoluteEssentials.inventory;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import absoluteEssentials.item.ModItems;

public class CreativeTabAE extends CreativeTabs {
	
	public CreativeTabAE(String label) {
		super(label);
	}
	
	public ItemStack getIconItemStack() {
		return new ItemStack(ModItems.itemBucketElectrum);
	}
	
}
