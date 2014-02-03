package absoluteEssentials.item;

import java.util.List;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import absoluteEssentials.AbsoluteEssentials;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemDurableBucket extends Item {
	
	protected int maxDurability;
	protected int depth;
	public int currentDurability;
	public int currentCapacity;
	public String currentLiquid;
	protected int quarterDurability = maxDurability / 4;
	protected int halfDurability = maxDurability / 2;
	protected int nearFullCapacity = (depth / 4) * 3;
	protected int halfCapacity = depth / 2;
	protected boolean isFull = currentCapacity >= depth;
	
	public ItemDurableBucket(int id, int durability, int depth) {
		super(id);
		this.maxDurability = durability;
		this.depth = depth;
		this.currentDurability = durability;
		this.hasSubtypes = true;
		this.canRepair = false;
		this.maxStackSize = 1;
		this.setCreativeTab(AbsoluteEssentials.TAB_ABSOLUTEESSENTIALS);
		
	}
	
	public ItemDurableBucket(int id, int durability) {
		super(id);
		this.maxDurability = durability;
		this.depth = 1;
		this.hasSubtypes = true;
		this.canRepair = false;
		this.maxStackSize = 1;
	}
	
	//Like a vanilla bucket?
	public ItemDurableBucket(int id) {
		super(id);
		this.maxDurability = -1;
		this.depth = 1;
		this.maxStackSize = 1;
		
	}
	
	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
		
		if (!world.canMineBlock(player, x, y, z)) {
			return false;
        }
                
        if (!this.isFull) {
        	if (!player.canPlayerEdit(x, y, z, side, stack)) {
        		return false;
            }
                	
            if (world.getBlockMaterial(x, y, z) == Material.water && world.getBlockMetadata(x, y, z) == 0) {
            	world.setBlockToAir(x, y, z);
            	
            	if (player.capabilities.isCreativeMode) {
            		return true;
                }
                        
                if (--stack.stackSize <= 0) {
                	this.currentCapacity += 1;
                	this.currentLiquid = "water";
                	--currentDurability;
                	return true;
                }
                return false;
            }
                	
            if (world.getBlockMaterial(x, y, z) == Material.lava && world.getBlockMetadata(x, y, z) == 0) {
            	world.setBlockToAir(x, y, z);
            	
            	if (player.capabilities.isCreativeMode) {
            		return true;
                }
                        
                if (--stack.stackSize <= 0) {
                	this.currentCapacity += 1;
                	this.currentLiquid = "lava";
                	--currentDurability;
                	return true;
                }
                    return false;                        
            }  	
        }
		return false;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	@SuppressWarnings({ "rawtypes", "unchecked"})
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
		list.add(EnumChatFormatting.ITALIC + "Durability: " + EnumChatFormatting.RESET + (currentDurability <= quarterDurability ? EnumChatFormatting.RED :
			(currentDurability <= halfDurability ? EnumChatFormatting.YELLOW : EnumChatFormatting.GREEN)) + currentDurability + EnumChatFormatting.RESET + "/" + maxDurability);
		list.add(EnumChatFormatting.ITALIC + "Capacity: " + EnumChatFormatting.RESET + (currentCapacity <= halfCapacity ? EnumChatFormatting.GREEN :
			(currentCapacity <= nearFullCapacity ? EnumChatFormatting.YELLOW : EnumChatFormatting.GREEN)) + currentCapacity + EnumChatFormatting.RESET + "/" + depth);
		if(currentLiquid != null) {
			list.add(EnumChatFormatting.ITALIC + "Currently holds " +
				(currentLiquid == "water" ? EnumChatFormatting.AQUA :
				(currentLiquid == "lava" ? EnumChatFormatting.GOLD :
				(currentLiquid == "milk" ? EnumChatFormatting.WHITE : "")))
			+ currentLiquid);
		}
	}

}
