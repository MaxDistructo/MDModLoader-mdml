package io.github.maxdistructo;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import io.github.maxdistructo.download.*;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
      getFiles.init();
    }

    public void init(FMLInitializationEvent e) {

    }

    public void postInit(FMLPostInitializationEvent e) {
      updateCheck.startCheck();
    }
}