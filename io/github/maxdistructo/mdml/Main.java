package io.github.maxdistructo.mdml;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main {
	@SidedProxy(clientSide="ClientProxy", serverSide = "ServerProxy")
	public static CommonProxy proxy;
    public static final String MODID = "mdml";
    public static final String MODNAME = "MD Mod Loader";
    public static final String VERSION = "Unstable 0.1";
    public static String[] modIDs = new String[100];
    public static String[] devs = new String[100];
    public static String[] versions = new String[100];
    public static String[] types = new String[100];
    public static String[] files = new String[100];
    public static String[] materials = new String[100];
    public static String modId;
    public static String unlocalizedName;
        
    @Instance
    public static Main instance = new Main();
        
     
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {

        proxy.preInit(e);
    }
        
    @EventHandler
    public void init(FMLInitializationEvent e) {

        proxy.init(e);
    }
        
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
    	proxy.postInit(e);
                
    }
}
