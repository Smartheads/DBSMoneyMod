package com.dobsinalia.dbsmoneymod.init;

import com.dobsinalia.dbsmoneymod.DBSMoneyMod;
import com.dobsinalia.dbsmoneymod.item.ItemOneJunk;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid=DBSMoneyMod.MODID)
public class ModItems
{
	static Item oneJunk;
	
	public static void init()
	{
		oneJunk = new ItemOneJunk("one_junk");	
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(oneJunk);
	}
}
