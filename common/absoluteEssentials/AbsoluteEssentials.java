package absoluteEssentials;

import net.minecraft.creativetab.CreativeTabs;
import absoluteEssentials.config.ConfigLoader;
import absoluteEssentials.inventory.CreativeTabAE;
import absoluteEssentials.item.ModItems;
import absoluteEssentials.lang.RegisterNames;
import absoluteEssentials.lib.Reference;
import absoluteEssentials.recipe.ModRecipes;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION_NUMBER, dependencies = Reference.DEPENDENCIES)
@NetworkMod(channels = { Reference.CHANNEL_NAME }, clientSideRequired = true, serverSideRequired = false)
public class AbsoluteEssentials {
	
	@Instance(Reference.MOD_ID)
	public static AbsoluteEssentials instance;
	
	public static final CreativeTabs TAB_ABSOLUTEESSENTIALS = new CreativeTabAE(Reference.MOD_ID);
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		ConfigLoader.init(event);
		
		ModItems.init();
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
		RegisterNames.load();
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
		ModRecipes.recipes();
		
	}

}
