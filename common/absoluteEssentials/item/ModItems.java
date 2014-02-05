package absoluteEssentials.item;

import net.minecraft.item.Item;
import absoluteEssentials.config.ConfigSettings;

public class ModItems {
	
	//Items
	public static Item itemBucketCopper;
	public static Item itemBucketTin;
	//public static Item itemBucketIron;
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
	//public static Item itemBucketMagnesium;
	public static Item itemBucketObsidian;
	
	public static void init() {
		
		itemBucketCopper = new ItemDurableBucket(ConfigSettings.bucketCopper, ConfigSettings.copperDur, ConfigSettings.copperDepth).setUnlocalizedName("bucketCopper");
		itemBucketTin = new ItemDurableBucket(ConfigSettings.bucketTin, ConfigSettings.tinDur, ConfigSettings.tinDepth).setUnlocalizedName("bucketTin");
		//itemBucketIron = new ItemDurableBucket(ConfigSettings.bucketIron, ConfigSettings.ironDur, ConfigSettings.ironDepth).setUnlocalizedName("bucketIron");
		itemBucketSteel = new ItemDurableBucket(ConfigSettings.bucketSteel, ConfigSettings.steelDur, ConfigSettings.steelDepth).setUnlocalizedName("bucketSteel");
		itemBucketCarbon = new ItemDurableBucket(ConfigSettings.bucketCarbon, ConfigSettings.carbonDur, ConfigSettings.carbonDepth).setUnlocalizedName("bucketCarbon");
		itemBucketSilver = new ItemDurableBucket(ConfigSettings.bucketSilver, ConfigSettings.silverDur, ConfigSettings.silverDepth).setUnlocalizedName("bucketSilver");
		itemBucketLead = new ItemDurableBucket(ConfigSettings.bucketLead, ConfigSettings.leadDur, ConfigSettings.leadDepth).setUnlocalizedName("bucketLead");
		itemBucketGold = new ItemDurableBucket(ConfigSettings.bucketGold, ConfigSettings.goldDur, ConfigSettings.goldDepth).setUnlocalizedName("bucketGold");
		itemBucketInvar = new ItemDurableBucket(ConfigSettings.bucketInvar, ConfigSettings.invarDur, ConfigSettings.invarDepth).setUnlocalizedName("bucketInvar");
		itemBucketElectrum = new ItemDurableBucket(ConfigSettings.bucketElectrum, ConfigSettings.electrumDur, ConfigSettings.electrumDepth).setUnlocalizedName("bucketElectrum");
		itemBucketTungsten = new ItemDurableBucket(ConfigSettings.bucketTungsten, ConfigSettings.tungstenDur, ConfigSettings.tungstenDepth).setUnlocalizedName("bucketTungsten");
		itemBucketChromium = new ItemDurableBucket(ConfigSettings.bucketChromium, ConfigSettings.chromiumDur, ConfigSettings.chromiumDepth).setUnlocalizedName("bucketChromium");
		itemBucketTitanium = new ItemDurableBucket(ConfigSettings.bucketTitanium, ConfigSettings.titaniumDur, ConfigSettings.titaniumDepth).setUnlocalizedName("bucketTitanium");
		itemBucketAntimony = new ItemDurableBucket(ConfigSettings.bucketAntimony, ConfigSettings.antimonyDur, ConfigSettings.antimonyDepth).setUnlocalizedName("bucketAntimony");
		itemBucketOsmium = new ItemDurableBucket(ConfigSettings.bucketOsmium, ConfigSettings.osmiumDur, ConfigSettings.osmiumDepth).setUnlocalizedName("bucketOsmium");
		itemBucketPlatinum = new ItemDurableBucket(ConfigSettings.bucketPlatinum, ConfigSettings.platinumDur, ConfigSettings.platinumDepth).setUnlocalizedName("bucketPlatinum");
		itemBucketIridium = new ItemDurableBucket(ConfigSettings.bucketIridium, ConfigSettings.iridiumDur, ConfigSettings.iridiumDepth).setUnlocalizedName("bucketIridium");
		itemBucketTungstensteel = new ItemDurableBucket(ConfigSettings.bucketTungstensteel, ConfigSettings.tungstensteelDur, ConfigSettings.tungstensteelDepth).setUnlocalizedName("bucketTungstensteel");
		itemBucketZinc = new ItemDurableBucket(ConfigSettings.bucketZinc, ConfigSettings.zincDur, ConfigSettings.zincDepth).setUnlocalizedName("bucketZinc");
		itemBucketBronze = new ItemDurableBucket(ConfigSettings.bucketBronze, ConfigSettings.bronzeDur, ConfigSettings.bronzeDepth).setUnlocalizedName("bucketBronze");
		itemBucketBrass = new ItemDurableBucket(ConfigSettings.bucketBrass, ConfigSettings.brassDur, ConfigSettings.brassDepth).setUnlocalizedName("bucketBrass");
		itemBucketNickel = new ItemDurableBucket(ConfigSettings.bucketNickel, ConfigSettings.nickelDur, ConfigSettings.nickelDepth).setUnlocalizedName("bucketNickel");
		itemBucketMagnalium = new ItemDurableBucket(ConfigSettings.bucketMagnalium, ConfigSettings.magnaliumDur, ConfigSettings.magnaliumDepth).setUnlocalizedName("bucketMagnalium");
		itemBucketAluminium = new ItemDurableBucket(ConfigSettings.bucketAluminium, ConfigSettings.aluminiumDur, ConfigSettings.aluminiumDepth).setUnlocalizedName("bucketAluminium");
		//itemBucketMagnesium = new ItemDurableBucket(ConfigSettings.bucketMagnesium, ConfigSettings.magnesiumDur, ConfigSettings.magnesiumDepth).setUnlocalizedName("bucketMagnesium");
		itemBucketObsidian = new ItemDurableBucket(ConfigSettings.bucketObsidian, ConfigSettings.obsidianDur, ConfigSettings.obsidianDepth).setUnlocalizedName("bucketObsidian");
		
	}
	
	
	
}
