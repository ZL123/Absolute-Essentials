package absoluteEssentials.lang;

import absoluteEssentials.item.ModItems;
import absoluteEssentials.lib.Reference;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class RegisterNames {
	
	public static void load() {
		
		//Items
		LanguageRegistry.addName(ModItems.itemBucketCopper, "Copper Bucket");
		LanguageRegistry.addName(ModItems.itemBucketTin, "Tin Bucket");
		LanguageRegistry.addName(ModItems.itemBucketIron, "Iron Bucket");
		LanguageRegistry.addName(ModItems.itemBucketSteel, "Steel Bucket");
		LanguageRegistry.addName(ModItems.itemBucketCarbon, "Carbon Bucket");
		LanguageRegistry.addName(ModItems.itemBucketSilver, "Silver Bucket");
		LanguageRegistry.addName(ModItems.itemBucketLead, "Lead Bucket");
		LanguageRegistry.addName(ModItems.itemBucketGold, "Gold Bucket");
		LanguageRegistry.addName(ModItems.itemBucketInvar, "Invar Bucket");
		LanguageRegistry.addName(ModItems.itemBucketElectrum, "Electrum Bucket");
		LanguageRegistry.addName(ModItems.itemBucketTungsten, "Tungsten Bucket");
		LanguageRegistry.addName(ModItems.itemBucketChromium, "Chromium Bucket");
		LanguageRegistry.addName(ModItems.itemBucketTitanium, "Titanium Bucket");
		LanguageRegistry.addName(ModItems.itemBucketAntimony, "Antimony Bucket");
		LanguageRegistry.addName(ModItems.itemBucketOsmium, "Osmium Bucket");
		LanguageRegistry.addName(ModItems.itemBucketPlatinum, "Platinum Bucket");
		LanguageRegistry.addName(ModItems.itemBucketIridium, "Iridium Bucket");
		LanguageRegistry.addName(ModItems.itemBucketTungstensteel, "Tungstensteel Bucket");
		LanguageRegistry.addName(ModItems.itemBucketZinc, "Zinc Bucket");
		LanguageRegistry.addName(ModItems.itemBucketBronze, "Bronze Bucket");
		LanguageRegistry.addName(ModItems.itemBucketBrass, "Brass Bucket");
		LanguageRegistry.addName(ModItems.itemBucketNickel, "Nickel Bucket");
		LanguageRegistry.addName(ModItems.itemBucketMagnalium, "Magnalium Bucket");
		LanguageRegistry.addName(ModItems.itemBucketAluminium, "Aluminium Bucket");
		LanguageRegistry.addName(ModItems.itemBucketMagnesium, "Magnesium Bucket");
		LanguageRegistry.addName(ModItems.itemBucketObsidian, "Obsidian Bucket");
		
		
		//Other
		LanguageRegistry.instance().addStringLocalization("itemGroup." + Reference.MOD_ID, Reference.MOD_NAME);
		
		
	}

}
