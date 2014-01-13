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
		ConfigSettings.copperDur = config.getItem("Copper Bucket Durability", DefaultIDs.copperDur).getInt();
		ConfigSettings.tinDur = config.getItem("Tin Bucket Durability", DefaultIDs.tinDur).getInt();
		ConfigSettings.ironDur = config.getItem("Iron Bucket Durability", DefaultIDs.ironDur).getInt();
		ConfigSettings.steelDur = config.getItem("Steel Bucket Durability", DefaultIDs.steelDur).getInt();
		ConfigSettings.carbonDur = config.getItem("Carbon Bucket Durability", DefaultIDs.carbonDur).getInt();
		ConfigSettings.silverDur = config.getItem("Silver Bucket Durability", DefaultIDs.silverDur).getInt();
		ConfigSettings.leadDur = config.getItem("Lead Bucket Durability", DefaultIDs.leadDur).getInt();
		ConfigSettings.goldDur = config.getItem("Gold Bucket Durability", DefaultIDs.goldDur).getInt();
		ConfigSettings.invarDur = config.getItem("Invar Bucket Durability", DefaultIDs.invarDur).getInt();
		ConfigSettings.electrumDur = config.getItem("Electrum Bucket Durability", DefaultIDs.electrumDur).getInt();
		ConfigSettings.tungstenDur = config.getItem("Tungsten Bucket Durability", DefaultIDs.tungstenDur).getInt();
		ConfigSettings.chromiumDur = config.getItem("Chromium Bucket Durability", DefaultIDs.chromiumDur).getInt();
		ConfigSettings.titaniumDur = config.getItem("Titanium Bucket Durability", DefaultIDs.titaniumDur).getInt();
		ConfigSettings.antimonyDur = config.getItem("Antimony Bucket Durability", DefaultIDs.antimonyDur).getInt();
		ConfigSettings.osmiumDur = config.getItem("Osmium Bucket Durability", DefaultIDs.osmiumDur).getInt();
		ConfigSettings.platinumDur = config.getItem("Platinum Bucket Durability", DefaultIDs.platinumDur).getInt();
		ConfigSettings.iridiumDur = config.getItem("Iridium Bucket Durability", DefaultIDs.iridiumDur).getInt();
		ConfigSettings.tungstensteelDur = config.getItem("Tungstensteel Bucket Durability", DefaultIDs.tungstensteelDur).getInt();
		ConfigSettings.zincDur = config.getItem("Zinc Bucket Durability", DefaultIDs.zincDur).getInt();
		ConfigSettings.bronzeDur = config.getItem("Bronze Bucket Durability", DefaultIDs.bronzeDur).getInt();
		ConfigSettings.brassDur = config.getItem("Brass Bucket Durability", DefaultIDs.brassDur).getInt();
		ConfigSettings.nickelDur = config.getItem("Nickel Bucket Durability", DefaultIDs.nickelDur).getInt();
		ConfigSettings.magnaliumDur = config.getItem("Magnalium Bucket Durability", DefaultIDs.magnaliumDur).getInt();
		ConfigSettings.aluminiumDur = config.getItem("Aluminium Bucket Durability", DefaultIDs.aluminiumDur).getInt();	
		ConfigSettings.magnesiumDur = config.getItem("Magnesium Bucket Durability", DefaultIDs.magnesiumDur).getInt();
		ConfigSettings.obsidianDur = config.getItem("Obsidian Bucket Durability", DefaultIDs.obsidianDur).getInt();
		
		//Bucket 'depth'
		ConfigSettings.copperDepth = config.getItem("Copper Bucket Depth", DefaultIDs.copperDepth).getInt();
		ConfigSettings.tinDepth = config.getItem("Tin Bucket Depth", DefaultIDs.tinDepth).getInt();
		ConfigSettings.ironDepth = config.getItem("Iron Bucket Depth", DefaultIDs.ironDepth).getInt();
		ConfigSettings.steelDepth = config.getItem("Steel Bucket Depth", DefaultIDs.steelDepth).getInt();
		ConfigSettings.carbonDepth = config.getItem("Carbon Bucket Depth", DefaultIDs.carbonDepth).getInt();
		ConfigSettings.silverDepth = config.getItem("Silver Bucket Depth", DefaultIDs.silverDepth).getInt();
		ConfigSettings.leadDepth = config.getItem("Lead Bucket Depth", DefaultIDs.leadDepth).getInt();
		ConfigSettings.goldDepth = config.getItem("Gold Bucket Depth", DefaultIDs.goldDepth).getInt();
		ConfigSettings.invarDepth = config.getItem("Invar Bucket Depth", DefaultIDs.invarDepth).getInt();
		ConfigSettings.electrumDepth = config.getItem("Electrum Bucket Depth", DefaultIDs.electrumDepth).getInt();
		ConfigSettings.tungstenDepth = config.getItem("Tungsten Bucket Depth", DefaultIDs.tungstenDepth).getInt();
		ConfigSettings.chromiumDepth = config.getItem("Chromium Bucket Depth", DefaultIDs.chromiumDepth).getInt();
		ConfigSettings.titaniumDepth = config.getItem("Titanium Bucket Depth", DefaultIDs.titaniumDepth).getInt();
		ConfigSettings.antimonyDepth = config.getItem("Antimony Bucket Depth", DefaultIDs.antimonyDepth).getInt();
		ConfigSettings.osmiumDepth = config.getItem("Osmium Bucket Depth", DefaultIDs.osmiumDepth).getInt();
		ConfigSettings.platinumDepth = config.getItem("Platinum Bucket Depth", DefaultIDs.platinumDepth).getInt();
		ConfigSettings.iridiumDepth = config.getItem("Iridium Bucket Depth", DefaultIDs.iridiumDepth).getInt();
		ConfigSettings.tungstensteelDepth = config.getItem("Tungstensteel Bucket Depth", DefaultIDs.tungstensteelDepth).getInt();
		ConfigSettings.zincDepth = config.getItem("Zinc Bucket Depth", DefaultIDs.zincDepth).getInt();
		ConfigSettings.bronzeDepth = config.getItem("Bronze Bucket Depth", DefaultIDs.bronzeDepth).getInt();
		ConfigSettings.brassDepth = config.getItem("Brass Bucket Depth", DefaultIDs.brassDepth).getInt();
		ConfigSettings.nickelDepth = config.getItem("Nickel Bucket Depth", DefaultIDs.nickelDepth).getInt();
		ConfigSettings.magnaliumDepth = config.getItem("Magnalium Bucket Depth", DefaultIDs.magnaliumDepth).getInt();
		ConfigSettings.aluminiumDepth = config.getItem("Aluminium Bucket Depth", DefaultIDs.aluminiumDepth).getInt();	
		ConfigSettings.magnesiumDepth = config.getItem("Magnesium Bucket Depth", DefaultIDs.magnesiumDepth).getInt();
		ConfigSettings.obsidianDepth = config.getItem("Obsidian Bucket Depth", DefaultIDs.obsidianDepth).getInt();
		
		
		config.save();	
		
	}
	
}
