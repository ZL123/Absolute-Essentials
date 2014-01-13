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
		ConfigSettings.bucketIron = config.getItem("Iron Bucket ID", DefaultIDs.bucketIron).getInt();
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
		ConfigSettings.copperDur = config.get("Copper Bucket Durability", "Durability", DefaultIDs.copperDur).getInt();
		ConfigSettings.tinDur = config.get("Tin Bucket Durability", "Durability", DefaultIDs.tinDur).getInt();
		ConfigSettings.ironDur = config.get("Iron Bucket Durability", "Durability", DefaultIDs.ironDur).getInt();
		ConfigSettings.steelDur = config.get("Steel Bucket Durability", "Durability", DefaultIDs.steelDur).getInt();
		ConfigSettings.carbonDur = config.get("Carbon Bucket Durability", "Durability", DefaultIDs.carbonDur).getInt();
		ConfigSettings.silverDur = config.get("Silver Bucket Durability", "Durability", DefaultIDs.silverDur).getInt();
		ConfigSettings.leadDur = config.get("Lead Bucket Durability", "Durability", DefaultIDs.leadDur).getInt();
		ConfigSettings.goldDur = config.get("Gold Bucket Durability", "Durability", DefaultIDs.goldDur).getInt();
		ConfigSettings.invarDur = config.get("Invar Bucket Durability", "Durability", DefaultIDs.invarDur).getInt();
		ConfigSettings.electrumDur = config.get("Electrum Bucket Durability", "Durability", DefaultIDs.electrumDur).getInt();
		ConfigSettings.tungstenDur = config.get("Tungsten Bucket Durability", "Durability", DefaultIDs.tungstenDur).getInt();
		ConfigSettings.chromiumDur = config.get("Chromium Bucket Durability", "Durability", DefaultIDs.chromiumDur).getInt();
		ConfigSettings.titaniumDur = config.get("Titanium Bucket Durability", "Durability", DefaultIDs.titaniumDur).getInt();
		ConfigSettings.antimonyDur = config.get("Antimony Bucket Durability", "Durability", DefaultIDs.antimonyDur).getInt();
		ConfigSettings.osmiumDur = config.get("Osmium Bucket Durability", "Durability", DefaultIDs.osmiumDur).getInt();
		ConfigSettings.platinumDur = config.get("Platinum Bucket Durability", "Durability", DefaultIDs.platinumDur).getInt();
		ConfigSettings.iridiumDur = config.get("Iridium Bucket Durability", "Durability", DefaultIDs.iridiumDur).getInt();
		ConfigSettings.tungstensteelDur = config.get("Tungstensteel Bucket Durability", "Durability", DefaultIDs.tungstensteelDur).getInt();
		ConfigSettings.zincDur = config.get("Zinc Bucket Durability", "Durability", DefaultIDs.zincDur).getInt();
		ConfigSettings.bronzeDur = config.get("Bronze Bucket Durability", "Durability", DefaultIDs.bronzeDur).getInt();
		ConfigSettings.brassDur = config.get("Brass Bucket Durability", "Durability", DefaultIDs.brassDur).getInt();
		ConfigSettings.nickelDur = config.get("Nickel Bucket Durability", "Durability", DefaultIDs.nickelDur).getInt();
		ConfigSettings.magnaliumDur = config.get("Magnalium Bucket Durability", "Durability", DefaultIDs.magnaliumDur).getInt();
		ConfigSettings.aluminiumDur = config.get("Aluminium Bucket Durability", "Durability", DefaultIDs.aluminiumDur).getInt();	
		ConfigSettings.magnesiumDur = config.get("Magnesium Bucket Durability", "Durability", DefaultIDs.magnesiumDur).getInt();
		ConfigSettings.obsidianDur = config.get("Obsidian Bucket Durability", "Durability", DefaultIDs.obsidianDur).getInt();
		
		//Bucket 'depth'
		ConfigSettings.copperDepth = config.get("Copper Bucket Capacity", "Capacity", DefaultIDs.copperDepth).getInt();
		ConfigSettings.tinDepth = config.get("Tin Bucket Capacity", "Capacity", DefaultIDs.tinDepth).getInt();
		ConfigSettings.ironDepth = config.get("Iron Bucket Capacity", "Capacity", DefaultIDs.ironDepth).getInt();
		ConfigSettings.steelDepth = config.get("Steel Bucket Capacity", "Capacity", DefaultIDs.steelDepth).getInt();
		ConfigSettings.carbonDepth = config.get("Carbon Bucket Capacity", "Capacity", DefaultIDs.carbonDepth).getInt();
		ConfigSettings.silverDepth = config.get("Silver Bucket Capacity", "Capacity", DefaultIDs.silverDepth).getInt();
		ConfigSettings.leadDepth = config.get("Lead Bucket Capacity", "Capacity", DefaultIDs.leadDepth).getInt();
		ConfigSettings.goldDepth = config.get("Gold Bucket Capacity", "Capacity", DefaultIDs.goldDepth).getInt();
		ConfigSettings.invarDepth = config.get("Invar Bucket Capacity", "Capacity", DefaultIDs.invarDepth).getInt();
		ConfigSettings.electrumDepth = config.get("Electrum Bucket Capacity", "Capacity", DefaultIDs.electrumDepth).getInt();
		ConfigSettings.tungstenDepth = config.get("Tungsten Bucket Capacity", "Capacity", DefaultIDs.tungstenDepth).getInt();
		ConfigSettings.chromiumDepth = config.get("Chromium Bucket Capacity", "Capacity", DefaultIDs.chromiumDepth).getInt();
		ConfigSettings.titaniumDepth = config.get("Titanium Bucket Capacity", "Capacity", DefaultIDs.titaniumDepth).getInt();
		ConfigSettings.antimonyDepth = config.get("Antimony Bucket Capacity", "Capacity", DefaultIDs.antimonyDepth).getInt();
		ConfigSettings.osmiumDepth = config.get("Osmium Bucket Capacity", "Capacity", DefaultIDs.osmiumDepth).getInt();
		ConfigSettings.platinumDepth = config.get("Platinum Bucket Capacity", "Capacity", DefaultIDs.platinumDepth).getInt();
		ConfigSettings.iridiumDepth = config.get("Iridium Bucket Capacity", "Capacity", DefaultIDs.iridiumDepth).getInt();
		ConfigSettings.tungstensteelDepth = config.get("Tungstensteel Bucket Capacity", "Capacity", DefaultIDs.tungstensteelDepth).getInt();
		ConfigSettings.zincDepth = config.get("Zinc Bucket Capacity", "Capacity", DefaultIDs.zincDepth).getInt();
		ConfigSettings.bronzeDepth = config.get("Bronze Bucket Capacity", "Capacity", DefaultIDs.bronzeDepth).getInt();
		ConfigSettings.brassDepth = config.get("Brass Bucket Capacity", "Capacity", DefaultIDs.brassDepth).getInt();
		ConfigSettings.nickelDepth = config.get("Nickel Bucket Capacity", "Capacity", DefaultIDs.nickelDepth).getInt();
		ConfigSettings.magnaliumDepth = config.get("Magnalium Bucket Capacity", "Capacity", DefaultIDs.magnaliumDepth).getInt();
		ConfigSettings.aluminiumDepth = config.get("Aluminium Bucket Capacity", "Capacity", DefaultIDs.aluminiumDepth).getInt();	
		ConfigSettings.magnesiumDepth = config.get("Magnesium Bucket Capacity", "Capacity", DefaultIDs.magnesiumDepth).getInt();
		ConfigSettings.obsidianDepth = config.get("Obsidian Bucket Capacity", "Capacity", DefaultIDs.obsidianDepth).getInt();
		
		
		config.save();	
		
	}
	
}
