package absoluteEssentials.item;

import absoluteEssentials.config.ConfigSettings;
import net.minecraft.item.Item;

public class ModItems {
	
	//Items
	public static Item itemBucketCopper;
	public static Item itemBucketTin;
	public static Item itemBucketIron;
	public static Item itemBucketSteel;
	public static Item itemBucketCarbon;
	public static Item itemBucketSilver;
	public static Item itemBucketLead;
	public static Item itemBucketGold;
	public static Item itemBucketInvar;
	public static Item itemBucketElectrum;
	public static Item itemBucketTungsten;
	public static Item itemBucketChromium;
	public static Item itemBucketTitanium;
	public static Item itemBucketAntimony;
	public static Item itemBucketOsmium;
	public static Item itemBucketPlatinum;
	public static Item itemBucketIridium;
	public static Item itemBucketTungstensteel;
	public static Item itemBucketZinc;
	public static Item itemBucketBronze;
	public static Item itemBucketBrass;
	public static Item itemBucketNickel;
	public static Item itemBucketMagnalium;
	public static Item itemBucketAluminium;
	public static Item itemBucketMagnesium;
	public static Item itemBucketObsidian;
	
	public static void init() {
		
		itemBucketCopper = new ItemDurableBucket(ConfigSettings.bucketCopper, ConfigSettings.copperDur, ConfigSettings.copperDepth);
		itemBucketTin = new ItemDurableBucket(ConfigSettings.bucketTin, ConfigSettings.tinDur, ConfigSettings.tinDepth);
		itemBucketIron = new ItemDurableBucket(ConfigSettings.bucketIron, ConfigSettings.ironDur, ConfigSettings.ironDepth);
		itemBucketSteel = new ItemDurableBucket(ConfigSettings.bucketSteel, ConfigSettings.steelDur, ConfigSettings.steelDepth);
		itemBucketCarbon = new ItemDurableBucket(ConfigSettings.bucketCarbon, ConfigSettings.carbonDur, ConfigSettings.carbonDepth);
		itemBucketSilver = new ItemDurableBucket(ConfigSettings.bucketSilver, ConfigSettings.silverDur, ConfigSettings.silverDepth);
		itemBucketLead = new ItemDurableBucket(ConfigSettings.bucketLead, ConfigSettings.leadDur, ConfigSettings.leadDepth);
		itemBucketGold = new ItemDurableBucket(ConfigSettings.bucketGold, ConfigSettings.goldDur, ConfigSettings.goldDepth);
		itemBucketInvar = new ItemDurableBucket(ConfigSettings.bucketInvar, ConfigSettings.invarDur, ConfigSettings.invarDepth);
		itemBucketElectrum = new ItemDurableBucket(ConfigSettings.bucketElectrum, ConfigSettings.electrumDur, ConfigSettings.electrumDepth);
		itemBucketTungsten = new ItemDurableBucket(ConfigSettings.bucketTungsten, ConfigSettings.tungstenDur, ConfigSettings.tungstenDepth);
		itemBucketChromium = new ItemDurableBucket(ConfigSettings.bucketChromium, ConfigSettings.chromiumDur, ConfigSettings.chromiumDepth);
		itemBucketTitanium = new ItemDurableBucket(ConfigSettings.bucketTitanium, ConfigSettings.titaniumDur, ConfigSettings.titaniumDepth);
		itemBucketAntimony = new ItemDurableBucket(ConfigSettings.bucketAntimony, ConfigSettings.antimonyDur, ConfigSettings.antimonyDepth);
		itemBucketOsmium = new ItemDurableBucket(ConfigSettings.bucketOsmium, ConfigSettings.osmiumDur, ConfigSettings.osmiumDepth);
		itemBucketPlatinum = new ItemDurableBucket(ConfigSettings.bucketPlatinum, ConfigSettings.platinumDur, ConfigSettings.platinumDepth);
		itemBucketIridium = new ItemDurableBucket(ConfigSettings.bucketIridium, ConfigSettings.iridiumDur, ConfigSettings.iridiumDepth);
		itemBucketTungstensteel = new ItemDurableBucket(ConfigSettings.bucketTungstensteel, ConfigSettings.tungstensteelDur, ConfigSettings.tungstensteelDepth);
		itemBucketZinc = new ItemDurableBucket(ConfigSettings.bucketZinc, ConfigSettings.zincDur, ConfigSettings.zincDepth);
		itemBucketBronze = new ItemDurableBucket(ConfigSettings.bucketBronze, ConfigSettings.bronzeDur, ConfigSettings.bronzeDepth);
		itemBucketBrass = new ItemDurableBucket(ConfigSettings.bucketBrass, ConfigSettings.brassDur, ConfigSettings.brassDepth);
		itemBucketNickel = new ItemDurableBucket(ConfigSettings.bucketNickel, ConfigSettings.nickelDur, ConfigSettings.nickelDepth);
		itemBucketMagnalium = new ItemDurableBucket(ConfigSettings.bucketMagnalium, ConfigSettings.magnaliumDur, ConfigSettings.magnaliumDepth);
		itemBucketAluminium = new ItemDurableBucket(ConfigSettings.bucketAluminium, ConfigSettings.aluminiumDur, ConfigSettings.aluminiumDepth);
		itemBucketMagnesium = new ItemDurableBucket(ConfigSettings.bucketMagnesium, ConfigSettings.magnesiumDur, ConfigSettings.magnesiumDepth);
		itemBucketObsidian = new ItemDurableBucket(ConfigSettings.bucketObsidian, ConfigSettings.obsidianDur, ConfigSettings.obsidianDepth);
		
		
		
	}
	
	
	
}
