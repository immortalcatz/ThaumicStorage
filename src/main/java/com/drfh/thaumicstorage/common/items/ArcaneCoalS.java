package com.drfh.thaumicstorage.common.items;

import com.drfh.thaumicstorage.Main;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ArcaneCoalS extends ArcaneCoal
{
	@Override
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack stack)
    {
        return true;
    }
	
}