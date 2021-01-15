package com.dobsinalia.dbsmoneymod;

import org.apache.logging.log4j.Logger;

import com.dobsinalia.dbsmoneymod.init.ModItems;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = DBSMoneyMod.MODID, name = DBSMoneyMod.NAME, version = DBSMoneyMod.VERSION, useMetadata = true)
public class DBSMoneyMod
{
    public static final String MODID = "dbsmoneymod";
    public static final String NAME = "Dobsinalian Money Mod";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        ModItems.init();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        
    }
}
