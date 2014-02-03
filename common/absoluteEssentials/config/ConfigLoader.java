package absoluteEssentials.config;

import absoluteEssentials.lib.DefaultIDs;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ConfigLoader {
	
	public static Configuration config;
	
	public static void init(FMLPreInitializationEvent event) {
		
		config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		
		//Item IDs
		ConfigSettings.bucketCopper = config.getItem("Copper Bucket ID", DefaultIDs.bucketCopper).getInt();
		ConfigSettings.bucketTin = config.getItem("Tin Bucket ID", DefaultIDs.bucketTin).getInt();
		ConfigSettings.bucketSteel = config.getItem("Steel Bucket ID", DefaultIDs.bucketSteel).getInt();
		ConfigSettings.bucketCarbon = config.getItem("Carbon Bucket ID", DefaultIDs.bucketCarbon).getInt();
		ConfigSettings.bucketSilver = config.getItem("Silver Bucket ID", DefaultIDs.bucketSilver).getInt();
		ConfigSettings.bucketLead = config.getItem("Lead Bucket ID", DefaultIDs.bucketLead).getInt();
		ConfigSettings.bucketGold = config.getItem("Gold Bucket ID", DefaultIDs.bucketGold).getInt();
		ConfigSettings.bucketInvar = config.getItem("Invar Bucket ID", DefaultIDs.bucketInvar).getInt();
		ConfigSettings.bucketElectrum = config.getItem("Electrum Bucket ID", DefaultIDs.bucketElectrum).getInt();
		ConfigSettings.bucketTungsten = config.getItem("Tungsten Bucket ID", DefaultIDs.bucketTungsten).getInt();
		ConfigSettings.bucketChromium = config.getItem("Chromium Bucket ID", DefaultIDs.bucketChromium).getInt();
		ConfigSettings.bucketTitanium = config.getItem("Titanium Bucket ID", DefaultIDs.bucketTitanium).getInt();
		ConfigSettings.bucketAntimony = config.getItem("Antimony Bucket ID", DefaultIDs.bucketAntimony).getInt();
		ConfigSettings.bucketOsmium = config.getItem("Osmium Bucket ID", DefaultIDs.bucketOsmium).getInt();
		ConfigSettings.bucketPlatinum = config.getItem("Platinum Bucket ID", DefaultIDs.bucketPlatinum).getInt();
		ConfigSettings.bucketIridium = config.getItem("Iridium Bucket ID", DefaultIDs.bucketIridium).getInt();
		ConfigSettings.bucketTungstensteel = config.getItem("Tungstensteel Bucket ID", DefaultIDs.bucketTungstensteel).getInt();
		ConfigSettings.bucketZinc = config.getItem("Zinc Bucket ID", DefaultIDs.bucketZinc).getInt();
		ConfigSettings.bucketBronze = config.getItem("Bronze Bucket ID", DefaultIDs.bucketBronze).getInt();
		ConfigSettings.bucketBrass = config.getItem("Brass Bucket ID", DefaultIDs.bucketBrass).getInt();
		ConfigSettings.bucketNickel = config.getItem("Nickel Bucket ID", DefaultIDs.bucketNickel).getInt();
		ConfigSettings.bucketMagnalium = config.getItem("Magnalium Bucket ID", DefaultIDs.bucketMagnalium).getInt();
		ConfigSettings.bucketAluminium = config.getItem("Aluminium Bucket ID", DefaultIDs.bucketAluminium).getInt();	
		ConfigSettings.bucketMagnesium = config.getItem("Magnesium Bucket ID", DefaultIDs.bucketMagnesium).getInt();
		ConfigSettings.bucketObsidian = config.getItem("Obsidian Bucket ID", DefaultIDs.bucketObsidian).getInt();
		
		//Item Durability
		ConfigSettings.copperDur = config.get("Durability", "Copper Bucket Durability", DefaultIDs.copperDur).getInt();
		ConfigSettings.tinDur = config.get("Durability", "Tin Bucket Durability", DefaultIDs.tinDur).getInt();
		ConfigSettings.ironDur = config.get("Durability", "Iron Bucket Durability", DefaultIDs.ironDur).getInt();
		ConfigSettings.steelDur = config.get("Durability", "Steel Bucket Durability", DefaultIDs.steelDur).getInt();
		ConfigSettings.carbonDur = config.get("Durability", "Carbon Bucket Durability", DefaultIDs.carbonDur).getInt();
		ConfigSettings.silverDur = config.get("Durability", "Silver Bucket Durability", DefaultIDs.silverDur).getInt();
		ConfigSettings.leadDur = config.get("Durability", "Lead Bucket Durability", DefaultIDs.leadDur).getInt();
		ConfigSettings.goldDur = config.get("Durability", "Gold Bucket Durability", DefaultIDs.goldDur).getInt();
		ConfigSettings.invarDur = config.get("Durability", "Invar Bucket Durability", DefaultIDs.invarDur).getInt();
		ConfigSettings.electrumDur = config.get("Durability", "Electrum Bucket Durability", DefaultIDs.electrumDur).getInt();
		ConfigSettings.tungstenDur = config.get("Durability", "Tungsten Bucket Durability", DefaultIDs.tungstenDur).getInt();
		ConfigSettings.chromiumDur = config.get("Durability", "Chromium Bucket Durability", DefaultIDs.chromiumDur).getInt();
		ConfigSettings.titaniumDur = config.get("Durability", "Titanium Bucket Durability", DefaultIDs.titaniumDur).getInt();
		ConfigSettings.antimonyDur = config.get("Durability", "Antimony Bucket Durability", DefaultIDs.antimonyDur).getInt();
		ConfigSettings.osmiumDur = config.get("Durability", "Osmium Bucket Durability", DefaultIDs.osmiumDur).getInt();
		ConfigSettings.platinumDur = config.get("Durability", "Platinum Bucket Durability", DefaultIDs.platinumDur).getInt();
		ConfigSettings.iridiumDur = config.get("Durability", "Iridium Bucket Durability", DefaultIDs.iridiumDur).getInt();
		ConfigSettings.tungstensteelDur = config.get("Durability", "Tungstensteel Bucket Durability", DefaultIDs.tungstensteelDur).getInt();
		ConfigSettings.zincDur = config.get("Durability", "Zinc Bucket Durability", DefaultIDs.zincDur).getInt();
		ConfigSettings.bronzeDur = config.get("Durability", "Bronze Bucket Durability", DefaultIDs.bronzeDur).getInt();
		ConfigSettings.brassDur = config.get("Durability", "Brass Bucket Durability", DefaultIDs.brassDur).getInt();
		ConfigSettings.nickelDur = config.get("Durability", "Nickel Bucket Durability", DefaultIDs.nickelDur).getInt();
		ConfigSettings.magnaliumDur = config.get("Durability", "Magnalium Bucket Durability", DefaultIDs.magnaliumDur).getInt();
		ConfigSettings.aluminiumDur = config.get("Durability", "Aluminium Bucket Durability", DefaultIDs.aluminiumDur).getInt();	
		ConfigSettings.magnesiumDur = config.get("Durability", "Magnesium Bucket Durability", DefaultIDs.magnesiumDur).getInt();
		ConfigSettings.obsidianDur = config.get("Durability", "Obsidian Bucket Durability", DefaultIDs.obsidianDur).getInt();
		
		//Bucket 'depth'
		ConfigSettings.copperDepth = config.get("Capacity", "Copper Bucket Capacity", DefaultIDs.copperDepth).getInt();
		ConfigSettings.tinDepth = config.get("Capacity", "Tin Bucket Capacity", DefaultIDs.tinDepth).getInt();
		ConfigSettings.ironDepth = config.get("Capacity", "Iron Bucket Capacity", DefaultIDs.ironDepth).getInt();
		ConfigSettings.steelDepth = config.get("Capacity", "Steel Bucket Capacity", DefaultIDs.steelDepth).getInt();
		ConfigSettings.carbonDepth = config.get("Capacity", "Carbon Bucket Capacity", DefaultIDs.carbonDepth).getInt();
		ConfigSettings.silverDepth = config.get("Capacity", "Silver Bucket Capacity", DefaultIDs.silverDepth).getInt();
		ConfigSettings.leadDepth = config.get("Capacity", "Lead Bucket Capacity", DefaultIDs.leadDepth).getInt();
		ConfigSettings.goldDepth = config.get("Capacity", "Gold Bucket Capacity", DefaultIDs.goldDepth).getInt();
		ConfigSettings.invarDepth = config.get("Capacity", "Invar Bucket Capacity", DefaultIDs.invarDepth).getInt();
		ConfigSettings.electrumDepth = config.get("Capacity", "Electrum Bucket Capacity", DefaultIDs.electrumDepth).getInt();
		ConfigSettings.tungstenDepth = config.get("Capacity", "Tungsten Bucket Capacity", DefaultIDs.tungstenDepth).getInt();
		ConfigSettings.chromiumDepth = config.get("Capacity", "Chromium Bucket Capacity", DefaultIDs.chromiumDepth).getInt();
		ConfigSettings.titaniumDepth = config.get("Capacity", "Titanium Bucket Capacity", DefaultIDs.titaniumDepth).getInt();
		ConfigSettings.antimonyDepth = config.get("Capacity", "Antimony Bucket Capacity", DefaultIDs.antimonyDepth).getInt();
		ConfigSettings.osmiumDepth = config.get("Capacity", "Osmium Bucket Capacity", DefaultIDs.osmiumDepth).getInt();
		ConfigSettings.platinumDepth = config.get("Capacity", "Platinum Bucket Capacity", DefaultIDs.platinumDepth).getInt();
		ConfigSettings.iridiumDepth = config.get("Capacity", "Iridium Bucket Capacity", DefaultIDs.iridiumDepth).getInt();
		ConfigSettings.tungstensteelDepth = config.get("Capacity", "Tungstensteel Bucket Capacity", DefaultIDs.tungstensteelDepth).getInt();
		ConfigSettings.zincDepth = config.get("Capacity", "Zinc Bucket Capacity", DefaultIDs.zincDepth).getInt();
		ConfigSettings.bronzeDepth = config.get("Capacity", "Bronze Bucket Capacity", DefaultIDs.bronzeDepth).getInt();
		ConfigSettings.brassDepth = config.get("Capacity", "Brass Bucket Capacity", DefaultIDs.brassDepth).getInt();
		ConfigSettings.nickelDepth = config.get("Capacity", "Nickel Bucket Capacity", DefaultIDs.nickelDepth).getInt();
		ConfigSettings.magnaliumDepth = config.get("Capacity", "Magnalium Bucket Capacity", DefaultIDs.magnaliumDepth).getInt();
		ConfigSettings.aluminiumDepth = config.get("Capacity", "Aluminium Bucket Capacity", DefaultIDs.aluminiumDepth).getInt();	
		ConfigSettings.magnesiumDepth = config.get("Capacity", "Magnesium Bucket Capacity", DefaultIDs.magnesiumDepth).getInt();
		ConfigSettings.obsidianDepth = config.get("Capacity", "Obsidian Bucket Capacity", DefaultIDs.obsidianDepth).getInt();
		
		
		config.save();	
		
	}
	
}
