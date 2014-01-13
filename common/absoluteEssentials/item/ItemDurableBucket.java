package absoluteEssentials.item;

import net.minecraft.item.Item;

public class ItemDurableBucket extends Item {
	
	protected int durability;
	protected int depth;
	
	public ItemDurableBucket(int id, int durability, int depth) {
		super(id);
		this.durability = durability;
		this.depth = depth;
		this.hasSubtypes = true;
		this.canRepair = false;
		this.maxStackSize = 1;
		
	}
	
	public ItemDurableBucket(int id, int durability) {
		super(id);
		this.durability = durability;
		this.depth = 1;
		this.hasSubtypes = true;
		this.canRepair = false;
		this.maxStackSize = 1;
	}
	
	//Like a vanilla bucket?
	public ItemDurableBucket(int id) {
		super(id);
		this.durability = -1;
		this.depth = 1;
		this.maxStackSize = 1;
		
	}

}
