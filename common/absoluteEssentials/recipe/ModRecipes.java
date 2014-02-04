package absoluteEssentials.recipe;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import absoluteEssentials.item.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void recipes() {
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.itemBucketCopper),
			new Object[]{"X X", " X ", Character.valueOf('X'), "ingotCopper"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.itemBucketTin),
				new Object[]{"X X", " X ", Character.valueOf('X'), "ingotTin"}));
		//GameRegistry.addRecipe(new ItemStack(ModItems.itemBucketIron),
		//		new Object[]{"X X", " X ", Character.valueOf('X'), new ItemStack(Item.ingotIron)});
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.itemBucketSteel),
				new Object[]{"X X", " X ", Character.valueOf('X'), "ingotSteel"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.itemBucketCarbon),
				new Object[]{"X X", " X ", Character.valueOf('X'), "plateCarbon"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.itemBucketCarbon),
				new Object[]{"X X", " X ", Character.valueOf('X'), "carbonPlate"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.itemBucketCarbon),
				new Object[]{"X X", " X ", Character.valueOf('X'), "ingotCarbon"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.itemBucketSilver),
				new Object[]{"X X", " X ", Character.valueOf('X'), "ingotSilver"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.itemBucketLead),
				new Object[]{"X X", " X ", Character.valueOf('X'), "ingotLead"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.itemBucketGold),
				new Object[]{"X X", " X ", Character.valueOf('X'), "ingotGold"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.itemBucketInvar),
				new Object[]{"X X", " X ", Character.valueOf('X'), "ingotInvar"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.itemBucketElectrum),
				new Object[]{"X X", " X ", Character.valueOf('X'), "ingotElectrum"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.itemBucketTungsten),
				new Object[]{"X X", " X ", Character.valueOf('X'), "ingotTungsten"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.itemBucketChromium),
				new Object[]{"X X", " X ", Character.valueOf('X'), "ingotChromium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.itemBucketTitanium),
				new Object[]{"X X", " X ", Character.valueOf('X'), "ingotTitanium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.itemBucketAntimony),
				new Object[]{"X X", " X ", Character.valueOf('X'), "ingotAntimony"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.itemBucketOsmium),
				new Object[]{"X X", " X ", Character.valueOf('X'), "ingotOsmium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.itemBucketPlatinum),
				new Object[]{"X X", " X ", Character.valueOf('X'), "ingotPlatinum"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.itemBucketIridium),
				new Object[]{"X X", " X ", Character.valueOf('X'), "ingotIridium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.itemBucketTungstensteel),
				new Object[]{"X X", " X ", Character.valueOf('X'), "ingotTungstensteel"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.itemBucketZinc),
				new Object[]{"X X", " X ", Character.valueOf('X'), "ingotZinc"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.itemBucketBronze),
				new Object[]{"X X", " X ", Character.valueOf('X'), "ingotBronze"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.itemBucketBrass),
				new Object[]{"X X", " X ", Character.valueOf('X'), "ingotBrass"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.itemBucketNickel),
				new Object[]{"X X", " X ", Character.valueOf('X'), "ingotNickel"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.itemBucketMagnalium),
				new Object[]{"X X", " X ", Character.valueOf('X'), "ingotMagnalium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.itemBucketAluminium),
				new Object[]{"X X", " X ", Character.valueOf('X'), "ingotAluminium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.itemBucketMagnesium),
				new Object[]{"X X", " X ", Character.valueOf('X'), "ingotMagnesium"}));
		GameRegistry.addRecipe(new ItemStack(ModItems.itemBucketObsidian),
				new Object[]{"X X", " X ", Character.valueOf('X'), new ItemStack(Block.obsidian)});		
		
	}
	
}
