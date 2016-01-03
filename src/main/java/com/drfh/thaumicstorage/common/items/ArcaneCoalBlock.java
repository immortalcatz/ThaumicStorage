package com.drfh.thaumicstorage.common.items;

import java.util.List;

import com.drfh.thaumicstorage.Main;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ArcaneCoalBlock extends EnergyItem 
{
	public ArcaneCoalBlock()
	{
		super();
		this.setMaxStackSize(1);
		this.setMaxFuelLevel(1800*10);
		this.setFuelLeft(1800*10);
		this.setBurnTime(200);
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemStack)
	{
		{
			ItemStack		copiedStack=itemStack.copy();
			EnergyItem		e_item=(EnergyItem)copiedStack.getItem();
			int				dam=0,max=e_item.getMaxDamage();
			
			dam=e_item.removeFuel(e_item.getBurnTime());
			copiedStack.setItemDamage(e_item.getMaxDamage()-e_item.getFuelLeft());
			copiedStack.stackSize=1;
			return copiedStack;
		}
	}

	@Override
	public boolean hasContainerItem()
	{
		return true;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack item, EntityPlayer play, List l, boolean par4)
	{
	//	Main.logger.info("ArcaneCoalBlock addInformation:(NBT==NULL)");
	//	super.addInformation(item,play,l,par4);
	}

	/*	public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ)
	{
		return true;
	}
*/
}